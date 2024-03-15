package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.renew.renewPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerFail;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerPass;
import static mlhuillier.qcl.utilities.Utilities.*;
import static mlhuillier.qcl.utilities.Utilities.click;

public class      RenewTestSteps extends BaseClass  {

    public void toValidateRenewTransaction() throws Exception {
        HeaderChildNode("To verify Renew Transaction");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent ( LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.renewMenuBtn,"Renew Menu Button");
        if(verifyElementPresent(renewPage.renewRenewPage,"Header")){
            click(renewPage.KebabBtn,"Button");
            verifyElementPresentAndClick(renewPage.ptStatus,"Status");

            verifyElementPresentAndClick(renewPage.selectBtn,"Select Button");

            verifyElementPresentAndClick(renewPage.paymentMethodBtn,"Option");
            click(renewPage.paymentMethodCash,"Option");

            tenderAmount();
            waitTime(5000);
            click(renewPage.saveBtn,"Save Button");
            click(renewPage.yesBtn,"Yes Button");
            extentLoggerPass("", "Successfully To Validate Renew Transaction");
        }else{
            extentLoggerFail("", "Failed To Validate Renew Transaction");
        }
    }
}

