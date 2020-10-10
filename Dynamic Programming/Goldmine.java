import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] gold = new int [n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    gold[i][j] = scn.nextInt();
                }
            }

            int ans = goldMine(gold);
            System.out.println(ans);
        }

        public static int goldMine(int[][] gold) {
            int strg[][] = new int[gold.length][gold[0].length];

            for (int j = strg[0].length - 1; j >= 0; j--) {
                for (int i = 0; i < strg.length; i++) {
                    if (j == strg[0].length - 1) {
                        strg[i][j] = gold[i][j];
                    } else if (i == 0) {
                        int max = Math.max(strg[i][j + 1], strg[i + 1][j + 1]);
                        strg[i][j] = gold[i][j] + max;
                    }else if(i == strg.length - 1){
                        int max = Math.max(strg[i][j+1] , strg[i-1][j+1]);
                        strg[i][j] = gold[i][j] + max;
                    }
                    else {
                        int max = Math.max(strg[i - 1][j + 1], Math.max(strg[i][j + 1], strg[i + 1][j + 1]));
                        strg[i][j] = gold[i][j] + max;
                    }
                }
            }

            int ans = strg[0][0];
            for (int i = 1; i < strg.length; i++) {
                if (ans < strg[i][0]) {
                    ans = strg[i][0];
                }
            }
            return ans;
        }

    }