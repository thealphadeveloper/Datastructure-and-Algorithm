import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str  = scn.nextLine();
        
        int ca = 0, cb = 0, cc = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' ){
                ca = 2 * ca + 1;
            }else if(str.charAt( i ) == 'b'){
                cb = 2 * cb + ca;
            }else if(str.charAt( i ) == 'c'){
                cc = 2 * cc + cb;
            }
        }
        
        System.out.println(cc);

    }
}