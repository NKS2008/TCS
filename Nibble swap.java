import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = ((n & 0X0F)<<4 | (n & 0XF0)>>4);
        System.out.println(r);
    }
}
