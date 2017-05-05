package Address;

import java.io.FileNotFoundException;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class ClassesAddresses {
    static final int MAX_ADDRESSES = 5;

    public static void main(String[] args) throws FileNotFoundException{
        Address[] addresses = new Address[MAX_ADDRESSES];
        for (int id = 0; id < addresses.length; id++) {
            addresses[id] = new Address();
        }

        addresses[2].name = "Renate Mustermann";
        addresses[2].city = "Konstanz";
        addresses[2].postcode = 78462;
        addresses[4].setAddress("Brauneggerstr. 55", 78462, "Konstanz");
        for (Address anAddress : addresses) {
            System.out.println(anAddress.city);
            System.out.println(anAddress.fullAddress());
        }
        System.out.println("Der zur Postleitzahl 78462 geh�rende Ort ist "
                + Address.postcodeToCity("78462"));
    }
}