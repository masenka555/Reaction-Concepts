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
  public void verifyHomeHeaderDisplayed() {
   HomePage.verifyHomeHeaderDisplayed();
  }

  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyHeaderButtonsWork() {
    HomePage
            .openServicesPage()
            .openSuccessStoriesPage()
            .openAboutPage()
            .openContactPage();

  }

  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyFacebookHeaderLink() {
    HomePage.verifyFacebookHeaderLink();
  }


  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyFacebookFooterLink() { HomePage.verifyFacebookFooterLink();
  }


  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyLinkedInHeaderLink() {
    HomePage.verifyLinkedInHeaderLink();
  }

  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyLinkedInFooterLink() {
    HomePage.verifyLinkedInFooterLink();
  }


  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyServicesHeaderWork() {
    HomePage
            .openServicesPage()
            .openPPCAccountSetUpPage()
            .openServicesPage()
            .openPPCManagementPage()
            .openServicesPage()
            .openSocialMediaAdvertisingPage()
            .openServicesPage()
            .openSearchEngineOptimizationPage()
            .openServicesPage()
            .openGeneralMarketingPage();

  }

  @Test(description = "", groups = {"smoke", "qa", "prod"})
  public void verifyFooterButtonsWork() {
    HomePage
            .openServicesPageWithFooterButton()
            .openSuccessStoriesPageWithFooterButton()
            .openAboutPageWithFooterButton()
            .openContactPageWithFooterButton();

  }

}


