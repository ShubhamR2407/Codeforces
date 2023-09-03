import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        s = s.toLowerCase();

        StringBuilder t = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                continue;
            } else {
                t.append('.');
                t.append(ch);
            }
        }

        System.out.println(t.toString());

    }
}
