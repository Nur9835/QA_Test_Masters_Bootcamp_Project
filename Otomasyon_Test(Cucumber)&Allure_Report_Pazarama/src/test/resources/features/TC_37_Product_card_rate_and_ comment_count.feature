@card_rate_and_comment_count
Feature: pazarama sitesi ürün puan ve yorum sayısı  testi

  Scenario: Uygulamadaki kategoriye  uygun listelenen bazı ürünlerin puan ve değerlendirme sayıları o ürünlerin detay sayfasındaki puan ve değerlendirme sayılarıyla eşitlik göstermelidir
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Moda navbar elementinin hover durumundan sonra Erkek Mont, Kaban seçilir
    And  Erkek Mont,Kaban kategorisindeki ürünlerden birinin puan ve değerlendirme sayısı değişkende tutulur
    Then O ürünün detay  sayfasındaki puan ve değerlendirme sayılarıyla  değişkende tutulan sayılar eşit olmalı
