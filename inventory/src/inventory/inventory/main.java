package inventory;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.output.OutputException;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//main class
class launch {
    public static void main(String[] args) throws IOException, NoSuchElementException, BarcodeException, OutputException {
        inventory.store vs = new inventory.store();
        Barcode barcode = new Barcode();
        int ch, uCh, aCh, vno;

        String iname, choice;
        //the interface
        do {
            System.out.println("=========Menu=========");

            System.out.println("1. Login as Employee");
            System.out.println("2. Login as Admin");
            System.out.println("Enter Your Choice");
            Scanner s = new Scanner(System.in);

            ch = s.nextInt();

            do {

                switch (ch)

                //choices and calling other functions. case 1 is for Employee. case 2 for admin.
                {    case 1:

                    System.out.println("1. List Inventory");
                    System.out.println("2. Take Item");
                    System.out.println("3. Enter the price of an item ");
                    System.out.println("4. Restock Item");
                    System.out.println("5. Create a barcode for an desired item in the inventory");

                    uCh = s.nextInt();

                    if (uCh == 1)  {

                        vs.listInventory();} else if (uCh == 2) {

                        vs.listInventory();
                        System.out.println("Enter the item name");
                        iname = s.next();
                        vs.checkOut(iname);}
                    else if (uCh == 3) {
                        vs.receivePrice();    }
                    else if (uCh == 4) {
                        System.out.println("Enter the name of the item to restock");
                        iname = s.next();
                        // vs.returnItem(iname);
                        System.out.println("Item has been restocked");
                    }
                    else if(uCh == 5){
                        System.out.print("Please enter a name that you wish to give: ");
                        s.nextLine();
                        String barcodeName = s.nextLine();

                        System.out.println("For which material you wish to give a barcode: ");
                        vs.listInventory();
                        System.out.println();
                        System.out.print("=> ");
                        String materialName = s.nextLine();
                        barcode.creatingBarcode(barcodeName, materialName);
                    }
                    else
                    {  System.out.println("No such Option is available");       }

                    break;

                    case 2:
                        System.out.println("1. List Inventory");

                        System.out.println("2. Add Item");
                        aCh = s.nextInt();
                        if (aCh == 1)  {
                            vs.listInventory();
                        }
                        if (aCh == 2)
                        {
                            System.out.println("Enter the name of the Item ");
                            iname = s.next();
                            vs.addItem(iname);
                        }
                        break;
                    default:
                        System.out.println("Sorry Wrong Choice");
                }
                System.out.println("Do you want to continue yes/no");
                choice = s.next();
            } while (choice.equalsIgnoreCase("yes"));

            System.out.println("Want to Return to main Menu yes/no");
            choice = s.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
