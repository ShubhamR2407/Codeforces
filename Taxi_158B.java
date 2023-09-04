import java.util.Scanner;

public class Taxi_158B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[5];

        for (int i = 0; i < n; i++) {
            int s = scn.nextInt();
            arr[s]++;
        }

        int total = arr[4] + arr[3] + arr[2] / 2;
        arr[1] -= arr[3];
        if(arr[2] % 2 == 1) {
            total += 1;
            arr[1] -= 2;
        }

        if(arr[1] > 0) {
            total += arr[1] / 4 + (arr[1]%4 == 0 ? 0 : 1);
        }
        System.out.println(total);        
    }
}
