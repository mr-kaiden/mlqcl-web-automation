package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.prenda.PrendaPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerPass;
import static mlhuillier.qcl.utilities.Utilities.*;
import static mlhuillier.qcl.utilities.Utilities.verifyElementPresent;

public class PrendaTestSteps extends BaseClass{
    public void toVerifyPrendaModule() throws Exception {
        HeaderChildNode("To verify Prenda module");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        verifyElementPresent ( LoginPage.objprendadetails, "Prenda Details");
        verifyElementPresent ( LoginPage.objbranchdetail, "Branch Name Details" );
        verifyElementPresent ( LoginPage.objContactDetails, "Customer Name Details" );
        scrollToBottomOfPageWEB ();
        verifyElementPresent ( LoginPage.objDateGranted, "Date Granted" );
        verifyElementPresent ( LoginPage.objMaturityDate, "Maturity Date" );
        verifyElementPresent ( LoginPage.objExpireDate, "Expiry Date" );
        extentLoggerPass("", "To verify Prenda module validated");
    }

    public void toVerifyPrendaTransaction() throws Exception {
        HeaderChildNode("To verify Prenda Transaction");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        click ( PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user" );

        extentLoggerPass("", "To verify Prenda Transaction validated");
    }

    public void toVerifyTheExistingPrendaTransaction() throws Exception {

    }

    public void toVerifyThePrintReceiptPrendaTransaction() throws Exception {

    }

    public void toVerifyCRMScorePrendaAddOn() throws Exception {

    }

    public void toVerifyPrendaLendingLimitTransactionAbove50k() throws Exception {

    }

    public void toVerifyPrendaTransactionUsingCkycUnderWatchlist() throws Exception {

    }

    public void toVerifyByClickingGreenPlusSignButton() throws Exception {

    }

    public void toVerifyByCalculatingTheTotalAppraisalAmountWithoutCRMAddOn() throws Exception {

    }

    public void toVerifyByEnteringValidLoanValueAmount() throws Exception {

    }

    public void toVerifyLoanValueIsGreaterThanAppraisedValue() throws Exception {

    }

    public void toVerifyTheNewPrendaTransactionFunctionality() throws Exception {

    }

    public void toVerifyFilteringPrendaExistingPrendaTransaction() throws Exception {

    }

    public void functionName1() throws Exception {

    }

    public void functionName2() throws Exception {

    }
}