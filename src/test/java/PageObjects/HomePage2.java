package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2
{
    public WebDriver driver;

    public HomePage2(WebDriver rdriver)
    {
        driver =rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindAll({
            @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/main/div[2]/div[1]/div[1]/div[1]/div[1]")
    })
    @CacheLookup
    WebElement HiLogo;

    public String welcomeLogo()
    {
        String s2 = HiLogo.getText();
        return s2;
    }
}
