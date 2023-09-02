import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long m = scn.nextLong();
        long n = scn.nextLong();
        long a = scn.nextLong();

        System.out.println((int)(Math.ceil((double)m/a)*Math.ceil((double)n/a)));
    }
}
