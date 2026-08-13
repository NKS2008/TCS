import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] g = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                g[i][j] = sc.nextInt();
            }
        }
        int ma = Integer.MIN_VALUE;
        int s = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < m-2; j++){
                s = g[i][j] + g[i][j+1] + g[i][j+2] + g[i+1][j+1] + g[i+2][j] + g[i+2][j+1] + g[i+2][j+2];
            }
            ma = Math.max(ma, s);
        }
        System.out.println(ma);
    }
}

