package tests;

import extensions.EveryTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.lang.reflect.Method;

public class ReactionConceptsTests extends EveryTest {
  private HomePage HomePage;

  @BeforeMethod(alwaysRun = true)
  public void beforeTest(Method method) {
    HomePage = initializeTest(method);
  }


  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifySearchFieldDisplayed() {
   HomePage.verifyHomeHeaderDisplayed();
  }

  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyHeader() {
    HomePage
            .openServicesPage()
            .openSuccessStoriesPage()
            .openAboutPage()
            .openContactPage();

  }

  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyFacebookLink() {
    HomePage.verifyFacebookLink();
  }



  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyLinkedInLink() {
    HomePage.verifyLinkedInLink();
  }


}


