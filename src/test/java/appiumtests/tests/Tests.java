package appiumtests.tests;

import org.junit.Test;

public class Tests extends Base {
    @Test
    public void sampleTest(){
        menuPage.play().wihGameMode("normal").startGame().acceptGame();
    }

}