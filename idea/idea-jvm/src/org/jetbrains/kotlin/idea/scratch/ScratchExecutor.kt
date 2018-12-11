/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.scratch

import org.jetbrains.kotlin.idea.scratch.output.ScratchOutputHandler

abstract class ScratchExecutor(protected val file: ScratchFile) {
    abstract fun execute()
    abstract fun stop()

    protected val handlers = mutableListOf<ScratchOutputHandler>()

    fun addOutputHandler(outputHandler: ScratchOutputHandler) {
        handlers.add(outputHandler)
    }

    fun errorOccurs(message: String, e: Throwable? = null, isFatal: Boolean = false) {
        handlers.forEach {
            it.error(file, message)
            if (isFatal) {
                it.onFinish(file)
            }
        }

        if (e != null) LOG.error(e)
    }
}