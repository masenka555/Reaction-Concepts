package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class ContactPage extends EveryHeaderFooter {
  public ContactPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_CONTACT))
      fail("The Contact Page did not load correctly");
  }


  private static final String PAGETITLE_CONTACT = "Contact";


}