package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.lukat.lukatPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.Utilities.*;

public class Lukat extends BaseClass{

    /*Lukat*/

    public void toVerifyLukatModule() throws Exception{
        HeaderChildNode("To verify Lukat module");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Luakt Navigation");
        waitTime(4000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Lukat Navigation");
        verifyElementPresent(lukatPage.ObjLukatDetails,"Lukat Details");
        verifyElementPresent(lukatPage.ObjBranchDetails,"Branch Name");
        verifyElementPresent(lukatPage.ObjCustomer,"Customer Name");
        extentLoggerPass("", "To verify Lukat module validated");
    }


}
