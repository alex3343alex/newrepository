package Numbers311;
import java.io.*;

public class EvenOdd {
    public static void main(String[] args) throws IOException{
        try{
            int n;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(in.readLine());
            if (n % 2 == 0)
            {
                System.out.println("Given number is Even.");
            }
            else
            {
                System.out.println("Given number is Odd.");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage() + " is not a numeric value.");
            System.exit(0);
        }
    }
}