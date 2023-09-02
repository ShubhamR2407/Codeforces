import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        while(n-->0) {
            String s = scn.next();
            
            if(s.length() > 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(s.length() - 2);
                sb.append(s.charAt(s.length() -1));
                System.out.println(sb.toString());
            } else {
                System.out.println(s);
            }
        }
    }
}