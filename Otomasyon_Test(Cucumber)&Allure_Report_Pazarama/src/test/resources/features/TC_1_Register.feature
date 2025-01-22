@register
Feature: pazarama sitesi login/kayit ol  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir

  Scenario Outline: Pazarama sitesine zorunlu alanlar doldurularak kayıt olunmalı
    And üye ol tıkla
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda soyad bolumune "<soyad>" girilir
    And uyelik sayfasinda email bolumune "<email>" girilir
    And uyelik sayfasinda password bolumune "<password>" girilir
    And riza metni icin "<riza metni>" checkbox secilir
    And uyelik metni icin "<uyelik metni>" checkbox secilir

    And uye ol butonu tiklanir
    Examples:
      | ad  |  soyad | email               | password  | uyelik metni | riza metni |
      | Nur |  Test  | ttestnur@gmail.com  | test1234  | 1            | 1          |

