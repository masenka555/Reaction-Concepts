package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class GoogleMyBusinessPage extends EveryHeaderFooter {
    public GoogleMyBusinessPage(WebDriver driver) {
        super(driver);
        if (!isCurrent(PAGETITLE_GOOGLE_MY_BUSINESS))
            fail("The PPC Account Set-up Page did not load correctly");
    }

    private static final String PAGETITLE_GOOGLE_MY_BUSINESS = "Google My Business";

}