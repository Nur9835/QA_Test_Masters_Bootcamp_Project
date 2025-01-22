package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class Product_Page {

    public Product_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "label-input")
    public WebElement searchbox;

    @FindBy(css = "div[class='line-clamp-2 text-gray-600 h-8 text-xs leading-4 mb-1.5']")
    public List<WebElement> productList;

    @FindBy(xpath = "//div[@class='!w-1/4 px-2.5 py-2.5']")
    public List<WebElement>  filteredproduct;

    @FindBy(xpath = "//div[@class='flex mb-5']//button[@data-testid='base-addbasket-button' and contains(., 'Sepete Ekle')]")
    public WebElement addproduct;

    @FindBy(css = "button[class='btn btn-sm bg-white border border-pink-500 !text-pink-500 text-xxs font-bold w-45']")
    public WebElement cerez;

    @FindBy(xpath="//div[@data-testid='base-litecheckbox-container' and .//span[contains(text(),'Papia')]]//input")
    public WebElement papiaselect;

    @FindBy(xpath="//div[p[span[text()='Parfüm']]]//div[@data-testid='base-litecheckbox-container' and .//span[contains(text(),'Yok')]]//input")
    public WebElement parfumnoselect;

    @FindBy(xpath="//div[p[span[text()='Parfüm']]]")
    public WebElement parfumpanel;

    @FindBy(xpath="//div[p[span[text()='Fiyat']]]")
    public WebElement fiyatmpanel;

    @FindBy(xpath="//div[p[span[text()='Fiyat']]]//div[@data-testid='base-accordion-content']//input[@placeholder='En Az']")
    public WebElement minfiyat;

    @FindBy(xpath="//div[p[span[text()='Fiyat']]]//div[@data-testid='base-accordion-content']//input[@placeholder='En Çok']")
    public WebElement maxfiyat;

    @FindBy(css = "button[class='btn btn-md btn-gray']")
    public WebElement fiyatbutton;

    @FindBy(css = "button[class='dn-slide-deny-btn']")
    public WebElement no;

    @FindBy(css = "div[class='leading-tight font-semibold text-huge text-error']")
    public List<WebElement> indirimliürünfiyat;

    @FindBy(css = "div[class='leading-tight font-semibold text-huge text-gray-600']")
    public List<WebElement>  normalfiyat;

    @FindBy(xpath="//p[@class='text-xxs']")
    public WebElement  sontoplamürüntext;

    @FindBy(xpath="//*[contains(text(), 'Ürün bulunamadı.')]")
    public WebElement  emptyproducttext;

    @FindBy(xpath="//div[@class='!w-1/4 px-2.5 py-2.5'][1]//button")
    public WebElement  firstproductaddbasketbutton;

    @FindBy(xpath="//div[@class='!w-1/4 px-2.5 py-2.5'][1]")
    public WebElement  product;

    @FindBy(xpath="//div[@class='!w-1/4 px-2.5 py-2.5'][2]//button")
    public WebElement  secondproductaddbasketbutton;

    @FindBy(xpath="//div[@class='!w-1/4 px-2.5 py-2.5'][3]//button")
    public WebElement thirdproductaddbasketbutton;

    @FindBy(xpath="(//div[contains(text(), 'Rodi Erkek Fermuarlı Kapuşonlu Mont')])[1]")
    public WebElement  firstproduct;

    @FindBy(xpath="((//div[contains(text(), 'Rodi Erkek Fermuarlı Kapuşonlu Mont')])[1]/..)//span[@data-testid='product-card-rate']")
    public WebElement  firstproductcardrate;

    @FindBy(xpath="((//div[contains(text(), 'Rodi Erkek Fermuarlı Kapuşonlu Mont')])[1]/..)//p[@data-testid='product-card-comment-count']")
    public WebElement  firstproductcardcommentcount;

    @FindBy(xpath="//span[text()='Kodu Ekle']")
    public WebElement  nocoupon;

    @FindBy(xpath="//div[contains(text(),'Ürün Değerlendirme')]")
    public WebElement  customer_comments;

    @FindBy(xpath="//button[@class='btn btn-xs text-blue-500 mx-auto' and text()[normalize-space()='Tüm Yorumları Oku']]")
    public WebElement  all_comments;

    @FindBy(xpath="//span[text()='Kullanıcı Fotoğrafları']")
    public List<WebElement> customer_photo__comments;

    @FindBy(xpath="//div[@class='pl-7 ms-2']//input")
    public WebElement customer_photo__comments_filter_checkbox;

    @FindBy(xpath = "//div[@class='border border-gray-200 rounded-md mb-3.75 last:mb-0 relative']")
    public List<WebElement> customer_photo__comment_filtered;

    @FindBy(xpath="//span[@class='text-lg leading-none font-bold text-orange-500 ml-2']")
    public WebElement product_detail_page_card_rate;

    @FindBy(xpath="//a[@class='nuxt-link-active text-gray-400 text-xxs font-semibold']")
    public WebElement product_detail_page_comment_count;

    @FindBy(xpath="//button[@data-testid='sepetim-index-btn-remove-all']")
    public WebElement  alldeleteproductinbasket;

    @FindBy(xpath="//button[@data-testid='base-modal-approve-button']")
    public WebElement  alertacceptdeleteproductinbasket;

    @FindBy(xpath="//p[contains(text(), 'Sepetinizde ürün bulunmamaktadır.')]")
    public WebElement noproductinbasket;

    @FindBy(xpath="//button[@class='btn w-8 h-8 bg-pink-50']")
    public WebElement  firstproductdeletebuttoninbasket;

    @FindBy(xpath="//div[@class='flex mb-5']//input[@data-testid='base-counter-quantity-input']")
    public WebElement  product_count;

    @FindBy(xpath="//span[@class='badge bg-pink-500 mt-1 ml-0.5']")
    public WebElement  in_basket_count;

    @FindBy(xpath="//p[@class='flex text-gray-500 text-xxs !text-base']//span[2]")
    public WebElement  store_name;

    @FindBy(xpath="//h1[@class='text-lg text-blue-500 font-semibold']")
    public WebElement  actual_store_name;

    @FindBy(xpath="//div[@class='flex items-center text-xxs font-semibold']")
    public WebElement  store_road;

    @FindBy(xpath="//div[@class='flex justify-between mt-4']/a[1]//span")
    public WebElement  category_name;

    @FindBy(xpath="//div[@class='flex justify-between mt-4']/a[1]")
    public WebElement  category_link;

    @FindBy(xpath="//h1[@class='text-base text-gray-600 font-bold whitespace-normal break-words line-clamp-2']")
    public WebElement  actual_category_name;


}
