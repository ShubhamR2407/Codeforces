import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        if(n <= 2 || n % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}