package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

class CompanySuccessStoryPage extends EveryHeaderFooter {

    CompanySuccessStoryPage(WebDriver driver, String companyName) {
        super(driver);
        if (!isCurrent(companyName) || !verifyHeader(companyName))
            fail("The Success Stories Page did not load correctly");
    }



    @FindBy(tagName = "h1")                                                                 private WebElement companyHeader;
    @FindBy(xpath = "//*[@id='breadcrumbs']/span/span/span/a")                              private WebElement backToSuccessStories;


    private WebElement getCompanyHeader()                { return waitForElementToBeClickable(companyHeader, driver); }
    private WebElement getBackToSuccessStories()         { return waitForElementToBeClickable(backToSuccessStories, driver); }



    private boolean verifyHeader(String companyName) {
        return getCompanyHeader().getText().equals(companyName);
    }

    CompanySuccessStoryPage openCompanySuccessPage() {
        getBackToSuccessStories().click();
        return new CompanySuccessStoryPage(driver, "Success Stories");
    }



}
