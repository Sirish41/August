import java.util.Scanner;

public class Four_ArrayComparision {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int result=1;
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
            if(i!=0 && arr[i]>arr[i-1]){
                result++;
            }
        }
        scan.close();
        System.out.println(result);
    }    
}
