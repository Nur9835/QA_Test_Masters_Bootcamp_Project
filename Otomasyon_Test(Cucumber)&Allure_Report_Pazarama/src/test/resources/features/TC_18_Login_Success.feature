@login
Feature: pazarama sitesi login/kayit ol  testi
  Background: pazarama sitesine giriş/kayit ol sayfasına yönlendirme
    Given "pazarama" sitesine gidilir
    When  Header alanındaki Giris Yap/ Uye Ol tıklanır
    And   Açılan dropdown menuden Giris Yap/Uye Ol tıklanır
    And   Giriş Yap sayfasi acilir


  Scenario: Pazarama sitesine Login
    And email ve password kutusuna girilir
      | email       | password |
      |ttestnur@gmail.com| test1234|

    Then Sayfaya giris yapıldığı doğrulanır


