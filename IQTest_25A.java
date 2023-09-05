import java.util.Scanner;

public class IQTest_25A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int evenCount = 0;
        int lastEven = 0;
        int lastOdd = 0;
        for(int i = 0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
                lastEven = i + 1;
            }
            else {
                evenCount--;
                lastOdd = i + 1;
            }
        }

        if(evenCount > 0) {
            System.out.println(lastOdd);
        } else {
            System.out.println(lastEven);
        }
    }
}
