package PrimeNumber2;

import java.util.ArrayList;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class PrimeNumber {

    int value;

    public PrimeNumber(int value){
        this.value = value;
    }

    ArrayList<Integer> prims = new ArrayList<>();

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

    public boolean isPrim() {
        primNumber(this.value + 2);

        boolean check = false;
        for (int i = 0; i < prims.size(); i++) {

            if (this.value == prims.get(i)) {
                check = true;

            }
        }
        System.out.println(check);
        return check;
    }
}
