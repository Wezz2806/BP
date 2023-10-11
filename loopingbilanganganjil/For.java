package loopingbilanganganjil;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Input N: ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i+=2) {
            System.out.println(""+i);            
        }
    }
    
}
