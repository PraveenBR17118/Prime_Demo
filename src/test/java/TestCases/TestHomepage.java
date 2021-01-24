package TestCases;


import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends Base
{
    @Test
    public void openHomePage()
    {
        logger.info("WebPage Opened");
        HomePage hp = new HomePage(driver);
        hp.isLogoDisplayed();
        String a1 = "times prime logo";
        String a2 = hp.getTextOfLogo();
        System.out.println("Captured the String");
        System.out.println("Logo is "+ a2);
        if(a1.equals(a2))
        {
            System.out.println("Logo is same");
            Assert.assertTrue(a1.equals(a2));
        }
        else
        {
            //System.out.println("Logo is different");
            //Assert.assertFalse(a1.equals(a2));
            Assert.fail("Logo is different");
        }
        logger.warn("Completed Task");
    }
}
