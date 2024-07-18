package org.tft.conections;

import java.io.StringWriter;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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


    Map<String, String> defaults = new HashMap<String, String>() {{
//        put("deviceName","Galaxy A32");
//        put("deviceName", "R58R83MKLLA");
        put("deviceName", "adb-R58R83MKLLA-i4S8g5._adb-tls-connect._tcp");
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

//        private URL getUrl() {
//            try {
//                return new URL("http://127.0.0.1:4723");
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Service Started . . . .");
//        JSONObject values= defaults();
//
//        DesiredCapabilities cap = new DesiredCapabilities();
//        Sequence tap;
////        System.out.println("a" + values);
//
//        cap.setCapability("deviceName", values.get("deviceName"));
//        cap.setCapability("udid", values.get("udid"));
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", values.get("platformVersion"));
//        cap.setCapability("noReset", "true");
//        cap.setCapability("automationName", "UiAutomator2");
//
//        cap.setCapability("appPackage", "com.riotgames.league.teamfighttactics");
//        cap.setCapability("appActivity", "com.riotgames.leagueoflegends.RiotNativeActivity");
//
//        URL url = new URL("http://127.0.0.1:4723/");
//        driver = new AppiumDriver<MobileElement>(url, cap);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        tap = actions.clickRiotLogin();
//        driver.perform(Arrays.asList(tap));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        MobileElement username = driver.findElementByXPath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText");
//        MobileElement password = driver.findElementByXPath("//android.view.View[@resource-id=\"root\"]/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText");
//        MobileElement signin = driver.findElementByXPath("//android.widget.Button[@text=\"Sign in\"]");
//        username.sendKeys("fersh474");
//        password.sendKeys("Avengers3..");
//        signin.click();
//
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        tap = actions.clickPlay();
//        driver.perform(Arrays.asList(tap));
//
//        System.out.println("Application Started . . .");
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
