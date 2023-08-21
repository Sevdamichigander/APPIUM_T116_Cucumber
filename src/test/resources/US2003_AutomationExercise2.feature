Feature: AE Product Verify
  Scenario: US_002 AE Product Verify

    Given kullanici "automationUrl" anasayfaya gider
    Then anasayfaya ulastigini dogrular
    And product sayfasina gider
    And tum urunlerin goruntulendigini dogrular
    Then arama kismina Premium Polo T-Shirts yazip search butonuna tiklar
    And urun ayrintisini goruntuler
    And urun adini dogrular