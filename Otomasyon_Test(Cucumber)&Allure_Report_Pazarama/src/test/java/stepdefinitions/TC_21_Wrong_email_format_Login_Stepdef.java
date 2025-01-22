package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class TC_21_Wrong_email_format_Login_Stepdef {
    Login_Page page = new Login_Page();

    @When("email alanında format yanlış olması")
    public void email_alanında_format_yanlış_olması(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String email = row.get("email");
            String password = row.get("password");
            page.emailInput.clear();
            page.emailInput.sendKeys(email);
            ReusableMethods.screenshot();
            page.passwordInput.clear();
            page.passwordInput.sendKeys(password);
            ReusableMethods.screenshot();
            page.loginButton.click();
        }
        }

    @Then("Geçerli bir e-posta girmelisiniz. uyarısının alındığı doğrulanır")
    public void geçerli_bir_e_posta_girmelisiniz_uyarısının_alındığı_doğrulanır() {
        ReusableMethods.screenshot();
        Assert.assertTrue("Uyarı vermeli!", page.wrongemialformattext.isDisplayed());
    }
}
