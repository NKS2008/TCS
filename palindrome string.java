import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String r = "";
        for(int i = n-1; i >= 0; i--){
            r = r + s.charAt(i);
        }
        if (s.equals(r)) System.out.println("YES");
        else System.out.println("False");
    }
}
