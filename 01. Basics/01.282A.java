// https://codeforces.com/problemset/problem/282/A
// Bit++

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int x=0;

        for(int i=0;i<n;i++){
            String stmt=sc.next();

            if(stmt.charAt(1)=='+'){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
