import java.io.*;
public class Main{
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("Text.txt");
            file.write("I Guess you'll never know what i just wrote!\n");
            file.append("Hmmmmmmmmm\n");
            file.close();
        }
        catch(IOException e)
        {e.printStackTrace();}
    }
}