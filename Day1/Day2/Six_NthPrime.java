package Day1.Day2;
import java.util.Scanner;

public class Six_NthPrime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int nthPrime=2, flag;
        for(int i=2; i<num; i++){
            flag=0;
            for(int j=2; j<=Math.pow(i, 0.5); j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                nthPrime=i;
            }
        }
        System.out.println(nthPrime);
    }    
}
