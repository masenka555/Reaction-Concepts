package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class ServicesPage extends EveryHeaderFooter {
  public ServicesPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_SERVICES))
      fail("The Services Page did not load correctly");
  }


  private static final String PAGETITLE_SERVICES = "Services";



  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[1]/a/div[1]")               private WebElement ServicesPPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[2]/a/h4")                   private WebElement ServicesPPCManagementButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[3]/a/h4")                   private WebElement ServicesSocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[4]/a/h4")                   private WebElement ServicesSearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[5]/a/div[1]/img")           private WebElement ServicesGeneralMarketingButton;


  public WebElement getServicesPPCAccountSetUpButton()                                    { return waitForElementToBeClickable(ServicesPPCAccountSetUpButton, driver); }
  public WebElement getServicesPPCManagementButton()                                      { return waitForElementToBeClickable(ServicesPPCManagementButton, driver); }
  public WebElement getServicesSocialMediaAdvertisingButton()                             { return waitForElementToBeClickable(ServicesSocialMediaAdvertisingButton, driver); }
  public WebElement getServicesSearchEngineOptimizationButton()                           { return waitForElementToBeClickable(ServicesSearchEngineOptimizationButton, driver); }
  public WebElement getServicesGeneralMarketingButton()                                   { return waitForElementToBeClickable(ServicesGeneralMarketingButton, driver); }


  public PPCAccountSetUpPage openPPCAccountSetUpPageServices() {
    getServicesPPCAccountSetUpButton().click();
    return new PPCAccountSetUpPage(driver);
  }

  public PPCManagementPage openPPCManagementPageServices() {
    getServicesPPCManagementButton().click();
    return new PPCManagementPage(driver);
  }

  public SocialMediaAdvertisingPage openSocialMediaAdvertisingPageServices() {
    getServicesSocialMediaAdvertisingButton().click();
    return new SocialMediaAdvertisingPage(driver);
  }

  public SearchEngineOptimizationPage openSearchEngineOptimizationPageServices() {
    getServicesSearchEngineOptimizationButton().click();
    return new SearchEngineOptimizationPage(driver);
  }

  public GeneralMarketingPage openGeneralMarketingPageServices() {
    getServicesGeneralMarketingButton().click();
    return new GeneralMarketingPage(driver);
  }



}