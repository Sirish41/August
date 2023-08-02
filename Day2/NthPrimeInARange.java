import java.util.Scanner;

public class NthPrimeInARange {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt(), end=scan.nextInt(), n=scan.nextInt();
        int flag=0;
        int i=start-1, count=0, nthPrime=start;
        while(count!=n && i<end){
            flag=0;
            i++;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    flag=1; 
                    break;
                }
            }
            if(flag==0){
                count++;
                nthPrime=i;
            }
        }
        System.out.println(nthPrime);
    }
}
