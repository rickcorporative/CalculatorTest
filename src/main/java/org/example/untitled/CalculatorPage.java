package org.example.untitled;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage {
    private AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickDigit(int digit) {
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_" + digit)).click();
    }

    public void clickPlus(){
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_add")).click();
    }

    public void clickMinus() {
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_sub")).click();
    }

    public void clickMul() {
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_mul")).click();
    }

    public void clickDiv() {
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_div")).click();
    }

    public void clickEquals() {
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/eq")).click();
    }

    public String getResult() {
        return driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_preview")).getText();
    }
}
