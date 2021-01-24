package TestCases;


import PageObjects.HomePage;
import org.testng.annotations.Test;

public class TestHomepage extends Base
{
    @Test
    public void openHomePage()
    {
        logger.info("WebPage Opened");
        HomePage hp = new HomePage(driver);
        hp.isLogoDisplayed();
        logger.warn("Completed Task");
    }
}
