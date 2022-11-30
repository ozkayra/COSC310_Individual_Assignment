package inventory;
import java.io.IOException;
import java.util.Scanner;

public class store extends inventory.inven1 {

    Currency currency = new Currency();

    inventory.inven1 v[] = new inventory.inven1[10];
    static int i = 0;

        //for adding items to inventory
        void addItem(String iname) {
            v[i] = new inventory.inven1();
            this.iname=iname;
            v[i].iname=iname;
            i++;
            System.out.println("Item added successfully");

        }

        //Function for taking item out of inventory. It checks name of item
        void checkOut(String iname) {
            for (int k=0; k< i; k++)
            {
                if (v[k].iname.equalsIgnoreCase(iname)) {
                    if (v[k].checked()) {
                        v[k].take();
                        System.out.println("Item successfully taken");
                    }
                    else {
                        System.out.println("Item is out of stock");
                    }
                }
            }

        }

        //restocking item
        void returnItem(String iname) {
            if (i==0) {
                System.out.println("Item has been restocked");
            }
            for (int k =0; k<i; k++) {
                if (v[k].iname.equalsIgnoreCase(iname)) {
                    v[k].checked = true;
                }
            }
        }

    //Setting price to items and uses currency convertor
        public void receivePrice() throws IOException {
            Scanner ob = new Scanner(System.in);
            double money =0;
            if (i == 0) {
                System.out.println("No items in Inventory");
            }
            else {
                for (int k = 0; k < i; k++) {
                    System.out.println("Enter the price of the item " + v[k].iname);
                    //Scanner ob = new Scanner(System.in);
                    v[k].price = ob.nextInt();
                    price = v[k].price;
                    money = price;
                    System.out.println("The price of " + v[k].iname + "is entered as " + price + " USD");
                }
            }
                System.out.println("This price can also presented other currencies as well");
                System.out.println("Which are:\n1)CAD\n2)GBP\n3)EUR\n4)TRY\n5)AUD");
                System.out.print("Please enter the number you want the currency: ");
                int curNo = ob.nextInt();
                currency.currencyRun(curNo, money);
        }

        //listing the inventory
        public void listInventory () {
            if (i == 0) {
                System.out.println("No items in Inventory");
            } else {
                for (int k = 0; k < i; k++) {
                    System.out.println(k + 1 + ". " + v[k].iname + " " + "Price: "
                            + v[k].price + " Status: " + v[k].checked());
                }
            }
        }
}
