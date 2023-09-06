import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem_4C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        
        while(n-->0) {
            String s = scn.next();
            if(!map.containsKey(s)) {
                map.put(s, 1);
                System.out.println("OK");
            } else {
                StringBuilder sb = new StringBuilder(s);
                sb.append(map.get(s));
                map.put(s, map.get(s) + 1);
                System.out.println(sb.toString());
            }
        }
    }
}
