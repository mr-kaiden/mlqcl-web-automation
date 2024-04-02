package mlhuillier.qcl.pageObject;


import org.openqa.selenium.By;

public class LoginPage {


        public static By kpxlogin = By.xpath("//*[@class='login-btn']");
        public  static By kpxusername = By.xpath("//*[@name='username']");
        public  static By kpxpassword= By.xpath("//*[@name='password']");

        public  static By kpxlogind = By.xpath("//*[@type='submit']");
        public static By googleSign = By.xpath("//*[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']");
        public static By email_google = By.xpath("//*[@id='identifierId']");
        public static By nextBtn_google = By.xpath("//*[contains(text(), 'Next')]");
        public static By password_google = By.xpath("//*[@type='password']");
        public static By obj_2StepsVerificatoin = By.xpath("//span[contains(text(), '2-Step Verification')]");

        public static By try_another_way_google = By.xpath("//span[contains(text(), 'Try another way')]");
        public static By enter_back_up_codes_google = By.xpath("//*[contains(text(), 'Google Authenticator')]");
        public static By input_back_up_codes_google = By.xpath("//*[@type= 'tel']");
        public static By LoginText = By.xpath("//*[contains(text(), 'Login')]");
        public static By invalid_login_credential = By.xpath("//*[@id='swal2-content']/h5");


        public static By fieldAttempts = By.xpath("//*[contains(text(),'Too many failed attempts')]");
//        Preda

        public static By Dashboard = By.xpath ( "(//*[contains(text(), 'Dashboard')])[2]" );

        public static By objPNavigation = By.xpath ( "//*[@id='__next']/aside/div/div[2]/button[1]" );

        public static By objQCLL = By.xpath ( "//*[@id='__next']/div/div/div[1]/div/div[2]/h1" );

        public static By objcontinue =  By.xpath ( "//*[@id='__next']//span" );

        public static By objprendadetails = By.xpath ( "//*[@class='w-full center-row-between bg-secondaryBg rounded-t-md p-4 text-xl font-semibold text-mainDark']");
        public static By objbranchdetail =  By.xpath ( "//*[contains(text(), 'Branch: ')]" );
        public static By objContactDetails =  By.xpath ( "//*[contains(text(), 'Customer Name')]" );
        public static By objDateGranted =  By.xpath ( "//*[contains(text(), 'Date Loan Granted')]" );
        public static By objMaturityDate =  By.xpath ( "//*[contains(text(), 'Maturity Date')]" );
        public static By objExpireDate =  By.xpath ( "//*[contains(text(), 'Expiry Date')]" );

}

