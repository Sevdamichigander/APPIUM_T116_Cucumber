package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class aileButcemStep {

    AppiumDriver<AndroidElement> driver;

    AileButcemPage aileButcemPage = new AileButcemPage();

    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")

    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {

        Driver.getAndroidDriver();
        ReusableMethods.screenScrollLeft(2000);
        //for (int i = 0; i < 5; i++) {
        //    ReusableMethods.screenScrollLeft(2000);
        //}
        ReusableMethods.koordinatTiklama(514,1167,1000);
    }

    @Given("mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin")

    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin() throws InterruptedException {
        ReusableMethods.koordinatTiklama(463,1094, 1000);
        aileButcemPage.emailAdresiBox.sendKeys("testfort108@gmail.com");
        ReusableMethods.koordinatTiklama(345,1010, 1000);
        aileButcemPage.sifreBox.sendKeys("t108t108");
        ReusableMethods.koordinatTiklama(995,1692, 1000);
        ReusableMethods.koordinatTiklama(514,1483, 1000);

    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

        String actualHesapIsmiText = aileButcemPage.hesapAdiText.getText();
        String expectedHesapIsmiText = "Hesap : TYuzSekiz Appium";

        Assert.assertEquals(expectedHesapIsmiText, actualHesapIsmiText);

    }
    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() throws InterruptedException {

        ReusableMethods.koordinatTiklama(121,121, 1000);
        ReusableMethods.koordinatTiklama(360,786, 1000);

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {



    }
    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }
}
