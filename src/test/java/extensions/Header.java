package extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;

public class Header extends EveryPage {
  public Header(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[@id='masthead']/div/div/div[2]/div/a/img")                  private WebElement HomeLogo;
  @FindBy(xpath = "//*[@id='menu-item-145']/a")                                    private WebElement ServicesButton;
  @FindBy(xpath = "//*[@id='menu-item-146']/a")                                    private WebElement SuccessStoriesButton;
  @FindBy(xpath = "//*[@id='menu-item-147']/a")                                    private WebElement AboutButton;
  @FindBy(xpath = "//*[@id='menu-item-148']/a")                                    private WebElement ContactButton;


  public WebElement getHomeLogo()                                                 { return waitForElementToBeClickable(HomeLogo, driver); }
  public WebElement getServicesButton()                                           { return waitForElementToBeClickable(ServicesButton, driver); }
  public WebElement getSuccessStoriesButton()                                     { return waitForElementToBeClickable(SuccessStoriesButton, driver); }
  public WebElement getAboutButton()                                              { return waitForElementToBeClickable(AboutButton, driver); }
  public WebElement getContactButton()                                            { return waitForElementToBeClickable(ContactButton, driver); }


  public HomePage openHomePage() {
    getHomeLogo().click();
    return new HomePage(driver);
  }

  public ServicesPage openServicesPage() {
    getServicesButton().click();
    return new ServicesPage(driver);
  }

  public SuccessStoriesPage openSuccessStoriesPage() {
    getSuccessStoriesButton().click();
    return new SuccessStoriesPage(driver);
  }

  public AboutPage openAboutPage() {
    getAboutButton().click();
    return new AboutPage(driver);
  }

  public ContactPage openContactPage() {
    getContactButton().click();
    return new ContactPage(driver);
  }



}
