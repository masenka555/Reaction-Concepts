package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.By;
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

  @FindBy(xpath = "//*[@id='content']/div[1]/div/div/div[2]/div[1]")                  private WebElement HomeHeader;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[1]/div[3]/a")                private WebElement HomePPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[2]/div[3]/a")                private WebElement HomePPCManagementButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[3]/div[3]/a")                private WebElement HomeSocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[4]/div[3]/a")                private WebElement HomeSearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[5]/div[3]/a")                private WebElement HomeGeneralMarketingButton;
  @FindBy(className = "services-button")                                              private WebElement HomeBodyServicesButton;
  @FindBy(className = "success-stories-button")                                       private WebElement HomeBodySuccessStoriesButton;
  @FindBy(className = "contact-us-button")                                            private WebElement HomeBodyContactUsButton;
  @FindBy(xpath = "//*[@id='content']/div[5]/div/h2/a")                               private WebElement AllSuccessStoriesButton;
  @FindBy(xpath = "//*[@id='arrows']/button[2]")                                      private WebElement RightArrowButton;


  public WebElement getHomePPCAccountSetUpButton()                                    { return waitForElementToBeClickable(HomePPCAccountSetUpButton, driver); }
  public WebElement getHomePPCManagementButton()                                      { return waitForElementToBeClickable(HomePPCManagementButton, driver); }
  public WebElement getHomeSocialMediaAdvertisingButton()                             { return waitForElementToBeClickable(HomeSocialMediaAdvertisingButton, driver); }
  public WebElement getHomeSearchEngineOptimizationButton()                           { return waitForElementToBeClickable(HomeSearchEngineOptimizationButton, driver); }
  public WebElement getHomeGeneralMarketingButton()                                   { return waitForElementToBeClickable(HomeGeneralMarketingButton, driver); }
  private WebElement getHomeHeader()                                                  { return waitForElement(HomeHeader, driver); }
  private WebElement getHomeBodyServicesButton()                                      { return waitForElement(HomeBodyServicesButton, driver); }
  private WebElement getHomeBodySuccessStoriesButton()                                { return waitForElement(HomeBodySuccessStoriesButton, driver); }
  private WebElement getHomeBodyContactUsButton()                                     { return waitForElement(HomeBodyContactUsButton, driver); }
  public WebElement getAllSuccessStoriesButton()                                      { return waitForElementToBeClickable(AllSuccessStoriesButton, driver); }
  public WebElement getRightArrowButton()                                             { return waitForElementToBeClickable(RightArrowButton, driver); }


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

  public boolean verifyHomeHeaderDisplayed () {
    return HomeHeader.isDisplayed();
  }

  public ServicesPage openServicesPageWithHomeBodyServicesButton() {
    getHomeBodyServicesButton().click();
    return new ServicesPage(driver);
  }

  public SuccessStoriesPage openSuccessStoriesPageWithHomeBodySuccessStoriesButton() {
    getHomeBodySuccessStoriesButton().click();
    return new SuccessStoriesPage(driver);
  }

  public ContactPage openContactPageWithHomeBodyContactUsButton() {
    getHomeBodyContactUsButton().click();
    return new ContactPage(driver);
  }

  public SuccessStoriesPage openSuccessStoriesPageWithAllSuccessStoriesButton() {
    getAllSuccessStoriesButton().click();
    return new SuccessStoriesPage(driver);
  }

  public boolean verifyScrollingSuccessStories() {

    for (int i = 0; i < 5; i++) {
        By locator = By.id("slick-slide-control0" + i);
        //*[@id="slick-slide-control04"]
        if (!driver.findElement(locator).getAttribute("aria-selected").equals("true")) {
            fail("The tab index is not correct");
        }
        getRightArrowButton().click();
    }
    return true;
  }

  //*[@id="slick-slide-control00"]
  //*[@id="slick-slide-control01"]
  //*[@id="slick-slide03"]/h2
  //*[@id="slick-slide04"]/h2
}