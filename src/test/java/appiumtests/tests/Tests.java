package appiumtests.tests;

import org.junit.Test;

public class Tests extends Base {
    @Test
    public void sampleTest(){
        loginPage.loginWith("Riot");
        loginPage.loginAs("fersh474").withPassword("Avengers3..");
    }
//    static Actions actions = new Actions();

//    public  void main(String[] args) {
//        try{
//            startConnection();
//        }catch(Exception exp){
//            System.out.println(exp.getCause());
//            System.out.println(exp.getMessage());
//            exp.printStackTrace();
//        }finally{
//            driver.quit();
//            System.out.println("Application closed. . . .");
//        }
//        Sequence tap = actions.clickPlay();
//
//        driver.perform(Arrays.asList(tap));

//    }

}