package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.renew.renewPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;
import mlhuillier.qcl.pageObject.lukat.lukatPage;


import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.Utilities.*;

public class QCLWeb extends BaseClass{

    public void  toValidateTheLoginFunctionality() throws Exception{
        HeaderChildNode("To Validate the login functionality");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        extentLoggerPass("", "To Validate the login functionality validated");
    }

    public void toValidateTheLoginFunctionalityWithInvalidPassword() throws Exception{
        HeaderChildNode("To Validate the login functionality");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.kpxusernameinput (accountCredential.getproperty ( "kpxusername" ));
        prop.getproperty ( "" );
        TestExecutionUtils.kpxpasswordinput ( prop.getproperty ( "INCORRECTPASSWORD" ) );
        click(LoginPage.kpxlogind, "click login");
        verifyElementPresent ( LoginPage.invalid_login_credential, "Invalid Login Credential");
        extentLoggerPass("", "To Validate the login functionality with invalid password validated");
    }

    public void toValidateTheLoginFunctionalityWithInvalidUsername() throws Exception {
        HeaderChildNode("To Validate the login functionality with invalid username & password");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.kpxusernameinput (prop.getproperty ( "INCORRECTUSERNAME" ));
        TestExecutionUtils.kpxpasswordinput ( accountCredential.getproperty ( "password" ));
        click(LoginPage.kpxlogind, "click login");
        verifyElementPresent ( LoginPage.invalid_login_credential, "Invalid Login Credential");
        extentLoggerPass("", "To Validate the login functionality with invalid username & password validated");
    }

    public void toValidateTheLoginFunctionalityWithInvalidUsernamePassword() throws Exception{
        HeaderChildNode("To Validate the login functionality with invalid username and password");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.kpxusernameinput (prop.getproperty ( "INCORRECTUSERNAME" ));
        TestExecutionUtils.kpxpasswordinput ( accountCredential.getproperty ( "password" ));
        click(LoginPage.kpxlogind, "click login");
        verifyElementPresent ( LoginPage.invalid_login_credential, "Invalid Login Credential");
        extentLoggerPass("", "To Validate the login functionality with invalid username and password validated");
    }

    public void toVerifyPrendaModule() throws Exception{
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
        scrollDownWEB ();
        verifyElementPresent ( LoginPage.objDateGranted, "Date Granted" );
        verifyElementPresent ( LoginPage.objMaturityDate, "Maturity Date" );
        verifyElementPresent ( LoginPage.objExpireDate, "Expiry Date" );
        extentLoggerPass("", "To verify Prenda module validated");
    }

}
