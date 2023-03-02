import java.util.SplittableRandom;

public class BMW {
    private String name;
    private String models;
    private int doors;
    private  int horsepower;

    public BMW() {
    }

    public BMW(String name, String models, int doors, int horsepower) {
        this.name = name;
        this.models = models;
        this.doors = doors;
        this.horsepower = horsepower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        //Encapsulate fields
        if (doors<1){
            System.out.println("Invalid door operation");
            return;
        }
        System.out.println("Method not Stopped");
        this.doors = doors;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if(horsepower<10){
            System.out.println("Invalid horsepower");
            return;
        }
        this.horsepower = horsepower;
    }
}
