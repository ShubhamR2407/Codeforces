import java.util.Scanner;

public class YoungPhysicist_69A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] += scn.nextInt();
            }
        }

        boolean flag = true;
        for(int i = 0; i<3; i++) {
            if(arr[i] != 0) {
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("YES");
        else {
            System.out.println("NO");
        }
    }
}
