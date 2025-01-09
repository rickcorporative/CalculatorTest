package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.example.untitled.CalculatorPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.example.untitled.DriverManager;


import static org.testng.AssertJUnit.assertEquals;

public class SubTest {

    private static AndroidDriver driver;
    private static CalculatorPage calculatorPage;

    @BeforeClass
    public static void setUp() throws Exception {
        driver = DriverManager.getDriver();
        calculatorPage = new CalculatorPage(driver);
    }

    @AfterClass
    public static void tearDown() {
        DriverManager.quitDriver();
    }

    @Test
    public void testAddition() {
        calculatorPage.clickDigit(3);
        calculatorPage.clickMinus();
        calculatorPage.clickDigit(2);
        int result = Integer.parseInt(calculatorPage.getResult());
        assertEquals(1, result);
    }
}
