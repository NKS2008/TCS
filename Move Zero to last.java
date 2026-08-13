import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int [] a1 = new int[n];
        int k =0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                a1[k] = arr[i];
                k++;
            }
        }
        for(int i : a1){
            System.out.println(i);
        }
    }
}

