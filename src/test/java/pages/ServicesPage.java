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



  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[1]/a/div[1]")                       private WebElement servicesPPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[2]/a/h4")                           private WebElement servicesPPCManagementButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[3]/a/h4")                           private WebElement servicesSocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[4]/a/h4")                           private WebElement servicesSearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[5]/a/h4")                           private WebElement servicesGoogleMyBusinessButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[6]/a/h4")                           private WebElement servicesGeneralMarketingButton;


  public WebElement getServicesPPCAccountSetUpButton()                                    { return waitForElementToBeClickable(servicesPPCAccountSetUpButton, driver); }
  public WebElement getServicesPPCManagementButton()                                      { return waitForElementToBeClickable(servicesPPCManagementButton, driver); }
  public WebElement getServicesSocialMediaAdvertisingButton()                             { return waitForElementToBeClickable(servicesSocialMediaAdvertisingButton, driver); }
  public WebElement getServicesSearchEngineOptimizationButton()                           { return waitForElementToBeClickable(servicesSearchEngineOptimizationButton, driver); }
  public WebElement getServicesGoogleMyBusinessButton()                                   { return waitForElementToBeClickable(servicesGoogleMyBusinessButton, driver); }
  public WebElement getServicesGeneralMarketingButton()                                   { return waitForElementToBeClickable(servicesGeneralMarketingButton, driver); }


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

    public GoogleMyBusinessPage openGoogleMyBusinessPageServices() {
        getServicesGoogleMyBusinessButton().click();
        return new GoogleMyBusinessPage(driver);
    }

  public GeneralMarketingPage openGeneralMarketingPageServices() {
    getServicesGeneralMarketingButton().click();
    return new GeneralMarketingPage(driver);
  }

}
