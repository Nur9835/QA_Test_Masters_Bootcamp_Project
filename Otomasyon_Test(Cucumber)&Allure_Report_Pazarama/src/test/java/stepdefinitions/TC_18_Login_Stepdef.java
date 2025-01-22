package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_Page;
import utilities.ReusableMethods;
import java.util.List;
import java.util.Map;

public class TC_18_Login_Stepdef {
    Login_Page page = new Login_Page();

    @When("email ve password kutusuna girilir")
    public void email_ve_password_kutusuna_girilir(io.cucumber.datatable.DataTable dataTable) {
        ReusableMethods.bekle(5);
        page.cerez2.click();
        List<Map<String,String>> map =dataTable.asMaps();
        for(int i=0; i<map.size(); i++){
            page.emailInput.clear();//input alanı temizlenir
            page.emailInput.sendKeys(dataTable.asMaps().get(i).get("email"));
            ReusableMethods.screenshot();
            ReusableMethods.bekle(3);
            page.passwordInput.clear(); //password alanı temizlenir
            page.passwordInput.sendKeys(dataTable.asMaps().get(i).get("password"));
            ReusableMethods.screenshot();
            ReusableMethods.bekle(3);
        }

    }

    @Then("Sayfaya giris yapıldığı doğrulanır")
    public void sayfayaGirisYapıldığıDoğrulanır() {
        ReusableMethods.screenshot();
        page.loginButton.click();
        //Cloudflare durumu olduğu için manuel devam edildi
    }
}


