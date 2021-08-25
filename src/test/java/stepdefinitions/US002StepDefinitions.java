package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.FaradayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002StepDefinitions {

    FaradayPage faradayPage= new FaradayPage();
    @Given("go to faradaywebsite")
    public void go_to_faradaywebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("faradayurl"));
      //  String title = Driver.getDriver().getTitle();
      //  System.out.println("actuel title  " + title);
       // String url = Driver.getDriver().getCurrentUrl();
       // System.out.println("actuel url " + url);
        ReusableMethods.waitFor(5);
    }

    @Given("click partners button")
    public void click_partners_button() {
       faradayPage.partnersbutton.click();
       ReusableMethods.waitFor(3);
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
      //  js.executeScript ("window.scrollBy (0,500)");
    }

    @Given("click applynow button")
    public void click_applynow_button() {
      faradayPage.applyfirst.click();
    }

    @Given("enter applyname")
    public void enter_applyname() {
faradayPage.applyfirstname.sendKeys(ConfigReader.getProperty("name"));
    }

    /*browser=chrome
faradayurl=https://faraday.net
name=firdevs123**...
invalidemail=ffirdevska---ya31@gmail.com
invalidmobilephone=test denemesi
invalidmobilephone=123aaa444aaa33.
selectfirstindex=3
selectsecondindex=4
companyname=faradaynet*/


    @Given("enter emailadress")
    public void enter_emailadress() {
faradayPage.applyemail.sendKeys(ConfigReader.getProperty("invalidemail"));
    }

    @Given("select country")
    public void select_country() {
Select select = new Select(faradayPage.country);
select.selectByIndex(3);
    }

    @Given("enter phone")
    public void enter_phone() {
faradayPage.applyphone.sendKeys("invalidmobilephone");
    }

    @Given("enter company")
    public void enter_company() {
faradayPage.applycompany.sendKeys("company");
    }

    @Given("enter title")
    public void enter_title() {
faradayPage.title.sendKeys("title");
    }

    @Then("sendmessages")
    public void sendmessages() {
faradayPage.applymessage.sendKeys("invalidmobilephone");
    }




}
