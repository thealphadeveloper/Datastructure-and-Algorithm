import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []strg = new int[n+1];
    int ans = fiboT( n );
    System.out.println( ans );
 }
 
 public static int fiboT(int n ){
     if(n < 1){
         return n;
     }
     int []strg = new int[n + 1];
     strg[0] = 0;
     strg[1] = 1;
     
     for(int i = 2; i <= n; i++){
         strg[i] = strg[i-1]+ strg[i-2];
     }
     return strg[n];
 }

}