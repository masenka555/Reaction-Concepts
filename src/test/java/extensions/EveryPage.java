package extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class EveryPage {
  public static WebDriver driver;
  private static boolean retry = true;

  public EveryPage(WebDriver driver){
    EveryPage.driver = driver;
    PageFactory.initElements(driver, this);
  }


  public boolean isCurrent(WebElement element) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
      wait.until(stream -> element.isDisplayed()); }
    catch(Exception ignored) { }
    return element.isDisplayed();
  }

  public boolean isCurrent(WebElement element, String text) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
      wait.until(stream -> element.getText().toLowerCase().contains(text.toLowerCase())); }
    catch(Exception ignored) { }
    return element.getText().toLowerCase().contains(text.toLowerCase());
  }


  public boolean isCurrent(String pageTitle) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
      wait.until(stream -> driver.getTitle().toLowerCase().contains(pageTitle.toLowerCase())); }
    catch(Exception ignored) { }
    return driver.getTitle().toLowerCase().contains(pageTitle.toLowerCase());
  }

  public static WebElement waitForElementToBeClickable(WebElement element, WebDriver driver){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    try {
      wait.until(ExpectedConditions.elementToBeClickable(element));
    } catch (Exception ex) {
      if (retry) {
        retry = false;
        driver.navigate().refresh();
        waitForElementToBeClickable(element, driver);
      } else {
        retry = true;
        fail(String.format("Clickable Element Failed on Page:\t%s", driver.getTitle()));
      }
    }
    retry = true;
    return element;
  }

  public static WebElement waitForElement(WebElement element, WebDriver driver){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    try {
      wait.until(ExpectedConditions.visibilityOf(element));
    } catch (Exception ex) {
      fail(String.format("Element Failed to Display on Page:\t%s", driver.getTitle()));
    }
    return element;
  }

  public String FacebookURL = "https://www.facebook.com/pages/Reaction-Concepts/212144135490827";
  public String LinkedInURL = "https://www.linkedin.com/in/lauri-taylor-14a2683/";

  @FindBy(xpath = "//*[@id='masthead']/div/div/div[1]/div/a[2]")          private WebElement FacebookLink;
  @FindBy(xpath = "//*[@id='masthead']/div/div/div[1]/div/a[3]")          private WebElement LinkedInLink;


  public WebElement getFacebookLink() {                                     return waitForElementToBeClickable(FacebookLink, driver); }
  public WebElement getLinkedInLink() {                                     return waitForElementToBeClickable(LinkedInLink, driver); }


    public boolean verifyFacebookLink () {
      return getFacebookLink().getAttribute("href").contains(FacebookURL);
    }

    public boolean verifyLinkedInLink () {
      return getLinkedInLink().getAttribute("href").equals(LinkedInURL);
    }


}

