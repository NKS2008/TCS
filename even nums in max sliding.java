import java.util.*;

public class Main {
    public static void main(String[] args) {
    int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
    
    int c = 0;
    for(int i = 0; i < k; i++){
      if(a[i]%2 == 0){
        c++;
      }
    }
    System.out.println(c);
    for(int i = k;i < n; i++){
      if(a[i]%2 == 0){
        c++;
      }
      if(a[i-k]%2 == 0) c--;
      System.out.println(c);
    }
    }
}
