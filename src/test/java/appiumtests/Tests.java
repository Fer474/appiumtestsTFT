package appiumtests;

import org.json.simple.JSONObject;
import org.openqa.selenium.interactions.Sequence;
import org.tft.conections.Actions;
import org.tft.conections.StartConnection;

import java.util.Arrays;

import static org.tft.conections.StartConnection.*;

public class Tests extends StartConnection {

//    static Actions actions = new Actions();

    public static void main(String[] args) {
        try{
            startConnection();
        }catch(Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
//        Sequence tap = actions.clickPlay();
//
//        driver.perform(Arrays.asList(tap));

    }

}