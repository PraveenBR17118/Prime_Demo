package TestCases;


import PageObjects.HomePage;
import PageObjects.HomePage2;
import PageObjects.SignUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends Base
{
    @Test
    public void openHomePage() throws InterruptedException
    {
        logger.info("WebPage Opened");
        HomePage hp = new HomePage(driver);
        hp.isLogoDisplayed();
        String a1 = "prime logo1";
        String a2 = hp.getTextOfLogo();
        System.out.println("Captured the String");
        System.out.println("Logo is "+ a2);

        if(a1.equals(a2))
        {
            System.out.println("Logo is same");
            logger.info("Logo is same");
        }
        else
         {
             try
             {
                 captureScreen(driver, "Logo is different");
                 logger.warn("Logo is different");
                 Assert.fail("Logo is different");
             }
             catch (Throwable e)
             {
                 e.printStackTrace();
             }

         }

        hp.clickSignup();

        Thread.sleep(5000);
        logger.info("Opened signup page");
        SignUp sg = new SignUp(driver);
        String s1 = "SIGNUP1";
        String s2 = sg.getTextOfLogo();
        System.out.println(" Captured String is : " + s2);

        if(s1.equals(s2))
        {
            System.out.println("Text is same");
            logger.info("Signup Text is same");
        }
        else
        {
            try
            {
                captureScreen(driver, "Signup Logo is different");
                logger.warn("Signup Logo is different");
                Assert.fail("SignUp is different");
            }
            catch(Throwable e)
            {
                e.printStackTrace();
            }
        }

        Thread.sleep(8000);

        sg.signUpfieldClick("9972822275");
        Thread.sleep(3000);
        sg.clickContinue();
        logger.info("Entered phone number");

        Thread.sleep(20000);

//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter OTP");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
//
//        Thread.sleep(4000);
//
//        sg.enterOTP(userName);

        HomePage2 hp2 = new HomePage2(driver);
        String s4 = hp2.welcomeLogo();
        System.out.println(s4);
        String s5 = "Hi Praveen B R1";

        logger.info("Opened home page after login");

        if(s4.equals(s5))
        {
            System.out.println("Welcome Logo is same");
            logger.info("After login welcome logo is same");
        }
        else
        {
            try
            {
                captureScreen(driver, "Welcome logo is different");
                logger.warn("Welcome logo is different");
                Assert.fail("Welcome Logo is different");
            }
            catch(Throwable e)
            {
                e.printStackTrace();
            }
        }
        logger.warn("Completed Task");
    }
}
