import java.util.Scanner;

public class Eight_MatrixModification {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] inp=new int[n][n];
        int[][] res=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                inp[i][j]=scan.nextInt();
                res[i][j]=inp[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(inp[i][k]==0 || inp[k][j]==0){
                        res[i][j]=0;
                        break;
                    }
                }
                
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
