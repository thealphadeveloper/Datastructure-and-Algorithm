import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = scn.nextInt();

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        boolean [][] dp = new boolean[n+1][tar+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = false;
                }else if(j == 0){
                    dp[i][j] = true;
                }else{
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i - 1];
                        if(j >= val){
                            if(dp[i -1][j - val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(dp[n][tar]);

    

    }
}
