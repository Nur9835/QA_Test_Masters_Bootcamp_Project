@login3
Feature: pazarama sitesi login  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario: Pazarama sitesine boş password ile Login
    And e-mail alanı doğru password boş girilir
      | email                 | password  |
      | ttestnur@gmail.com    |           |


    Then Şifrenizi girmelisiniz uyarısının alındığı doğrulanır
