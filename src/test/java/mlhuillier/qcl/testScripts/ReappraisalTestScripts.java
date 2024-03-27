package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class ReappraisalTestScripts extends BaseTest{

    @Test(priority = 1, groups = "HappyPath")
    public void toValidateReappraisalFunctionality() throws Exception {
        ReappraisalTestSteps.toValidateReappraisalFunctionality();

    }
}
