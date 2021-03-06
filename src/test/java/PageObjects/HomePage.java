package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    public WebDriver driver;

    public HomePage(WebDriver rdriver)
    {
        driver =rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/header/div/div/div/a/div")
    })
    @CacheLookup
    WebElement Signup;

    public void clickSignup()
    {
        Signup.click();
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/main/div[1]/div/div[1]/div[1]/img")
    })
    @CacheLookup
    WebElement Logodisplayed;

    public void isLogoDisplayed()
    {
        Logodisplayed.isDisplayed();
    }

    public String getTextOfLogo()
    {
       String ab = Logodisplayed.getAttribute("alt");
        return ab;
    }

}
