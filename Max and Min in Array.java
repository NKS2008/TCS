import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > l){
                l = arr[i];
            }
            if(arr[i] < s){
                s = arr[i];
            }
        }
        System.out.println(l);
        System.out.println(s);
    }
}
