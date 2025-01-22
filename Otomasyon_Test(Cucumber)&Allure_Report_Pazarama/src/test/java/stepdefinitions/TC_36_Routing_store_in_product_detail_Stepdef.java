package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_36_Routing_store_in_product_detail_Stepdef {
    Product_Page page = new Product_Page();
    String expected_store;
    String actual_store;

    @When("Masaüstü Bilgisayar kategorisindeki seçilen üründen birinin detay sayfasına gidilir")
    public void masaüstü_bilgisayar_kategorisindeki_seçilen_üründen_birinin_detay_sayfasına_gidilir() {
        ReusableMethods.bekle(5);
        page.product.click();

    }
    @Then("Detay sayfasındaki satıcı bilgileri ile yönlendirilen mağaza sayfasının  doğruluğu test edilir")
    public void detay_sayfasındaki_satıcı_bilgileri_ile_yönlendirilen_mağaza_sayfasının_doğruluğu_test_edilir() {
        //Ürün detay sayfasındaki  ürünün satıcı bilgisinin doğruluğu; satıcı linkine tıklandıktan sonra açılan
        // sayfadaki (satıcı sayfası) başlık  ile karşılaştırılarak doğruluğu kanıtlanmış olur
        ReusableMethods.bekle(3);
        expected_store=page.store_name.getText();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        page.store_road.click();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        actual_store=page.actual_store_name.getText();
        ReusableMethods.bekle(3);
        Assert.assertEquals(expected_store, actual_store);

    }


}
