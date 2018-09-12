package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class ContactValidationErrorPage extends EveryHeaderFooter {
    public ContactValidationErrorPage(WebDriver driver) {
        super(driver);
        if (!isCurrent(PAGETITLE_CONTACT))
            fail("The Contact Error Page did not load correctly");
    }


    private static final String PAGETITLE_CONTACT = "Contact";

    @FindBy(className = "validation_error")                                                   private WebElement validationErrorHeader;
    @FindBy(xpath = "//*[@id='field_1_5']/div[2]")                                            private WebElement requiredNameMessage;
    @FindBy(xpath = "//*[@id='field_1_7']/div[2]")                                            private WebElement requiredCompanyNameMessage;
    @FindBy(xpath = "//*[@id='field_1_2']/div[2]")                                            private WebElement requiredEmailMessage;
    @FindBy(xpath = "//*[@id='field_1_6']/div[3]")                                            private WebElement requiredInterestedServicesMessage;
    @FindBy(xpath = "//*[@id='field_1_4']/div[2]")                                            private WebElement requiredInquiryMessage;


    public WebElement getValidationErrorHeader()                                             { return waitForElementToBeClickable(validationErrorHeader, driver); }
    public WebElement getRequiredNameMessage()                                               { return waitForElementToBeClickable(requiredNameMessage, driver); }
    public WebElement getRequiredCompanyNameMessage()                                        { return waitForElementToBeClickable(requiredCompanyNameMessage, driver); }
    public WebElement getRequiredEmailMessage()                                              { return waitForElementToBeClickable(requiredEmailMessage, driver); }
    public WebElement getRequiredInterestedServicesMessage()                                 { return waitForElementToBeClickable(requiredInterestedServicesMessage, driver); }
    public WebElement getRequiredInquiryMessage()                                            { return waitForElementToBeClickable(requiredInquiryMessage, driver); }


    public boolean verifyValidationErrorHeaderDisplayed ()                                   { return validationErrorHeader.isDisplayed();  }
    public boolean verifyRequiredNameMessageDisplayed ()                                     { return requiredNameMessage.isDisplayed();  }
    public boolean verifyRequiredCompanyNameMessageDisplayed ()                              { return requiredCompanyNameMessage.isDisplayed();  }
    public boolean verifyRequiredEmailMessageDisplayed ()                                    { return requiredEmailMessage.isDisplayed();  }
    public boolean verifyRequiredInterestedServicesMessageDisplayed ()                       { return requiredInterestedServicesMessage.isDisplayed();  }
    public boolean verifyRequiredInquiryMessageDisplayed ()                                  { return requiredInquiryMessage.isDisplayed();  }

    public boolean verifyErrorMessages() {
        return verifyRequiredCompanyNameMessageDisplayed() && verifyRequiredEmailMessageDisplayed() &&
                verifyRequiredInquiryMessageDisplayed()&& verifyRequiredInterestedServicesMessageDisplayed() &&
                verifyRequiredNameMessageDisplayed();
    }
}