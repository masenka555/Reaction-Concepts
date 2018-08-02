package pages;

import extensions.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class HomePage extends Header {
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


}