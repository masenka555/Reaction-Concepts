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

    @FindBy(className = "validation_error")                                                   private WebElement ValidationErrorHeader;
    @FindBy(xpath = "//*[@id='field_1_5']/div[2]")                                            private WebElement RequiredNameMessage;
    @FindBy(xpath = "//*[@id='field_1_7']/div[2]")                                            private WebElement RequiredCompanyNameMessage;
    @FindBy(xpath = "//*[@id='field_1_2']/div[2]")                                            private WebElement RequiredEmailMessage;
    @FindBy(xpath = "//*[@id='field_1_6']/div[3]")                                            private WebElement RequiredInterestedServicesMessage;
    @FindBy(xpath = "//*[@id='field_1_4']/div[2]")                                            private WebElement RequiredInquiryMessage;


    public WebElement getValidationErrorHeader()                                             { return waitForElementToBeClickable(ValidationErrorHeader, driver); }
    public WebElement getRequiredNameMessage()                                               { return waitForElementToBeClickable(RequiredNameMessage, driver); }
    public WebElement getRequiredCompanyNameMessage()                                        { return waitForElementToBeClickable(RequiredCompanyNameMessage, driver); }
    public WebElement getRequiredEmailMessage()                                              { return waitForElementToBeClickable(RequiredEmailMessage, driver); }
    public WebElement getRequiredInterestedServicesMessage()                                 { return waitForElementToBeClickable(RequiredInterestedServicesMessage, driver); }
    public WebElement getRequiredInquiryMessage()                                            { return waitForElementToBeClickable(RequiredInquiryMessage, driver); }


    public boolean verifyValidationErrorHeaderDisplayed ()                                   { return ValidationErrorHeader.isDisplayed();  }
    public boolean verifyRequiredNameMessageDisplayed ()                                     { return RequiredNameMessage.isDisplayed();  }
    public boolean verifyRequiredCompanyNameMessageDisplayed ()                              { return RequiredCompanyNameMessage.isDisplayed();  }
    public boolean verifyRequiredEmailMessageDisplayed ()                                    { return RequiredEmailMessage.isDisplayed();  }
    public boolean verifyRequiredInterestedServicesMessageDisplayed ()                       { return RequiredInterestedServicesMessage.isDisplayed();  }
    public boolean verifyRequiredInquiryMessageDisplayed ()                                  { return RequiredInquiryMessage.isDisplayed();  }

    public boolean verifyErrorMessages() {
        return verifyRequiredCompanyNameMessageDisplayed() && verifyRequiredEmailMessageDisplayed() &&
                verifyRequiredInquiryMessageDisplayed()&& verifyRequiredInterestedServicesMessageDisplayed() &&
                verifyRequiredNameMessageDisplayed();
    }
}