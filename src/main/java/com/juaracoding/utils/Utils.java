package com.juaracoding.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {


    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int testCount = 0;

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String pathDestination = System.getProperty("user.dir") + "/FailedTestScreenshot/"
                + screenshotName + "_" + dateName + ".png";
        File destination = new File(pathDestination);
        FileUtils.copyFile(source, destination);
        return pathDestination;
    }



    public static void handleAlert(WebDriver driver, String expectedAlertText) {
        try {
            // Wait for the alert to be present
            WebDriverWait wait = new WebDriverWait(driver, 10);
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            // Verify the alert text
            String alertText = alert.getText();
            if (alertText.equals(expectedAlertText)) {
                alert.accept(); // Click OK if the alert text matches the expected text
                System.out.println("Alert accepted with text: " + alertText);
            } else {
                alert.dismiss(); // Dismiss the alert if the text doesn't match
                System.out.println("Alert dismissed. Expected: " + expectedAlertText + " but found: " + alertText);
            }
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present: " + e.getMessage());
        }
    }

}

