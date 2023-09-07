import java.util.Scanner;

public class TwoVessels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while(n-->0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            double diff = Math.ceil(Math.abs(a-b) / 2.0);
            System.out.println(">> " + diff);
            System.out.println(Math.ceil(diff/c));
        }
    }
}
