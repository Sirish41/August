import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            int inp=scan.nextInt();
            int j=i-1; int v=inp;
            while(j>=0 && arr[j]>v){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=v;
        }
        scan.close();
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
