@add_multiple_basket
Feature: Sepete eklenen ürünlerin miktar doğrulaması

  Scenario:Sepete aynı üründen birden fazla eklenmesi ve eklendiği miktar kadar sepette o ürünün olması testi
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir
    And  Masaüstü Bilgisayar kategorisindeki seçilen üründen test amaçlı 5 adet eklenir
    Then Sepete eklenen ürünün 5 adet olduğu doğrulanır

