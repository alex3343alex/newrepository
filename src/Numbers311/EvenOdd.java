package Numbers311;
import java.io.*;

public class EvenOdd {
    public static void main(String[] args) throws IOException{
        System.out.println("Введіть якесь число");
        try{
            int n;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(in.readLine());
            if (n % 2 == 0)
            {
                System.out.println("Ваше число парне");
            }
            else
            {
                System.out.println("Ваше число непартне");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage() + " Дане число не є цілим");
            System.exit(0);
        }
    }
}