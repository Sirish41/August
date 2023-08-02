package Day1;
import java.util.Scanner;

public class Three_PalindromeNumber {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int rNum=0;
        int numClone=num;
        while(numClone!=0){
            int digit=numClone%10;
            rNum=rNum*10+digit;
            numClone/=10;
        }
        if(num-rNum==0){
            System.out.println(num + " is palindrome");
        }
        else
            System.out.println(num + " is not palindrome");
    }    
}
