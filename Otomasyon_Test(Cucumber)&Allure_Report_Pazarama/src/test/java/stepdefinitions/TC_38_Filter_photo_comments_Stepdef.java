package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Home_Page;
import pages.Product_Page;
import utilities.ReusableMethods;

public class TC_38_Filter_photo_comments_Stepdef {

    Home_Page page=new Home_Page();
    Product_Page page2 = new Product_Page();

    //beklenen fotoğraflı  yorum sayısı
    int customer_photo_comments;
    //filtreli gelen fotoğraflı yorum sayısı
    int actual_customer_photo_comments;


    @When("Ana sayfadaki Moda navbar elementinin hover durumundan sonra Erkek Mont, Kaban seçilir")
    public void ana_sayfadaki_moda_navbar_elementinin_hover_durumundan_sonra_erkek_mont_kaban_seçilir() {
        page2.cerez.click();
        ReusableMethods.moveToElementWithAction(page.home_navbar_moda);
        page.home_navbar_elektronik_erkek_mont.click();
    }
    @When("Erkek Mont,Kaban kategorisindeki ürünlerden birinin detay sayfasına gidilir")
    public void erkek_mont_kaban_kategorisindeki_ürünlerden_birinin_detay_sayfasına_gidilir() {
        ReusableMethods.bekle(5);
        page2.firstproduct.click();
        ReusableMethods.bekle(5);
        ReusableMethods.screenshot();
        ReusableMethods.scroll(page2.customer_comments);
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        page2.all_comments.click();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        //Tüm yorumlar listelenir ve fotoğraflı yorum sayısı int değerde tutulur. Bu senaryoya göre 7 tane fotoğraflı yorum mevcut
        customer_photo_comments= page2.customer_photo__comments.size();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        System.out.printf("beklenen:",customer_photo_comments);
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        ReusableMethods.scroll(page2.customer_comments);
        //tüm yorumlardan tespit edilen fotoğraflı yorumların sayısı fotoğraflı yorum filtresi sonucu çıkan elementle aynı olmalı
        ReusableMethods.bekle(3);
        if (!page2.customer_photo__comments_filter_checkbox.isSelected()) {
            page2.customer_photo__comments_filter_checkbox.click();
        }
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        actual_customer_photo_comments= page2.customer_photo__comment_filtered.size();
        ReusableMethods.bekle(3);
        ReusableMethods.screenshot();
        System.out.printf("çıkan sonuç:",actual_customer_photo_comments);


    }
    @Then("Ürün detay sayfasında Tüm yorumlardan Fotoğraflı yorumlar adediyle birlikte tespit edilir ve Fotoğraflı Yorum filtresi seçildikten sonra dönen sonuçların doğrılığu kanıtlanır olmalı")
    public void ürün_detay_sayfasında_tüm_yorumlardan_fotoğraflı_yorumlar_adediyle_birlikte_tespit_edilir_ve_fotoğraflı_yorum_filtresi_seçildikten_sonra_dönen_sonuçların_doğrılığu_kanıtlanır_olmalı() {
        //çıkan sonuç beklenen ile karşılaştırılır
        ReusableMethods.screenshot();
        Assert.assertEquals("Filtreleme düzgün çalışmalı!", customer_photo_comments , actual_customer_photo_comments);

    }



}
