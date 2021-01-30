package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp
{
    public WebDriver driver;

    public SignUp(WebDriver rdriver)
    {
        driver =rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/main/div[1]/div[1]/div[1]/div/div/div[1]/span[2]")
    })
    @CacheLookup
    WebElement Signupisplayed;

    public void isSignupDisplayed()
    {
        Signupisplayed.isDisplayed();
    }

    public String getTextOfLogo()
    {
        String ab = Signupisplayed.getText();
        return ab;
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/main/div[1]/div[1]/div[1]/div/div/div[2]/div/input")
    })
    @CacheLookup
    WebElement Signupfield;

    public void signUpfieldClick(String a1)
    {
        String b1 = a1;
        Signupfield.click();
        Signupfield.sendKeys(b1);
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/main/div[1]/div[1]/div[1]/div/div/div[3]/div/span/button")
    })
    @CacheLookup
    WebElement Continuebutton;

    public void clickContinue()
    {
        Continuebutton.click();
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/main/div[1]/div[1]/div[1]/div[2]/div[4]/div/div")
    })
    @CacheLookup
    WebElement OTPfiled;

    public void enterOTP(String a1)
    {
        String b1 = a1;
        OTPfiled.sendKeys(b1);
    }

}
