import java.util.Scanner;

public class ChatRoom_58A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();

        String check = "hello";
        boolean flag = false;
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == check.charAt(j)) {
                j++;
            }
            if(j == check.length()) {
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
