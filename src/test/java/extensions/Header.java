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
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[1]/a/div[1]")               private WebElement PPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[2]/a/h4")                   private WebElement PPCManagementButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[3]/a/h4")                   private WebElement SocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[4]/a/h4")                  private WebElement SearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[5]/a/div[1]/img")           private WebElement GeneralMarketingButton;



  public WebElement getHomeLogo()                                                 { return waitForElementToBeClickable(HomeLogo, driver); }
  public WebElement getServicesButton()                                           { return waitForElementToBeClickable(ServicesButton, driver); }
  public WebElement getSuccessStoriesButton()                                     { return waitForElementToBeClickable(SuccessStoriesButton, driver); }
  public WebElement getAboutButton()                                              { return waitForElementToBeClickable(AboutButton, driver); }
  public WebElement getContactButton()                                            { return waitForElementToBeClickable(ContactButton, driver); }
  public WebElement getPPCAccountSetUpButton()                                    { return waitForElementToBeClickable(PPCAccountSetUpButton, driver); }
  public WebElement getPPCManagementButton()                                      { return waitForElementToBeClickable(PPCManagementButton, driver); }
  public WebElement getSocialMediaAdvertisingButton()                             { return waitForElementToBeClickable(SocialMediaAdvertisingButton, driver); }
  public WebElement getSearchEngineOptimizationButton()                           { return waitForElementToBeClickable(SearchEngineOptimizationButton, driver); }
  public WebElement getGeneralMarketingButton()                                   { return waitForElementToBeClickable(GeneralMarketingButton, driver); }



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

  public PPCAccountSetUpPage openPPCAccountSetUpPage() {
    getPPCAccountSetUpButton().click();
    return new PPCAccountSetUpPage(driver);
  }

  public PPCManagementPage openPPCManagementPage() {
    getPPCManagementButton().click();
    return new PPCManagementPage(driver);
  }

  public SocialMediaAdvertisingPage openSocialMediaAdvertisingPage() {
    getSocialMediaAdvertisingButton().click();
    return new SocialMediaAdvertisingPage(driver);
  }

  public SearchEngineOptimizationPage openSearchEngineOptimizationPage() {
    getSearchEngineOptimizationButton().click();
    return new SearchEngineOptimizationPage(driver);
  }

  public GeneralMarketingPage openGeneralMarketingPage() {
    getGeneralMarketingButton().click();
    return new GeneralMarketingPage(driver);
  }


}
