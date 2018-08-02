package extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import pages.HomePage;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class EveryTest {
  protected static WebDriver driver;


  //------------------------------------------------------------------------------------------------------------------

  public HomePage initializeTest(Method method) {
    try {
          driver = new ChromeDriver();
    } catch (Exception e) {
      e.printStackTrace();
      fail("The WebDriver could not be initialized.");
    }

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://reactionconcepts.com/");

    return new HomePage(driver);
  }

  @AfterMethod(alwaysRun = true)
  public void afterTest(ITestResult result) {
    String resultStr = result.getStatus() == 1 ? "PASSED" :
            result.getStatus() == 2 ? "FAILED" : "IGNORED";
    System.out.println(resultStr);

    driver.close();
    driver.quit();

    if (driver != null)
      driver.quit();
  }
}

