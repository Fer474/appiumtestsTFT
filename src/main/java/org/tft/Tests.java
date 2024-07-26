package org.tft;

import com.aspose.ocr.*;

import java.util.ArrayList;

public class Tests {
    public static void main(String[] args) throws AsposeOCRException {

        // Initialize Aspose.OCR recognition API
        AsposeOCR api = new AsposeOCR();
        RecognitionSettings recognitionSettings = new RecognitionSettings();
// Add image to the recognition batch
        OcrInput source = new OcrInput(InputType.SingleImage);
        source.add("src/main/resources/imagen.png");
// Specify recognition language
//        RecognitionSettings recognitionSettings = new RecognitionSettings();
        recognitionSettings.setLanguage(Language.Eng);
//        recognitionSettings.setUpscaleSmallFont(true);
// Extract text from image
        ArrayList<RecognitionResult> results = api.Recognize(source, recognitionSettings);
        System.out.println("Recognition result:\n" + results.get(0).recognitionText);

//        // Create instance of OCR API
//        AsposeOCR api = new AsposeOCR();
//// Activate font upscaling
//        RecognitionSettings recognitionSettings = new RecognitionSettings();
//        recognitionSettings.setUpscaleSmallFont(true);
//        OcrInput source = new OcrInput(InputType.SingleImage);
//        source.add("src/main/resources/testIMG.png");
//// Extract text from image
//        RecognitionResult result = api.Recognize("source.png", recognitionSettings);
//        System.out.println("Recognition result:\n" + result.recognitionText);


//        // Create instance of OCR API
//        AsposeOCR api = new AsposeOCR();
//        OcrInput source = new OcrInput(InputType.SingleImage);
//        source.add("src/main/resources/testIMG.png");
//// Recognize Ukrainian text
//        ReceiptRecognitionSettings recognitionSettings = new ReceiptRecognitionSettings();
//        recognitionSettings.setLanguage(Language.Spa);
//// Extract text from receipt
//        ArrayList<RecognitionResult> result = api.RecognizeReceipt(source, recognitionSettings);
//        System.out.println("Recognition result:\n" + result.recognitionText);


//        // Initialize Aspose.OCR recognition API
//        AsposeOCR api = new AsposeOCR();
//        ReceiptRecognitionSettings recognitionSettings = new ReceiptRecognitionSettings();
//        // Add image to the recognition batch
//        OcrInput source = new OcrInput(InputType.SingleImage);
//        source.add("src/main/resources/testIMG.png");
//        // Specify recognition language
////        RecognitionSettings recognitionSettings = new RecognitionSettings();
//        recognitionSettings.setLanguage(Language.Spa);
//        // Extract text from image
//        ArrayList<RecognitionResult> result = api.RecognizeReceipt(source, recognitionSettings); //RecognizeReceipt(source, recognitionSettings);
////        System.out.println(result.recognition_text);
//        System.out.println("Recognition result:\n" + result);
    }
}
