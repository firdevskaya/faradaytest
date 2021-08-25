package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.FaradayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001StepDefinitions {
FaradayPage faradayPage= new FaradayPage();



    @Given("go to faraday website")
    public void go_to_faraday_website() {
        Driver.getDriver().get(ConfigReader.getProperty("faradayurl"));
        String title = Driver.getDriver().getTitle();
        System.out.println("actuel title  " + title);
        String url = Driver.getDriver().getCurrentUrl();
        System.out.println("actuel url " + url);
        ReusableMethods.waitFor(5);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


      //go to product button and click
     //   faradayPage.product.click();
   //     js.executeScript ("window.scrollBy (0,500)");
   //    faradayPage.tryfaradayedgefreebutton.click();


    }




    @Given("click contact button")
    public void click_contact_button() {
        faradayPage.contact.click();
    }
    @Given("enter the name")
    public void enter_the_name() {
      faradayPage.firstname.sendKeys(ConfigReader.getProperty("name"));

    }
    @Given("enter  mobilephonenumber")
    public void enter_mobilephonenumber() {
        faradayPage.phone.sendKeys(ConfigReader.getProperty("invalidmobilephone"));
    }
    @Given("enter the   email")
    public void enter_the_email() {
faradayPage.emailbutton.sendKeys(ConfigReader.getProperty("invalidemail"));
    }

    @Given("enter companyname")
    public void enter_companyname() {
       faradayPage.companyname.sendKeys(ConfigReader.getProperty("companyname"));
    }
    @Given("selectfirst")
    public void selectfirst() {
        Select select = new Select(faradayPage.select1);
        select.selectByIndex(3);

    }
    @Given("selectsecond")
    public void selectsecond() {
Select select= new Select(faradayPage.select2);
select.selectByIndex(4);
    }
    @Given("send message")
    public void send_message() {
faradayPage.sendmessage.sendKeys(ConfigReader.getProperty("sendmessage"));
    }





}


