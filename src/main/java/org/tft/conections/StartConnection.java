package org.tft.conections;

import java.io.StringWriter;
import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class StartConnection {

    public static AppiumDriver<MobileElement> driver;

    private static JSONObject defaults(){
        JSONObject obj=new JSONObject();
        obj.put("deviceName","Galaxy A32");
        obj.put("udid", "R58R83MKLLA");
        obj.put("platformVersion", "13");
        return obj;
    }
    static Actions actions = new Actions();

    public static void startConnection() throws Exception {
        JSONObject values= defaults();

        DesiredCapabilities cap = new DesiredCapabilities();
        Sequence tap = actions.clickPlay();
//        System.out.println("a" + values);

        cap.setCapability("deviceName", values.get("deviceName"));
        cap.setCapability("udid", values.get("udid"));
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", values.get("platformVersion"));
        cap.setCapability("noReset", "true");
        cap.setCapability("automationName", "UiAutomator2");

        cap.setCapability("appPackage", "com.riotgames.league.teamfighttactics");
        cap.setCapability("appActivity", "com.riotgames.leagueoflegends.RiotNativeActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.perform(Arrays.asList(tap));

        System.out.println("Application Started . . .");
    }

}
