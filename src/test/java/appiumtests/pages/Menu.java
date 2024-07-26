package appiumtests.pages;

public class Menu extends Common{
    public Menu play(){
        try {
            Thread.sleep(20000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        clickElement(83.58, 89.35);
        return this;
    }

    public Menu wihGameMode(String gameMode){
        try {
            Thread.sleep(5000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        switch (gameMode.toUpperCase()) {
            case ("NORMAL"):
                rightSwipe();
                clickElement(13.83, 63.70);
                break;
            case ("RANKED"):
                rightSwipe();
                clickElement(31.08, 63.70);
                break;
            case ("DOUBLE UP"):
                rightSwipe();
                clickElement(48.71, 63.70);
                break;
            case ("HYPER ROLL"):
                rightSwipe();
                clickElement(66.54, 63.70);
                break;
            case ("TUTORIAL"):
                rightSwipe();
                clickElement(84.42, 63.70);
                acceptTutorial();
                break;
            case ("TUTORIAL1"):
                leftSwipe();
                clickElement(91.42, 63.70);
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
        clickElement(84.21, 89.54);
        return this;
    }

    public Menu acceptGame(){
        try {
            Thread.sleep(5000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        clickElement(49.92, 75.74);
        return this;
    }

    private void acceptTutorial(){
        clickElement(56.21, 62.22);
        try {
            Thread.sleep(30000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
    }
}
