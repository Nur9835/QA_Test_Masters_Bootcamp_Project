package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Register_Page;
import utilities.ReusableMethods;

public class TC_7_8_9_10_Empty_field_register_Stepdef {

    Register_Page page = new Register_Page();

    @Then("Uygun hata mesajları {string}  görüntülenmelidir:")
    public void uygunHataMesajlarıGörüntülenmelidir(String error) {

        boolean isErrorDisplayed = false;

        switch (error) {
            case "Adınızı girmelisiniz.":
                isErrorDisplayed = page.empty_name.isDisplayed();;
                break;
            case "Soyadınızı girmelisiniz.":
                isErrorDisplayed = page.empty_surname.isDisplayed();
                break;
            case "E-Posta Adresinizi girmelisiniz.":
                isErrorDisplayed = page.empty_email.isDisplayed();
                break;
            case "Şifrenizi girmelisiniz.":
                isErrorDisplayed = page.empty_password.isDisplayed();
                break;
            default:
                throw new IllegalArgumentException("Beklenmeyen hata: " + error);
        }
            ReusableMethods.screenshot();
            Assert.assertTrue("hata mesajını göstermeli! " + error, isErrorDisplayed);
    }

}