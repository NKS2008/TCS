// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int m = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;
        int tm = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > m){
                tm = sm;
                sm = m;
                m = arr[i];
            }
            else if(arr[i] > sm && arr[i] != m){
                sm = arr[i];
            }
            else if(arr[i] > tm && arr[i] != sm && arr[i] != m){
                tm = arr[i];
            }
        }
        System.out.println(tm);
    }
}

