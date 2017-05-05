package Address;

import java.io.FileNotFoundException;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class test {

    public static void main(String[] args) throws FileNotFoundException{
        Address a = new Address();

        a.postcodeToCity("78462");
    }
}
