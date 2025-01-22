@register4
Feature: pazarama sitesi login/kayit ol  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario Outline: Pazarama sitesine Register işleminde zorunlu alanların her birinin boş bırakılması sonucunda uyarı vermeli
    And üye ol tıkla
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda soyad bolumune "<soyad>" girilir
    And uyelik sayfasinda email bolumune "<email>" girilir
    And uyelik sayfasinda password bolumune "<password>" girilir(kurallara uymadan)
    And uyelik metni icin "<uyelik metni>" checkbox secilir
    And riza metni icin "<riza metni>" checkbox secilir
    And uye ol butonu tiklanir
    Then Uygun hata mesajları "<error>"  görüntülenmelidir:


    Examples:
      | ad  |  soyad | email              | password    | uyelik metni | riza metni | error                            |
      |     |  Test  |ttestnur@gmail.com  | test1234    | 1            | 1          | Adınızı girmelisiniz.            |
      | Nur |        |ttestnur@gmail.com  | test1234    | 1            | 1          | Soyadınızı girmelisiniz.         |
      | Nur |  Test  |                    | test1234    | 1            | 1          | E-Posta Adresinizi girmelisiniz. |
      | Nur |  Test  |ttestnur@gmail.com  |             | 1            | 1          | Şifrenizi girmelisiniz.          |

