package appiumtests.pages;

public class InGame extends Common{
    public InGame champ1board(){
        try {
            Thread.sleep(10000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        moveElement(601,962,1203,717,1);
        try {
            Thread.sleep(38000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        takeScreenshotinPoint(2186, 923, 66,80);
        return this;
    }
    public InGame champ2board(){
        try {
            Thread.sleep(2000); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        moveElement(601,962,1511,717,1);
        return this;
    }


    public InGame buyChamp(){
        try {
            Thread.sleep(50); // Pausa durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            // Manejo de excepciones aquí
        }
        clickElement(61.21,19.07);
        return this;
    }
}
