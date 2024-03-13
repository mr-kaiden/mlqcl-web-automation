package mlhuillier.qcl.pageObject.lukat;

import org.openqa.selenium.By;

public class lukatPage {

    public static By ObjLukat = By.xpath ( "//*[@id='__next']/aside/div/div[2]/button[2]" );
    public static By ObjLukatDetails = By.xpath("//*[contains(text(), 'Lukat Details')]");
    public static By ObjBranchDetails = By.xpath("//*[contains(text(), 'Branch')]");

    public static By ObjCustomer = By.xpath("//*[contains(text(), 'Customer Name')]");
}
