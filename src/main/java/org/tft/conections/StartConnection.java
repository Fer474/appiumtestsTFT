package org.tft.conections;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StartConnection {

//    public static AppiumDriver<MobileElement> driver;
//
//    private static JSONObject defaults(){
//        JSONObject obj=new JSONObject();
//        obj.put("deviceName","Galaxy A32");
//        obj.put("udid", "R58R83MKLLA");
//        obj.put("platformVersion", "13");
//        return obj;
//    }
//    static Actions actions = new Actions();
    ADBDevices adbDevice = new ADBDevices();
    List<String> devices = adbDevice.getConnectedDevices();
    String deviceName = devices.getFirst();
    Map<String, String> defaults = new HashMap<String, String>() {{
//        put("deviceName","Galaxy A32");
//        put("deviceName", "R58R83MKLLA");
        put("deviceName", deviceName);
        put("platformVersion", "13");
    }};


    private AndroidDriver driver;

    private static StartConnection instance = new StartConnection();

    public static StartConnection getInstance(){
        return instance;
    }

//    ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
    public AndroidDriver getDriver(){
        return driver;
    }

    public void startConnection(){
        var options = new BaseOptions()
                .amend("platformName", "Android")
                .amend("appium:platformVersion", defaults.get("platformVersion"))
                .amend("appium:deviceName", defaults.get("platformVersion"))
                .amend("appPackage", "com.riotgames.league.teamfighttactics")
                .amend("appActivity", "com.riotgames.leagueoflegends.RiotNativeActivity")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:noReset", "true")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Service Started . . . .");

    }

    public void waitForActivity(){
        // Esperar hasta que la actividad principal esté activa
        String currentActivity = driver.currentActivity();
        while (!currentActivity.equals("com.riotgames.leagueoflegends.RiotNativeActivity")) {
            currentActivity = driver.currentActivity();
        }

        System.out.println("The app launched successfully");
    }

    public void removeDriver(){
        if(driver.getSessionId() != null){
            try {
                driver.quit();
                System.out.println("Service Stopped . . . .");
            }catch (Exception e){
                System.err.println("Unable to quit");
            }
        }
    }
}
