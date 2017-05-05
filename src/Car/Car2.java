package Car;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class Car2 {

    String color;
    int speed;
    String manufactoerer;

    public Car2() {

        this.color = "silber";
        this.speed = 150;
        this.manufactoerer = "Volkswagen";
    }


    public String Description() {

        String a = "Dieses " + this.manufactoerer + "-Auto in " + this.color + " fährt bis zu " + this.speed + "km/h schnell";

        System.out.println(a);
        return a;
    }

}

