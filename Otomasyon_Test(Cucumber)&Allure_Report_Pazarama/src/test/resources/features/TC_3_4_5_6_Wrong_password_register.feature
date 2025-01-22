@register3
Feature: pazarama sitesi login/kayit ol  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario Outline: Pazarama sitesine Register işleminde şifre rakam, harf ve en az 8 karakterden oluşmadığı durumda uyarı vermeli
    And üye ol tıkla
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda soyad bolumune "<soyad>" girilir
    And uyelik sayfasinda email bolumune "<email>" girilir
    And uyelik sayfasinda password bolumune "<password>" girilir(kurallara uymadan)
    And uyelik metni icin "<uyelik metni>" checkbox secilir
    And riza metni icin "<riza metni>" checkbox secilir
    And uye ol butonu tiklanir
    Then Şifreniz rakam, harf ve en az sekiz karakterden oluşmalıdır. uyarısının alındığı doğrulanır
    Examples:
      | ad  |  soyad | email              | password    | uyelik metni | riza metni |
      | Nur |  Test  |ttestnur@gmail.com  | test        | 1            | 1          |
      | Nur |  Test  |ttestnur@gmail.com  | 12345678    | 1            | 1          |
      | Nur |  Test  |ttestnur@gmail.com  | abcdefgh    | 1            | 1          |
      | Nur |  Test  |ttestnur@gmail.com  | ac23        | 1            | 1          |

