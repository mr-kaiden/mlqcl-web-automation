package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.renew.renewPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerFail;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerPass;
import static mlhuillier.qcl.utilities.Utilities.*;
import static mlhuillier.qcl.utilities.Utilities.click;

public class RenewTestSteps extends BaseClass  {
    String renewal = "Renewal Transaction";

    public void toValidateRenewTransaction() throws Exception {
        HeaderChildNode("To verify Renew Transaction");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation, "Renew Menu Button");
        if (verifyElementPresent(renewPage.objRenewLabel, "Header")) {
            String branch = getText(renewPage.objBranch);
            System.out.println(branch);
            click(renewPage.objKebabBtn, "Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus, "Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn, "Select Button");
            String pawn = DisableFiled(renewPage.objPawnNumber);
            System.out.println(pawn);
            click(renewPage.objKebabBtn, "Button");
            String firstName = DisableFiled(renewPage.objFirstName);
            String lastName = DisableFiled(renewPage.objLastName);
            String middleName = DisableFiled(renewPage.objMiddleName);
            click(renewPage.objExitButton, "Exit Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn, "Option");
            click(renewPage.objPaymentMethodCash, "Option");
            scrollDownWEB();
            String principal = getText(renewPage.objPrincipal);
            System.out.println(principal);
            waitTime(1000);
            click(renewPage.objItemsBtn, "Items Button");
            String description = getText(renewPage.objDescription);
            System.out.println(description);
            String quantity = getText(renewPage.objQuantity);
            System.out.println(quantity);
            String transaction = DisableFiled(renewPage.objTransactionsAmount);
            System.out.println(transaction);
            tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            waitTime(1000);
            click(renewPage.objSaveBtn, "Save Button");
            waitTime(1000);
            String renewalHeader = getText(renewPage.objRenewalHeader);
            assertionValidation(renewal, renewalHeader);
            click(renewPage.objYesBtn, "Yes Button");
            waitTime(2000);
            /////// OR Receipt////
            click(renewPage.objPrintOR, "Print OR Receipt Button");
            waitTime(1000);
            String ORBranch = getText(renewPage.objORBranch);
            System.out.println(ORBranch);
            String ORCustomer = getText(renewPage.objORCustomer);
            System.out.println(ORCustomer);
            String ORTransaction = getText(renewPage.objORTransaction);
            System.out.println(ORTransaction);
            String ORPawnNumber = getText(renewPage.objORPawnNumber);
            assertionValidation(pawn, ORPawnNumber);
            assertionValidation(branch, ORBranch);
            assertionValidation(firstName + " " + middleName + " " + lastName, ORCustomer);
            assertionValidation(transaction, ORTransaction);
            waitTime(3000);
            click(renewPage.objExitButton, "Exit button");
            ///////// PT Receipt//////////////
            click(renewPage.objPrintPT, "Print Receipt Button");
            waitTime(1000);
            verifyElementPresent(renewPage.objPTPrincipal, "Principal Amount");
            String PTPrincipal = getText(renewPage.objPTPrincipal);
            System.out.println(PTPrincipal);
            String PTPawnNumber = getText(renewPage.objPTPawnNumber);
            System.out.println(PTPawnNumber);
            System.out.println(getText(renewPage.objPTExtendedDate));
            String PTQuantity = getText(renewPage.objPTQuantity);
            System.out.println(PTQuantity);
            String PTDescription = getText(renewPage.objPTDescription);
            System.out.println(PTDescription);
            assertionValidation(principal, PTPrincipal);
            assertionValidation(pawn, PTPawnNumber);
            assertionValidation(quantity + ".00", PTQuantity);
            assertionValidation(description, PTDescription);
            waitTime(3000);
            click(renewPage.objExitButton, "Exit button");
            extentLoggerPass("", "Successfully To Validate Renew Transaction");
        } else {
            extentLoggerFail("", "Failed To Validate Renew Transaction");
        }
    }
    public void validateRenewOrReceipt() throws Exception{
        HeaderChildNode("To verify Renew OR Receipt");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent ( LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation,"Renew Menu Button");
        if(verifyElementPresent(renewPage.objRenewLabel,"Header")){
            String branch = getText(renewPage.objBranch);
            System.out.println(branch);
            click(renewPage.objKebabBtn,"Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus,"Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn,"Select Button");
            String pawn = DisableFiled(renewPage.objPawnNumber);
            System.out.println(pawn);
            click(renewPage.objKebabBtn,"Button");
            String firstName = DisableFiled(renewPage.objFirstName);
            String lastName = DisableFiled(renewPage.objLastName);
            String middleName = DisableFiled(renewPage.objMiddleName);
            click(renewPage.objExitButton,"Exit Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn,"Option");
            click(renewPage.objPaymentMethodCash,"Option");
            String transaction = DisableFiled(renewPage.objTransactionsAmount);
            System.out.println(transaction);
            tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            waitTime(2000);
            click(renewPage.objSaveBtn,"Save Button");
            waitTime(1000);
            String renewalHeader = getText(renewPage.objRenewalHeader);
            assertionValidation(renewal,renewalHeader);
            click(renewPage.objYesBtn,"Yes Button");
            waitTime(2000);
            click(renewPage.objPrintOR,"Print OR Receipt Button");
            waitTime(1000);
            String ORBranch = getText(renewPage.objORBranch);
            System.out.println(ORBranch);
            String ORCustomer = getText(renewPage.objORCustomer);
            System.out.println(ORCustomer);
            String ORTransaction = getText(renewPage.objORTransaction);
            System.out.println(ORTransaction);
            String ORPawnNumber = getText(renewPage.objORPawnNumber);
            assertionValidation(pawn,ORPawnNumber);
            assertionValidation(branch,ORBranch);
            assertionValidation(firstName + " " + middleName+ " " + lastName, ORCustomer);
            assertionValidation(transaction,ORTransaction);
            click(renewPage.objPrintBtn,"Print Button");
            extentLoggerPass("", "Successfully To Validate Renew OR Receipt");
        }else{
            extentLoggerFail("", "Failed To Validate Renew OR Receipt");
        }
    }
    public void validateRenewReceipt() throws Exception{
        HeaderChildNode("To verify Renew PT Receipt");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent ( LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation,"Renew Menu Button");
        if(verifyElementPresent(renewPage.objRenewLabel,"Header")){
            click(renewPage.objKebabBtn,"Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus,"Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn,"Select Button");
            String pawn = DisableFiled(renewPage.objPawnNumber);
            System.out.println(pawn);
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn,"Option");
            click(renewPage.objPaymentMethodCash,"Option");
            scrollDownWEB();
            String principal = getText(renewPage.objPrincipal);
            System.out.println(principal);
            click(renewPage.objItemsBtn,"Items Button");
            String description = getText(renewPage.objDescription);
            System.out.println(description);
            String quantity = getText(renewPage.objQuantity);
            System.out.println(quantity);
            tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            waitTime(2000);
            click(renewPage.objSaveBtn,"Save Button");
            waitTime(1000);
            String renewalHeader = getText(renewPage.objRenewalHeader);
            assertionValidation(renewal,renewalHeader);
            click(renewPage.objYesBtn,"Yes Button");
            waitTime(2000);
            click(renewPage.objPrintPT,"Print Receipt Button");
            waitTime(1000);
            verifyElementPresent(renewPage.objPTPrincipal,"Principal Amount");
            String PTPrincipal = getText(renewPage.objPTPrincipal);
            System.out.println(PTPrincipal);
            String PTPawnNumber = getText(renewPage.objPTPawnNumber);
            System.out.println(PTPawnNumber);
            getText(renewPage.objPTExtendedDate);
            String PTQuantity = getText(renewPage.objPTQuantity);
            System.out.println(PTQuantity);
            String PTDescription = getText(renewPage.objDescription);
            System.out.println(PTDescription);
            assertionValidation(principal, PTPrincipal);
            assertionValidation(pawn, PTPawnNumber);
            assertionValidation(quantity + ".00", PTQuantity);
            assertionValidation(description, PTDescription);
            click(renewPage.objPrintBtn, "Print Button");
            extentLoggerPass("", "Successfully To Validate Renew Receipt");
        }else{
            extentLoggerFail("", "Failed To Validate Renew Receipt");

        }
    }
    public void validatePaymentMethod() throws Exception{
        HeaderChildNode("To verify Renew Payment Method");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent ( LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation,"Renew Menu Button");
        if(verifyElementPresent(renewPage.objRenewLabel,"Header")){
            click(renewPage.objKebabBtn,"Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus,"Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn,"Select Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn,"Option");
            click(renewPage.objPaymentMethodCash,"Cash Option");

            extentLoggerPass("", "Successfully To Validate Renew Payment Method");
        }else{
            extentLoggerFail("", "Failed To Validate Renew Payment Method");
        }
    }
    public void validateItemsDataGrid() throws Exception{
        HeaderChildNode("To verify Renew Items Data Grid");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent ( LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation,"Renew Menu Button");
        if(verifyElementPresent(renewPage.objRenewLabel,"Header")){
            click(renewPage.objKebabBtn,"Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus, "Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn,"Select Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn,"Option");
            click(renewPage.objPaymentMethodCash,"Option");
            click(renewPage.objRedeemBtn,"Redeem Button");
            waitTime(1000);
            click(renewPage.objItemsBtn,"Items Button");
            click(renewPage.objEyesIcon,"Items Button");
            verifyElementPresent(renewPage.objItemModal,"Item Details Modal");
            click(renewPage.objCloseBtn,"Close Button");
            tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            click(renewPage.objSaveBtn, "Save Button");
            waitTime(1000);
            String renewalHeader = getText(renewPage.objRenewalHeader);
            assertionValidation(renewal,renewalHeader);
            click(renewPage.objYesBtn, "Yes Button");
            extentLoggerPass("", "Successfully To Validate Renew Items Data Grid");
        }else{
            extentLoggerFail("", "Failed To Validate Renew Items Data Grid");
        }
    }

    public void validateIfTenderInputFieldIsEnable() throws Exception {
        HeaderChildNode("To verify if Tender Input Field is Enable");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation, "Renew Menu Button");
        if (verifyElementPresent(renewPage.objRenewLabel, "Header")) {
            click(renewPage.objKebabBtn, "Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus, "Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn, "Select Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn, "Option");
            click(renewPage.objPaymentMethodCash, "Option");
            click(renewPage.objRedeemBtn,"Redeem Button");
            waitTime(1000);
            clickBtn(renewPage.objItemsBtn, "Items Button");
            clickBtn(renewPage.objEyesIcon, "Items Button");
            verifyElementPresent(renewPage.objItemModal, "Item Details Modal");
            clickBtn(renewPage.objCloseBtn, "Close Button");
            tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            extentLoggerPass("", "Successfully To Validate Tender Input Field is Enable");
        } else {
            extentLoggerFail("", "Failed To Validate Tender Input Field is Enable");
        }
    }

    public void validateInvalidTenderAmount() throws Exception {
        HeaderChildNode("To verify if Error Message for Invalid Tender Amount");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation, "Renew Menu Button");
        if (verifyElementPresent(renewPage.objRenewLabel, "Header")) {
            click(renewPage.objKebabBtn, "Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus, "Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn, "Select Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn, "Option");
            click(renewPage.objPaymentMethodCash, "Option");
            click(renewPage.objRedeemBtn,"Redeem Button");
            waitTime(1000);
            click(renewPage.objItemsBtn, "Items Button");
            click(renewPage.objEyesIcon, "Items Button");
            verifyElementPresent(renewPage.objItemModal,"Item Details Modal");
            click(renewPage.objCloseBtn, "Close Button");
            invalidTenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            click(renewPage.objSaveBtn,"Save Button");
            verifyElementPresent(renewPage.objErrorMessage, "Error Message");
            click(renewPage.objOkBtn,"Error Message Ok Button");
            extentLoggerPass("", "Successfully To Validate Error Message for Invalid Tender Amount");
        } else {
            extentLoggerFail("", "Failed To Validate Error Message for Invalid Tender Amount");
        }
    }
    public void validateNewRenewalTransaction() throws Exception {
        HeaderChildNode("To verify New Renewal Transaction");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation, "Renew Menu Button");
        if (verifyElementPresent(renewPage.objRenewLabel, "Header")) {
            click(renewPage.objKebabBtn, "Button");
            verifyElementPresentAndClick(renewPage.objOpenStatus, "Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn, "Select Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn, "Option");
            click(renewPage.objPaymentMethodCash, "Option");
            click(renewPage.objRedeemBtn,"Redeem Button");
            waitTime(1000);
            tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
            click(renewPage.objSaveBtn,"Save Button");
            waitTime(1000);
            String renewalHeader = getText(renewPage.objRenewalHeader);
            assertionValidation(renewal,renewalHeader);
            click(renewPage.objYesBtn,"Yes Button");
            waitTime(2000);
            click(renewPage.objNewTransactionBtn,"New Button");
            verifyElementPresent(renewPage.objNewFormModal,"Modal");
            click(renewPage.objYesBtn,"Ok Button");
            waitTime(2000);
            extentLoggerPass("", "Successfully To Validate New Renewal Transaction");
        } else {
            extentLoggerFail("", "Failed To Validate Validate New Renewal Transaction");
        }
    }
    public void validateSaveButtonIsDisable() throws Exception {
        HeaderChildNode("To verify if Save Button is Disable if Pawn Ticket is Closed");
        TestExecutionUtils.signInWithGoogle(accountCredential.getproperty("email"), accountCredential.getproperty("password"));
        TestExecutionUtils.signInQCL(accountCredential.getproperty("kpxusername"), accountCredential.getproperty("kpxpassword"));
        click(LoginPage.objQCLL, " QCL");
        click(LoginPage.objcontinue, "continue ");
        waitTime(3000);
        verifyElementPresent(LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        click(renewPage.objRenewNavigation, "Renew Menu Button");
        if (verifyElementPresent(renewPage.objRenewLabel, "Header")) {
            click(renewPage.objKebabBtn, "Button");
            verifyElementPresentAndClick(renewPage.objCloseStatus, "Status");
            verifyElementPresentAndClick(renewPage.objSelectBtn, "Select Button");
            verifyElementPresentAndClick(renewPage.objPaymentMethodBtn, "Option");
            click(renewPage.objPaymentMethodCash, "Option");
            click(renewPage.objRedeemBtn,"Redeem Button");
            waitTime(1000);
            scrollDownWEB();
            verifyElementIsDisabledWeb(renewPage.objSaveBtn,"Save Button");

            extentLoggerPass("", "Successfully To Validate Save Button is Disable if Pawn Ticket is Closed");
        } else {
            extentLoggerFail("", "Failed To Validate Validate Save Button is Disable if Pawn Ticket is Closed");
        }
    }

}
