import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ps = arr[0];
        int ss = arr[n-1];
        int i = 0;
        int j = n-1;
        int m = Integer.MIN_VALUE;
        while( i <= j){
            if(ps == ss){
                m = Math.max(m, ps);
            }
            if(ps < ss){
                i++;
                ps += arr[i];
            }
            else{
                j--;
                ss += arr[j];
            }
        }
        System.out.println(m);
    }
}
