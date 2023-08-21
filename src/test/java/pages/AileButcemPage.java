package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(Driver.getAndroidDriver(), this);
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public WebElement emailAdresiBox;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[10]")
    public WebElement sifreBox;

    @FindBy(xpath = "//*[@text='Hesap : TYuzSekiz Appium']")
    public WebElement hesapAdiText;



}
