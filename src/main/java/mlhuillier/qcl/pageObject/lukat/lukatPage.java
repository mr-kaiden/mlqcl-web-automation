package mlhuillier.qcl.pageObject.lukat;

import org.openqa.selenium.By;

public class lukatPage {

    public static By ObjLukat = By.xpath ( "//*[@id='__next']/aside/div/div[2]/button[2]" );
    public static By ObjLukatDetails = By.xpath("//*[contains(text(), 'Lukat Details')]");
    public static By ObjBranchDetails = By.xpath("//*[contains(text(), 'Branch')]");

    public static By ObjCustomer = By.xpath("//*[contains(text(), 'Customer Name')]");

    public static By ObjKebabBtn = By.xpath("(//*[@class='text-teriaryDark absolute pointer-events-pointer right-0 top-1/2 transform -translate-y-1/2  hover:cursor-pointer'])[1]");
    public static By ObjSearchPawnTicket = By.xpath("//*[@id='headlessui-dialog-title-:rb:']");

    public static By ObjPawnTikcetNumberInput = By.xpath("//*[@name='ptn_number']");

    public static By ObjFilterButton = By.xpath("//*[contains(text(), 'Filter')]");

    public static By ObjDataGridDisplay = By.xpath("//*[@id='headlessui-dialog-panel-:ra:']/div[3]/table/tbody/tr/td[5]");

    public static By ObjSelectButton = By.xpath("//*[@id='headlessui-dialog-panel-:ra:']/div[5]/button[1]");
    public static By ObjPawnticketNumber = By.xpath("//*[@id='__next']/div/div/div/div[2]/div/form/div[1]/div[1]/div[1]/label");
    public static By ObjTransactionDate = By.xpath("//*[contains(text(), 'Transaction Date')]");
    public static By ObjEmployee = By.xpath("//*[@id='__next']/div/div/div/div[2]/div/form/div[1]/div[1]/div[3]/label");
    public static By ObjPaymentMethod = By.xpath("//*[@id='__next']/div/div/div/div[3]/div/div[1]/label");
    public static By ObjPaymentMethodDropdown = By.xpath("(//*[contains(text(),'Select')])[1]");
    public static By ObjPaymentMethodOption = By.xpath("(//*[contains(text(),'Cash')])[1]");

    public static By ObjLukatAmount = By.xpath("//*[contains(text(), 'Lukat Amount')]");
    public static By ObjLukatAmountValue = By.xpath("//*[@id='__next']/div/div/div/div[3]/div/div[2]/div/input");

    // Computation------------------------------------------------------------------------------------------------------
    public static By ObjComputation = By.xpath("//*[contains(text(), 'Computations')]");

    public static By ObjAMOUNT = By.xpath("//*[contains(text(), 'AMOUNT')]");
    public static By ObjAMOUNTvalue = By.xpath("//*[@id='headlessui-tabs-panel-:r7:']/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[1]");
    public static By ObjPRINCIPAL = By.xpath("//*[contains(text(), 'PRINCIPAL')]");
    public static By ObjPRINCIPALvalue = By.xpath("//*[@id='headlessui-tabs-panel-:r7:']/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[2]");

    public static By ObjNoofMonths = By.xpath("//*[@id='headlessui-tabs-panel-:r7:']/div[1]/div/div/div/div/div/div/table/thead/tr/th[3]");
    public static By ObjNoofMonthsValue = By.xpath("//*[@id='headlessui-tabs-panel-:r7:']/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[3]");


    //Item--------------------------------------------------------------------------------------------------------------

    public static By ObjItems = By.xpath("//*[contains(text(), 'Items')]");
    public static By ObjItemCode = By.xpath("//*[contains(text(), 'ITEM CODE')]");
    public static By ObjItemDescription = By.xpath("//*[contains(text(), 'ITEM DESCRIPTION')]");
    public static By ObjDescription = By.xpath("//*[@id='headlessui-tabs-panel-:r8:']/div[1]/div/div/div/div/div/div/table/thead/tr/th[3]");
    public static By ObjType = By.xpath("//*[contains(text(), 'YPE')]");
    public static By ObjItemQuantity = By.xpath("//*[contains(text(), 'ITEM QUANTITY')]");
    public static By ObjSingleCarat = By.xpath("//*[contains(text(), 'SINGLE CARAT')]");
    public static By ObjDiamond_Amount_Value = By.xpath("//*[contains(text(), 'DIAMOND AMOUNT VALUE')]");
    public static By ObjKarat = By.xpath("//*[contains(text(), 'KARAT')]");

    public static By ObjSorting_Class = By.xpath("//*[contains(text(), 'SORTING CLASS')]");
    public static By ObjWeight_in_Grams = By.xpath("//*[contains(text(), 'WEIGHT')]");
    public static By Objkarat_Rate = By.xpath("//*[@id='headlessui-tabs-panel-:r8:']/div[1]/div/div/div/div/div/div/table/thead/tr/th[13]");
    public static By ObjAppraised_value = By.xpath("//*[contains(text(), 'APPRAISED VALUE')]");
    public static By ObjAction = By.xpath("//*[contains(text(), 'ACTION')]");
    public static By ObjAction_eye_icon = By.xpath("//*[@id='headlessui-tabs-panel-:r8:']/div[1]/div/div/div/div/div/div/table/tbody/tr[2]/td[15]/div/button");

    //Action Eye Icon---------------------------------------------------------------------------------------------------

    public static By ObjAction_ItemDetails = By.xpath("//*[contains(text(), 'Item Details')]");
    public static By ObjAction_CloseBtn = By.xpath("//*[@class='icon-btn-colored bg-mlRed text-secondaryBg']");
    public static By saveBtn = By.xpath("//*[contains(text(),'Save')]");
    public static By ObjSave_Lukat_Transaction = By.xpath("//*[contains(text(),'Save Lukat Transaction')]");
    public static By ObjSaveBtnVerification = By.xpath("//*[contains(text(),'Yes')]");
    public static By ObjSave_Complete_Modal = By.xpath("//*[contains(text(),'Save Complete')]");
    public static By ObjModal_Message = By.xpath("//*[contains(text(),'Lukat Transaction has been successfully saved.')]");
    public static By ObjPrint_OR = By.xpath("//*[contains(text(),'Print OR')]");
    public static By ObjPrint_OR_Modal = By.xpath("//*[@class='text-xl font-bold leading-6 text-secondaryDark text-center']");


    public static By ObjBranch_Name = By.xpath("(//*[contains(text(),'MLTG QA TESTING BRANCH')])[2]");
    public static By ObjCustomer_Name = By.xpath("(//*[@class='flex justify-start flex-col']/p)[1]");

    public static By ObjPt_Number = By.xpath("(//*[@class='flex justify-start flex-col']/div/div/p)[1]");
    public static By ObjAmount = By.xpath("(//*[@class='flex justify-start flex-col']/div/div/p)[5]");

    public static By ObjNew = By.xpath("//*[@class='center-row gap-1 regular-btn text-teriaryDark bg-teriaryBg']");

    public static By ObjYesBtn = By.xpath("//*[@class='rounded-md p-2 bg-mlRed text-secondaryBg disabled:bg-gray-300 disabled:text-gray-500 disabled:cursor-not-allowed min-w-[100px]']");

    public static By ObjFormCleared = By.xpath("//*[@class='text-xl font-bold leading-6 text-center text-buttonFontColorGreen']");








}
