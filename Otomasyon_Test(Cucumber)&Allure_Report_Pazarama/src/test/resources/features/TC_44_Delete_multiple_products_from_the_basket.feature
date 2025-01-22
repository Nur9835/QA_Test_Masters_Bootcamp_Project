@delete_multiple_basket
Feature: pazarama sitesi sepette tüm ürünlerin silinmesi testi

  Scenario:Sepetteki tüm ürünlerin çıkartılma butonu işlevini yerine getirilmesi
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir
    And  Masaüstü Bilgisayar kategorisindeki seçilen farklı ürünler sepete eklenir
    Then Sepette tüm ürünlerin silinmesi butonunun işlevi yerine getirerek sepetteki tüm ürünlerin silindiği doğrulanır



