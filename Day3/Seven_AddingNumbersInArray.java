import java.util.Scanner;

public class Seven_AddingNumbersInArray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int digit1=scan.nextInt(), digit2=scan.nextInt();
        int arrSize=Math.max(digit1, digit2);
        arrSize++;
        int[] a=new int[arrSize];
        int[] b=new int[arrSize];
        int result[]=new int[arrSize];
        for(int i=0; i<digit1; i++){
            a[arrSize-digit1+i]=scan.nextInt();
        }
        for(int i=0; i<digit2; i++){
            b[arrSize-digit2+i]=scan.nextInt();
        }
        scan.close();
        System.out.println();
        for(int i=arrSize-1; i>0; i--){
            if(result[i]+a[i]+b[i]/10>0){
                int temp=(result[i]+a[i]+b[i]);
                result[i]=temp%10;
                result[i-1]=temp/10;
            }
            else
                result[i]+=a[i]+b[i];
        }
        for(int i=0; i<arrSize; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
