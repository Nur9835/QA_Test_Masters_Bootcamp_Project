@searchproduct
Feature: pazarama sitesi ürün arama ve sayısının doğru verilmesi testi
  Scenario:Arama sonuçlarının doğru gösterilmesi
    Given "pazarama" sitesine gidilir
    When search box ina "jenga" yazılır
    Then goruntulenen sonuclarda "jenga" yazdığı doğrulanir
