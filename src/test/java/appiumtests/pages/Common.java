package appiumtests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tft.conections.StartConnection;

import java.time.Duration;
import java.util.Arrays;

public class Common {
    AndroidDriver driver = StartConnection.getInstance().getDriver();

    public Common(){
        PageFactory.initElements(driver, this);
    }

    public Common preLoading(WebElement opt){
        try {
            new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.visibilityOf(opt));
        }catch (TimeoutException te){
            driver.navigate().refresh();
//			preLoading(opt);
        }
        return this;
    }

    public Common clickElement (int x, int y){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(859, 835);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));

        return this;
    }
}
