package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Home_Page {

    public Home_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@data-testid='navbar-container']/li[a/span[text()='Elektronik']]")
    public WebElement home_navbar_elektronik;

    @FindBy(xpath = "//ul[@data-testid='navbar-container']/li[a/span[text()='Moda']]")
    public WebElement home_navbar_moda;

    @FindBy(xpath = "//a[text()[normalize-space()='Masaüstü Bilgisayar']]")
    public WebElement home_navbar_elektronik_notebook;

    @FindBy(xpath = "//a[text()[normalize-space()='Erkek Mont, Kaban']]")
    public WebElement home_navbar_elektronik_erkek_mont;

    @FindBy(xpath = "//a[@href='/sepetim']")
    public WebElement gobasket;

}
