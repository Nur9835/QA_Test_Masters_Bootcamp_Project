@register5
Feature: pazarama sitesi login/kayit ol  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir

  Scenario Outline: Pazarama sitesine zorunlu alanlar doldurulup üyelik metni ve rıza metni seçilmediğinde hata verilmesi gerekir
    And üye ol tıkla-kvkk
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda soyad bolumune "<soyad>" girilir
    And uyelik sayfasinda email bolumune "<email>" girilir
    And uyelik sayfasinda password bolumune "<password>" girilir
    And uye ol butonu tiklanir-kvkk
    Then Uygun hata mesajları kvkk ve üyelik metni için  görüntülenmelidir

    Examples:
      | ad  |  soyad | email               | password  |
      | Nur |  Test  | ttestnur@gmail.com  | test1234  |