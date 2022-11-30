package inventory;

import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Barcode {

    public void creatingBarcode(String barcodeName, String materialName) throws BarcodeException, OutputException {
        JPanel jPanel = new JPanel();
        net.sourceforge.barbecue.Barcode barcodeImage = BarcodeFactory.createCode128(materialName);
        jPanel.add(barcodeImage);

        BufferedImage Barcode = new BufferedImage(1000, 1000, BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D graphics2D = (Graphics2D) Barcode.getGraphics();
        barcodeImage.draw(graphics2D, 100, 100);

        File barcodeFile = new File(barcodeName + ".jpeg");
        BarcodeImageHandler.saveJPEG(barcodeImage, barcodeFile);
        System.out.println("Barcode file has been created successfully!!!");
    }
}
