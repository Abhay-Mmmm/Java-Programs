public class Main{
    public static void main(String[] args) {
        String name = "Rick";
        int age = 45;
        double weight = 78;
        boolean x = false;
        Human man = new Human(name,age,weight,x);

        Human man1 = new Human("Abhay",19,67,true);

        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.weight);
        System.err.println(); //To give a space.
        System.out.println(man1.name);
        System.out.println(man1.age);
        System.out.println(man1.weight);
        man1.study(); //this only calls the method study() for man1
    }
}
class Human{
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight,boolean ch)
    {
        if(ch==true)
        {
            this.name=name; //We used "this" hence we can get the inputted values.
            this.age=age;
            this.weight=weight;

        }
        else
        {
            name=name; //if we don't use "this" keyword, we get the default values of the variable
            age=age;
            weight=weight;
        }
    }
    void study(){
        System.out.println(this.name+" is Studying!!");
    }
}