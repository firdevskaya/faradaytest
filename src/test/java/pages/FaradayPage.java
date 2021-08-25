package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaradayPage {
    public FaradayPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

@FindBy(xpath ="(//a[text()='Contact'])[1]")
    public WebElement contact;
    @FindBy(xpath ="(//a[text()='Product'])[1]")
    public  WebElement product;
//@FindBy(xpath ="//*[text()='Contact Us for Free Demo']")
  //  public WebElement Contact_Us_for_Free_Demo;
    @FindBy(xpath = "//a[@class='btn']")
    public  WebElement tryfaradayedgefreebutton;
@FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstname ;
@FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;
@FindBy(xpath = "//input[@id='email']")
    public WebElement emailbutton;
@FindBy(xpath = "//input[@id='company']")
    public WebElement companyname;
@FindBy(xpath = "(//select[@class='form-control required'])[1]")
    public WebElement select1;
@FindBy(xpath = "(//select[@class='form-control required'])[2]")
    public WebElement select2;
@FindBy(xpath = "//textarea[@id='message']")
    public  WebElement sendmessage;
@FindBy(xpath = "(//a[text()='Partners'])[1]")
    public WebElement partnersbutton;
@FindBy(xpath = "(//a[text()='Apply Now'])[1]")
    public WebElement applyfirst;
@FindBy(xpath = "(//a[text()='Apply Now'])[2]")
    public WebElement applysecond;
@FindBy(xpath ="//input[@id='firstname']")
    public WebElement applyfirstname;
@FindBy(xpath = "//input[@id='email']")
    public WebElement applyemail;
@FindBy(xpath = "//select[@id='country']")
    public  WebElement country;
@FindBy(xpath = "//input[@id='phone']")
    public WebElement applyphone;
@FindBy(xpath = "//input[@id='company']")
    public WebElement applycompany;
@FindBy(xpath = "//input[@id='title']")
    public  WebElement title;
@FindBy(xpath ="//input[@id='message']")
    public  WebElement applymessage;










}
