package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class PPCManagementPage extends EveryHeaderFooter {
  public PPCManagementPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_PPC_MANAGEMENT))
      fail("The PPC Management Page did not load correctly");
  }


  private static final String PAGETITLE_PPC_MANAGEMENT = "PPC Management";


}