package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.reappraise.reappraisePage;
import mlhuillier.qcl.pageObject.renew.renewPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.Utilities.*;

public class ReappraisalTestSteps extends BaseClass {
    public void toValidateReappraisalModule() throws Exception {
        HeaderChildNode("To verify Reappraisal Module");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(reappraisePage.objReappraiseNavigation, "Reappraise Menu Button");
        if (verifyElementPresent(reappraisePage.objReappraiseLabel, "Header")) {
            verifyElementPresent(reappraisePage.objBranchName, "Branch Name");
            verifyElementPresent(reappraisePage.objBranchManager, "Branch Manager");
            verifyElementPresent(reappraisePage.objBranchAddress, "Branch Address");
            extentLoggerPass("", "Successfully To Validate Reappraisal Module");
        } else {
            extentLoggerFail("", "Failed To Validate Reappraisal Transaction");
        }
    }

    public void toValidateReappraisalFunctionality() throws Exception {
        HeaderChildNode("To verify Reappraisal Functionality");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(reappraisePage.objReappraiseNavigation, "Reappraise Menu Button");
        if (verifyElementPresent(reappraisePage.objReappraiseLabel, "Header")) {
            click(renewPage.objKebabBtn, "Kebab Button");
            String pawnTicket = getText(reappraisePage.objPawnTicketNo);
            click(reappraisePage.objPawnTicketField,"Text Field");
            type(reappraisePage.objPawnTicketField, pawnTicket, "Input Pawn Ticket Number");
            verifyElementEnabled(reappraisePage.objFilterBtn, "Filter Button");
            click(reappraisePage.objFilterBtn, "Filter Button");
            waitTime(1000);
            click(reappraisePage.objFilterResult,"Pawn Ticket Number");
            click(renewPage.objSelectBtn, "Select Button");
            String pawn = DisableFiled(renewPage.objPawnNumber);
            waitTime(1000);
            assertionValidation(pawnTicket, pawn);
            click(renewPage.objPaymentMethodBtn, "Payment Method");
            click(renewPage.objPaymentMethodCash, "Cash Payment Method Option");
            inputNewLoan(renewPage.objPrincipal,reappraisePage.objNewLoanAmount);
            click(reappraisePage.objRedeemPoints, "Redeem Points Button");
            waitTime(2000);
            scrollDownWEB();
            waitTime(1000);
            removeSign(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            click(renewPage.objSaveBtn, "Save Button");
            waitTime(1000);
            String expected = "Save Reappraisal Transaction";
            verifyElementPresent(reappraisePage.objConfirmationDialog, "Confirmation Dialog");
            String actual = getText(reappraisePage.objConfirmationDialog);
            assertionValidation(expected, actual);
            click(renewPage.objYesBtn, "Button");
            waitTime(2000);
            extentLoggerPass("", "Successfully To Validate Reappraisal Functionality");
        } else {
            extentLoggerFail("", "Failed To Validate Reappraisal Functionality");
        }
    }

    
}
