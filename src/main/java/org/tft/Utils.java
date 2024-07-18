package org.tft;

import io.appium.java_client.android.AndroidDriver;
import org.tft.conections.StartConnection;

import java.io.File;

public class Utils {

    AndroidDriver driver = StartConnection.getInstance().getDriver();

    public static String getDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        for (String s : c.getName().split("\\.")) {
            dir = new File(dir, s);
        }

        System.out.println("Using data directory: " + dir.toString());
        return dir.toString() + File.separator;
    }

    public static String getSharedDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        return dir.toString() + File.separator;
    }



    public Double getCoordinates(double coordinate) {
        double resultInPx = (coordinate/100);

        return 0.0;
    }



}