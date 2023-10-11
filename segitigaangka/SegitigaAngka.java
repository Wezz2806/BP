package segitigaangka;
import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Segitiga Angka");
        System.out.print("Masukkan N: ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(""+j);
            }
            System.out.println("");
        }
    }
    
}
