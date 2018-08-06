package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class HomePage extends EveryHeaderFooter {
  public HomePage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_HOME))
      fail("The Home Page did not load correctly");
  }


  private static final String PAGETITLE_HOME = "Home";

  @FindBy(xpath = "//*[@id='content']/div[1]/div/div/div[2]/div[1]")       private WebElement HomeHeader;


  private WebElement getHomeHeader()                                     { return waitForElement(HomeHeader, driver); }


  public boolean verifyHomeHeaderDisplayed ()                            { return HomeHeader.isDisplayed();
  }

  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[1]/div[3]/a")                    private WebElement HomePPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[2]/div[3]/a")                    private WebElement HomePPCManagementButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[3]/div[3]/a")                    private WebElement HomeSocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[4]/div[3]/a")                    private WebElement HomeSearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[5]/div[3]/a")                    private WebElement HomeGeneralMarketingButton;


  public WebElement getHomePPCAccountSetUpButton()                                    { return waitForElementToBeClickable(HomePPCAccountSetUpButton, driver); }
  public WebElement getHomePPCManagementButton()                                      { return waitForElementToBeClickable(HomePPCManagementButton, driver); }
  public WebElement getHomeSocialMediaAdvertisingButton()                             { return waitForElementToBeClickable(HomeSocialMediaAdvertisingButton, driver); }
  public WebElement getHomeSearchEngineOptimizationButton()                           { return waitForElementToBeClickable(HomeSearchEngineOptimizationButton, driver); }
  public WebElement getHomeGeneralMarketingButton()                                   { return waitForElementToBeClickable(HomeGeneralMarketingButton, driver); }


  public PPCAccountSetUpPage openPPCAccountSetUpPageHome() {
    getHomePPCAccountSetUpButton().click();
    return new PPCAccountSetUpPage(driver);
  }

  public PPCManagementPage openPPCManagementPageHome() {
    getHomePPCManagementButton().click();
    return new PPCManagementPage(driver);
  }

  public SocialMediaAdvertisingPage openSocialMediaAdvertisingPageHome() {
    getHomeSocialMediaAdvertisingButton().click();
    return new SocialMediaAdvertisingPage(driver);
  }

  public SearchEngineOptimizationPage openSearchEngineOptimizationPageHome() {
    getHomeSearchEngineOptimizationButton().click();
    return new SearchEngineOptimizationPage(driver);
  }

  public GeneralMarketingPage openGeneralMarketingPageHome() {
    getHomeGeneralMarketingButton().click();
    return new GeneralMarketingPage(driver);
  }



}