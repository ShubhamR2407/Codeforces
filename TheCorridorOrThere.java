import java.util.Scanner;

public class TheCorridorOrThere {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while(t-->0) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            int a = findEvenNumberInRange(x, y);
            int b = findEvenNumberInRange(x, y - a); // Ensure a + b <= y
    
            if (a != -1 && b != -1) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(-1);
            }
        }
    }
    public static int findEvenNumberInRange(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
}
