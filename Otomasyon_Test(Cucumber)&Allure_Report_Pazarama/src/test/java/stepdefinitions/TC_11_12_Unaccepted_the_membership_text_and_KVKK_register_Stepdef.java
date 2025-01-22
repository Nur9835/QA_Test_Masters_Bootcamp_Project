package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Register_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_11_12_Unaccepted_the_membership_text_and_KVKK_register_Stepdef {

    Register_Page page = new Register_Page();

    @And("uye ol butonu tiklanir-kvkk")
    public void uyeOlButonuTiklanirKvkk() {
        ReusableMethods.bekle(5);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();",  page.registerbutton);
        ReusableMethods.screenshot();
        ReusableMethods.bekle(5);
    }

    @Then("Uygun hata mesajları kvkk ve üyelik metni için  görüntülenmelidir")
    public void uygunHataMesajlarıKvkkVeÜyelikMetniIçinGörüntülenmelidir() {
        //kvkk ve üyelik için aynı 2 mesaj verilmektedir
        ReusableMethods.screenshot();
        Assert.assertEquals("Hata mesajı sayısı beklenenden farklı!", 2, page.empty_kvkk_and_memeber_text.size());

        for (WebElement message : page.empty_kvkk_and_memeber_text) {
            Assert.assertTrue("Hata mesajı görünür değil!", message.isDisplayed());
        }
    }

    @And("üye ol tıkla-kvkk")
    public void üyeOlTıklaKvkk() {
       page.cerez2.click();
       ReusableMethods.screenshot();
       page.UyeOlPanel.click();
       ReusableMethods.screenshot();
    }
}
