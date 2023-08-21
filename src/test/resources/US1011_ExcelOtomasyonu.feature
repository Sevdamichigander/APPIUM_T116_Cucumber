Feature: US1011 Excel Otomasyonu
@wip
  Scenario: TC17 kullanici excel dosyasini testlerde kullanabilmeli

    Given kullanici excel dosyasini kullanabilecegi ayarlari yapar
    Then indexi 1 olan satirdaki indexi 2 olan hucreyi yazdirir
    And baskenti "Cakarta" olan ulkenin ingilizce ismini yazdirir
    And Ulke sayisininin 190 oldugunu test eder
    And Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder
    And baskenti "Cakarta" olan ulkenin tum bilgilerini yazdirir


#Baskentler excelini framework’e ekleyelim ve excelle ilgili islemleri yaparak dosyayi kullanilabilir hale getirelim
# - 1.satirdaki 2.hucreye gidelim ve yazdiralim
# - 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
# - baskenti Jakarta olan ulke ismini yazdiralim
# - Ulke sayisini bulalim
# - Fiziki olarak kullanilan satir sayisini bulun
# - Tum bilgileri map olarak kaydedelim
# - baskenti Jakarta olan ulkenin tum bilgilerini yazdiralim
# - Satir ve sutun bilgisi ile hucre yazdiralim