package tests;

import extensions.EveryTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.lang.reflect.Method;

import static org.testng.Assert.assertTrue;

public class ReactionConceptsTests extends EveryTest {
    private HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(Method method) {
        homePage = initializeTest(method);
    }


    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyHomeHeaderDisplayed() {
        homePage.verifyHomeHeaderDisplayed();
    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyHeaderButtonsWork() {
        homePage
                .openServicesPage()
                .openSuccessStoriesPage()
                .openAboutPage()
                .openContactPage();

    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyFacebookHeaderLink() {
        assertTrue(homePage.verifyFacebookHeaderLink());
    }


    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyFacebookFooterLink() {
        assertTrue(homePage.verifyFacebookFooterLink());
    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyLinkedInHeaderLink() {
        homePage.verifyLinkedInHeaderLink();
    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyLinkedInFooterLink() {
        homePage.verifyLinkedInFooterLink();
    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyPhoneNumberHeader() {
        homePage.verifyPhoneNumberHeader();
    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyPhoneNumberFooter() {
        homePage.verifyPhoneNumberFooter();
    }


    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyServicesHeaderWork() {
        homePage
                .openServicesPage()
                .openPPCAccountSetUpPageServices()
                .openServicesPage()
                .openPPCManagementPageServices()
                .openServicesPage()
                .openSocialMediaAdvertisingPageServices()
                .openServicesPage()
                .openSearchEngineOptimizationPageServices()
                .openServicesPage()
                .openGeneralMarketingPageServices();

    }

    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyHomeHeaderWork() {
        homePage
                .openPPCAccountSetUpPageHome()
                .openHomePage()
                .openPPCManagementPageHome()
                .openHomePage()
                .openSocialMediaAdvertisingPageHome()
                .openHomePage()
                .openSearchEngineOptimizationPageHome()
                .openHomePage()
                .openGeneralMarketingPageHome();
    }


    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyFooterButtonsWork() {
        homePage
                .openServicesPageWithFooterButton()
                .openSuccessStoriesPageWithFooterButton()
                .openAboutPageWithFooterButton()
                .openContactPageWithFooterButton();

    }


    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyHomeBodyButtonsWork() {
        homePage.openServicesPageWithHomeBodyServicesButton()
                .openHomePage()
                .openSuccessStoriesPageWithHomeBodySuccessStoriesButton()
                .openHomePage()
                .openContactPageWithHomeBodyContactUsButton();


    }


    @Test(description = "", groups = {"smoke", "qa", "prod"})
    public void verifyAllSuccessStoriesButtonWork() {
        homePage.openSuccessStoriesPageWithAllSuccessStoriesButton();
    }

    @Test
    public void verifyRightScrolling() {
        assertTrue(homePage.verifyRightScrollingSuccessStories());
    }


    @Test
    public void verifyLeftScrolling() {
        assertTrue(homePage.verifyLeftScrollingSuccessStories());
    }

    @Test
    public void verifyCompanyTilesGoToCorrectPage() {
        homePage.openSuccessStoriesPage().verifyCompanyTilesGoToCorrectPage();
    }

    @Test
    public void verifyContactValidationErrorPage() {
        homePage.openContactPage().openContactValidationErrorPageWithSubmitButton()
                .verifyValidationErrorHeaderDisplayed();
    }

    @Test
    public void verifyErrorMessages() {
        homePage.openContactPage().openContactValidationErrorPageWithSubmitButton()
                .verifyErrorMessages();
    }

}


