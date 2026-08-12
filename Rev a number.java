import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            r += s.charAt(i);
        }
        System.out.println(r);
    }
}
