import java.util.*;
class Main{
  static int kad(int[] arr){
    int n = arr.length;
    int sum = 0;
    int s = arr[0];
    for(int i = 0; i < n; i++){
      sum = sum + arr[i];
    
    if(sum > s){
      s = sum;
    }
    if(sum <0){
      sum = 0;
    }
  }
      return s;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] a = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
    int k = kad(a);
    System.out.println(k);
  }
}
