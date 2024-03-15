package mlhuillier.qcl.pageObject.renew;

import org.openqa.selenium.By;

public class renewPage {

    public static By objRenewNavigation = By.xpath("(//*[contains(text(), 'Renew')])[1]");
    public static By objRenewLabel = By.xpath("(//*[contains(text(), 'Renew Details')])");

    public static By objTransactionsAmount = By.xpath("(//*[@class='general-text-input lg:w-[250px] md:w-[250px] w-full text-right'])[1]");

    public static By objKebabBtn = By.xpath("(//*[@class='text-teriaryDark absolute pointer-events-pointer right-0 top-1/2 transform -translate-y-1/2  hover:cursor-pointer'])[1]");
    public static By objOpenStatus = By.xpath("//*[contains(text(),'OPEN')]");
    public static By objCloseStatus = By.xpath("//*[contains(text(),'CLOSED')]");
    public static By objSelectBtn = By.xpath("(//*[contains(text(),'Select')])[2]");
    public static By objPaymentMethodBtn = By.xpath("(//*[contains(text(),'Select')])[1]");
    public static By objPaymentMethodCash = By.xpath("(//*[contains(text(),'Cash')])[1]");
    public static By objTenderAmount = By.xpath("//*[@class='general-text-input w-[250px] text-right']");
    public static By objYesBtn = By.xpath("//*[contains(text(),'Yes')]");
    public static By objPrintOR = By.xpath("//*[contains(text(),'Print')][1]");
    public static By objPrintPT = By.xpath("//*[contains(text(),'Print')][2]");
    public static By objPrintBtn = By.xpath("//*[contains(text(),'PRINT')]");
    public static By objCloseBtn = By.xpath("//*[@title='close']");
    public static By objSaveBtn = By.xpath("//*[contains(text(),'Save')]");
    public static By objItemsBtn = By.xpath("//*[contains(text(),'Items')]");
    public static By objEyesIcon = By.xpath("//*[@class='flex justify-center gap-2']//child::button");
    public static By objItemModal = By.xpath("//*[@class='w-[1000px] transform overflow-hidden rounded-2xl bg-white p-6 text-left align-middle shadow-xl transition-all']");
//    public static By objSaveComplete = By.xpath("//*[@id='headlessui-dialog-panel-:rl:']");

    public static By objErrorMessage = By.xpath("//*[contains(text(),'Insufficient Tender Amount.')]");
    public static By objOkBtn = By.xpath("//button[contains(text(),'OK')]");
    public static By objNewTransactionBtn = By.xpath("//button[contains(text(),'New')]");

    public static By objNewFormModal = By.xpath("//*[@class='w-full max-w-md transform overflow-hidden rounded-2xl bg-white p-6 text-left align-middle shadow-xl transition-all']");
//    public static By objFormCleared = By.xpath(" //*[@id='headlessui-dialog-panel-:r1b:']");


}
