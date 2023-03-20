package Test;

import ObjectRepo.Be_a_Host.BeAHost;
import ObjectRepo.Login.login;
import Utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.extentreports.ExtentTestManager.startTest;


public class OutfitterTest extends base.BaseClass{
    login login = new login();
    BeAHost payment = new BeAHost();
    @Test
    public void verify_login_with_valid_data() throws InterruptedException {
        test =startTest("verify_login_with_valid_data", "verify_login_with_valid_data");
        test.assignCategory("OutfitterTest");
        login.click_on_dropdown_basic();
        login.click_on_sign_in_drop_down_button();
        login.click_on_email();
        login.send_key_email("Test5@gmail.com");
        login.click_on_Password_text();
        login.send_key_Password_text("Test@123");
        login.click_on_Sign_In();
        login.is_displayed_login_pop_up();
    }

    @Test
    public void verify_login_with_invalid_data() throws InterruptedException {
        test =startTest("verify_login_with_invalid_data", "verify_login_with_invalid_data");
        test.assignCategory("OutfitterTest");
        login.click_on_dropdown_basic();
        login.click_on_sign_in_drop_down_button();
        login.click_on_email();
        login.send_key_email("Test5@gmail.com");
        login.click_on_Password_text();
        login.send_key_Password_text("Test@12");
        login.click_on_Sign_In();
        login.is_displayed_invalid_login_pop_up();
    }

    @Test
    public void verify_it_should_redirect_be_host_page() throws InterruptedException {
        test =startTest("verify_it_should_redirect_be_host_page", "verify_it_should_redirect_be_host_page");
        test.assignCategory("OutfitterTest");
        login.click_on_Be_a_Host();
        Assert.assertEquals("https://staging-jakt.outfitter.services/become-outfitter",driver.getCurrentUrl());
    }

    @Test
    public void verify_it_show_error_message_without_checked_term_and_condition() throws InterruptedException {
        test =startTest("verify_it_show_error_message_without_checked_term_and_condition", "verify_it_show_error_message_without_checked_term_and_condition");
        test.assignCategory("OutfitterTest");
        login.click_on_dropdown_basic();
        login.click_on_sign_in_drop_down_button();
        login.click_on_email();
        login.send_key_email("Test5@gmail.com");
        login.click_on_Password_text();
        login.send_key_Password_text("Test@123");
        login.click_on_Sign_In();
        login.click_on_what();
        payment.click_on_Fishing_Check_box();
        payment.click_on_Search_Button();
        payment.click_on_fishing_img();
        payment.click_on_book_now_button();
        payment.click_on_agree_and_pay();
        payment.is_displayed_Terms_condition();
    }

    @Test
    public void verify_destination_page_show_proper_location() throws InterruptedException {
        test =startTest("verify_destination_page_show_proper_location", "verify_destination_page_show_proper_location");
        test.assignCategory("OutfitterTest");
        login.click_on_dropdown_basic();
        login.click_on_sign_in_drop_down_button();
        login.click_on_email();
        login.send_key_email("Test5@gmail.com");
        login.click_on_Password_text();
        login.send_key_Password_text("Test@123");
        login.click_on_Sign_In();
        login.click_on_dropdown_basic();
        payment.click_on_destination();
        payment.click_on_mumbai_img();
        payment.click_on_destination_mumbai_img();
        Assert.assertEquals(payment.get_text_mumbai_location(),"Mumbai, Maharashtra, India");
    }

}
