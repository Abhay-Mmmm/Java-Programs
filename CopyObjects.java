public class Main{
    public static void main(String[] args) {
        Car car1=new Car("Nissan","GTR",2023);
        Car car2=new Car("Ferrari","La Ferrari",2013);
        Car car3=new Car(car2); // In method overload the objects gets copied without chaging address
        car2.copy(car1); // To copy the things from car1 to car2 without changing the memory address of the objects
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
       
        System.out.println(car1.getMake());  // Returns here and prints Make
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());  // Returns here and prints Make
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());  // Returns here and prints Make
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}

class Car{
    private String make;
    private String model;
    private int year;
    Car x; // Creates an x to be passed in copy() method of the type "Car" which is the class

    Car(String make,String model,int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public String getMake() // Getter methods that gets the details of the private varibale.
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear() 
    {
        return year;
    }
    public void setMake(String make) // The bottom three are setter methods which take an input and sets the variable.
    { 
        this.make=make;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public void setYear(int year)
    {
        this.year=year;
    }

    public void copy(Car x) // This method copies the make,model and year of the "this" instance to that of "x" 
    {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
    Car(Car x) // This is a method overload of the contructor which copies the objects
    {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}