import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int arr[] = new int[n + 1];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = scn.nextInt();
            if ((i <= k && arr[i] > 0) || (arr[i] >= arr[k] && arr[i] > 0))
                count++;
        }

        System.out.println(count);
    }
    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);

    //     int n = scn.nextInt();
    //     int k = scn.nextInt();

    //     int arr[] = new int[n+1];
    //     arr[0] = 0;
    //     int count = 0;
    //     int min = 0;

    //     for(int i = 1; i<=n; i++) {
    //         arr[i] = scn.nextInt();
    //         if(i==k) min = arr[i];
    //     }

    //     for(int i = 1; i<=n; i++) {
    //         if(arr[i] >= min && arr[i] > 0) count ++;
    //         else break;
    //     }

    //     System.out.println(count);
    // }
}

