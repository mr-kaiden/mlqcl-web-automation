package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;
public class PrendaScripts extends BaseTest{

    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyPrendaModule() throws Exception {
        PrendaTestSteps.toVerifyPrendaModule();
    }

    @Test(priority = 2, groups = "Test")
    public void toVerifyPrendaTransaction() throws Exception {
        PrendaTestSteps.toVerifyPrendaTransaction();
    }

    @Test(priority = 3, groups = "HappyPath")
    public void toVerifyTheExistingPrendaTransaction() throws Exception {
        PrendaTestSteps.toVerifyTheExistingPrendaTransaction();
    }

    @Test(priority = 4, groups = "HappyPath")
    public void toVerifyThePrintReceiptPrendaTransaction() throws Exception {
        PrendaTestSteps.toVerifyThePrintReceiptPrendaTransaction();
    }

    @Test(priority = 5, groups = "HappyPath")
    public void toVerifyCRMScorePrendaAddOn() throws Exception {
        PrendaTestSteps.toVerifyCRMScorePrendaAddOn();
    }

    @Test(priority = 6, groups = "HappyPath")
    public void toVerifyPrendaLendingLimitTransactionAbove50k() throws Exception {
        PrendaTestSteps.toVerifyPrendaLendingLimitTransactionAbove50k();
    }

    @Test(priority = 7, groups = "HappyPath")
    public void toVerifyPrendaTransactionUsingCkycUnderWatchlist() throws Exception {
        PrendaTestSteps.toVerifyPrendaTransactionUsingCkycUnderWatchlist();
    }

    @Test(priority = 8, groups = "HappyPath")
    public void toVerifyByClickingGreenPlusSignButton() throws Exception {
        PrendaTestSteps.toVerifyByClickingGreenPlusSignButton();
    }

    @Test(priority = 9, groups = "HappyPath")
    public void toVerifyByCalculatingTheTotalAppraisalAmountWithoutCRMAddOn() throws Exception {
        PrendaTestSteps.toVerifyByCalculatingTheTotalAppraisalAmountWithoutCRMAddOn();
    }

    @Test(priority = 10, groups = "HappyPath")
    public void toVerifyByEnteringValidLoanValueAmount() throws Exception {
        PrendaTestSteps.toVerifyByEnteringValidLoanValueAmount();
    }

    @Test(priority = 11, groups = "HappyPath")
    public void toVerifyLoanValueIsGreaterThanAppraisedValue() throws Exception {
        PrendaTestSteps.toVerifyLoanValueIsGreaterThanAppraisedValue();
    }

    @Test(priority = 12, groups = "HappyPath")
    public void toVerifyTheNewPrendaTransactionFunctionality() throws Exception {
        PrendaTestSteps.toVerifyTheNewPrendaTransactionFunctionality();
    }

    @Test(priority = 13, groups = "HappyPath")
    public void toVerifyFilteringPrendaExistingPrendaTransaction() throws Exception {
        PrendaTestSteps.toVerifyFilteringPrendaExistingPrendaTransaction();
    }

    @Test(priority = 14, groups = "HappyPath")
    public void functionName1() throws Exception {
        PrendaTestSteps.functionName1();
    }

    @Test(priority = 15, groups = "HappyPath")
    public void functionName2() throws Exception {
        PrendaTestSteps.functionName2();
    }


}
