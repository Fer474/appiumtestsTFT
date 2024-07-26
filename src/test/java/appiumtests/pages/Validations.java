package appiumtests.pages;

import org.tft.Assertions;

import static org.junit.Assert.fail;

public class Validations {
    Assertions asserts = new Assertions();

    public Validations validateGoldIsReducted(){
        String goldAfterBuy = asserts.getText("goldAfterBuy").trim();
        String goldBeforeBuy = asserts.getText("goldAfterBuy").trim();
        boolean textResult = (Integer.parseInt(goldAfterBuy.trim()) < Integer.parseInt(goldBeforeBuy.trim())) ? true : false;
        boolean result = asserts.compareImages("goldBeforeBuy", "goldAfterBuy");
        if (textResult && !result){
            System.out.println("Gold was reduced");
        }else fail("The gold was not reduced");
        return this;
    }
}
