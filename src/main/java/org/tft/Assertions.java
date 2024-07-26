package org.tft;

import com.aspose.ocr.AsposeOCR;
//import org.junit.Assert;
import org.tft.conections.Actions;

public class Assertions {
    //Create api instance
    AsposeOCR api = new AsposeOCR();
    public Assertions imageHasText (String textToFind, String imageName){
        // ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(Assertions.class);

        // The image path
        String imagePath1 = dataDir + imageName ;

        // Detect if image has text
        boolean result = api.ImageHasText(imagePath1, textToFind);
        System.out.println("Image Has Text: "+ textToFind + " : " + result);
        return this;
    }

    public Assertions compareImages(){

        // ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(Assertions.class);

        // The image path
        String imagePath1 = dataDir + "img.png";
        String imagePath2 = dataDir + "img.png";

        // Compare two images by texts
        boolean isEqual = api.CompareImageTexts(imagePath1, imagePath2);
        System.out.println("Images are equal: " + isEqual);

        // Compare two images by texts
        float diff = api.ImageTextDiff(imagePath1, imagePath2);
        System.out.println("Difference: " + diff);
        // ExEnd:1
        return this;
    }
}
