Feature: Guru99 Telecom Project

  Scenario: Guru99 Telecom Project Add Costumer

    Given kullanici guru99 Telecom anasayfaya gider.
    Then  sayfanin title inin Telecom icerdigini test eder
    And   add costumer sayfasina gider
    And   formu doldurup submit butonuna basar
    And   kaydin basarili oldugunu dogrular
    And   costumer id numarasini yazdirir
    And   sayfayi kapatir