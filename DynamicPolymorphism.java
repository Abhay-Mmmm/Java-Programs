import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal ani; // Creates a vaiable with the type of Animal 

        System.out.println("What animal do you want?");
        System.out.print("1: Dog | 2: Cat = ");
        int ch = sc.nextInt();
        if(ch==1)
        {  
            ani=new Dog(); // Assigned the Dog class as per choice
            ani.speak();
        }
        else if(ch==2)
        {
            ani=new Cat();
            ani.speak();
        }
        else
        {   System.out.println("Invalid!!");
            ani=new Animal();
            ani.speak();
        }
        sc.close();
    }
}

class Animal{
    void speak()
    {System.out.println("Animal *makes a sound*");}
}

class Dog extends Animal{
    @Override
    void speak()
    {System.out.println("Dog *Barks*");}
}

class Cat extends Animal{
    @Override
    void speak()
    {System.out.println("Cat *meows*");}
}