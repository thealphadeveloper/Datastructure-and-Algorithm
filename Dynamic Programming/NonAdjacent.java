import java.io.*;
import java.util.*;

public class NonAdjacent {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int exc = 0;
        int inc = arr[0];
        
        for(int i = 1; i < n; i++){
            int nInc = exc + arr[i];
            int nExc = Math.max(inc , exc);
            
            exc = nExc;
            inc = nInc;
        }
        System.out.println(Math.max(inc , exc) );

    }
}