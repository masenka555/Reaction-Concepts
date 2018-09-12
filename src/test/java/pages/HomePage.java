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

  @FindBy(xpath = "//*[@id='content']/div[1]/div/div/div[2]/div[1]")                  private WebElement homeHeader;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[1]/div[3]/a")                private WebElement homePPCAccountSetUpButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[2]/div[3]/a")                private WebElement homePPCManagementButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[3]/div[3]/a")                private WebElement homeSocialMediaAdvertisingButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[4]/div[3]/a")                private WebElement homeSearchEngineOptimizationButton;
  @FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[5]/div[3]/a")                private WebElement homeGeneralMarketingButton;
  @FindBy(className = "services-button")                                              private WebElement homeBodyServicesButton;
  @FindBy(className = "success-stories-button")                                       private WebElement homeBodySuccessStoriesButton;
  @FindBy(className = "contact-us-button")                                            private WebElement homeBodyContactUsButton;
  @FindBy(xpath = "//*[@id='content']/div[5]/div/h2/a")                               private WebElement allSuccessStoriesButton;
  @FindBy(xpath = "//*[@id='arrows']/button[2]")                                      private WebElement rightArrowButton;
  @FindBy(xpath = "//*[@id='arrows']/button[1]")                                      private WebElement leftArrowButton;


  public WebElement getHomePPCAccountSetUpButton()                                   { return waitForElementToBeClickable(homePPCAccountSetUpButton, driver); }
  public WebElement getHomePPCManagementButton()                                     { return waitForElementToBeClickable(homePPCManagementButton, driver); }
  public WebElement getHomeSocialMediaAdvertisingButton()                            { return waitForElementToBeClickable(homeSocialMediaAdvertisingButton, driver); }
  public WebElement getHomeSearchEngineOptimizationButton()                          { return waitForElementToBeClickable(homeSearchEngineOptimizationButton, driver); }
  public WebElement getHomeGeneralMarketingButton()                                  { return waitForElementToBeClickable(homeGeneralMarketingButton, driver); }
  private WebElement getHomeHeader()                                                 { return waitForElement(homeHeader, driver); }
  private WebElement getHomeBodyServicesButton()                                     { return waitForElement(homeBodyServicesButton, driver); }
  private WebElement getHomeBodySuccessStoriesButton()                               { return waitForElement(homeBodySuccessStoriesButton, driver); }
  private WebElement getHomeBodyContactUsButton()                                    { return waitForElement(homeBodyContactUsButton, driver); }
  public WebElement getAllSuccessStoriesButton()                                     { return waitForElementToBeClickable(allSuccessStoriesButton, driver); }
  public WebElement getRightArrowButton()                                            { return waitForElementToBeClickable(rightArrowButton, driver); }
  public WebElement getLeftArrowButton()                                             { return waitForElementToBeClickable(leftArrowButton, driver); }


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
    return homeHeader.isDisplayed();
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

  public boolean verifyRightScrollingSuccessStories() {

    for (int i = 0; i < 5; i++) {
        By locator = By.id("slick-slide-control0" + i);
        //*[@id="slick-slide-control04"]
        if (!driver.findElement(locator).getAttribute("aria-selected").equals("true"))
           return false;

        getRightArrowButton().click();
        Sleep(1);
    }
    return true;
  }

    public boolean verifyLeftScrollingSuccessStories() {

        for (int i = 4 ; i >= 0; i--) {
            getLeftArrowButton().click();
            Sleep(1);
            By locator = By.id("slick-slide-control0" + i);
            if (!driver.findElement(locator).getAttribute("aria-selected").equals("true"))
                return false;
        }
        return true;
    }
}