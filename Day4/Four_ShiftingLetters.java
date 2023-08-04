import java.util.Scanner;

public class Four_ShiftingLetters{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char c[]=s.toCharArray();
        int len=scan.nextInt();
        int shifts[]=new int[len];
        for(int i=0; i<len; i++){
            shifts[i]=scan.nextInt();
        }
        scan.close();
        int sum=0;
        for(int i=len-1; i>=0; i--){
            sum+=shifts[i];
            if((c[i]+sum)>'z'){
                c[i]=(char)(97-1+sum);
            }
            else
                c[i]=(char)((c[i]+sum));

        }
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]);
        }
    }
}