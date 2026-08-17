import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a =new int[n];
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0; i <= n-k;i++){
            int m = a[i];
            for(int j = i +1; j < i+k; j++){
                if(a[j]>m){
                    m = a[j];
                }
            }
            System.out.println(m);
        }
    }
}
