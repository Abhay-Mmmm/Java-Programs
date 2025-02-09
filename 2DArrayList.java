import java.util.ArrayList;
class Test{
    public static void main(String args[])
    {
        //2D ArrayList is basically a dynamic list of lists.
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Bread");
        bakeryList.add("Biscuits");
        bakeryList.add("Rusk");

        ArrayList<String> veggList = new ArrayList<String>();
        veggList.add("Tomato");
        veggList.add("Potato");

        ArrayList<String> chocoList = new ArrayList<String>();
        chocoList.add("DiaryMilk");
        chocoList.add("MilkyBar");
        chocoList.add("Ferrero Rocher");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakeryList);
        groceryList.add(veggList);
        groceryList.add(chocoList);

        System.out.println(groceryList); // Prints the 2D ArrayList.
        System.out.println("List at 0th position is : "+groceryList.get(0)); // Prints the List at 0th position.
        System.out.println("Element of 2nd List and 0th element is : "+groceryList.get(2).get(0)); // Prints the 0th element of the 2nd List of the 2D ArrayList.
    }
}