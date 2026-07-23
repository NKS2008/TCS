import java.util.*;
class Main{
  static int[] two(int[] arr, int t){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(arr[i]+arr[j] == t){
          System.out.println(i + " " + j);
          return new int[]{i,j};
        }
      }
    }
    return new int []{};
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] a = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
            int t = sc.nextInt();
    int [] arr = two(a,t);
    for(int x : arr)
      System.out.println(x);
  }
}
