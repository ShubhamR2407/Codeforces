import java.util.Arrays;
import java.util.Scanner;

public class VanyaNLanterns_492B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int l = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int diff = Math.max(arr[0], l - arr[n-1]) * 2;
        for(int i = 1; i<n; i++) {
            diff = Math.max(diff, (arr[i] - arr[i-1]) );
        }
        System.out.println((double) diff / 2.0);
    }
}
