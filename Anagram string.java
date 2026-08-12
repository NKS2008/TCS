import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String s1 = sc.nextLine().toLowerCase();
        s = s.replaceAll("[^a-z]", "");
        s1 = s1.replaceAll("[^a-z]", "");
        if (s.length() != s1.length()) {
            System.out.println("NO");
            return;
        }
        char[] a = s.toCharArray();
        char[] b = s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
