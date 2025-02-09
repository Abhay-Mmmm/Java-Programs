public class Main{
    public static void main(String[] args) {
        Hero hero = new Hero("Batman",42,"Money");
        System.out.println("Power is : "+hero.power);
        System.out.println("\n");

        // Another way of doing this is by using toString() method.
        Hero1 hero1 = new Hero1("SuperMan",100,"Lazer Vision");
        System.out.println(hero1.toString());
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age)
    {
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
}

class Hero extends Person{
    String power;
    Hero(String name,int age,String power)
    {
        super(name,age);
        this.power=power;
    }
          
} 

class Person1{
    String name;
    int age;
    Person1(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+"\n"+age+"\n";
    }
}

class Hero1 extends Person1{
    String power;
    Hero1(String name,int age,String power){
        super(name,age);
        this.power=power;
    }
    public String toString()
    {
        return super.toString()+power;  // Calls the parent toString() method
    }
}