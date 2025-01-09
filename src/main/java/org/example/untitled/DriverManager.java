package org.example.untitled;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setDeviceName("emulator-5554"); // Проверь командой adb devices
            options.setPlatformVersion("15.0"); // Версия Android на эмуляторе
            options.setApp("C:\\Users\\rickc\\Downloads\\calc.apk"); // Путь к APK-файлу

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
