package appiumtests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CalculatorTest {

    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try{
            openCalculator();
        }catch(Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    public static void openCalculator() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Galaxy A32");
        cap.setCapability("udid", "R58R83MKLLA");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13");
        cap.setCapability("noReset", "true");
        cap.setCapability("automationName", "UiAutomator2");

        cap.setCapability("appPackage", "com.riotgames.league.teamfighttactics");
        cap.setCapability("appActivity", "com.riotgames.leagueoflegends.RiotNativeActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Started . . .");
    }
}
