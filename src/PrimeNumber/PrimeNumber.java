package PrimeNumber;

import java.util.ArrayList;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class PrimeNumber {


    private ArrayList<Integer> prims = new ArrayList<>();

    private void primNumber(int n) {

        for (int i = 2; i < n; i++) {

            prims.add(i);
        }

        for (int i = 0; i < prims.size(); i++) {
            for (int j = i + 1; j < prims.size(); j++) {

                if (prims.get(j) > prims.get(i) && prims.get(j) % prims.get(i) == 0) {
                    prims.remove(j);
                    j--;
                }

            }
        }
    }

    public boolean isPrim(int isprim) {
        primNumber(isprim + 2);

        boolean check = false;
        for (int i = 0; i < prims.size(); i++) {

            if (isprim == prims.get(i)) {
               check = true;

            }
        }
        System.out.println(check);
        return check;
    }


}
