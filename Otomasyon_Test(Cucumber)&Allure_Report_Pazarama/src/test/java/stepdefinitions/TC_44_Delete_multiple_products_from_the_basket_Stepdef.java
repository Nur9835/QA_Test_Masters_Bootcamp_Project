package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Home_Page;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_44_Delete_multiple_products_from_the_basket_Stepdef {
    Home_Page page=new Home_Page();
    Product_Page page2 = new Product_Page();

    @When("Masaüstü Bilgisayar kategorisindeki seçilen farklı ürünler sepete eklenir")
    public void masaüstü_bilgisayar_kategorisindeki_seçilen_farklı_ürünler_sepete_eklenir() {
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.firstproductaddbasketbutton.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.secondproductaddbasketbutton.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.thirdproductaddbasketbutton.click();
        ReusableMethods.bekle(5);
    }
    @Then("Sepette tüm ürünlerin silinmesi butonunun işlevi yerine getirerek sepetteki tüm ürünlerin silindiği doğrulanır")
    public void sepette_tüm_ürünlerin_silinmesi_butonunun_işlevi_yerine_getirerek_sepetteki_tüm_ürünlerin_silindiği_doğrulanır() {
        //Sepette tüm ürünlerin çıkartıldığı doğrulanmalı
        page.gobasket.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.alldeleteproductinbasket.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.alertacceptdeleteproductinbasket.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        Assert.assertTrue("Sepette ürün kalmamalı!", page2.noproductinbasket.isDisplayed());
        ReusableMethods.bekle(5);
    }

}
