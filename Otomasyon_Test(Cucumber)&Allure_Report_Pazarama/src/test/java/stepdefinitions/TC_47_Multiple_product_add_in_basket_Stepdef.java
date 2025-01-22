package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_47_Multiple_product_add_in_basket_Stepdef {
    Product_Page page = new Product_Page();

    @When("Masaüstü Bilgisayar kategorisindeki seçilen üründen test amaçlı {int} adet eklenir")
    public void masaüstü_bilgisayar_kategorisindeki_seçilen_üründen_test_amaçlı_adet_eklenir(Integer int1) {
        ReusableMethods.bekle(5);
        page.product.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page.product_count.clear();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page.product_count.sendKeys(int1.toString());
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page.addproduct.click();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
    }

    @Then("Sepete eklenen ürünün {int} adet olduğu doğrulanır")
    public void sepete_eklenen_ürünün_adet_olduğu_doğrulanır(Integer int1) {
        //5 adet sepete eklenen ürün Header alanındaki sepet icon içerisindeki değerle karşılaştırılarak 5 adet eklendiği kontrol edilir
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(3);
        String countText =  page.in_basket_count.getText();
        ReusableMethods.screenshot();
        int count_basket = Integer.parseInt(countText.trim());
        ReusableMethods.screenshot();
        Assert.assertEquals(int1.intValue(), count_basket);
    }


}
