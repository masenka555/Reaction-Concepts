package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class SuccessStoriesPage extends EveryHeaderFooter {
    public SuccessStoriesPage(WebDriver driver) {
        super(driver);
        if (!isCurrent(PAGETITLE_SUCCESS_STORIES))
            fail("The Success Stories Page did not load correctly");
    }


    private static final String PAGETITLE_SUCCESS_STORIES = "Success Stories";


//    @FindBy(xpath = "//div[1]/a/h4")                                                        private WebElement CompanyTile;
//
//
//    public WebElement getCompanyTile()                         { return waitForElementToBeClickable(CompanyTile, driver); }


  // new CompanySuccessStoryPage(driver, "companyName");



    public void verifyCompanyTilesGoToCorrectPage() {

        for (int i = 1; i <= 5; i++) {
            WebElement CompanyTile = driver.findElement(By.xpath("//div[" + i + "]/a/h4"));
            String companyName = CompanyTile.getText();
            CompanyTile.click();
            new CompanySuccessStoryPage(driver, companyName).openCompanySuccessPage();
        }


    }
}

