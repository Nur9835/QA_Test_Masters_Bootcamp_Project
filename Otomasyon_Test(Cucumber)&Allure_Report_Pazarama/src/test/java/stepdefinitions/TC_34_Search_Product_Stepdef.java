package stepdefinitions;
import org.openqa.selenium.Keys;
import pages.Product_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;

public class TC_34_Search_Product_Stepdef {
    Product_Page page=new Product_Page();

    @When("search box ina {string} yazılır")
    public void search_box_ina_yazılır(String string) {
        page.cerez.click();
        page.searchbox.sendKeys(string, Keys.ENTER);
        ReusableMethods.screenshot();
        ReusableMethods.bekle(  3);
    }
    @Then("goruntulenen sonuclarda {string} yazdığı doğrulanir")
    public void goruntulenen_sonuclarda_yazdığı_doğrulanir(String string) {
        for (int i = 0; i < page.productList.size(); i++) {
            System.out.printf(page.productList.get(i).getText());
            assertTrue(page.productList.get(i).getText().contains(string)   ||  page.productList.get(i).getText().contains("JENGA") || page.productList.get(i).getText().contains("Jenga")   );
        }
        ReusableMethods.screenshot();
    }

}
