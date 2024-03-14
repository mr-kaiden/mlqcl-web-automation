package mlhuillier.qcl.pageObject.prenda;

import org.openqa.selenium.By;

public class PrendaPage {
    public static  By obj_prenda_navigator  = By.xpath("//button[contains(text(), 'Prenda')]");
    public  static By obj_prenda_header  = By.xpath("//h1[contains(text(), 'Prenda')]");
    public  static By obj_prenda_details  = By.xpath("//span[contains(text(), 'Prenda Details')]");
    public  static By obj_ticketNumber_label  = By.xpath("//*[contains(text(), 'Pawn Ticket Number')]");
    public  static By obj_ticketNumber_input  = By.xpath("//input[@placeholder='Pawn Ticket Number']");
    public static By obj_pawnTicket_menu  = By.xpath("(//*[@class='relative w-full ']//*[namespace-uri()='http://www.w3.org/2000/svg'])[1]");
    public static  By obj_dateTime_label  = By.xpath("//*[contains(text(), 'Date & Time')]");
    public  static By obj_dateTime_input  = By.xpath("//input[@placeholder='Date & Time']");
    public static  By obj_employee_label  = By.xpath("//*[contains(text(), 'Employee')]");
    public static  By obj_employee_input  = By.xpath("//input[@placeholder='Employee']");
    public static  By obj_contactName_label  = By.xpath("//*[contains(text(), 'Customer Name')]");
    public  static By obj_contactName_input  = By.xpath("//input[@placeholder='Customer Name']");
    public static  By obj_customerName_menu  = By.xpath("(//*[@class='relative w-full ']//*[namespace-uri()='http://www.w3.org/2000/svg'])[3]");
    public  static By obj_mlCardNo_label  = By.xpath("//*[contains(text(), 'ML Card No')]");
    public  static By obj_mlCardNo_input  = By.xpath("//input[@placeholder='ML Card No.']");
    public  static By obj_ptnStatus_label  = By.xpath("//*[contains(text(), 'PTN Status')]");
    public  static By obj_ptnStatus_input  = By.xpath("//input[@placeholder='PTN Status']");
    public  static By obj_appraiserName_label  = By.xpath("//*[contains(text(), 'Appraiser Name')]");
    public  static By obj_appraiserName_input  = By.xpath("//input[@placeholder='Appraiser Name']");
    public  static By obj_remarks_label = By.xpath("//*[contains(text(), 'Remarks')]");
    public static  By obj_remarks_input  = By.xpath("//textarea[@placeholder='Remarks']");
    public static  By obj_dateLoanGranted_label  = By.xpath("//*[contains(text(), 'Date Loan Granted')]");
    public  static By obj_dateLoanGranted_input  = By.xpath("//input[@placeholder='Date Loan Granted']");
    public static  By obj_maturityDate_label  = By.xpath("//*[contains(text(), 'Maturity Date')]");
    public static  By obj_maturityDate_input  = By.xpath("//input[@placeholder='Maturity Date']");
    public  static By obj_expiryDate_label  = By.xpath("//*[contains(text(), 'Expiry Date')]");
    public  static By obj_expiryDate_input  = By.xpath("//input[@placeholder='Expiry Date']");
    public static By obj_reference1_label  = By.xpath("//*[contains(text(), 'Reference File 1')]");
    public static  By obj_reference1_input  = By.xpath("//input[@placeholder='Reference File 1']");
    public By obj_reference2_label  = By.xpath("//*[contains(text(), 'Reference File 2')]");
    public By obj_reference2_input  = By.xpath("//input[@placeholder='Reference File 2']");
    public By obj_reference3_label  = By.xpath("//*[contains(text(), 'Reference File 3')]");
    public By obj_reference3_input  = By.xpath("//input[@placeholder='Reference File 3']");
    public By obj_itemType_label  = By.xpath("//*[contains(text(), 'Item Type')]");
    public By obj_itemType_dropdown  = By.xpath("//*[@id='headlessui-menu-button-:r4:']");
    public By obj_crmScore_label  = By.xpath("//*[contains(text(), 'CRM Score')]");
    public By obj_crmScore_togglebtn  = By.xpath("//*[@id='headlessui-switch-:r5:']");
    public By obj_crmScore_text  = By.xpath("//*[contains(text(), 'Toggle button to apply CRM Score.')]");
    public By obj_ites_btn  = By.xpath("//*[@id='headlessui-tabs-tab-:r6:']");
    public By obj_addItem_btn  = By.xpath("//*[@class='text-end my-2']/button");

// side information about the branch
    public By obj_branch_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[1]");
    public By obj_branch_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[2]");
    public By obj_branchManager_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[3]");
    public By obj_branchManager_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[4]");
    public By obj_branchAddress_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[5]");
    public By obj_branchAddress_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[6]");
    public By obj_corporationName_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[7]");
    public By obj_corporationName_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[8]");
    public By obj_tin_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[9]");
    public By obj_tin_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[10]");
    public By obj_branchTelephone_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[11]");
    public By obj_branchTelephone_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[12]");

    public By obj_appraisedAmount_label = By.xpath("//*[contains(text(), 'Appraised Amount (PHP)')]");
    public By obj_appraisedAmount_input = By.xpath("//*[contains(text(), 'Appraised Amount (PHP)')]/following-sibling::input");
    public By obj_loanValue_label = By.xpath("//*[contains(text(), 'Loan Value (PHP)')]");
    public By obj_loanValue_input  = By.xpath("//*[contains(text(), 'Loan Value (PHP)')]/following-sibling::input");
    public By obj_crmAddon_label = By.xpath("//*[contains(text(), 'CRM Add On (PHP)')]");
    public By obj_crmAddon_input = By.xpath("//input[@placeholder='CRM Add On (PHP)']");
    public By obj_storageFee_label = By.xpath("//*[contains(text(), 'Storage fee (PHP)')]");
    public By obj_storageFee_input = By.xpath("//*[contains(text(), 'Storage fee (PHP)')]/following-sibling::input");
    public By obj_appraisedAmountTotal_label = By.xpath("//*[contains(text(), 'Total Appraised Amount (PHP)')]");
    public By obj_appraisedAmountTotal_input = By.xpath("//*[contains(text(), 'Total Appraised Amount (PHP)')]/following-sibling::input");
    public By obj_interest_label = By.xpath("//*[contains(text(), 'Interest (PHP)')]");
    public By obj_interest_input = By.xpath("//*[contains(text(), 'Interest (PHP)')]/following-sibling::input");
    public By obj_serviceChargeDst_label = By.xpath("//*[contains(text(), 'Service charge & DST (PHP)')]");
    public By obj_serviceChargeDst_input = By.xpath("//*[contains(text(), 'Service charge & DST (PHP)')]/following-sibling::input");
    public By obj_netProceed_label = By.xpath("//*[contains(text(), 'Net Proceed (PHP)')]");
    public By obj_netProceed_input = By.xpath("//*[contains(text(), 'Net Proceed (PHP)')]/following-sibling::input");
    public By obj_printOR_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[1]");
    public By obj_printPT_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[2]");
    public By obj_new_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[3]");
    public By obj_save_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[4]");

//    POP UP
    public By obj_customerLookUp_header = By.xpath ( "//*[contains(text(), 'Customer Lookup')]" );
    public By obj_lastname_label = By.xpath ( "//*[contains(text(), 'Last Name')]" );
    public By obj_lastname_input = By.xpath ( "//input[@placeholder='Last Name ']" );
    public By obj_firstname_label = By.xpath ( "//*[contains(text(), 'First Name')]" );
    public By obj_firstname_input = By.xpath ( "//input[@placeholder='First Name ']" );
    public By obj_middleName_label = By.xpath ( "//*[contains(text(), 'Middle Name')]" );
    public By obj_middleName_input = By.xpath ( "//input[@placeholder='Middle Name ']" );
    public By obj_birthday_label = By.xpath ( "//*[contains(text(), 'Birthdate')]" );
    public By obj_birsthday_input = By.xpath ( "//input[@name='birthDate']" );
    public By obj_search_btn = By.xpath ( "//*[@id='headlessui-dialog-panel-:r23:']/div[2]/button" );
    public By obj_other = By.xpath ( "" );
    public By obj_crm = By.xpath ( "" );
    public By obj_searching_loading = By.xpath ( "//*[@id='headlessui-dialog-panel-:r3f:']" );
    public By obj_customerFound_loading = By.xpath ( "//*[@id='headlessui-dialog-title-:r3j:']" );
    public By obj_confirm_btn = By.xpath ( "//*[@class='py-3 center-row-end gap-3']/button[1]" );
    public By obj_cancel_btn = By.xpath ( "//*[@class='py-3 center-row-end gap-3']/button[2]" );


}
