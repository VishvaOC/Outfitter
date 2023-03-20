package ObjectRepo.Be_a_Host;

import Utils.Utility;
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

public class BeAHost {
    public void click_on_Be_a_Host() {
        driver.findElement(By.xpath("(//span[contains(text(), 'Be a Host')])[2]")).click();
    }

    public boolean is_displayed_Be_a_Host() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("(//span[contains(text(), 'Be a Host')])[2]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Be_a_Host() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("(//span[contains(text(), 'Be a Host')])[2]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Fishing_Check_box() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@title = 'Fishing']//input")).click();
    }

    public boolean is_displayed_Fishing_Check_box() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@title = 'Fishing']//input")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Fishing_Check_box() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//div[@title = 'Fishing']//input")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Search_Button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button)[1]")).click();
    }

    public boolean is_displayed_Search_Button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("(//button)[1]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_Search_Button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("(//button)[1]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_fishing_img() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h5[contains(text(), 'Fishing Day Hunt')]")).click();
    }

    public boolean is_displayed_fishing_img() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//h5[contains(text(), 'Fishing Day Hunt')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_fishing_img() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//h5[contains(text(), 'Fishing Day Hunt')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_book_now_button() throws InterruptedException {
        Thread.sleep(3000);
        Utility utility = new Utility();
        utility.scroll(driver.findElement(By.xpath("//span[contains(text(), 'Guests')]")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(), 'Book now')]")).click();
    }

    public boolean is_displayed_book_now_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Book now')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_book_now_button() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Book now')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_agree_and_pay() throws InterruptedException {
        Thread.sleep(2000);
        Utility utility = new Utility();
        utility.scroll(driver.findElement(By.xpath("//input[@type='checkbox']")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(), 'Agree & Pay ')]")).click();
    }

    public boolean is_displayed_agree_and_pay() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Agree & Pay ')]")).isDisplayed();
        if (flag) {
            System.out.println("The element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
        }
        return flag;
    }

    public boolean is_enable_agree_and_pay() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//button[contains(text(), 'Agree & Pay ')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

    public void click_on_Terms_condition() {
        driver.findElement(By.xpath("//span[contains(text(), 'Please check and agree to Outiffer Terms & Conditions to continue with booking.')]")).click();
    }

    public boolean send_key_Terms_condition(String text) {
        boolean flag = false;
        try {
            WebElement ele = driver.findElement(By.xpath("//span[contains(text(), 'Please check and agree to Outiffer Terms & Conditions to continue with booking.')]"));
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

    public boolean is_displayed_Terms_condition() throws InterruptedException {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Please check and agree to Outiffer Terms & Conditions to continue with booking.')]")).isDisplayed();
        if (flag) {
            test.log(Status.valueOf("INFO"),"Error Message is Displayed");
        } else {
            test.log(Status.valueOf("FAIL"),"Error Message is not Displayed");;
        }
        Thread.sleep(3000);
        return flag;
    }

    public boolean is_enable_Terms_condition() {
        boolean flag = false;
        flag = driver.findElement(By.xpath("//span[contains(text(), 'Please check and agree to Outiffer Terms & Conditions to continue with booking.')]")).isEnabled();
        if (flag) {
            System.out.println("The element is Enabled");
        } else {
            System.out.println("The element is not Enabled");
        }
        return flag;
    }

   public void click_on_destination() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Destinations')]")).click();
 }

   public void click_on_mumbai_img() throws InterruptedException {
     Thread.sleep(3000);
  driver.findElement(By.xpath("//div[contains(text(), 'Mumbai')]")).click();
 }

  public void click_on_destination_mumbai_img() throws InterruptedException {
        Thread.sleep(3000);
         driver.findElement(By.xpath("(//div[@class='card'])[2]")).click();
 }


 public String get_text_mumbai_location() throws InterruptedException {
        
     String text = driver.findElement(By.xpath("(//div[@class='speciality_box'])[3]")).getText();
     return text;
 }


}