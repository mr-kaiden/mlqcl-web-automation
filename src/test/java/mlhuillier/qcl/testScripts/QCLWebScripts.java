package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;

public class QCLWebScripts extends BaseTest{

 // Types of groups declared  Transactional  HappyPath Regression  Test
 // Test tag will be used if initially run a specific new test

    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyPrendaModule() throws  Exception {
        QCLWeb.toVerifyPrendaModule ();

    }

    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyLukatModule() throws Exception{
        Lukat.toVerifyLukatModule();
    }

    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyLukatTxnFunctionality() throws Exception{
        Lukat.toVerifyLukatTxnFunctionality();
    }


    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyLukatOR() throws Exception{
        Lukat.toVerifyLukatOR();
    }

    @Test(priority = 1, groups = "Test")
    public void toVerifyFilterFunctionality() throws Exception{
        Lukat.toVerfiyFilterFunctionality();
    }
}
