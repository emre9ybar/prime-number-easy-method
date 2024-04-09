
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Rakamı Giriniz :");
        int a =scanner.nextInt();


        for (int i = 2; i < a; i++) {
            boolean isAsal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isAsal = false;
                    break;
                }
            }
            if (isAsal) {
                System.out.println("asallar :" + i);
            }
        }


    }
}
