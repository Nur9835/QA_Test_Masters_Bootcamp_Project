package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_35_Routing_category_in_product_detail_Stepdef {

    Product_Page page = new Product_Page();
    String expected_category;//beklenen kategori ismi
    String actual_category;//gerçek kategori ismi

    @Then("Detay sayfasındaki kategori  bilgileri ile yönlendirilen kategori sayfasının  doğruluğu test edilir")
    public void detaySayfasındakiKategoriBilgileriIleYönlendirilenKategoriSayfasınınDoğruluğuTestEdilir() {
        ReusableMethods.bekle(3);
        expected_category=page.category_name.getText();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        page.category_link.click();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        actual_category=page.actual_category_name.getText();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        Assert.assertEquals(expected_category, actual_category);

    }


}
