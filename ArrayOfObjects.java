public class Main{
    public static void main(String[] args) {
        //Food [] shelf = new Food[3];
        Food food1 = new Food("DoughNut");  // There are three objects here called food1, food2, food3.
        Food food2 = new Food("Mutta Puffs");
        Food food3 = new Food("Pizza");

        //shelf[0]=food1;
        //shelf[1]=food2;
        //shelf[2]=food3;  
        
        //Instead of this,
        Food [] shelf={food1,food2,food3};  
        // If we are doing this, we don't need lines 3,8,9,10.
        System.out.println(shelf[0].food);
        System.out.println(shelf[1].food);
        System.out.println(shelf[2].food);
    }
}

class Food{
    String food;
    Food(String food)
    {
        this.food=food;
    }
}