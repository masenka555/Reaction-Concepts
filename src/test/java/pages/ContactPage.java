package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class ContactPage extends EveryHeaderFooter {
  public ContactPage(WebDriver driver) {
    super(driver);
    if (!isCurrent(PAGETITLE_CONTACT))
      fail("The Contact Page did not load correctly");
  }


  private static final String PAGETITLE_CONTACT = "Contact";

    @FindBy(id = "gform_submit_button_1")                                   private WebElement submitContactButton;


    public WebElement getSubmitContactButton()                             { return waitForElementToBeClickable(submitContactButton, driver); }


    public ContactValidationErrorPage openContactValidationErrorPageWithSubmitButton() {
        getSubmitContactButton().click();
        return new ContactValidationErrorPage(driver);
    }

}

