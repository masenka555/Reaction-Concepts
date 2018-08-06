package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class SuccessStoriesPage extends EveryHeaderFooter {
  public SuccessStoriesPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_SUCCESS_STORIES))
      fail("The Success Stories Page did not load correctly");
  }


  private static final String PAGETITLE_SUCCESS_STORIES = "Success Stories";


}