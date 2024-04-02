package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.prenda.PrendaPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.Objects;

import static mlhuillier.qcl.utilities.ExtentReporter.HeaderChildNode;
import static mlhuillier.qcl.utilities.ExtentReporter.extentLoggerPass;
import static mlhuillier.qcl.utilities.Utilities.*;
import static mlhuillier.qcl.utilities.Utilities.verifyElementPresent;


public class PrendaTestSteps extends BaseClass{
    public void toVerifyPrendaModule() throws Exception {
        HeaderChildNode("To verify Prenda module");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if( verifyElementPresent ( LoginPage.objprendadetails, "Prenda Details")){
            verifyElementPresent ( LoginPage.objbranchdetail, "Branch Name Details" );
            verifyElementPresent ( LoginPage.objContactDetails, "Customer Name Details" );
            scrollToBottomOfPageWEB ();
            verifyElementPresent ( LoginPage.objDateGranted, "Date Granted" );
            verifyElementPresent ( LoginPage.objMaturityDate, "Maturity Date" );
            verifyElementPresent ( LoginPage.objExpireDate, "Expiry Date" );
            extentLoggerPass("", "To verify Prenda module validated");
        }else {
            extentLoggerFail("", "Failed To verify Prenda module");
        }
    }

    public void toVerifyPrendaTransaction() throws Exception {
        HeaderChildNode("To verify Prenda Transaction");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
//            mouseHover(PrendaPage.obj_birsthday_input);
//            waitTime(1000);
//            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            clearField(PrendaPage.obj_birsthday_input,"Employee birthdate");
            System.out.println("Hello World");
            waitTime(5000);
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
//            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
//        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
            verifyElementPresent(PrendaPage.obj_saveComplete_modal, " Save Completely ");
            extentLoggerPass("To verify Prenda Transaction", "validated");
        } else {
            extentLoggerFail("", "Failed To Validate Prenda Transaction");
        }
    }

    public void toVerifyTheExistingPrendaTransaction() throws Exception {
        HeaderChildNode("To verify the Existing Prenda transactionn");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
            waitTime(2000);
            WebElement ticketNumberInput = getWebDriver().findElement(By.xpath("//input[@placeholder='Pawn Ticket Number']"));
            scrollToBottomToTopOfPageWEB();
            String value = ticketNumberInput.getAttribute("value");
            logger.info("Pawn ticket number of this product is  " + value);
            waitTime(2000);
            click(PrendaPage.obj_pawnTicket_menu, " pawn ticket menu");
            waitTime(1000);
            click(PrendaPage.obj_modal_ticketNumber_input, " pawn ticket number");
            type(PrendaPage.obj_modal_ticketNumber_input, value, " pawn ticket number");
            click(PrendaPage.obj_modal_filter_btn, " filter ");
            waitTime(1500);
            click(PrendaPage.obj_modal_select_first, " select the first search output");
            click(PrendaPage.obj_modal_select_btn, " select button");
            extentLoggerPass("To verify the Existing Prenda transaction", "validated");
        }else {
            extentLoggerFail("","Failed To Validate The Existing Prenda Transaction");
        }
    }

    public void toVerifyThePrintReceiptPrendaTransaction() throws Exception {
        HeaderChildNode("To verify the Print receipt Prenda transaction");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = driver.findElement(By.xpath("//td[17]//input"));
//        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");

            WebElement ticketNumberInput = driver.findElement(By.xpath("//input[@placeholder='Pawn Ticket Number']"));
            String value = ticketNumberInput.getAttribute("value");

            waitTime(1000);
            click(PrendaPage.obj_printPT_btn, " print pt ");
            click(PrendaPage.obj_yes_button, " yes ");


            extentLoggerPass("To verify the Print receipt Prenda transaction", "validated");
        }else{
            extentLoggerFail("","Failed To Validate Print Receipt Prenda Transaction");
        }
    }

    public void toVerifyCRMScorePrendaAddOn() throws Exception {
        HeaderChildNode("To verify CRM score prenda add on");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);

            WebElement ticketNumberInput = getWebDriver().findElement(By.xpath("//*[contains(text(), 'CRM Add On (PHP)')]/following-sibling::input"));
            String value = ticketNumberInput.getAttribute("value");
            logger.info(" CRM add On is " + value);


            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");

            extentLoggerPass("To verify CRM score prenda add on", "validated");
        }else{
            extentLoggerFail("","Failed To Validate CRM Score Prenda Add On ");
        }
    }

    public void toVerifyPrendaLendingLimitTransactionAbove50k() throws Exception {
        HeaderChildNode("To verify Prenda lendnig limit transaction above 50k");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("MOREITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("MORELOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(2000);
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
            waitTime(2000);
            if (verifyElementPresent(PrendaPage.obj_requestApproval_text, "request approval")) {
                logger.info(" Request Approval is visible");
                extentLoggerPass("", "To verify Prenda lendnig limit transaction above 50k validated");
            }
        }else{
            extentLoggerFail("","Failed To Validate Prenda Lending Limit Transaction Above 50K");
        }

    }

    public void toVerifyPrendaTransactionUsingCkycUnderWatchlist() throws Exception {
        HeaderChildNode("To verify Prenda transaction using ckyc under watchlist");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("WCLASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("WCFIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("WCBIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_25, "25");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
            verifyElementPresent(PrendaPage.obj_forComplianceAssisstance_text, "For Compliance Assistance ");
            click(PrendaPage.obj_ok_btn, " ok button ");
            waitTime(1500);
            verifyElementPresent(PrendaPage.obj_saveComplete_modal, " Completely save");
            extentLoggerPass("", "To verify Prenda transaction using ckyc under watchlist validated");
        }else{
            extentLoggerFail("","Failed To Validate Prenda Transaction Using CKYC Under Watchlist");
        }
    }

    public void toVerifyByClickingGreenPlusSignButton() throws Exception {
        HeaderChildNode("To verify by clicking green plus sign button");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            waitTime(2000);
            verifyElementPresent(PrendaPage.obj_itemCode_menu, "Item menu");
            verifyElementPresent(PrendaPage.obj_description_input, "description");
            extentLoggerPass("", "To verify by clicking green plus sign button validated");
        }else{
            extentLoggerFail("","Failed To Validate Green Plus Sign Button");
        }
    }

    public void toVerifyByCalculatingTheTotalAppraisalAmountWithoutCRMAddOn() throws Exception {
        HeaderChildNode("To verify by calculating the total appraisal amount WITHOUT CRM Add On");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            WebElement crmValue = getWebDriver().findElement(By.xpath("//*[contains(text(), 'CRM Add On (PHP)')]/following-sibling::input"));
            logger.info(" C R M  displayed is " + crmValue);
            extentLoggerPass("", "To verify by calculating the total appraisal amount WITHOUT CRM Add On validated");
        }else{
            extentLoggerFail("","Failed To Validate Total Appraisal Amount Without CRM Add On");
        }
    }

    public void toVerifyByEnteringValidLoanValueAmount() throws Exception {
        HeaderChildNode("To verify by entering VALID  loan value amount");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
            verifyElementPresent(PrendaPage.obj_saveComplete_modal, " Save Completely ");
            extentLoggerPass("", "To verify by entering VALID  loan value amount validated");
        }else{
            extentLoggerFail("","Failed To Validate Enter Valid Loan Value Amount");
        }
    }

    public void toVerifyLoanValueIsGreaterThanAppraisedValue() throws Exception {
        HeaderChildNode("To verifyloan value is greater than appraised value");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("ABOVELOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            verifyElementPresent(PrendaPage.obj_greaterTotal_text, " Loan Amount is greater than Total Appraised Value");
            click(PrendaPage.obj_ok_btn, " ok button ");
            waitTime(1500);
            verifyElementPresent(PrendaPage.obj_saveComplete_modal, " Completely save");
            extentLoggerPass("", "To verifyloan value is greater than appraised value validated");
        }else{
            extentLoggerFail("","Failed To Validate Loan Value is Greater Than Appraised Value");
        }
    }

    public void toVerifyTheNewPrendaTransactionFunctionality() throws Exception {
        HeaderChildNode("To verify the new prenda transaction funcitonality");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            WebElement ticket = getWebDriver().findElement(By.xpath("//input[@placeholder='Pawn Ticket Number']"));
            String valueticket = ticket.getAttribute("value");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
//        waitTime ( 2000 );
//        click ( PrendaPage.obj_new_btn, " new button" );
//        waitTime ( 3000 );
//        verifyElementPresent ( PrendaPage.obj_yes_button, " yes button" );
//        click ( PrendaPage.obj_yes_button, " yes button" );
//
//
//
//        WebElement newticket = getWebDriver().findElement ( By.xpath ( "//input[@placeholder='Pawn Ticket Number']" ) );
//        String newticketvalue = newticket.getAttribute("value");
//
//        logger.info ( "Last pawn ticket is " + valueticket);
//        logger.info ( " New transaction with new pawn ticket " + newticketvalue );
//
//        logger.info ( " Cleared the  customer name  now it showing " + newticketvalue );
//        logger.info ( "Can filter existing prenda transactinon" );
            extentLoggerPass("", "To verify the new prenda transaction functionality validated");
        }else{
            extentLoggerFail("", "Failed To Validate New Prenda Transaction Functionality");
        }
    }

    public void toVerifyFilteringPrendaExistingPrendaTransaction() throws Exception {

        HeaderChildNode("To verify filtering prenda existing prenda transaction");
        TestExecutionUtils.signInWithGoogle ( accountCredential.getproperty ( "email" ), accountCredential.getproperty ( "password" ));
        TestExecutionUtils.signInQCL (accountCredential.getproperty ( "kpxusername" ), accountCredential.getproperty ( "kpxpassword" ));
        click ( LoginPage.objQCLL, " QCL" );
        click ( LoginPage.objcontinue, "continue " );
        waitTime(3000);
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( LoginPage.objPNavigation, "Prenda Navigation");
        waitTime(4000);
        if (verifyElementPresent(LoginPage.objprendadetails, "Prenda Details")) {
            click(PrendaPage.obj_customerName_menu, "Testing the click  menu to get any user");
            click(PrendaPage.obj_lastname_input, "Employee last name");
            type(PrendaPage.obj_lastname_input, prop.getproperty("LASTNAME"), "Employee last name");
            click(PrendaPage.obj_firstname_input, "Employee first name");
            type(PrendaPage.obj_firstname_input, prop.getproperty("FIRSTNAME"), "Employee first name");
            waitTime(2000);
            mouseHover(PrendaPage.obj_birsthday_input);
            waitTime(1000);
            click(PrendaPage.obj_cleardate_btn, "clear default employee birthdate");
            click(PrendaPage.obj_birsthday_input, "Employee birthdate");
            type(PrendaPage.obj_birsthday_input, prop.getproperty("BIRTHDATE"), "Employee birthdate");
            click(PrendaPage.obj_select_27, "27");
            waitTime(1000);
            click(PrendaPage.obj_search_btn, "Search button");
            waitTime(5000);
            scrollToBottomOfPageWEB();
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_confirm_btn, "Confirm button");
            click(PrendaPage.obj_addItem_btn, "add item button");
            scrollToBottomOfPageWEB();
            click(PrendaPage.obj_itemCode_menu, "Item menu");
            waitTime(1000);
            click(PrendaPage.obj_itemCodeSelect_101, "101");
            click(PrendaPage.obj_select_btn, "select button");
            waitTime(2000);
            click(PrendaPage.obj_description_input, "adding description");
            waitTime(1000);
            type(PrendaPage.obj_description_input, prop.getproperty("ITEMDESCRIPTION"), "adding description");
            click(PrendaPage.obj_itemType_input, "click input type to select type");
            waitTime(1000);
            click(PrendaPage.obj_itemType_sellable, "sellable select");
            click(PrendaPage.obj_itemQuantity_input, "ITEMQUANTITY");
            type(PrendaPage.obj_itemQuantity_input, prop.getproperty("ITEMQUANTITY"), "add item quantity");
            waitTime(1500);
            WebElement divElement = getWebDriver().findElement(By.xpath("//*[@class='min-h-[371px]']"));
            int scrollValue = 2000;
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
            jsExecutor.executeScript("arguments[0].scrollLeft = arguments[1]", divElement, scrollValue);
            waitTime(100);
            click(PrendaPage.obj_itemKarat_input, "karat");
            click(PrendaPage.obj_itemKarat_22, "adding 22");
            click(PrendaPage.obj_sortingClass_input, "sorting class");
            click(PrendaPage.obj_itemSoritng_chinese, "Sorting  CHINES");
            waitTime(2000);
            click(PrendaPage.obj_weight_input, "adding value");
            type(PrendaPage.obj_weight_input, prop.getproperty("ITEMWEIGHT"), "adding value");
            waitTime(2000);
            WebElement chooseFileButton = getWebDriver().findElement(By.xpath("//td[17]//input"));
            //        String fileSath = "C:\\Users\\DASI20248151\\Documents\\testing.png";
            String filePath = Objects.requireNonNull(PrendaTestSteps.class.getClassLoader().getResource("testing.png")).getFile();
            chooseFileButton.sendKeys(filePath);
            click(PrendaPage.obj_save_button, "saving item");
            scrollToBottomOfPageWEB();
            waitTime(5000);
            click(PrendaPage.obj_loanValue_input, "loan value");
            type(PrendaPage.obj_loanValue_input, prop.getproperty("LOANVALUE"), " loan value php");
            click(PrendaPage.obj_save_btn, "save button");
            waitTime(1000);
            click(PrendaPage.obj_yes_button, "save trasaction");
            waitTime(2000);
            WebElement ticketNumberInput = getWebDriver().findElement(By.xpath("//input[@placeholder='Pawn Ticket Number']"));
            scrollToBottomToTopOfPageWEB();
            String value = ticketNumberInput.getAttribute("value");
            logger.info("Pawn ticket number of this product is  " + value);
            waitTime(2000);
            click(PrendaPage.obj_pawnTicket_menu, " pawn ticket menu");
            waitTime(1000);
            click(PrendaPage.obj_modal_ticketNumber_input, " pawn ticket number");
            type(PrendaPage.obj_modal_ticketNumber_input, value, " pawn ticket number");
            click(PrendaPage.obj_modal_filter_btn, " filter ");
            waitTime(1500);
            click(PrendaPage.obj_modal_select_first, " select the first search output");
            click(PrendaPage.obj_modal_select_btn, " select button");
            logger.info("Can filter existing prenda transactinon");
            extentLoggerPass("", "To verify filtering prenda existing prenda transaction validated");
        }else {
            extentLoggerFail("","Failed To Validate Filtering Prenda Existing Transaction");
        }
    }


}