package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class RenewTestScript extends BaseTest{
    @Test(priority = 1, groups = "Test")
    public void toValidateRenewTransaction() throws  Exception {
        RenewTestSteps.toValidateRenewTransaction();

    }
}
