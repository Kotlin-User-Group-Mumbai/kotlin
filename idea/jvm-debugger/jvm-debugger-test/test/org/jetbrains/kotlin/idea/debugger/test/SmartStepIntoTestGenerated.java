/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SmartStepIntoTestGenerated extends AbstractSmartStepIntoTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInSmartStepInto() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/annotation.kt");
    }

    @TestMetadata("arrayAccess.kt")
    public void testArrayAccess() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/arrayAccess.kt");
    }

    @TestMetadata("callChain.kt")
    public void testCallChain() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/callChain.kt");
    }

    @TestMetadata("constructor.kt")
    public void testConstructor() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/constructor.kt");
    }

    @TestMetadata("conventionMethod.kt")
    public void testConventionMethod() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/conventionMethod.kt");
    }

    @TestMetadata("delegatedPropertyGetter.kt")
    public void testDelegatedPropertyGetter() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/delegatedPropertyGetter.kt");
    }

    @TestMetadata("doWhile.kt")
    public void testDoWhile() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/doWhile.kt");
    }

    @TestMetadata("dotQualified.kt")
    public void testDotQualified() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/dotQualified.kt");
    }

    @TestMetadata("dotQualifiedInParam.kt")
    public void testDotQualifiedInParam() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/dotQualifiedInParam.kt");
    }

    @TestMetadata("empty.kt")
    public void testEmpty() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/empty.kt");
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/for.kt");
    }

    @TestMetadata("funLiteral.kt")
    public void testFunLiteral() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/funLiteral.kt");
    }

    @TestMetadata("funWithExpressionBody.kt")
    public void testFunWithExpressionBody() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/funWithExpressionBody.kt");
    }

    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/if.kt");
    }

    @TestMetadata("infixCall.kt")
    public void testInfixCall() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/infixCall.kt");
    }

    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/inlineOnly.kt");
    }

    @TestMetadata("inlinedFunLiteral.kt")
    public void testInlinedFunLiteral() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/inlinedFunLiteral.kt");
    }

    @TestMetadata("inlinedFunctionalExpression.kt")
    public void testInlinedFunctionalExpression() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/inlinedFunctionalExpression.kt");
    }

    @TestMetadata("invoke.kt")
    public void testInvoke() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/invoke.kt");
    }

    @TestMetadata("libraryFun.kt")
    public void testLibraryFun() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/libraryFun.kt");
    }

    @TestMetadata("multiline.kt")
    public void testMultiline() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/multiline.kt");
    }

    @TestMetadata("multilineCallChain.kt")
    public void testMultilineCallChain() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/multilineCallChain.kt");
    }

    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/object.kt");
    }

    @TestMetadata("param.kt")
    public void testParam() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/param.kt");
    }

    @TestMetadata("parantesized.kt")
    public void testParantesized() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/parantesized.kt");
    }

    @TestMetadata("propertyGetter.kt")
    public void testPropertyGetter() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/propertyGetter.kt");
    }

    @TestMetadata("renderer.kt")
    public void testRenderer() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/renderer.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/simple.kt");
    }

    @TestMetadata("stringTemplate.kt")
    public void testStringTemplate() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/stringTemplate.kt");
    }

    @TestMetadata("unary.kt")
    public void testUnary() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/unary.kt");
    }

    @TestMetadata("when.kt")
    public void testWhen() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/when.kt");
    }

    @TestMetadata("while.kt")
    public void testWhile() throws Exception {
        runTest("idea/jvm-debugger/jvm-debugger-test/testData/smartStepInto/while.kt");
    }
}
