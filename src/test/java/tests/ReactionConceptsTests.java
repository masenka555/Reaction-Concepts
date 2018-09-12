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


    @Test(description = "Verify Home Header is Desplayed")
    public void verifyHomeHeaderDisplayed() {
        homePage.verifyHomeHeaderDisplayed();
    }

    @Test(description = "Verify all headers buttons is works and go to expected page")
    public void verifyHeaderButtonsWork() {
        homePage
                .openServicesPage()
                .openSuccessStoriesPage()
                .openAboutPage()
                .openContactPage();
    }

    @Test(description = "Verify Facebook Header link contains link to Facebook page")
    public void verifyFacebookHeaderLink() {
        assertTrue(homePage.verifyFacebookHeaderLink());
    }

    @Test(description = "Verify Facebook Footer link contains link to Facebook page")
    public void verifyFacebookFooterLink() {
        assertTrue(homePage.verifyFacebookFooterLink());
    }

    @Test(description = "Verify LinkedIn Header link contains link to LinkedIn page")
    public void verifyLinkedInHeaderLink() {
        assertTrue(homePage.verifyLinkedInHeaderLink());
    }

    @Test(description = "Verify LinkedIn Footer link contains link to LinkedIn page")
    public void verifyLinkedInFooterLink() {
        assertTrue(homePage.verifyLinkedInFooterLink());
    }

    @Test(description = "Verify Phone number at the Header is right and displayed")
    public void verifyPhoneNumberHeader() {
        assertTrue(homePage.verifyPhoneNumberHeader());
    }

    @Test(description = "Verify Phone number at the Footer is right and displayed")
    public void verifyPhoneNumberFooter() {
        assertTrue(homePage.verifyPhoneNumberFooter());
    }


    @Test(description = "Verify that All links in Services page go to expected pages")
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
                .openGoogleMyBusinessPageServices()
                .openServicesPage()
                .openGeneralMarketingPageServices();
    }

    @Test(description = "Verify all links in Home page go to expected pages")
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

    @Test(description = "Verify all footer buttons works and go to expected places")
    public void verifyFooterButtonsWork() {
        homePage
                .openServicesPageWithFooterButton()
                .openSuccessStoriesPageWithFooterButton()
                .openAboutPageWithFooterButton()
                .openContactPageWithFooterButton();
    }

    @Test(description = "Verify Home body buttons works")
    public void verifyHomeBodyButtonsWork() {
        homePage.openServicesPageWithHomeBodyServicesButton()
                .openHomePage()
                .openSuccessStoriesPageWithHomeBodySuccessStoriesButton()
                .openHomePage()
                .openContactPageWithHomeBodyContactUsButton();
    }

    @Test(description = "Veryfy All success stories buttons works")
    public void verifyAllSuccessStoriesButtonWork() {
        homePage.openSuccessStoriesPageWithAllSuccessStoriesButton();
    }

    @Test(description = "Verify right scrolling of success stories")
    public void verifyRightScrolling() {
        assertTrue(homePage.verifyRightScrollingSuccessStories());
    }

    @Test(description = "Verify left scrolling of success stories")
    public void verifyLeftScrolling() {
        assertTrue(homePage.verifyLeftScrollingSuccessStories());
    }

    @Test(description = "Verify company tiles in Success stories page go to correct page and contains the same name as in tile")
    public void verifyCompanyTilesGoToCorrectPage() {
        homePage.openSuccessStoriesPage().verifyCompanyTilesGoToCorrectPage();
    }

    @Test(description = "Verify Error messages displayed if User doesn;t insert any data in Contact Page")
    public void verifyContactValidationErrorPage() {
        homePage.openContactPage().openContactValidationErrorPageWithSubmitButton()
                .verifyValidationErrorHeaderDisplayed();
    }

    @Test(description = "Verify Error messages displayed for all required fields")
    public void verifyErrorMessages() {
        homePage.openContactPage().openContactValidationErrorPageWithSubmitButton()
                .verifyErrorMessages();
    }

}


