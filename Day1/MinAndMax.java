package Day1;
import java.util.Scanner;
public class MinAndMax {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int min, max, inp, n=scan.nextInt();
        int sMax=scan.nextInt(), sMin;
        sMin=sMax;
        min=max=sMin;
        for(int i=1; i<n; i++){
            inp=scan.nextInt();
            if(inp>max){
                sMax=max;
                max=inp;
            }
            else if(inp>sMax && inp<max){
                sMax=inp;
            }
            if(inp<min){
                sMin=min;
                min=inp;
            }
            else if(inp<sMin && inp>min){
                sMin=inp;
            }
        }
        scan.close();
        System.out.println("Least of all: "+min + "\nGreatest of all: "+ max);
        System.out.println("Second Least of all: "+sMin + "\nSecond Greatest of all: "+ sMax);
    }
}
