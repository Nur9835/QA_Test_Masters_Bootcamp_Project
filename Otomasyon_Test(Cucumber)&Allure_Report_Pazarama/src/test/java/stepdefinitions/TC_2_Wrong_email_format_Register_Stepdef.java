package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Register_Page;
import utilities.ReusableMethods;

public class TC_2_Wrong_email_format_Register_Stepdef {

    Register_Page page = new Register_Page();

    @And("uyelik sayfasinda email bolumune {string} girilir\\(e-mail yazım formatında olmayan)")
    public void uyelikSayfasindaEmailBolumuneGirilirEMailYazımFormatındaOlmayan(String arg0) {
        page.emailRegisterInput.sendKeys(arg0);
        ReusableMethods.screenshot();
    }

    @Then("Geçerli bir e-posta girmelisiniz. uyarısının alındığı doğrulanır-Register")
    public void geçerliBirEPostaGirmelisinizUyarısınınAlındığıDoğrulanırRegister() {
        Assert.assertTrue("Uyarı vermeli!", page.wrongemialformattext.isDisplayed());
    }

}
