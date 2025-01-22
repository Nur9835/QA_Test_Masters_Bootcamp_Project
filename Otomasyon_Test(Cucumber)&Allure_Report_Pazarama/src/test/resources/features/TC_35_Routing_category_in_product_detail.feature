@route_category
Feature: Ürün kategori sayfasına yönlendirme testi

  Scenario: Ürün detay sayfasındaki ürünün kategori bilgisinin doğruluğu; bir önceki sayfadaki (kategori sayfası) başlık ile karşılaştırılarak doğruluğu kanıtlanmalı
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir
    And  Masaüstü Bilgisayar kategorisindeki seçilen üründen birinin detay sayfasına gidilir
    Then Detay sayfasındaki kategori  bilgileri ile yönlendirilen kategori sayfasının  doğruluğu test edilir

