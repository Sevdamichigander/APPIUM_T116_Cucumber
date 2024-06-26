package stepdefinitions.apkYukleme;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkYukleme {

    AndroidDriver<AndroidElement> driver;

    @Test
    public void apkYukleme() throws MalformedURLException {

        final String cihazIsmi = "PIXEL 2";  // cihaz ismi degistirilmesin diye final yaptik
        final String platformVersion = "10.0";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\33602\\IdeaProjects\\APPIUM_T116_Cucumber\\Apps\\Aile Bütçem_1.07_apkcombo.com.apk"); //C:\Users\33602\IdeaProjects\APPIUM_T116\Apps\arabam.com_4.8.0_Apkpure.apk dosya yolunu yaziyoruz

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
