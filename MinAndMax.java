import java.util.Scanner;
public class MinAndMax {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, inp, n=scan.nextInt();
        for(int i=0; i<n; i++){
            inp=scan.nextInt();
            max=Math.max(max, inp);
            min=Math.min(min, inp);
        }
        System.out.println("Least of all: "+min + "\nGreatest of all: "+ max);
    }
}
