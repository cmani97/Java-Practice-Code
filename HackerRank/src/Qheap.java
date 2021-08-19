import java.io.*;
import java.util.*;

public class Qheap {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String[] s = sc.nextLine().split(" ");
            if(s[0] == "1"){
                ts.add(s[1]);
            }else if(s[0] == "2"){
                ts.remove(s[1]);
            }else if(s[0]== "3"){
                System.out.println(ts.pollFirst());
            }
        }
    }
}