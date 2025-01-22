package pages;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button[data-testid='baseheaderaccountindex-button-loginfalse']")
    public WebElement goLoginPageButton;

    @FindBy(xpath = "//a[@href='/giris']/parent::div")
    public WebElement navlinkLogin;

    @FindBy(id = "Username")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-sm mr-4 rounded-md text-pink-500 font-bold bg-white text-xxs border border-pink-500 w-45 hover:opacity-90' and contains(text(), 'Kabul Et')]")
    public WebElement cerez2;

    @FindBy(id = "submit-button")
    public WebElement loginButton;

    @FindBy(xpath = "//li[text()='E-Posta adresinizi girmelisiniz.']")
    public WebElement emptyemailsuccesspaswordtext;

    @FindBy(xpath = "//li[text()='Şifrenizi girmelisiniz.']")
    public WebElement emptypasswordsuccessemailtext;

    @FindBy(xpath = "//li[text()='Geçerli bir e-posta girmelisiniz.']")
    public WebElement wrongemialformattext;

}
