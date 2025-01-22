@login2
Feature: pazarama sitesi login  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario: Pazarama sitesine boş email adresi ile Login
    And email alanı boş password doğru girilir
      | email    | password  |
      |          | test1234 |

    Then E-Posta adresinizi girmelisiniz uyarısının alındığı doğrulanır


