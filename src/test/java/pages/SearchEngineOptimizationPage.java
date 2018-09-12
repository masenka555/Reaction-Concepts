package pages;

import extensions.EveryHeaderFooter;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class SearchEngineOptimizationPage extends EveryHeaderFooter {
public SearchEngineOptimizationPage(WebDriver driver) {
        super(driver);
        if (!isCurrent(PAGETITLE_SEARCH_ENGINE_OPTIMIZATION))
        fail("The Search Engine Optimization Page did not load correctly");
        }

private static final String PAGETITLE_SEARCH_ENGINE_OPTIMIZATION = "Search Engine Optimization (SEO)";

        }