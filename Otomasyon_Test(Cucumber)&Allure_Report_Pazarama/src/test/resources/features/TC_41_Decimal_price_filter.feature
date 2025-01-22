@productfilter2
Feature: pazarama sitesi küsuratlı fiyat filtre testi
  Scenario:Decimal değerlerin kullanıcı tarafından girilmesi engellenmediği taktirde istenilen decimal fiyat aralıklarında ürünler doğru filtrelenmeli
    Given "pazarama" sitesine gidilir
    When search box ina "tuvalet kağıdı" yaz
    And Papia seçilir
    Then Fiyat aralaıklarında kullanıcı decimal değer girememeli veya girmesi durumunda filtre doğru çalıştığının doğrulanması
