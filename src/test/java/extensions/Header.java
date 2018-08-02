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




  public WebElement getHomeLogo()                                                 { return waitForElementToBeClickable(HomeLogo, driver); }


  public HomePage openHomePage() {
    getHomeLogo().click();
    return new HomePage(driver);
  }

}
