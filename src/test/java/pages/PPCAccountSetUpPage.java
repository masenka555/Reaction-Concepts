package pages;

import extensions.Header;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class PPCAccountSetUpPage extends Header {
  public PPCAccountSetUpPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_PPC_ACCOUNT_SET_UP))
      fail("The PPC Account Set-up Page did not load correctly");
  }


  private static final String PAGETITLE_PPC_ACCOUNT_SET_UP = "PPC Account Set-up";


}