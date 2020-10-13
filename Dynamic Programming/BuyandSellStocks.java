import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int min = arr[0];
        int maxProfit = 0;
        
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }else{
                if(arr[i] - min > maxProfit){
                    maxProfit = arr[i] - min;
                }
            }
        }
          System.out.println(maxProfit);
    }

}