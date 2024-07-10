package appiumtests.tests;

import appiumtests.pages.Login;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.junit.After;
import org.junit.Before;
import org.tft.conections.StartConnection;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
//    private AndroidDriver driver;
    Login loginPage;
    @Before
    public void setUp() {
        StartConnection.getInstance().startConnection();
        loginPage = new Login();

//        var options = new BaseOptions()
//                .amend("platformName", "Android")
//                .amend("appium:platformVersion", "13")
//                .amend("appium:deviceName", "R58R83MKLLA")
//                .amend("appium:app", "C:\\Users\\fchac\\Downloads\\TFT.apk")
//                .amend("appium:automationName", "UiAutomator2")
//                .amend("appium:noReset", "true")
//                .amend("appium:ensureWebviewsHavePages", true)
//                .amend("appium:nativeWebScreenshot", true)
//                .amend("appium:newCommandTimeout", 3600)
//                .amend("appium:connectHardwareKeyboard", true);
//
////        private URL getUrl() {
////            try {
////                return new URL("http://127.0.0.1:4723");
////            } catch (MalformedURLException e) {
////                e.printStackTrace();
////            }
////        }
//
//        try {
//            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
    }

    @After
    public void turnDown(){
        StartConnection.getInstance().removeDriver();
    }
}
