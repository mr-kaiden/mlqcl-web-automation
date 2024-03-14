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
    public static By ObjPaymentMethodDropdown = By.xpath("//*[@id='headlessui-menu-button-:r4:']");




}
