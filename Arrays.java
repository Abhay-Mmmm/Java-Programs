class Test{
    public static void main(String args[])
    {
        String cars[]={"Corvette","Cadillac","GTR","Lambo"};
        String money[] = new String[100];
        System.out.println("Length is : "+cars.length);
        //To print all the elements in the array
        System.out.println("Printing elements in cars: ");
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
    }
}

class twoDimension{
    String apps[][]= new String[100][100];
    int app[][]={
        {1,2,3},
        {3,4,5},
        {4,7,8}     
    };
}