//Encapsulation = attributes of a clas  will be hidden or private
//                can be accessed only through methods (getters and setters)
//                should make attributes private if we don't want public or protected!!
//                Basically for safety.
public class Main{
    public static void main(String[] args) {
        Car car=new Car("Nissan","GTR",2023);
        System.out.println(car.getDetail());  // Returns here and prints.s
        car.setYear(1985); // Sends this to the setter variable and changes the private variable.
        System.out.println(car.getDetail());
    }
}

class Car{
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public String getDetail() // Getter method that gets the details of the private varibale.
    {
        return make+"\n"+model+"\n"+year+"\n";
    }
    public void setMake(String make){ // The bottom three are setter methods which take an input and sets the variable.
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
}