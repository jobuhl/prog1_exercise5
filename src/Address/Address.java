package Address;

import java.io.FileNotFoundException;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class Address {

    public String name;
    public String street;
    public String city;
    public int postcode;
    public String email;
    public String comment;

    /**
     * Constructor
     */
    public Address() {
        this.name = "";
        this.street = "";
        this.city = "";
        this.postcode = 0;
        this.email = "";
        this.comment = "";
    }

    /**
     * Instance method
     */
    public void setAddress(String aStreet, int aPostcode, String aCity) {
        this.street = aStreet;
        this.postcode = aPostcode;
        this.city = aCity;
    }

    /**
     * Instance method
     */
    public String fullAddress() {
        return name + ", " + street + ", " + ((Integer) postcode).toString()
                + " " + city;
    }

    /**
     * Class method
     */
    public static String postcodeToCity(String zip) throws FileNotFoundException {
        String city = getZip(zip);

        return city;
    }

    public static String getZip(String plz) throws FileNotFoundException {
        java.io.File postcodeFile = new java.io.File("src/OpenGeoDB-plz-ort-de.csv");
        System.out.println(postcodeFile.getAbsolutePath());
        if (postcodeFile.exists() && postcodeFile.canRead()) {
            System.out.println("File exists and can be read");
        }
        java.util.Scanner scanner = new java.util.Scanner(postcodeFile, "UTF-8");


        String zip;
        String town = "";

        while (scanner.hasNextLine()) {
            zip = scanner.next();
            town = scanner.nextLine();
            if (plz.equals(zip)) {
                System.out.println("");
                System.out.println(town);
                break;
                //Für alle Städte mit der gleichen PLZ muss er break entfernt werden
            }

        }
        return town;
    }

     /*
     - Instanzmethoden nehmen immer ein Bezug auf ein bestimmtes Objekt, dass tut eine Klassenmethode nicht
     - So bietet die Klassenmethode den Vorteil, dass man immer eine Hilfsmethode schreiben kann wo jedes Objekt trauf zurückgreifen kann
       daher auch die static deklaration
     - Die Instanzmethode bietet den Vorteil, dass jede Methode eindeutig zu einem Objekt zuweisbar ist und somit Missverständnisse nciht
       vorkommen können

     - Ein Nachteil der Klassenmethode ist, dass sie nur mit der Klassenvariable arbeiten können.

     */


}