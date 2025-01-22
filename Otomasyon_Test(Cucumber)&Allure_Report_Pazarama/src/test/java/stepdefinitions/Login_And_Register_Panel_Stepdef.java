package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Login_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login_And_Register_Panel_Stepdef {
    //Login ve Register paneline gitmek(ortak)
    Login_Page page = new Login_Page();

    @Given("{string} sitesine gidilir")
    public void sitesine_gidilir(String string) {
        Driver.getDriver().get("https://www.pazarama.com/");
        ReusableMethods.bekle(3);
    }

    @When("Header alanındaki Giris Yap\\/ Uye Ol tıklanır")
    public void header_alanındaki_giris_yap_uye_ol_tıklanır() {
        //page.cerez.click();
        ReusableMethods.screenshot();
        page.goLoginPageButton.click();
        ReusableMethods.bekle(3);

    }
    @When("Açılan dropdown menuden Giris Yap\\/Uye Ol tıklanır")
    public void açılan_dropdown_menuden_giris_yap_uye_ol_tıklanır() {
        ReusableMethods.screenshot();
        page.navlinkLogin.click();
        ReusableMethods.bekle(5);
    }

    @When("Giriş Yap sayfasi acilir")
    public void giriş_yap_sayfasi_acilir() {
    }
}
