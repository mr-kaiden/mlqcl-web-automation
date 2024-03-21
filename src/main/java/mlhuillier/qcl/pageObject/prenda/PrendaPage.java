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
    public static By obj_reference2_label  = By.xpath("//*[contains(text(), 'Reference File 2')]");
    public  static By obj_reference2_input  = By.xpath("//input[@placeholder='Reference File 2']");
    public static  By obj_reference3_label  = By.xpath("//*[contains(text(), 'Reference File 3')]");
    public  static By obj_reference3_input  = By.xpath("//input[@placeholder='Reference File 3']");
    public  static By obj_itemType_label  = By.xpath("//*[contains(text(), 'Item Type')]");
    public  static By obj_itemType_dropdown  = By.xpath("//*[@id='headlessui-menu-button-:r4:']");
    public static  By obj_crmScore_label  = By.xpath("//*[contains(text(), 'CRM Score')]");
    public  static By obj_crmScore_togglebtn  = By.xpath("//*[@id='headlessui-switch-:r5:']");
    public static  By obj_crmScore_text  = By.xpath("//*[contains(text(), 'Toggle button to apply CRM Score.')]");
    public  static By obj_items_btn  = By.xpath("//*[@id='headlessui-tabs-tab-:r6:']");

//    add items
    public  static By obj_itemCode_menu  = By.xpath("//td/div[1]//*[namespace-uri()='http://www.w3.org/2000/svg']");
    public  static By obj_itemCodeSelect_101 = By.xpath("//*[contains(text(), '101')]");
    public  static By obj_select_btn = By.xpath("//button[contains(text(), 'Select')]");
    public  static By obj_addItem_btn  = By.xpath("//*[@class='text-end my-2']/button");
    public  static By obj_itemCode_input  = By.xpath ( "//input[@placeholder='ITEM CODE']" );
    public  static By obj_description_input  = By.xpath ( "//input[@placeholder='DESCRIPTION']" );
    public  static By obj_itemType_input  = By.xpath ( "//td[4]//input" );
    public  static By obj_itemType_sellable  = By.xpath ( "//button[contains(text(), 'SELLABLE')]" );

    public  static By obj_itemType_select  = By.xpath ( "//*[contains(text(), 'SELLABLE')]" );
    public  static By obj_itemQuantity_input  = By.xpath ( "//td[5]//input" );
    public  static By obj_itemKarat_input  = By.xpath ( "//td[10]//input" );
    public  static By obj_itemKarat_22  = By.xpath ( "//button[contains(text(), '22')]" );
    public  static By obj_sortingClass_input  = By.xpath ( "//td[11]//input" );
    public  static By obj_itemSoritng_chinese  = By.xpath ( "//button[contains(text(), 'CHINESE')]" );
    public  static By obj_item_div  = By.xpath ( "//*[@class='relative overflow-x-auto']" );
    public  static By obj_weight_input  = By.xpath ( "//td[12]//input" );
    public  static By obj_choosePhoto  = By.xpath ( "//td[17]//input" );
    public  static By obj_save_button  = By.xpath ( "//td//*[@class='relative']/button[1]" );

//    Save Prenda Transaction
    public  static By obj_yes_button  = By.xpath ( "//button[contains(text(), 'Yes')]" );
    public  static By obj_saveComplete_modal  = By.xpath ( "//h2[contains(text(), 'Save Complete')]" );

// side information about the branch
    public static  By obj_branch_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[1]");
    public  static By obj_branch_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[2]");
    public  static By obj_branchManager_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[3]");
    public  static By obj_branchManager_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[4]");
    public  static By obj_branchAddress_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[5]");
    public  static By obj_branchAddress_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[6]");
    public  static By obj_corporationName_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[7]");
    public  static By obj_corporationName_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[8]");
    public static  By obj_tin_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[9]");
    public  static By obj_tin_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[10]");
    public static  By obj_branchTelephone_label = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[11]");
    public static  By obj_branchTelephone_text = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']//p[12]");
    public  static By obj_appraisedAmount_label = By.xpath("//*[contains(text(), 'Appraised Amount (PHP)')]");
    public static  By obj_appraisedAmount_input = By.xpath("//*[contains(text(), 'Appraised Amount (PHP)')]/following-sibling::input");
    public  static By obj_loanValue_label = By.xpath("//*[contains(text(), 'Loan Value (PHP)')]");
    public  static By obj_loanValue_input  = By.xpath("//*[contains(text(), 'Loan Value (PHP)')]/following-sibling::input");
    public  static By obj_crmAddon_label = By.xpath("//*[contains(text(), 'CRM Add On (PHP)')]");
    public static  By obj_crmAddon_input = By.xpath("//*[contains(text(), 'CRM Add On (PHP)')]/following-sibling::input");
    public  static By obj_storageFee_label = By.xpath("//*[contains(text(), 'Storage fee (PHP)')]");
    public static  By obj_storageFee_input = By.xpath("//*[contains(text(), 'Storage fee (PHP)')]/following-sibling::input");
    public  static By obj_appraisedAmountTotal_label = By.xpath("//*[contains(text(), 'Total Appraised Amount (PHP)')]");
    public  static By obj_appraisedAmountTotal_input = By.xpath("//*[contains(text(), 'Total Appraised Amount (PHP)')]/following-sibling::input");
    public  static By obj_interest_label = By.xpath("//*[contains(text(), 'Interest (PHP)')]");
    public  static By obj_interest_input = By.xpath("//*[contains(text(), 'Interest (PHP)')]/following-sibling::input");
    public  static By obj_serviceChargeDst_label = By.xpath("//*[contains(text(), 'Service charge & DST (PHP)')]");
    public static  By obj_serviceChargeDst_input = By.xpath("//*[contains(text(), 'Service charge & DST (PHP)')]/following-sibling::input");
    public  static By obj_netProceed_label = By.xpath("//*[contains(text(), 'Net Proceed (PHP)')]");
    public static  By obj_netProceed_input = By.xpath("//*[contains(text(), 'Net Proceed (PHP)')]/following-sibling::input");
    public  static By obj_printOR_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[1]");
    public static  By obj_printPT_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[2]");
    public  static By obj_new_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[3]");
    public static  By obj_save_btn  = By.xpath("//*[@class='p-4 w-full bg-secondaryBg center-row-start gap-3 rounded-md']//button[4]");

//    POP UP
    public  static By obj_customerLookUp_header = By.xpath ( "//*[contains(text(), 'Customer Lookup')]" );
    public  static By obj_lastname_label = By.xpath ( "//*[contains(text(), 'Last Name')]" );
    public  static By obj_lastname_input = By.xpath ( "//input[@placeholder='Last Name ']" );
    public  static By obj_firstname_label = By.xpath ( "//*[contains(text(), 'First Name')]" );
    public static  By obj_firstname_input = By.xpath ( "//input[@placeholder='First Name ']" );
    public static  By obj_middleName_label = By.xpath ( "//*[contains(text(), 'Middle Name')]" );
    public static  By obj_middleName_input = By.xpath ( "//input[@placeholder='Middle Name ']" );
    public  static By obj_birthday_label = By.xpath ( "//*[contains(text(), 'Birthdate')]" );
    public static  By obj_birsthday_input = By.xpath ( "//input[@name='birthDate']" );
    public static  By obj_search_btn = By.xpath ( "//*[@id='headlessui-dialog-panel-:rf:']/div[2]/button" );
    public static  By obj_cleardate_btn = By.xpath ( "(//*[@class='ant-picker-input']//*[namespace-uri()='http://www.w3.org/2000/svg'])[3]" );
    public  static By obj_select_25 = By.xpath ( "//div[contains(text(), '25')]" );
    public  static By obj_select_27 = By.xpath ( "//div[contains(text(), '27')]" );
    public static  By obj_other = By.xpath ( "" );
    public  static By obj_crm = By.xpath ( "" );
    public static  By obj_searching_loading = By.xpath ( "//*[@id='headlessui-dialog-panel-:rt:']" );
    public  static By obj_customerFound_loading = By.xpath ( "//*[@id='headlessui-dialog-title-:r3j:']" );
    public static  By obj_confirm_btn = By.xpath ( "//*[@class='py-3 center-row-end gap-3']/button[1]" );
    public  static By obj_cancel_btn = By.xpath ( "//*[@class='py-3 center-row-end gap-3']/button[2]" );

//    Pawn Ticket Number / OR Number
    public  static By obj_modal_ticketNumber_input  = By.xpath("(//input[@placeholder='Pawn Ticket Number'])[2]");
    public  static By obj_modal_filter_btn  = By.xpath("//*[@class='flex justify-start gap-2 items-end']/button[1]");
    public  static By obj_modal_select_btn  = By.xpath("//button[contains(text(), 'Select')]");
    public  static By obj_modal_select_first  = By.xpath("(//tbody)[2]/tr");

//    Print pt
    public  static By obj_modal_  = By.xpath("(//p/strong)[2]");
    public  static By obj_requestApproval_text  = By.xpath("//h2[contains(text(), 'Request Approval')]");

//    For Compliance Assistance Modal
    public  static By obj_greaterTotal_text  = By.xpath("//*[contains(text(), 'Loan Amount is greater than Total Appraised Value')]");
    public  static By obj_ok_btn  = By.xpath("//button[contains(text(), 'OK')]");
    public  static By obj_forComplianceAssisstance_text  = By.xpath("//*[contains(text(), 'For Compliance Assistance')]");


}
