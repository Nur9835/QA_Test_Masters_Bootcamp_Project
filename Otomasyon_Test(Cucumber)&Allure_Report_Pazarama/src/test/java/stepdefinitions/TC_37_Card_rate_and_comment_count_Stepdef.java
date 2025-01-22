package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_37_Card_rate_and_comment_count_Stepdef {

    Product_Page page= new Product_Page();
    String expected_card_rate;//beklenen ürün puan
    String actual_card_rate;//gerçek ürün puanı
    String expected_card_comment_count;//beklenen değerlendirme sayısı
    String actual_card_comment_count;//gerçek değerlendirme sayısı


    @When("Erkek Mont,Kaban kategorisindeki ürünlerden birinin puan ve değerlendirme sayısı değişkende tutulur")
    public void erkek_mont_kaban_kategorisindeki_ürünlerden_birinin_puan_ve_değerlendirme_sayısı_değişkende_tutulur() {
        //Kategoriye göre listelenen ürünlerden seçtiğimiz ürünün puan ve değerlendirme sayısı alınır
        ReusableMethods.bekle(5);
        expected_card_rate=page.firstproductcardrate.getText();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        expected_card_comment_count=page.firstproductcardcommentcount.getText().replaceAll("[^0-9]", "");
        ReusableMethods.screenshot();

    }

    @Then("O ürünün detay  sayfasındaki puan ve değerlendirme sayılarıyla  değişkende tutulan sayılar eşit olmalı")
    public void o_ürünün_detay_sayfasındaki_puan_ve_değerlendirme_sayılarıyla_değişkende_tutulan_sayılar_eşit_olmalı() {
        //o ürünün detay sayfasındaki puan ve değerlendirme sayısıyla karşılaştırma yapılır
        page.firstproduct.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        actual_card_rate=page.product_detail_page_card_rate.getText();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        actual_card_comment_count=page.product_detail_page_comment_count.getText().replaceAll("[^0-9]", "");
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();

        //Assert.assertEquals("Ürün puan aynı olmalı!", expected_card_rate , actual_card_rate);
        // Assert.assertEquals("Değerlendirme sayısı aynı olmalı!", expected_card_comment_count , actual_card_comment_count);

        //2 assert durumu olduğu için SoftAssert kullanıldı
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Ürün puan aynı olmalı!", expected_card_rate , actual_card_rate);
        softAssert.assertEquals("Değerlendirme sayısı aynı olmalı!", expected_card_comment_count , actual_card_comment_count);
        softAssert.assertAll();
    }

}
