package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.JavascriptExecutor;
import pages.Register_Page;
import utilities.Driver;
import utilities.ReusableMethods;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;
import utilities.ReusableMethods;

public class TC_1_Register_Stepdef {

    Register_Page page = new Register_Page();

    @When("üye ol tıkla")
    public void üye_ol_tıkla() {
        ReusableMethods.bekle(5);
      //  page.cerez2.click();
        page.UyeOlPanel.click();
        ReusableMethods.screenshot();
    }

    @When("uyelik sayfasinda ad bolumune {string} girilir")
    public void uyelik_sayfasinda_ad_bolumune_girilir(String string) {
        page.firstNameRegisterInput.sendKeys(string);
        ReusableMethods.screenshot();
    }

    @When("uyelik sayfasinda soyad bolumune {string} girilir")
    public void uyelik_sayfasinda_soyad_bolumune_girilir(String string) {
        page.lastNameRegisterInput.sendKeys(string);
        ReusableMethods.screenshot();
    }

    @And("uyelik sayfasinda email bolumune {string} girilir")
    public void uyelikSayfasindaEmailBolumuneGirilir(String arg0) {
        page.emailRegisterInput.sendKeys(arg0);
        ReusableMethods.screenshot();
    }

    @And("uyelik sayfasinda password bolumune {string} girilir")
    public void uyelikSayfasindaPasswordBolumuneGirilir(String arg0) {
        page.passwordRegisterInput.sendKeys(arg0);
        ReusableMethods.screenshot();
        ReusableMethods.bekle(3);
    }

    @When("uyelik metni icin {string} checkbox secilir")
    public void uyelik_metni_icin_checkbox_secilir(String string) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();",  page.uyelikkabul);
         ReusableMethods.screenshot();
         ReusableMethods.bekle(3);
    }

    @When("riza metni icin {string} checkbox secilir")
    public void riza_metni_icin_checkbox_secilir(String string) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();",   page.rizametni);
        ReusableMethods.screenshot();
        ReusableMethods.bekle(3);
    }

    @When("uye ol butonu tiklanir")
    public void uye_ol_butonu_tiklanir() {
     //   page.registerbutton.click();
    //Cloudflare durumu olduğu için manuel devam edildi
    }

}
