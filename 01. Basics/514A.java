// https://codeforces.com/contest/514/problem/A
// Chewbacca and number

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        long reversed = 0;
        int count = 0;

        while (num != 0) {
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            count++;
        }

        long ans = 0;

        for (int i = 0; i < count; i++) {
            long digit = reversed % 10;
            long inverted = 9 - digit;

            if (i == 0 && digit == 9) {
                ans = ans * 10 + digit;
            } else {
                ans = ans * 10 + Math.min(digit, inverted);
            }

            reversed /= 10;
        }

        System.out.println(ans);
        sc.close();
    }
}
