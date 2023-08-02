package Day1;
import java.util.Scanner;

public class Five_CarParking {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rows=scan.nextInt(), columns=scan.nextInt();
        int sum=0, maxSum=0, maxRow=0;
        for(int i=0; i<rows; i++){
            sum=0;
            for(int j=0; j<columns; j++){
                int value=scan.nextInt();
                sum+=value;
            }
            if(sum>maxSum){
                maxSum=sum;
                maxRow=i+1;
            }
        }
        scan.close();
        System.out.println(maxRow);
    }    
}
