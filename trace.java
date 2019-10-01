import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int l=1, max=0;
            for ( l = 1; l <= n; l++) {
                
                for (int r = 0; r < n-l+1 ; r++) {
                    for (int c = 0; c < n-l+1; c++) {
                        //System.out.println("r: "+ (r) + " c: " + (c) + "\n" );
                        int sum=0;
                        for (int i = 0; i < l; i++) {
                            System.out.println("r: "+ (r+i) + " c: " + (c+i) );
                            sum=sum+2+a[i]+a[r+i][c+i];
                           
                        }
                        if(sum>max){
                            max=sum;
                        }
                    }
                }   
            }
            System.out.println(max);
        }
    }
}
