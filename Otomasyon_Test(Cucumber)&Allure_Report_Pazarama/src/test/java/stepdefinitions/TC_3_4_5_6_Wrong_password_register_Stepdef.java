package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Register_Page;
import utilities.ReusableMethods;

public class TC_3_4_5_6_Wrong_password_register_Stepdef {

    Register_Page page = new Register_Page();

    @Then("Şifreniz rakam, harf ve en az sekiz karakterden oluşmalıdır. uyarısının alındığı doğrulanır")
    public void şifrenizRakamHarfVeEnAzSekizKarakterdenOluşmalıdırUyarısınınAlındığıDoğrulanır() {
        ReusableMethods.screenshot();
        Assert.assertTrue("Uyarı vermeli!", page.wrongpassword.isDisplayed());
    }

    @And("uyelik sayfasinda password bolumune {string} girilir\\(kurallara uymadan)")
    public void uyelikSayfasindaPasswordBolumuneGirilirKurallaraUymadan(String arg0) {
        ReusableMethods.bekle(3);
        page.passwordRegisterInput.sendKeys(arg0+ Keys.ENTER);
        ReusableMethods.screenshot();
    }
}
