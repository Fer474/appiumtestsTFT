package appiumtests.pages;

public class Menu extends Common{
    public Menu play(){
        try {
            Thread.sleep(20000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        clickElement(2006, 965);
        return this;
    }

    public Menu wihGameMode(String gameMode){
        try {
            Thread.sleep(5000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        switch (gameMode.toUpperCase()) {
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
                leftSwipe();
                clickElement(2194, 688);
                break;
        }
        return this;
    }

    public Menu startGame(){
        try {
            Thread.sleep(5000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        clickElement(2021, 967);
        return this;
    }

    public Menu acceptGame(){
        try {
            Thread.sleep(5000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        clickElement(1198, 818);
        return this;
    }
}
