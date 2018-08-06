package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class GeneralMarketingPage extends EveryHeaderFooter {
  public GeneralMarketingPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_GENERAL_MARKETING))
      fail("The General Marketing Page did not load correctly");
  }


  private static final String PAGETITLE_GENERAL_MARKETING = "General Marketing";


}