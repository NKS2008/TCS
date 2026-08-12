import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int r = 0;
        while(n!=0){
            int d = n%10;
            r = r * 10 + d;
            n = n/10;
        }
        if(t == r) System.out.println("YES");
        else System.out.println("False");
    }
}
