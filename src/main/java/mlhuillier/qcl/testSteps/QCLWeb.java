package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.Utilities.*;

public class QCLWeb extends BaseClass{

//    public void  toValidateTheLoginFunctionality() throws Exception{
//        HeaderChildNode("To Validate the login functionality");
//        TestExecutionUtils.signInQCLWeb();
//        extentLoggerPass("", "To Validate the login functionality validated");
//    }

    public void toVerifyPrendaModule() throws Exception{
        HeaderChildNode("To verify Prenda module");
        TestExecutionUtils.signInQCLWeb ();
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
        scrollDownWEB ();
        verifyElementPresent ( LoginPage.objDateGranted, "Date Granted" );
        verifyElementPresent ( LoginPage.objMaturityDate, "Maturity Date" );
        verifyElementPresent ( LoginPage.objExpireDate, "Expiry Date" );
        extentLoggerPass("", "To verify Prenda module validated");
    }

}
