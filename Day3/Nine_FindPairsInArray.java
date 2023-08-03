import java.util.*;

public class Nine_FindPairsInArray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt(), value;
        ArrayList<Integer> a=new ArrayList<Integer>();
        HashSet<Integer> b=new HashSet<Integer>();
        value=scan.nextInt();
        for(int i=0; i<size; i++){
            a.add(scan.nextInt());
            b.add(a.get(i));
        }
        scan.close();
        for(Integer x: a){
                if(b.contains(value-x)){
                    System.out.println(x+", "+(value-x));
                    b.remove(value-x);
                    b.remove(x);
                }
        }

    }    
}
