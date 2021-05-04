package com.mesaj.app.util.driver;

import com.mesaj.app.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static  String pathFormat = System.getProperty("user.dir") + "/src/test/resources/drivers/windows/%s";

    public static WebDriver get(Browser browser){

        if (Browser.chrome == browser){
            System.setProperty("webdriver.chrome.driver",String.format(pathFormat,"chromedriver"));
            return new ChromeDriver();
        }


        if (Browser.firefox == browser){
            System.setProperty("webdriver.gecko.driver",String.format(pathFormat,"geckodriver.exe"));
            return new ChromeDriver();
        }


        throw  new IllegalArgumentException("Driver not found" + browser);

    }

}
