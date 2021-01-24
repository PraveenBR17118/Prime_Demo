package TestCases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Base
{
    public static WebDriver driver;

    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public static void setUp(String br)
    {
        logger = Logger.getLogger("Test Prime");
        PropertyConfigurator.configure("Log4j.properties");


        if(br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/praveenbr/IntelliJIdea/TimesPrime/Drivers/chromedriver");
            driver=new ChromeDriver();
        }
        else if(br.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","/Users/praveenbr/IntelliJIdea/TimesPrime/Drivers/geckodriver");
            driver = new FirefoxDriver();
        }

        logger.info("Opened Browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.timesprime.com/");


    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
