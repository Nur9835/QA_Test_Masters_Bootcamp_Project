package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Home_Page;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_42_Single_product_delete_in_basket_Stepdef {
    Home_Page page=new Home_Page();
    Product_Page page2 = new Product_Page();

    @Then("Sepetteki ürünün  çöp kutusu  iconuna tıkladıktan sonra silindiği doğrulanır")
    public void sepetteki_ürünün_çöp_kutusu_iconuna_tıkladıktan_sonra_silindiği_doğrulanır() {
        page.gobasket.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.firstproductdeletebuttoninbasket.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        //tek bir ürün eklediğimiz için silme işlemi gerçekleşmesi durumunda sepette ürün kalmadı yazısı görünmeli
        Assert.assertTrue("Sepette ürün kalmamalı!", page2.noproductinbasket.isDisplayed());

    }
}
