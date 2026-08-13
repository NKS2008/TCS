import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }
        int m = Integer.MIN_VALUE;
        int p = 0; 
        int s = 0;
        for(int i = 0; i < n; i++){
            if( p == 0) p = 1;
            if(s==0) s= 1;
            p *= arr[i];
            s *= arr[n-1-i];
            m = Math.max(m, Math.max(p,s));
        }
        System.out.println(m);
    }
}

