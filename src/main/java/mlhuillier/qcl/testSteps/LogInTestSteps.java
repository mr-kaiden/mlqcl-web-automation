package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerPass;
import static mlhuillier.qcl.utilities.Utilities.click;
import static mlhuillier.qcl.utilities.Utilities.verifyElementPresent;

public class LogInTestSteps extends BaseClass{

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
        click( LoginPage.kpxlogind, "click login");
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
}
