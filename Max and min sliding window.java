import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
          a[i] = sc.nextInt();
    
      int s = 0;
      for(int i = 0; i <= n-k; i++){
        int m = a[i];
        int ma = a[i];
        for(int j = i; j < i+k; j++){
          if(a[j] > m){
            m = a[j];
          }
          if(a[j] < ma){
            ma = a[j];
          }
        }
        System.out.println(m-ma);
      }
    }
}
