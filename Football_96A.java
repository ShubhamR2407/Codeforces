import java.util.Scanner;

public class Football_96A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        int count = 1;
        char prev = s.charAt(0);
        boolean flag = false; 
        for(int i = 1; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == prev) {
                count++;
                if(count == 7) {
                    flag = true;
                    break;
                } 
            } else {
                count = 1;
                prev = curr;
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
