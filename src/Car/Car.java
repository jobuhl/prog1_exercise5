package Car;

/**
 * Created by Rackenrotz on 08.05.15.
 */
public class Car {

    String color;
    int speed;
    String manufactoerer;

    public Car(String color, int speed, String manufactoerer){

        this.color = color;
        this.speed = speed;
        this.manufactoerer = manufactoerer;
    }


    public String Description(){

        String a = "Dieses " +this.manufactoerer + "-Auto in " + this.color + " fährt bis zu " + this.speed + "km/h schnell";

        System.out.println(a);
        return a;
    }

}
