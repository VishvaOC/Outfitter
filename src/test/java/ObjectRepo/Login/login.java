package ObjectRepo.Login;

import com.aventstack.extentreports.Status;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

import static base.BaseClass.driver;
import static base.BaseClass.test;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class login {
    public void click_on_What() {
        driver.findElement(By.xpath("//div[contains(text(), 'What')]")).click();
    }

    public boolean send_key_What(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'What')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_What() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'What')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_What() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'What')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Where() {
        driver.findElement(By.xpath("//div[contains(text(), 'Where')]")).click();
    }

    public boolean send_key_Where(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'Where')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Where() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Where')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Where() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Where')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_When() {
        driver.findElement(By.xpath("//div[contains(text(), 'When')]")).click();
    }

    public boolean send_key_When(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'When')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_When() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'When')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_When() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'When')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_1_Guest() {
        driver.findElement(By.xpath("//div[contains(text(), '1 Guest')]")).click();
    }

    public boolean send_key_1_Guest(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), '1 Guest')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_1_Guest() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), '1 Guest')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_1_Guest() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), '1 Guest')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_submit_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public boolean is_displayed_submit_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_submit_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Be_a_Host() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(), 'Be a Host')]")).click();
        Thread.sleep(3000);
    }

    public boolean is_displayed_Be_a_Host() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Be a Host')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Be_a_Host() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Be a Host')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_dropdown_basic() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
    }

    public boolean is_displayed_dropdown_basic() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[@id='dropdown-basic']")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_dropdown_basic() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[@id='dropdown-basic']")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_homeExpList() {
        driver.findElement(By.xpath("//div[@id='homeExpList']")).click();
    }

    public boolean send_key_homeExpList(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[@id='homeExpList']"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_homeExpList() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@id='homeExpList']")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_homeExpList() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@id='homeExpList']")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Term() {
        driver.findElement(By.xpath("//span[contains(text(), 'Term')]")).click();
    }

    public boolean is_displayed_Term() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Term')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Term() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Term')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Term_link() {
        driver.findElement(By.xpath("//a[contains(text(), 'Term')]")).click();
    }

    public boolean is_displayed_Term_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Term')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Term_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Term')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Privacy_Policy() {
        driver.findElement(By.xpath("//span[contains(text(), 'Privacy Policy')]")).click();
    }

    public boolean is_displayed_Privacy_Policy() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Privacy Policy')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Privacy_Policy() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Privacy Policy')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Privacy_Policy_link() {
        driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]")).click();
    }

    public boolean is_displayed_Privacy_Policy_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Privacy_Policy_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Hosting_Rules() {
        driver.findElement(By.xpath("//span[contains(text(), 'Hosting Rules')]")).click();
    }

    public boolean is_displayed_Hosting_Rules() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Hosting Rules')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Hosting_Rules() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Hosting Rules')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Hosting_Rules_link() {
        driver.findElement(By.xpath("//a[contains(text(), 'Hosting Rules')]")).click();
    }

    public boolean is_displayed_Hosting_Rules_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Hosting Rules')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Hosting_Rules_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Hosting Rules')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Resources_Social() {
        driver.findElement(By.xpath("//span[contains(text(), 'Resources & Social')]")).click();
    }

    public boolean is_displayed_Resources_Social() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Resources & Social')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Resources_Social() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Resources & Social')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Resources_Social_link() {
        driver.findElement(By.xpath("//a[contains(text(), 'Resources & Social')]")).click();
    }

    public boolean is_displayed_Resources_Social_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Resources & Social')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Resources_Social_link() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//a[contains(text(), 'Resources & Social')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Sign_In_text() {
        driver.findElement(By.xpath("//h1[contains(text(), 'Sign In')]")).click();
    }

    public boolean send_key_Sign_In(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//h1[contains(text(), 'Sign In')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Sign_In_text() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//h1[contains(text(), 'Sign In')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Sign_In_text() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//h1[contains(text(), 'Sign In')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Email_Address() {
        driver.findElement(By.xpath("//label[contains(text(), 'Email Address')]")).click();
    }

    public boolean send_key_Email_Address(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//label[contains(text(), 'Email Address')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Email_Address() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//label[contains(text(), 'Email Address')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Email_Address() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//label[contains(text(), 'Email Address')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_email() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).click();
    }

    public boolean send_key_email(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
            flag = true;
        } catch (Exception e) {
            test.log(Status.valueOf("FAIL"),"element Not found");
            flag = false;
        } finally {
            if (flag) {
                test.log(Status.valueOf("INFO"),"Successfully entered "+text+" value");
            } else {
                test.log(Status.valueOf("FAIL"),"Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_email() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_email() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//input[@name='email']")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Password_text() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).click();
    }

    public boolean send_key_Password_text(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//input[@name='password']"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            test.log(Status.valueOf("FAIL"),"element Not found");
            flag = false;
        } finally {
            if (flag) {
                test.log(Status.valueOf("INFO"),"Successfully entered "+text+" value");
            } else {
                test.log(Status.valueOf("FAIL"),"Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Password_text() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Password')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Password_text() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Password')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Password() {
        driver.findElement(By.xpath("//label[contains(text(), 'Password')]")).click();
    }

    public boolean send_key_Password(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//label[contains(text(), 'Password')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Password() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//label[contains(text(), 'Password')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Password() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//label[contains(text(), 'Password')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Forgot_Password()
    {
        driver.findElement(By.xpath("//div[contains(text(), 'Forgot Password?')]")).click();
    }

    public boolean send_key_Forgot_Password(String text)

    {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'Forgot Password?')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Forgot_Password()

    {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Forgot Password?')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Forgot_Password()

    {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Forgot Password?')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Forgot_Password_button() {
        driver.findElement(By.xpath("//span[contains(text(), 'Forgot Password?')]")).click();
    }

    public boolean is_displayed_Forgot_Password_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Forgot Password?')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Forgot_Password_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Forgot Password?')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Sign_In() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]")).click();
    }

    public boolean is_displayed_Sign_In() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Sign_In() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_No_account_yet_Sign_Up() {
        driver.findElement(By.xpath("//div[contains(text(), 'No account yet? Sign Up')]")).click();
    }

    public boolean send_key_No_account_yet_Sign_Up(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'No account yet? Sign Up')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_No_account_yet_Sign_Up() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'No account yet? Sign Up')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_No_account_yet_Sign_Up() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'No account yet? Sign Up')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Sign_Up_button() {
        driver.findElement(By.xpath("//span[contains(text(), 'Sign Up')]")).click();
    }

    public boolean is_displayed_Sign_Up_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Sign Up')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Sign_Up_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Sign Up')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_or_continue_with() {
        driver.findElement(By.xpath("//span[contains(text(), 'or continue with')]")).click();
    }

    public boolean is_displayed_or_continue_with() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'or continue with')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_or_continue_with() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'or continue with')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Sign_in_with_facebook_text() {
        driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]")).click();
    }

    public boolean send_key_Sign_in_with_facebook_text(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Sign_in_with_facebook_text() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Sign_in_with_facebook_text() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_googleSignUp() {
        driver.findElement(By.xpath("//div[@id='googleSignUp']")).click();
    }

    public boolean send_key_googleSignUp(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[@id='googleSignUp']"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_googleSignUp() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@id='googleSignUp']")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_googleSignUp() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@id='googleSignUp']")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public boolean switch_to_frame_by_index_gsi_921231_340414(int index) {
        boolean flag = false;
        try {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='gsi_921231_340414']")));
            driver.switchTo().frame(index);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Frame with index " + index + " is selected");
            } else {
                System.out.println("Frame with index " + index + " is not selected");
            }
        }
    }

    public boolean switch_to_frame_by_id_gsi_921231_340414(String idValue) {
        boolean flag = false;
        try {
            driver.switchTo().frame(idValue);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Frame with Id" + idValue + " is selected");
            } else {
                System.out.println("Frame with Id" + idValue + " is not selected");
            }
        }
    }

    public boolean switch_to_frame_by_name_gsi_921231_340414(String nameValue) {
        boolean flag = false;
        try {
            driver.switchTo().frame(nameValue);
            flag = true;
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (flag) {
                System.out.println("Frame with Name" + nameValue + " is selected");
            } else {
                System.out.println("Frame with Name" + nameValue + " is not selected");
            }
        }
    }

    public boolean switch_to_default_frame_gsi_921231_340414() {
        boolean flag = false;
        try {
            driver.switchTo().defaultContent();
            flag = true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (flag) {
                System.out.println("Frame with Name is selected");
            } else {
                System.out.println("The Frame is not selected");
            }
        }
    }

    public void click_on_Sign_in_with_facebook() {
        driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]")).click();
    }

    public boolean send_key_Sign_in_with_facebook(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_Sign_in_with_facebook() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Sign_in_with_facebook() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Sign in with facebook')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Sign_in_with_facebook_button() {
        driver.findElement(By.xpath("//button[contains(text(), 'Sign in with facebook')]")).click();
    }

    public boolean is_displayed_Sign_in_with_facebook_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Sign in with facebook')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Sign_in_with_facebook_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Sign in with facebook')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_fb_root() {
        driver.findElement(By.xpath("//div[@id='fb-root']")).click();
    }

    public boolean send_key_fb_root(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//div[@id='fb-root']"));
            flag = ele.isDisplayed();
            ele.clear();
            ele.sendKeys(text);
// logger.info("Entered text :"+text);
            flag = true;
        } catch (Exception e) {
            System.out.println("Location Not found");
            flag = false;
        } finally {
            if (flag) {
                System.out.println("Successfully entered value");
            } else {
                System.out.println("Unable to enter value");
            }
        }
        return flag;
    }

    public boolean is_displayed_fb_root() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@id='fb-root']")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_fb_root() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@id='fb-root']")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }


    public void click_on_sign_in_drop_down_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]")).click();
        
    }

    public boolean is_displayed_login_pop_up() throws InterruptedException {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Login Successfully')]")).isDisplayed();
        if (flag) {
            test.log(Status.valueOf("INFO"),"Login Successfully");
        } else {
            test.log(Status.valueOf("FAIL"),"Invalid data");
        }
        Thread.sleep(2000);
        return flag;
    }


    public boolean is_displayed_invalid_login_pop_up() throws InterruptedException {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[contains(text(), 'Invalid credentials!')]")).isDisplayed();
        if (flag) {
            test.log(Status.valueOf("INFO"),"The element is Displayed");
        } else {
            test.log(Status.valueOf("FAIL"),"The element is not Displayed");
        }
        Thread.sleep(2000);
        return flag;
    }

    public void click_on_what() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(), 'What')]")).click();
    }

}