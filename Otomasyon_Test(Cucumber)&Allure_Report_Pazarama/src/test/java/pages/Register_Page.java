package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class Register_Page {

    public Register_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Üye Ol']/parent::button[@class='card__passive-page']")
    public WebElement UyeOlPanel;

    @FindBy(id = "FirstName")
    public WebElement firstNameRegisterInput;

    @FindBy(id = "LastName")
    public WebElement lastNameRegisterInput;

    @FindBy(id = "SignupUserName")
    public WebElement emailRegisterInput;

    @FindBy(id = "registerPassword")
    public WebElement passwordRegisterInput;

    @FindBy(xpath = "//input[@id='64c36e55-3c23-4fca-1f3e-08d9c45ccf32']")
    public WebElement rizametni;

    @FindBy(xpath = "//input[@id='4ebaa59b-b631-4599-9ed5-667fe5a69794']")
    public WebElement uyelikkabul;

    @FindBy(xpath = "//button[@id='register-submit-button']")
    public WebElement registerbutton;

    @FindBy(xpath = "//button[@class='btn btn-sm mr-4 rounded-md text-pink-500 font-bold bg-white text-xxs border border-pink-500 w-45 hover:opacity-90' and contains(text(), 'Kabul Et')]")
    public WebElement cerez2;

    @FindBy(xpath = "//li[text()='Geçerli bir e-posta girmelisiniz.']")
    public WebElement wrongemialformattext;

    @FindBy(xpath = "//li[text()='Şifreniz rakam, harf ve en az 8 karakterden oluşmalıdır.']")
    public WebElement wrongpassword;

    @FindBy(xpath = "//div[@id='password-eye']")
    public WebElement eyeicon;

    @FindBy(xpath = "//li[text()='Adınızı girmelisiniz.']")
    public WebElement empty_name;

    @FindBy(xpath = "//li[text()='Soyadınızı girmelisiniz.']")
    public WebElement empty_surname;

    @FindBy(xpath = "//li[text()='E-Posta Adresinizi girmelisiniz.']")
    public WebElement empty_email;

    @FindBy(xpath = "//li[text()='Şifrenizi girmelisiniz.']")
    public WebElement empty_password;

    @FindBy(xpath = "//li[text()='İlgili alanı onaylayınız.']")
    public List<WebElement>  empty_kvkk_and_memeber_text;

}
