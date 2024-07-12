package appiumtests.tests;

import org.junit.Test;

public class Tests extends Base {
    @Test
    public void sampleTest(){
//        loginPage.loginWith("Riot");
//        loginPage.loginAs("fersh474").withPassword("Avengers3..");
        menuPage.play().wihGameMode("normal").startGame().acceptGame();
    }

}