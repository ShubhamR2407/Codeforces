import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][3];

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<3; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++) {
            int count = 0;
            for(int j = 0; j<3; j++) {
                if(arr[i][j] == 1) count++;
            }
            if(count >=2) ans++;
        }
        System.out.println(ans);
    }
}
