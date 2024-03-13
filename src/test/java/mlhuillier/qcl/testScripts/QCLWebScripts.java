package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class QCLWebScripts extends BaseTest{

 // Types of groups declared  Transactional  HappyPath Regression  Test
 // Test tag will be used if initially run a specific new test

    @Test(priority = 1, groups = "HappyPath")
    public void toValidateTheLoginFunctionality() throws  Exception {
        QCLWeb.toValidateTheLoginFunctionality();
    }
    @Test(priority = 2, groups = "Negative")
    public void toValidateTheLoginFunctionalityWithInvalidPassword() throws  Exception {
        QCLWeb.toValidateTheLoginFunctionalityWithInvalidPassword ();

    }
    @Test(priority = 3, groups = "Negative")
    public void toValidateTheLoginFunctionalityWithInvalidUsername() throws  Exception {
        QCLWeb.toValidateTheLoginFunctionalityWithInvalidUsername();

    }
    @Test(priority = 4, groups = "Negative")
    public void toValidateTheLoginFunctionalityWithInvalidUsernamePassword() throws  Exception {
        QCLWeb.toValidateTheLoginFunctionalityWithInvalidUsernamePassword();

    }

    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyPrendaModule() throws  Exception {
        QCLWeb.toVerifyPrendaModule ();

    }

    @Test(priority = 1, groups = "Test")
    public void toVerifyLukatModule() throws Exception{
        Lukat.toVerifyLukatModule();
    }


}
