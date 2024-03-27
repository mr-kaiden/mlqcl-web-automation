package mlhuillier.qcl.pageObject.reappraise;

import org.openqa.selenium.By;

public class reappraisePage {
    public static By objReappraiseNavigation = By.xpath("(//*[contains(text(), 'Reappraise')])[1]");
    public static By objReappraiseLabel = By.xpath("(//*[contains(text(), 'Reappraise Details')])");
    public static By objCustomer = By.xpath("//*[@class='general-text-input w-full cursor-zoom-in']");
    public static By objNewLoanAmount = By.xpath("(//*[@class='general-text-input w-full'])[1]");
    public static By objBranchName = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']/child::p[2]");
    public static By objBranchManager = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']/child::p[4]");
    public static By objBranchAddress = By.xpath("//*[@class='grid grid-cols-2 gap-3 my-4']/child::p[6]");
    public static By objPawnTicketNo = By.xpath("(//*[@class='hover:cursor-pointer hover:bg-green-200 duration-200']/td)[1]");
    public static By objPawnTicketField = By.xpath("(//*[@class='block p-2 text-sm border border-gray-300 rounded-lg outline-[rgba(0,0,0,.3)] bg-gray-50'])[1]");
    public static By objFilterBtn = By.xpath("//*[contains(text(),' Filter')]");
    public static By objFilterResult = By.xpath("//*[@class='text-center']/child::tr");
    public static By objConfirmationDialog = By.xpath("//*[@class='text-xl font-bold leading-6 text-secondaryDark text-center']");
    public static By objRedeemPoints = By.xpath("//*[@class='mb-3 grid grid-cols-2 gap-2']/child::button");

    ///OR Receipt//////////
    public static By objORPrincipal = By.xpath("(//*[@class='ml-3'])[2]/p[2]");

    /////////////////PT Receipt/////////////
    public static By objPTPrincipal = By.xpath("//*[@class='flex flex-row gap-3 items-end absolute left-0 top-10']");
}
