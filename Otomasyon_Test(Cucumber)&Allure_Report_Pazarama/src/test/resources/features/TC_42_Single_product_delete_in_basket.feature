@delete_single_product_basket
Feature: pazarama sitesi sepette ürünün silinmesi testi

  Scenario:Sepetteki tekli ürünün  silinmesi testi
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir
    And  Masaüstü Bilgisayar kategorisindeki ürünlerden biri sepete eklenir(kupon mevcut)
    Then Sepetteki ürünün  çöp kutusu  iconuna tıkladıktan sonra silindiği doğrulanır