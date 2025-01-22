package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_41_Decimal_price_filter_Stepdef {
    Product_Page page=new Product_Page();

    @When("search box ina {string} yaz")
    public void searchBoxInaYaz(String arg0) {

        page.cerez.click();
        page.searchbox.sendKeys(arg0, Keys.ENTER);
        ReusableMethods.bekle(  3);
        ReusableMethods.screenshot();

    }

    @And("Papia seçilir")
    public void papiaSeçilir() {
        ReusableMethods.bekle(  3);
        page.papiaselect.click();
        ReusableMethods.bekle(  3);
        ReusableMethods.screenshot();
    }


    @Then("Fiyat aralaıklarında kullanıcı decimal değer girememeli veya girmesi durumunda filtre doğru çalıştığının doğrulanması")
    public void fiyatAralaıklarındaKullanıcıDecimalDeğerGirememeliVeyaGirmesiDurumundaFiltreDoğruÇalıştığınınDoğrulanması() {
        page.fiyatmpanel.click();
        page.minfiyat.sendKeys("100,99");
        page.maxfiyat.sendKeys("599,99");
        ReusableMethods.screenshot();
        //Verilen fiyat aralıklarında ürün vardır
        page.fiyatbutton.click();
        ReusableMethods.bekle(25);
        ReusableMethods.screenshot();
        //ürün bulunamadı yazısı olmamalı
        Assert.assertFalse("Ürünler decimal fiyat değerlerinin girişine izin vermemeli ya da girilen decimal değerlere göre doğru listelenmeli!", page.emptyproducttext.isDisplayed());


    }
}
