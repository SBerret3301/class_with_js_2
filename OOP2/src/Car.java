public class Car {
    String company;
    String name;
    String type;
    Short model;
    Short hourses_power;
    Short max_speed;
    double accelarate;

    void info(){
        System.out.println(name + " model " + model + " is made by " + company + " and its a " + type + " has a " + hourses_power + " hourse power " + " with " + max_speed + " mph as a max speed " + " It goes from 0 to 100 km/h in just " + accelarate + " seconds");
    }
}
