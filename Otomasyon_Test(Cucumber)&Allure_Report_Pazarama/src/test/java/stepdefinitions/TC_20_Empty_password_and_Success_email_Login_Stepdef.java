package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import utilities.ReusableMethods;
import java.util.List;
import java.util.Map;

public class TC_20_Empty_password_and_Success_email_Login_Stepdef {
    Login_Page page = new Login_Page();

    @When("e-mail alanı doğru password boş girilir")
    public void e_mail_alanı_doğru_password_boş_girilir(io.cucumber.datatable.DataTable dataTable) {
        ReusableMethods.bekle(5);
        page.cerez2.click();
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String email = row.get("email");
            String password = row.get("password");
            page.emailInput.clear();
            page.emailInput.sendKeys(email);
            ReusableMethods.screenshot();
            page.passwordInput.clear();
            // Boş değerler için null kontrolü
            if (password != null && !password.isEmpty()) {
                page.passwordInput.sendKeys(password);
                ReusableMethods.screenshot();
            }
            page.loginButton.click();
        }
    }

    @Then("Şifrenizi girmelisiniz uyarısının alındığı doğrulanır")
    public void şifrenizi_girmelisiniz_uyarısının_alındığı_doğrulanır() {
        ReusableMethods.screenshot();
        Assert.assertTrue("Uyarı vermeli!", page.emptypasswordsuccessemailtext.isDisplayed());
    }
}
