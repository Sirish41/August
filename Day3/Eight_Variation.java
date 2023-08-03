import java.util.Scanner;

public class Eight_Variation {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] row=new int[size];
        int[] col=new int[size];
        int[][] mat=new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                mat[i][j]=scan.nextInt();
                if(mat[i][j]==0){
                    row[i]=col[j]=0;
                }
            }
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(row[i]==0 || col[j]==0){
                    mat[i][j]=0;
                }
            }
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
