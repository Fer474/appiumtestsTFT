package org.tft;

import com.aspose.ocr.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

//import com.aspose.ocr.;
//import com.aspose.ocr.OcrResult;
//import com.aspose.ocr.OcrEngine;

import java.time.Duration;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws AsposeOCRException {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//        int ubicacionEnPixeles = 2006; // Ejemplo: ubicación en píxeles
//        int tamanoContenedor = 2400; // Ejemplo: tamaño total del contenedor en píxeles display(2400, 1080)
//        double porcentaje = (ubicacionEnPixeles / (double) tamanoContenedor) * 100;
//        System.out.println("La ubicación en píxeles " + ubicacionEnPixeles +
//                " equivale a aproximadamente " + porcentaje + "% del contenedor.");

//        int ubicacionEnPixelesY = 965; // Ejemplo: ubicación en píxeles
//        int tamanoContenedorY = 1080; // Ejemplo: tamaño total del contenedor en píxeles display(2400, 1080)
//        double porcentajeY = (ubicacionEnPixelesY / (double) tamanoContenedorY) * 100;
//        System.out.println("La ubicación en píxeles " + ubicacionEnPixelesY +
//                " equivale a aproximadamente " + porcentajeY + "% del contenedor.");


        double ubicacionEnPorcentajeY = 89.35185; // Ejemplo: ubicación en píxeles
        int tamanoContenedorY = 1080; // Ejemplo: tamaño total del contenedor en píxeles display(2400, 1080)
        int porcentajeY = (int) Math.round((ubicacionEnPorcentajeY /100) * tamanoContenedorY);
        System.out.println("La ubicación en porcentaje " + ubicacionEnPorcentajeY +
                " equivale a aproximadamente " + porcentajeY + "px del contenedor.");
//        // Initialize Aspose.OCR recognition API
//        AsposeOCR api = new AsposeOCR();
//        ReceiptRecognitionSettings recognitionSettings = new ReceiptRecognitionSettings();
//        // Add image to the recognition batch
//        OcrInput source = new OcrInput(InputType.SingleImage);
//        source.add("src/main/resources/testIMG.png");
//        // Specify recognition language
////        RecognitionSettings recognitionSettings = new RecognitionSettings();
//        recognitionSettings.setLanguage(Language.ExtLatin);
//        // Extract text from image
//        ArrayList<RecognitionResult> result = api.RecognizeReceipt(source, recognitionSettings);
////        System.out.println(result.recognition_text);
//        System.out.println("Recognition result:\n" + result);


//        // Create instance of OCR API
//        AsposeOCR api = new AsposeOCR();
//        // Recognize Ukrainian text
//        ReceiptRecognitionSettings recognitionSettings = new ReceiptRecognitionSettings();
//        recognitionSettings.setLanguage(Language.Spa);
//        // Extract text from receipt
//        String imagePath = "src/main/resources/testIMG.png";
//        OcrInput ocrInput = new OcrInput();
//        RecognitionResult result = api.RecognizeReceipt(, recognitionSettings);
//        System.out.println("Recognition result:\n" + result.recognitionText);



//        // Ruta de la imagen que deseas procesar
//        String imagePath = "ruta/a/tu/imagen.jpg";
//
//        // Crear una instancia del motor de OCR
//        OcrEngine ocrEngine = new OcrEngine();
//
//        // Realizar el reconocimiento en la imagen
//        OcrInput ocrInput = new OcrInput(imagePath);
//        OcrResult ocrResult = ocrEngine.Recognize(ocrInput);
//
//        // Obtener el texto reconocido
//        String textoReconocido = ocrResult.RecognitionText;
//        System.out.println("Texto extraído de la imagen:");
//        System.out.println(textoReconocido);
    }


}