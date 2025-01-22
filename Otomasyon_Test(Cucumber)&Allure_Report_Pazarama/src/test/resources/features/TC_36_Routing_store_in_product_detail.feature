@route_store
Feature: Ürün mağazasına yönlendirme testi

  Scenario:Ürün detay sayfasındaki satıcı  ismi doğruluğu kanıtlanmalı
    Given "pazarama" sitesine gidilir
    When Ana sayfadaki Elektronik navbar elementinin hover durumundan sonra Masaüstü Bilgisayar seçilir
    And  Masaüstü Bilgisayar kategorisindeki seçilen üründen birinin detay sayfasına gidilir
    Then Detay sayfasındaki satıcı bilgileri ile yönlendirilen mağaza sayfasının  doğruluğu test edilir

