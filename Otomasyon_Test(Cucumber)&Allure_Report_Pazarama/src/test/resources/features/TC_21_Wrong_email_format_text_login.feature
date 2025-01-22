@login4
Feature: pazarama sitesi login  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario: Pazarama sitesine Login işleminde e-mail adresi alanında e-mail yazım formatına aykırı olması durumunda uyarı  vermeli
    And email alanında format yanlış olması
      | email    | password  |
      | test     | test1234  |

    Then Geçerli bir e-posta girmelisiniz. uyarısının alındığı doğrulanır
