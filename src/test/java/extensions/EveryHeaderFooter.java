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



  @FindBy(xpath = "//*[@id='masthead']/div/div/div[2]/div/a/img")                  private WebElement homeLogo;
  @FindBy(xpath = "//*[@id='menu-item-145']/a")                                    private WebElement servicesHeaderButton;
  @FindBy(xpath = "//*[@id='menu-item-146']/a")                                    private WebElement successStoriesHeaderButton;
  @FindBy(xpath = "//*[@id='menu-item-147']/a")                                    private WebElement aboutHeaderButton;
  @FindBy(xpath = "//*[@id='menu-item-148']/a")                                    private WebElement contactHeaderButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[1]/a")                                private WebElement servicesFooterButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[2]/a")                                private WebElement successStoriesFooterButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[3]/a")                                private WebElement aboutFooterButton;
  @FindBy(xpath = "//*[@id='menu-main-1']/li[4]/a")                                private WebElement contactFooterButton;
  @FindBy(xpath = "//*[@id='masthead']/div/div/div[1]/div/a[2]")                   private WebElement facebookHeaderLink;
  @FindBy(xpath = "//*[@id='masthead']/div/div/div[1]/div/a[3]")                   private WebElement linkedInHeaderLink;
  @FindBy(xpath = "//*[@id='colophon']/div/div/div[3]/div/a[2]")                   private WebElement facebookFooterLink;
  @FindBy(xpath = "//*[@id='colophon']/div/div/div[3]/div/a[3]")                   private WebElement linkedInFooterLink;
  @FindBy(xpath = "//*[@id='header-tel']")                                         private WebElement phoneNumberHeader;
  @FindBy(xpath = "//*[@id='footer-tel']")                                         private WebElement phoneNumberFooter;



  public WebElement getHomeLogo()                                                 { return waitForElementToBeClickable(homeLogo, driver); }
  public WebElement getServicesHeaderButton()                                     { return waitForElementToBeClickable(servicesHeaderButton, driver); }
  public WebElement getSuccessStoriesHeaderButton()                               { return waitForElementToBeClickable(successStoriesHeaderButton, driver); }
  public WebElement getAboutHeaderButton()                                        { return waitForElementToBeClickable(aboutHeaderButton, driver); }
  public WebElement getContactHeaderButton()                                      { return waitForElementToBeClickable(contactHeaderButton, driver); }
  public WebElement getServicesFooterButton()                                     { return waitForElementToBeClickable(servicesFooterButton, driver); }
  public WebElement getSuccessStoriesFooterButton()                               { return waitForElementToBeClickable(successStoriesFooterButton, driver); }
  public WebElement getAboutFooterButton()                                        { return waitForElementToBeClickable(aboutFooterButton, driver); }
  public WebElement getContactFooterButton()                                      { return waitForElementToBeClickable(contactFooterButton, driver); }
  public WebElement getFacebookHeaderLink()                                       { return waitForElementToBeClickable(facebookHeaderLink, driver); }
  public WebElement getLinkedInHeaderLink()                                       { return waitForElementToBeClickable(linkedInHeaderLink, driver); }
  public WebElement getFacebookFooterLink()                                       { return waitForElementToBeClickable(facebookFooterLink, driver); }
  public WebElement getLinkedInFooterLink()                                       { return waitForElementToBeClickable(linkedInFooterLink, driver); }
  public WebElement getPhoneNumberHeader()                                        { return waitForElementToBeClickable(phoneNumberHeader, driver); }
  public WebElement getPhoneNumberFooter()                                        { return waitForElementToBeClickable(phoneNumberFooter, driver); }


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
      return getFacebookHeaderLink().getAttribute("href").equals(FacebookURL);
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
