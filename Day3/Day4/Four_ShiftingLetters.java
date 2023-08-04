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
        for(int i=0; i<len; i++){
            for(int j=0; j<i+1; j++){
                if((c[j]+shifts[i])>'z'){
                    c[j]=(char)(97-1+shifts[i]);
                }
                else
                    c[j]=(char)((c[j]+shifts[i]));
            }
        }
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]);
        }
    }
}