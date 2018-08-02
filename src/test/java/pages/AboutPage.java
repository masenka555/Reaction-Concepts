package pages;

import extensions.Header;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class AboutPage extends Header {
  public AboutPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_ABOUT))
      fail("The About Page did not load correctly");
  }


  private static final String PAGETITLE_ABOUT = "About";


}