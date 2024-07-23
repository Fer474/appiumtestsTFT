package appiumtests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tft.Utils;
import org.tft.conections.StartConnection;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

public class Common {
    AndroidDriver driver = StartConnection.getInstance().getDriver();
    Utils utils = new Utils();

    public Common(){
        PageFactory.initElements(driver, this);
    }

    public Common preLoading(WebElement opt){
        try {
            new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.visibilityOf(opt));
        }catch (TimeoutException te){
			preLoading(opt);
        }
        return this;
    }

    public Common clickElement (double x, double y){
//        System.out.println("Current Activity: " + driver.currentActivity());
//        // Obtener la orientación actual del dispositivo
//        ScreenOrientation orientation = driver.getOrientation();
//        System.out.println("La orientación actual es: " + orientation);
//        System.out.println("Y: "+driver.manage().window().getSize().height);
//        System.out.println("X: "+driver.manage().window().getSize().width);
//        takeScreenshotinPoint();
        int px = utils.getCoordinatesX(x);
        int py = utils.getCoordinatesY(y);
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var tapPoint = new Point(px, py);
        var tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), tapPoint.x, tapPoint.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));
        return this;
    }

    public Common moveElement (int startX, int startY,int endX, int endY, int originTime ){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(startX, startY);
        var end = new Point (endX, endY);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(originTime),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        return this;
    }

    public Common moveInCircleAndThrow (int startX, int startY,int ratio, int originTime ){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(startX, startY);
        var end = new Point ((startX + ratio), (startY+ ratio));
        var swipe = new Sequence(finger, 1);
        for (int i =0; i <= 12; i++ ){

        }
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(originTime),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(50),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        return this;
    }

    public Common leftSwipe (){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(2146, 616);
        var end = new Point (1790, 616);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), //Detect starting finger pressure point
                PointerInput.Origin.viewport(), start.getX(), start.getY()));//Start the swipe action and detect the start points
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); //detect the pressure point and starts the movement
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(300),//Drives the movement time
                PointerInput.Origin.viewport(), end.getX(), end.getY()));//determine where is going to stop
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));//mimic the lift finger action
        driver.perform(Arrays.asList(swipe));//start the order of actions
        return this;
    }
    public Common rightSwipe (){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point (1790, 616);
        var end = new Point(2146, 616);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        return this;
    }

    public Common upSwipe (){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(2146, 611);
        var end = new Point (1790, 616);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        return this;
    }

    public Common downSwipe (){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(2146, 611);
        var end = new Point (1790, 616);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
        return this;
    }

     public Common takeScreenshot (){
         File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

         // Guarda la captura en un archivo
         try {
             FileUtils.copyFile(screenshotFile, new File("src/main/resources/imagen.png"));
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

         return this;
     }

     public Common takeScreenshotinPoint (){
         File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

         // Recorta el área específica (por ejemplo, coordenadas x, y, ancho y alto)
         // Puedes usar las dimensiones de tu elemento o área deseada
         int x = 1839; // Coordenada x
         int y = 909; // Coordenada y
         int width = 351; // Ancho
         int height = 114; // Alto

         // Recorta la imagen
         BufferedImage fullImage = null;
         try {
             fullImage = ImageIO.read(screenshotFile);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         BufferedImage croppedImage = fullImage.getSubimage(x, y, width, height);

         // Guarda la captura recortada en un archivo
         File croppedFile = new File("src/main/resources/imagen.png");
         try {
             ImageIO.write(croppedImage, "png", croppedFile);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

         return this;
     }

}
