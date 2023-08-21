Feature: US1009 Kullanici olmayan bir web elementi test eder

  Scenario: TC15 olmayan butonu test edebilmeli

    Given kullanici "herokuappUrl" anasayfaya gider
    And Add Element butonuna basar
    And Delete butonu gorununceye kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder




