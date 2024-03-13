package mlhuillier.qcl.pageObject.renew;

import org.openqa.selenium.By;

public class renewPage {

    public static By renewMenuBtn = By.xpath("(//*[contains(text(), 'Renew')])[1]");
    public static By renewRenewPage = By.xpath("(//*[contains(text(), 'Renew Details')])");

    public static By transactionnAmount = By.xpath("(//*[@class='general-text-input lg:w-[250px] md:w-[250px] w-full text-right'])[1]");
//    public static By transactionnAmount = By.xpath("(//input[@disabled])[9]");
    public static By KebabBtn = By.xpath("(//*[@class='text-teriaryDark absolute pointer-events-pointer right-0 top-1/2 transform -translate-y-1/2  hover:cursor-pointer'])[1]");
    public static By ptStatus = By.xpath("//*[contains(text(),'OPEN')]");
    public static By selectBtn = By.xpath("(//*[contains(text(),'Select')])[2]");
    public static By paymentMethodBtn = By.xpath("(//*[contains(text(),'Select')])[1]");
    public static By paymentMethodCash = By.xpath("(//*[contains(text(),'Cash')])[1]");
    public static By tenderAmount = By.xpath("//*[@class='general-text-input w-[250px] text-right']");
    public static By yesBtn = By.xpath("//*[contains(text(),'Yes')]");
    public static By printORBtn = By.xpath("//*[contains(text(),'Print')][1]");
    public static By printPTBtn = By.xpath("//*[contains(text(),'Print')][2]");
    public static By printBtn = By.xpath("//*[contains(text(),'PRINT')]");
    public static By closeBtn = By.xpath("//*[@title='close']");
    public static By saveBtn = By.xpath("//*[contains(text(),'Save')]");
    public static By ItemsBtn = By.xpath("//*[contains(text(),'Items')]");
    public static By EyesBtn = By.xpath("//*[@class='flex justify-center gap-2']//child::button");
    public static By itemsDetails = By.xpath("//*[contains(text(),'Item Details')]");
    public static By messageDialog = By.xpath("//*[@id='headlessui-dialog-panel-:rl:']");

}
