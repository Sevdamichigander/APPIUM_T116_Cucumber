Feature: US1008 Liste olarak verilen kullanicilar ile negatif login testi

  Scenario Outline: TC14 Liste olarak verilen kullanicilar ile negatif login testi yapilabilmeli

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna listeden "<KullaniciAdi>" yazar
    And password kutusuna listeden "<password>" yazar
    When login butonuna basar
    And basarili olarak giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
    |KullaniciAdi|password|
    | Selgun           |  12345      |
    | Aysegul          |  34567      |
    | Yusuf            |  78965      |
    | Sevda            |  45786      |
    | Murat           |  54789632     |

    # Daha onceki stepDefinitionlarda datayi Configuration.properties ten aliyorduk.
    # stepleri ayirmak icin listeden ibaresi ekleyerek stepi farklilastirdik ve artik Config e gidip bilgi almayacak.
    # verdigimiz doneyi kullanacak