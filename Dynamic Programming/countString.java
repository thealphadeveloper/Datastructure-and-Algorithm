import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {

Scanner scn = new Scanner(System.in);
int n = scn.nextInt();

int oc0 = 1;
int oc1 = 1;

for(int i = 2; i <= n ; i++){
    int nc0 = oc1;
    int nc1 = oc0+ oc1;
}
  System.out.println(oc0+ oc1);

  }
}
