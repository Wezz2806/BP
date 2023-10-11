package loopingbilanganganjil;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Input N: ");
        int i, N = s.nextInt();
        while (N>0){
            i = 1;
            do{
                System.out.println(""+i);
                i += 2 ;
            }while(i<=N);
            
            System.out.println("");break;
        } 
    }
    
}
