import java.io.*;
public class Main{
    public static void main(String[] args) {
        File fobj = new File("text.txt");
        if(fobj.exists())
        {
            System.out.println("That file exists!!");
            System.out.println(fobj.getAbsolutePath());
            System.out.println(fobj.getPath());
            System.out.println(fobj.isFile());
            // fobj.delete(); deletes the file which the object is pointing!
        }
        else
        {System.out.println("That file doesn't exist!!");}
    }
}