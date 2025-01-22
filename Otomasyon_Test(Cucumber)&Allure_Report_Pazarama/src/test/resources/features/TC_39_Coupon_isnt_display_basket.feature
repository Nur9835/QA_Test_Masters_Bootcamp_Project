@coupon
Feature: pazarama sitesi kupon görünürlük  testi

  Scenario: Uygulamaya giriş yapmadan da sepete eklenen ürün için tanımlanan kuponun sepette gösterilmesi
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir
    And  Masaüstü Bilgisayar kategorisindeki ürünlerden biri sepete eklenir(kupon mevcut)
    Then  Kullanıcı sepete gelir ve sepete eklenen ürün için tanımlanması gereken kuponu Kuponlarım alanında görebidiği doğrulanır



