package stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.Product_Page;
import utilities.Driver;
import utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home_Page;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;

public class TC_39_Coupon_isnt_display_basket_Stepdef {

    Home_Page page=new Home_Page();
    Product_Page page2 = new Product_Page();


    @Given("Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir")
    public void ana_sayfadaki_elektronik_navbar_elementinin_hover_durumundan_sonra_masaüstü_bilgisayar_seçilir() {
        page2.cerez.click();
        ReusableMethods.moveToElementWithAction(page.home_navbar_elektronik);
        ReusableMethods.screenshot();
        page.home_navbar_elektronik_notebook.click();

    }

    @When("Masaüstü Bilgisayar kategorisindeki ürünlerden biri sepete eklenir\\(kupon mevcut)")
    public void masaüstü_bilgisayar_kategorisindeki_ürünlerden_biri_sepete_eklenir_kupon_mevcut() {
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        page2.firstproductaddbasketbutton.click();
        ReusableMethods.bekle(5);

    }

    @Then("Kullanıcı sepete gelir ve sepete eklenen ürün için tanımlanması gereken kuponu Kuponlarım alanında görebidiği doğrulanır")
    public void kullanıcı_sepete_gelir_ve_sepete_eklenen_ürün_için_tanımlanması_gereken_kuponu_kuponlarım_alanında_görebidiği_doğrulanır() {
        page.gobasket.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        Assert.assertFalse("Kupon ekle gösterilmemeli!", page2.nocoupon.isDisplayed());

    }
}
