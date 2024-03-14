package mlhuillier.qcl.testSteps;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.pageObject.lukat.lukatPage;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;

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
        verifyElementPresent (LoginPage.Dashboard, "dashbord");
        waitTime(2000);
        verifyElementPresentAndClick( lukatPage.ObjLukat, "Luakt Navigation");
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






        extentLoggerPass("", "To verify Lukat Functionality");

    }
}
