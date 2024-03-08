package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class QCLWebScripts extends BaseTest{

 // Types of groups declared  Transactional  HappyPath Regression  Test
 // Test tag will be used if initially run a specific new test

//    @Test(priority = 1, groups = "HappyPath")
//    public void toValidateTheLoginFunctionality() throws  Exception {
//        QCLWeb.toValidateTheLoginFunctionality();
//    }

    @Test(priority = 1, groups = "Test")
    public void toVerifyPrendaModule() throws  Exception {
        QCLWeb.toVerifyPrendaModule ();

    }


}
