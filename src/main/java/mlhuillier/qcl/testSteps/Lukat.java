package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.lukat.lukatPage;
import mlhuillier.qcl.pageObject.renew.renewPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Type;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.Utilities.*;
import static mlhuillier.qcl.utilities.Utilities.type;

public class Lukat extends BaseClass{

    /*Lukat*/

    public void toVerifyLukatModule() throws Exception{
        HeaderChildNode("To verify Lukat module");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Luakt Navigation");
        waitTime(4000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Lukat Navigation");
        verifyElementPresent(lukatPage.ObjLukatDetails,"Lukat Details");
        verifyElementPresent(lukatPage.ObjBranchDetails,"Branch Name");
        verifyElementPresent(lukatPage.ObjCustomer,"Customer Name");
        extentLoggerPass("", "To verify Lukat module validated");
    }

    public void toVerifyLukatTxnFunctionality() throws Exception{
        HeaderChildNode("To verify the Lukat Functionality");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Lukat Navigation");
        waitTime(4000);
        verifyElementPresentAndClick(lukatPage.ObjKebabBtn,"Khebab Button");
        waitTime(5000);
        verifyElementPresent(lukatPage.ObjSearchPawnTicket, "Search Pawn Ticket");
        waitTime(2000);
        verifyElementPresentAndClick(lukatPage.ObjPawnTikcetNumberInput,"Pawn Ticket Input Field");
        type(lukatPage.ObjPawnTikcetNumberInput, prop.getproperty("PAWNTICKET"),"Pawn Ticket Input field");
        waitTime(1000);
        click(lukatPage.ObjFilterButton, "Filter Button");
        verifyElementPresentAndClick(lukatPage.ObjDataGridDisplay, "Pawn ticket display");
        waitTime(2000);
        click(lukatPage.ObjSelectButton, "Select Button");
        verifyElementPresent(lukatPage.ObjPawnticketNumber,"Verify Pawn Ticket Number");
        verifyElementPresent(lukatPage.ObjTransactionDate, "Verify Transaction Date");
        verifyElementPresent(lukatPage.ObjEmployee, "Verify Employee");
        verifyElementPresent(lukatPage.ObjCustomer,"Verify Customer Name");
        scrollToBottomOfPageWEB();
        waitTime(2000);
        verifyElementPresent(lukatPage.ObjPaymentMethod,"Verify Payment Method");
        verifyElementPresentAndClick(lukatPage.ObjPaymentMethodDropdown, "Dropdown button");
        waitTime(2000);
        click(lukatPage.ObjPaymentMethodOption, "Cash");
        verifyElementPresent(lukatPage.ObjLukatAmount,"Lukat Amount");
        verifyElementPresent(lukatPage.ObjLukatAmountValue, "Lukat Amount value");
        scrollToBottomOfPageWEB();

//      Computation

        verifyElementPresent(lukatPage.ObjComputation, "Computation");
        verifyElementPresent(lukatPage.ObjAMOUNT, "Amount Label");
        verifyElementPresent(lukatPage.ObjAMOUNTvalue, "Amount value");
        verifyElementPresent(lukatPage.ObjPRINCIPAL, "Principal Label");
        verifyElementPresent(lukatPage.ObjPRINCIPALvalue, "Principal value");
        verifyElementPresent(lukatPage.ObjNoofMonths, "No. Of Months");

//      Items

        verifyElementPresentAndClick(lukatPage.ObjItems,"Items");
        waitTime(1000);
        verifyElementPresent(lukatPage.ObjItemCode, "Item Code");
        verifyElementPresent(lukatPage.ObjItemDescription, "Item Description");
        verifyElementPresent(lukatPage.ObjDescription, "Description");
        verifyElementPresent(lukatPage.ObjType, "TYPE");
        verifyElementPresent(lukatPage.ObjItemQuantity," Item Quantity");
        verifyElementPresent(lukatPage.ObjSingleCarat,"Single Carat");
        verifyElementPresent(lukatPage.ObjDiamond_Amount_Value, "Diamond amount value");
        verifyElementPresent(lukatPage.ObjKarat,"Karat");
        verifyElementPresent(lukatPage.Objkarat_Rate,"Karat Rate");
        verifyElementPresent(lukatPage.ObjSorting_Class, "Sorting Class");
        verifyElementPresent(lukatPage.ObjWeight_in_Grams, "Weight (IN GRAMS)");
        verifyElementPresent(lukatPage.ObjAppraised_value, "Appraised value");
        verifyElementPresent(lukatPage.ObjAction,"Action");
        waitTime(2000);
        //Action click Eye icon----------------------------------------------------------------------------------------
        verifyElementPresentAndClick(lukatPage.ObjAction_eye_icon,"Click Eye icon");
        waitTime(2000);
        verifyElementPresentAndClick(lukatPage.ObjAction_CloseBtn, "Close Action button");

        tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
        waitTime(5000);
        verifyElementPresentAndClick(lukatPage.saveBtn,"Save");
        waitTime(1000);
        verifyElementPresent(lukatPage.ObjSave_Lukat_Transaction,"Save Lukat Transaction verification");
        verifyElementPresentAndClick(lukatPage.ObjSaveBtnVerification, "Successfully save");
        waitTime(1000);
        verifyElementPresent(lukatPage.ObjSave_Complete_Modal, "Save Complete");
        verifyElementPresent(lukatPage.ObjModal_Message,"Lukat Transaction has been successfully saved.");
        waitTime(2000);


        //Branch Name--------------------------------------------------------------------------------------------------
        WebElement Branch_Name = driver.findElement(By.xpath("//*[contains(text(),'MLTG QA TESTING BRANCH')]"));
        String branchNameText = Branch_Name.getText();
        logger.info("Text inside the <p> element is: " + branchNameText);

        //Pawn Ticket---------------------------------------------------------------------------------------------------
        WebElement PawnTicketNumber = driver.findElement(By.xpath("//*[@class='general-text-input w-full cursor-zoom-in opacity-60']"));
        String pawnticketno = PawnTicketNumber.getAttribute("value");
        logger.info("Text inside the <p> element is: " + pawnticketno);

        //Customer Name-------------------------------------------------------------------------------------------------
        WebElement Customer_Name = driver.findElement(By.xpath("(//*[@class='general-text-input w-full cursor-zoom-in'])[1]"));
        String customerName = Customer_Name.getAttribute("value");
        logger.info("Text inside the <p> element is: " + customerName);

        //Transaction Amount--------------------------------------------------------------------------------------------
        WebElement LukatAmount = driver.findElement(By.xpath("(//*[@class='general-text-input lg:w-[250px] md:w-[250px] w-full text-right'])[1]"));
        String txnAmount = LukatAmount.getAttribute("value");
        logger.info("Text inside the <p> element is: " + txnAmount);



        //Print_OR------------------------------------------------------------------------------------------------------
        verifyElementPresentAndClick(lukatPage.ObjPrint_OR, "Click Print_OR");

        verifyElementPresent(lukatPage.ObjPrint_OR_Modal, "Print_OR");

        //Branch Name OR------------------------------------------------------------------------------------------------
        WebElement PrintORBranchName = driver.findElement(By.xpath("(//*[contains(text(),'MLTG QA TESTING BRANCH')])[2]"));
        String branchNameText1 = PrintORBranchName.getText();
        logger.info("Text inside the <p> element is: " + branchNameText1);


        if(branchNameText.contains(branchNameText1)){
            logger.info(" Branch Name is the same");
        }

        //Pawn Ticket---------------------------------------------------------------------------------------------------
        WebElement PrintORPawnTicketNumber = driver.findElement(By.xpath("(//*[@class='flex justify-start flex-col']/div/div/p)[1]"));
        String PrintORpawnticketno = PrintORPawnTicketNumber.getText();
        logger.info("Text inside the <p> element is: " + PrintORpawnticketno);

        if(pawnticketno.contains(PrintORpawnticketno)){
            logger.info(" Pawn Ticket Number is the same");
        }

        //Customer Name Print OR----------------------------------------------------------------------------------------
        WebElement PrintORCustomer_Name = driver.findElement(By.xpath("(//*[@class='flex justify-start flex-col']/p)[1]"));
        String PrintORcustomerName = PrintORCustomer_Name.getText();
        logger.info("Text inside the <p> element is: " + PrintORcustomerName);

        if(customerName.contains(PrintORcustomerName)){
            logger.info("Customer Name is the same");
        }

        //Transaction Amount--------------------------------------------------------------------------------------------
        WebElement PrintORLukatAmount = driver.findElement(By.xpath("(//*[@class='flex justify-start flex-col']/div/div/p)[5]"));
        String PrntORtxnAmount = PrintORLukatAmount.getText();
        logger.info("Text inside the <p> element is: " + PrntORtxnAmount);

        if(txnAmount.contains(PrntORtxnAmount)){
            logger.info("Lukat Amount is the same");
        }
        waitTime(2000);
        click(lukatPage.ObjAction_CloseBtn, "CLose Button");
        waitTime(1000);
        click(lukatPage.ObjNew, "New Transaction");
        waitTime(2000);
        click(lukatPage.ObjYesBtn, "To Clear Form");
        verifyElementPresent(lukatPage.ObjFormCleared, "Form Cleared");

        extentLoggerPass("", "To verify Lukat Functionality");

    }

    public void toVerifyLukatOR() throws Exception {
        HeaderChildNode("To verify the Lukat Functionality");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Lukat Navigation");
        waitTime(4000);
        verifyElementPresentAndClick(lukatPage.ObjKebabBtn,"Khebab Button");
        waitTime(5000);
        verifyElementPresent(lukatPage.ObjSearchPawnTicket, "Search Pawn Ticket");
        waitTime(2000);
        verifyElementPresentAndClick(lukatPage.ObjPawnTikcetNumberInput,"Pawn Ticket Input Field");
        type(lukatPage.ObjPawnTikcetNumberInput, prop.getproperty("PAWNTICKET"),"Pawn Ticket Input field");
        waitTime(1000);
        click(lukatPage.ObjFilterButton, "Filter Button");
        click(lukatPage.ObjDataGridDisplay, "Pawn ticket display");
        waitTime(2000);
        click(lukatPage.ObjSelectButton, "Select Button");
        scrollToBottomOfPageWEB();
        waitTime(2000);
        verifyElementPresent(lukatPage.ObjPaymentMethod,"Verify Payment Method");
        verifyElementPresentAndClick(lukatPage.ObjPaymentMethodDropdown, "Dropdown button");
        waitTime(2000);
        click(lukatPage.ObjPaymentMethodOption, "Cash");
        verifyElementPresent(lukatPage.ObjLukatAmountValue, "Lukat Amount value");
        scrollToBottomOfPageWEB();
        tenderAmount(renewPage.objTransactionsAmount, renewPage.objTenderAmount);
        waitTime(5000);
        click(lukatPage.saveBtn,"Save");
        waitTime(1000);
        verifyElementPresent(lukatPage.ObjSave_Lukat_Transaction,"Save Lukat Transaction verification");
        verifyElementPresentAndClick(lukatPage.ObjSaveBtnVerification, "Successfully save");
        waitTime(1000);
        verifyElementPresent(lukatPage.ObjSave_Complete_Modal, "Save Complete");
        verifyElementPresent(lukatPage.ObjModal_Message,"Lukat Transaction has been successfully saved.");
        waitTime(2000);

        //Print_OR------------------------------------------------------------------------------------------------------
        verifyElementPresentAndClick(lukatPage.ObjPrint_OR, "Click Print_OR");
        verifyElementPresent(lukatPage.ObjPrint_OR_Modal, "Print_OR");

        extentLoggerPass("", "To verify Lukat OR");

    }


    public void toVerfiyFilterFunctionality() throws Exception{
        HeaderChildNode("To verify the Lukat Functionality");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashboard");
        waitTime(2000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Lukat Navigation");
        waitTime(4000);
        verifyElementPresentAndClick(lukatPage.ObjKebabBtn,"Khebab Button");
        waitTime(5000);
        verifyElementPresent(lukatPage.ObjSearchPawnTicket, "Search Pawn Ticket");
        waitTime(2000);
        verifyElementPresentAndClick(lukatPage.ObjPawnTikcetNumberInput,"Pawn Ticket Input Field");
        type(lukatPage.ObjPawnTikcetNumberInput, prop.getproperty("PAWNTICKET"),"Pawn Ticket Input field");
        waitTime(1000);
        click(lukatPage.ObjFilterButton, "Filter Button");
        click(lukatPage.ObjDataGridDisplay, "Pawn ticket display");
        waitTime(2000);
        click(lukatPage.ObjSelectButton, "Select Button");

        extentLoggerPass("", "To verify Filter Functionality");

    }


}

