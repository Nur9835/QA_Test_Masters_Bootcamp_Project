@register2
Feature: pazarama sitesi login/kayit ol  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario Outline: Pazarama sitesine Register işleminde e-mail adresi alanında e-mail yazım formatına aykırı olması durumunda uyarı  vermeli
    And üye ol tıkla
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda soyad bolumune "<soyad>" girilir
    And uyelik sayfasinda email bolumune "<email>" girilir(e-mail yazım formatında olmayan)
    And uyelik sayfasinda password bolumune "<password>" girilir
    And uyelik metni icin "<uyelik metni>" checkbox secilir
    And riza metni icin "<riza metni>" checkbox secilir
    And uye ol butonu tiklanir
    Then Geçerli bir e-posta girmelisiniz. uyarısının alındığı doğrulanır-Register
    Examples:
      | ad  |  soyad | email          | password  | uyelik metni | riza metni |
      | Nur |  Test  | wrong_email_   | test1234  | 1            | 1          |


