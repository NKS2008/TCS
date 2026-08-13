import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }
        int k = sc.nextInt();
        if(k > n) k = k%n;
        rev(arr, 0 , n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void rev(int [] arr, int a , int b){
        while(a <= b){
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
            a++;
            b--;
        }
    }
}

