package mlhuillier.qcl.testScripts;

import org.testng.annotations.Test;
public class PrendaScripts extends BaseTest{

    @Test(priority = 1, groups = "HappyPath")
    public void toVerifyPrendaModule() {
        PrendaTestSteps.toVerifyPrendaModule();
    }

    @Test(priority = 2, groups = "HappyPath")
    public void toVerifyPrendaTransaction() {
        PrendaTestSteps.toVerifyPrendaTransaction();
    }

    @Test(priority = 3, groups = "HappyPath")
    public void toVerifyTheExistingPrendaTransaction() {
        PrendaTestSteps.toVerifyTheExistingPrendaTransaction();
    }

    @Test(priority = 4, groups = "HappyPath")
    public void toVerifyThePrintReceiptPrendaTransaction() {
        PrendaTestSteps.toVerifyThePrintReceiptPrendaTransaction();
    }

    @Test(priority = 5, groups = "HappyPath")
    public void toVerifyCRMScorePrendaAddOn() {
        PrendaTestSteps.toVerifyCRMScorePrendaAddOn();
    }

    @Test(priority = 6, groups = "HappyPath")
    public void toVerifyPrendaLendingLimitTransactionAbove50k() {
        PrendaTestSteps.toVerifyPrendaLendingLimitTransactionAbove50k();
    }

    @Test(priority = 7, groups = "HappyPath")
    public void toVerifyPrendaTransactionUsingCkycUnderWatchlist() {
        PrendaTestSteps.toVerifyPrendaTransactionUsingCkycUnderWatchlist();
    }

    @Test(priority = 8, groups = "HappyPath")
    public void toVerifyByClickingGreenPlusSignButton() {
        PrendaTestSteps.toVerifyByClickingGreenPlusSignButton();
    }

    @Test(priority = 9, groups = "HappyPath")
    public void toVerifyByCalculatingTheTotalAppraisalAmountWithoutCRMAddOn() {
        PrendaTestSteps.toVerifyByCalculatingTheTotalAppraisalAmountWithoutCRMAddOn();
    }

    @Test(priority = 10, groups = "HappyPath")
    public void toVerifyByEnteringValidLoanValueAmount() {
        PrendaTestSteps.toVerifyByEnteringValidLoanValueAmount();
    }

    @Test(priority = 11, groups = "HappyPath")
    public void toVerifyLoanValueIsGreaterThanAppraisedValue() {
        PrendaTestSteps.toVerifyLoanValueIsGreaterThanAppraisedValue();
    }

    @Test(priority = 12, groups = "HappyPath")
    public void toVerifyTheNewPrendaTransactionFunctionality() {
        PrendaTestSteps.toVerifyTheNewPrendaTransactionFunctionality();
    }

    @Test(priority = 13, groups = "HappyPath")
    public void toVerifyFilteringPrendaExistingPrendaTransaction() {
        PrendaTestSteps.toVerifyFilteringPrendaExistingPrendaTransaction();
    }

    @Test(priority = 14, groups = "HappyPath")
    public void functionName1() {
        PrendaTestSteps.functionName1();
    }

    @Test(priority = 15, groups = "HappyPath")
    public void functionName2() {
        PrendaTestSteps.functionName2();
    }


}
