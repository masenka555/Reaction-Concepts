package pages;

import extensions.Header;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class ServicesPage extends Header {
  public ServicesPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_SERVICES))
      fail("The Services Page did not load correctly");
  }


  private static final String PAGETITLE_SERVICES = "Services";


}