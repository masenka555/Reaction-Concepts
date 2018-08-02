package pages;

import extensions.Header;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class SocialMediaAdvertisingPage extends Header {
  public SocialMediaAdvertisingPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_SOCIAL_MEDIA_ADVERTISING))
      fail("The Social Media Advertising Page did not load correctly");
  }


  private static final String PAGETITLE_SOCIAL_MEDIA_ADVERTISING = "Social Media Advertising";


}