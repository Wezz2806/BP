package loopingbilanganganjil;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Input N: ");
        int N = s.nextInt();
        int i = 1;
        while (i<=N){
            System.out.println(""+i);
            i += 2;
        }
    }
    
}
