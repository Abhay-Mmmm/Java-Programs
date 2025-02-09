import java.util.ArrayList;
class Test{
    public static void main(String args[])
    {
        //Basically a re-sizeable array. Use reference data types eg: String,Integer,Double etc. 
        ArrayList<String> food = new ArrayList<String>();
        food.add("Hamburger"); //Adds the term "Hamburger".
        food.add("Pizza");
        food.add("Pasta");
        
        for(int i=0; i<food.size(); i++) //size() : gets the size of the array list.

        {System.out.println(food.get(i));} //get(index) : gets the element at the specified index.

        food.set(0,"Chocolate"); //set() : Sets the element at 0 as "Chocolate".

        System.out.println(food); // Prints the elements in a List order with [] brackets.

        food.remove(2); // remove() : removes the element at index 2.

        food.clear(); // clear() : Clears the whole Array List.
    }
}