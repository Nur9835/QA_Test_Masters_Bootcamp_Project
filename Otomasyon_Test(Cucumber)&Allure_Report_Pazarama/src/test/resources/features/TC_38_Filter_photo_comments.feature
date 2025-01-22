@filter_photo_comments
Feature: pazarama sitesi filtrelenmiş fotoğraflı yorum testi

  Scenario: Ürün detay sayfasındaki tüm yorumlardan Fotoğraflı yorum filtresi doğru sonuçları getirmeli
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Moda navbar elementinin hover durumundan sonra Erkek Mont, Kaban seçilir
    And  Erkek Mont,Kaban kategorisindeki ürünlerden birinin detay sayfasına gidilir
    Then Ürün detay sayfasında Tüm yorumlardan Fotoğraflı yorumlar adediyle birlikte tespit edilir ve Fotoğraflı Yorum filtresi seçildikten sonra dönen sonuçların doğrılığu kanıtlanır olmalı



