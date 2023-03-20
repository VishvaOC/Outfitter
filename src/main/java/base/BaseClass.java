package base;

import Utils.ReportMail;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {
    public static ExtentSparkReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static WebDriver driver;
    Properties prop;


    //--- For the open the chrome before every test case and set the url ---//
    @BeforeMethod
    public void init(){


        FileInputStream fileInput = null;

            File file = new File("src//test//java//Config//config.properties");

            try {
                fileInput = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            prop = new Properties();

            //load properties file
            try {
                prop.load(fileInput);
                if(prop.getProperty("BrowserName").equalsIgnoreCase("chrome")){
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions co = new ChromeOptions();
                    co.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(co);

                }
                if(prop.getProperty("BrowserName").equalsIgnoreCase("Firefox")){
                    WebDriverManager.chromiumdriver().setup();
                    driver = new FirefoxDriver();
                }
                driver.manage().window().maximize();

                driver.get(prop.getProperty("url"));
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
    }



    //--- For the Close the chrome ---//
    @AfterMethod
    public void Teardown(){
        driver.quit();
    }
    @AfterSuite
    public void mail(){
        ReportMail mail = new ReportMail();
        mail.report_mail();
    }

}

