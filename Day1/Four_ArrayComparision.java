import java.util.Scanner;

public class Four_ArrayComparision {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ref=0, result=0;
        for(int i=0; i<n; i++){
            int num=scan.nextInt();
            if(num>ref){
                result++;
                ref=num;
            }
        }
        scan.close();
        System.out.println(result);
    }    
}
