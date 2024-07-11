package appiumtests.pages;

public class Menu extends Common{
    public Menu play(){
        clickElement(2006, 965);
        return this;
    }

    public Menu wihGameMode(String gameMode){
        switch (gameMode) {
            case ("FIESTA DE PENGU"):
                clickElement(332, 688);
                break;
            case ("NORMAL"):
                clickElement(746, 688);
                break;
            case ("CLASIFICATORIA"):
                clickElement(1169, 688);
                break;
            case ("DUO DINAMICO"):
                clickElement(1597, 688);
                break;
            case ("HYPER ROLL"):
                clickElement(2026, 688);
                break;
            case ("TUTORIAL"):
                clickElement(2348, 688);
                break;
        }
        return this;
    }

    public Menu startGame(){
        clickElement(2021, 967);
        return this;
    }
}
