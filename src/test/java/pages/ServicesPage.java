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



  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[1]/a/div[1]")               private WebElement PPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[2]/a/h4")                   private WebElement PPCManagementButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[3]/a/h4")                   private WebElement SocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[4]/a/h4")                   private WebElement SearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='main']/div/div/div/div/div[5]/a/div[1]/img")           private WebElement GeneralMarketingButton;


  public WebElement getPPCAccountSetUpButton()                                    { return waitForElementToBeClickable(PPCAccountSetUpButton, driver); }
  public WebElement getPPCManagementButton()                                      { return waitForElementToBeClickable(PPCManagementButton, driver); }
  public WebElement getSocialMediaAdvertisingButton()                             { return waitForElementToBeClickable(SocialMediaAdvertisingButton, driver); }
  public WebElement getSearchEngineOptimizationButton()                           { return waitForElementToBeClickable(SearchEngineOptimizationButton, driver); }
  public WebElement getGeneralMarketingButton()                                   { return waitForElementToBeClickable(GeneralMarketingButton, driver); }


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