package mlhuillier.qcl.testScripts;

import com.aventstack.extentreports.ExtentTest;
import mlhuillier.qcl.testSteps.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import mlhuillier.qcl.utilities.driverInstance.AppiumServer;
import mlhuillier.qcl.utilities.propertyfilereader.PropertyFileReader;
import mlhuillier.qcl.utilities.LoggingUtils;
import org.testng.asserts.SoftAssert;
import mlhuillier.qcl.testSteps.QCLWeb;
import mlhuillier.qcl.testSteps.Lukat;
import mlhuillier.qcl.testSteps.PrendaTestSteps;
import mlhuillier.qcl.testSteps.RenewTestSteps;
import mlhuillier.qcl.testSteps.testExecution.TestExecutionUtils;
import static mlhuillier.qcl.utilities.Utilities.softAssert;

public class BaseTest {

    protected mlhuillier.qcl.testSteps.BaseClass baseClass;

    protected QCLWeb QCLWeb;

    protected Lukat Lukat;

    protected PrendaTestSteps PrendaTestSteps;

    protected RenewTestSteps RenewTestSteps;

    protected TestExecutionUtils TestExecutionUtils;

    public static ExtentTest testLogger;
    AppiumServer server = new AppiumServer();
    protected static LoggingUtils logger = new LoggingUtils();
    public static PropertyFileReader prop;
    public static PropertyFileReader accountCredential;
    public String osName = System.getProperty("os.name").toLowerCase();

    //To Read Properties File Based On Current OS Of Laptop
    public void propertyFileReader() {
        if (osName.contains("mac") || osName.contains("linux")) {
            System.out.println(osName);
            prop = new PropertyFileReader(".//dto//testdata.properties");
        } else {
            prop = new PropertyFileReader(".\\dto\\testdata.properties");
        }

    }

    public void accountCredentialReader(){
        if (osName.contains("mac") || osName.contains("linux")) {
            System.out.println(osName);
            accountCredential = new PropertyFileReader ( ".//credential//accountCredential.properties" );
        } else {
            accountCredential = new PropertyFileReader ( ".\\credential\\accountCredential.properties" );

        }
    }



    //Start Application
    @Parameters({"deviceName", "portno"})
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(String deviceName, String portno) throws Exception {
        baseClass = new BaseClass("qcl", deviceName, portno);
        TestExecutionUtils = new TestExecutionUtils();
        QCLWeb = new QCLWeb();
        Lukat = new Lukat();
        PrendaTestSteps = new PrendaTestSteps();
        RenewTestSteps = new RenewTestSteps();
        propertyFileReader();
        accountCredentialReader();
        softAssert = new SoftAssert();

    }



    //    Stop Application
    @AfterMethod
    public void afterTest() {
        baseClass.tearDown();
    }


}

