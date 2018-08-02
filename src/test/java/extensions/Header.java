package extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;

public class Header extends EveryPage {
  public Header(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[@id='nav']/ul/li[1]/a")                  private WebElement HomeButton;
  @FindBy(xpath = "//*[@id='nav']/ul/li[2]/a")                  private WebElement AddNewButton;
  @FindBy(xpath = "//*[@id='nav']/ul/li[3]/a")                  private WebElement GroupsButton;
  @FindBy(xpath = "//*[@id='nav']/ul/li[4]/a")                  private WebElement NextBirthdayButton;
  @FindBy(xpath = "//*[@id='nav']/ul/li[7]/a")                  private WebElement MapButton;
  @FindBy(xpath = "//*[@id='nav']/ul/li[8]/a")                  private WebElement ExportButton;
  @FindBy(xpath = "//*[@id='nav']/ul/li[9]/a")                  private WebElement ImportButton;



  public WebElement getHomeButton()               { return waitForElementToBeClickable(HomeButton, driver); }
  public WebElement getAddNewButton()             { return waitForElementToBeClickable(AddNewButton, driver); }
  public WebElement getGroupsButton()             { return waitForElementToBeClickable(GroupsButton, driver); }
  public WebElement getNextBirthdayButton()       { return waitForElementToBeClickable(NextBirthdayButton, driver); }
  public WebElement getMapButton()                { return waitForElementToBeClickable(MapButton, driver); }
  public WebElement getExportButton()             { return waitForElementToBeClickable(ExportButton, driver); }
  public WebElement getImportButton()             { return waitForElementToBeClickable(ImportButton, driver); }


  public AuthenticatedHomePage openAuthenticatedHomePage() {
    getHomeButton().click();
    return new AuthenticatedHomePage(driver);
  }

  public AddNewPage openAddNewPage() {
    getAddNewButton().click();
    return new AddNewPage(driver);
  }

  public GroupsHomePage openGroupsHomePage() {
    getGroupsButton().click();
    return new GroupsHomePage(driver);
  }

  public NextBirthdaysPage openNextBirthdayPage() {
    getNextBirthdayButton().click();
    return new NextBirthdaysPage(driver);
  }

  public MapPage openMapPage() {
    getMapButton().click();
    return new MapPage(driver);
  }

  public ExportPage openExportPage() {
    getExportButton().click();
    return new ExportPage(driver);
  }

  public ImportPage openImportPage() {
    getImportButton().click();
    return new ImportPage(driver);
  }


}
