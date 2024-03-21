package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class LogInTestScripts extends BaseTest{


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

}
