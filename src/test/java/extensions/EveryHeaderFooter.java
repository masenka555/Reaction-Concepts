package extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;

public class EveryHeaderFooter extends EveryPage {
  public EveryHeaderFooter(WebDriver driver) {
    super(driver);
  }


  public String FacebookURL = "https://www.facebook.com/pages/Reaction-Concepts/212144135490827";
  public String LinkedInURL = "https://www.linkedin.com/in/lauri-taylor-14a2683/";
  public String PhoneNumber = "818-999-9921";



  @FindBy(xpath = "//*[@id='masthead']/div/div/div[2]/div/a/img")                  private WebElement HomeLogo;
  @FindBy(xpath = "//*[@id='menu-item-145']/a")                                    private WebElement ServicesHeaderButton;
  @FindBy(xpath = "//*[@id='menu-item-146']/a")                                    private WebElement SuccessStoriesHeaderButton;
  @FindBy(xpath = "//*[@id='menu-item-147']/a")                                    private WebElement AboutHeaderButton;
  @FindBy(xpath = "//*[@id='menu-item-148']/a")                                    private WebElement ContactHeaderButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[1]/a")                                private WebElement ServicesFooterButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[2]/a")                                private WebElement SuccessStoriesFooterButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[3]/a")                                private WebElement AboutFooterButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[4]/a")                                private WebElement ContactFooterButton;
  @FindBy(xpath = "//*[@id='masthead']/div/div/div[1]/div/a[2]")                   private WebElement FacebookHeaderLink;
  @FindBy(xpath = "//*[@id='masthead']/div/div/div[1]/div/a[3]")                   private WebElement LinkedInHeaderLink;
  @FindBy(xpath = "//*[@id='colophon']/div/div/div[3]/div/a[2]/i")                 private WebElement FacebookFooterLink;
  @FindBy(xpath = "//*[@id='colophon']/div/div/div[3]/div/a[3]/i")                 private WebElement LinkedInFooterLink;
  @FindBy(xpath = "//*[@id='header-tel']")                                         private WebElement PhoneNumberHeader;
  @FindBy(xpath = "//*[@id='footer-tel']")                                         private WebElement PhoneNumberFooter;



  public WebElement getHomeLogo()                                                 { return waitForElementToBeClickable(HomeLogo, driver); }
  public WebElement getServicesHeaderButton()                                     { return waitForElementToBeClickable(ServicesHeaderButton, driver); }
  public WebElement getSuccessStoriesHeaderButton()                               { return waitForElementToBeClickable(SuccessStoriesHeaderButton, driver); }
  public WebElement getAboutHeaderButton()                                        { return waitForElementToBeClickable(AboutHeaderButton, driver); }
  public WebElement getContactHeaderButton()                                      { return waitForElementToBeClickable(ContactHeaderButton, driver); }
  public WebElement getServicesFooterButton()                                     { return waitForElementToBeClickable(ServicesFooterButton, driver); }
  public WebElement getSuccessStoriesFooterButton()                               { return waitForElementToBeClickable(SuccessStoriesFooterButton, driver); }
  public WebElement getAboutFooterButton()                                        { return waitForElementToBeClickable(AboutFooterButton, driver); }
  public WebElement getContactFooterButton()                                      { return waitForElementToBeClickable(ContactFooterButton, driver); }
  public WebElement getFacebookHeaderLink()                                       { return waitForElementToBeClickable(FacebookHeaderLink, driver); }
  public WebElement getLinkedInHeaderLink()                                       { return waitForElementToBeClickable(LinkedInHeaderLink, driver); }
  public WebElement getFacebookFooterLink()                                       { return waitForElementToBeClickable(FacebookFooterLink, driver); }
  public WebElement getLinkedInFooterLink()                                       { return waitForElementToBeClickable(LinkedInFooterLink, driver); }
  public WebElement getPhoneNumberHeader()                                        { return waitForElementToBeClickable(PhoneNumberHeader, driver); }
  public WebElement getPhoneNumberFooter()                                        { return waitForElementToBeClickable(PhoneNumberFooter, driver); }


  public HomePage openHomePage() {
    getHomeLogo().click();
    return new HomePage(driver);
  }

  public ServicesPage openServicesPage() {
    getServicesHeaderButton().click();
    return new ServicesPage(driver);
  }

  public SuccessStoriesPage openSuccessStoriesPage() {
    getSuccessStoriesHeaderButton().click();
    return new SuccessStoriesPage(driver);
  }

  public AboutPage openAboutPage() {
    getAboutHeaderButton().click();
    return new AboutPage(driver);
  }

  public ContactPage openContactPage() {
    getContactHeaderButton().click();
    return new ContactPage(driver);
  }

  public ServicesPage openServicesPageWithFooterButton() {
    getServicesFooterButton().click();
    return new ServicesPage(driver);
  }

  public SuccessStoriesPage openSuccessStoriesPageWithFooterButton() {
    getSuccessStoriesFooterButton().click();
    return new SuccessStoriesPage(driver);
  }

  public AboutPage openAboutPageWithFooterButton() {
    getAboutFooterButton().click();
    return new AboutPage(driver);
  }

  public ContactPage openContactPageWithFooterButton() {
    getContactFooterButton().click();
    return new ContactPage(driver);
  }

  public boolean verifyFacebookHeaderLink () {
    return getFacebookHeaderLink().getAttribute("href").contains(FacebookURL);
  }

  public boolean verifyLinkedInHeaderLink() {
    return getLinkedInHeaderLink().getAttribute("href").equals(LinkedInURL);
  }

  public boolean verifyFacebookFooterLink () {
    return getFacebookFooterLink().getAttribute("href").contains(FacebookURL);
  }

  public boolean verifyLinkedInFooterLink () {
    return getLinkedInFooterLink().getAttribute("href").contains(LinkedInURL);
  }

  public boolean verifyPhoneNumberHeader () {
    return getPhoneNumberHeader().getAttribute("href").contains(PhoneNumber);
  }

  public boolean verifyPhoneNumberFooter () {
    return getPhoneNumberFooter().getAttribute("href").contains(PhoneNumber);
  }

}
