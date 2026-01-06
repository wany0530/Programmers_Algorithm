package LevelZero.유한소수판별하기;

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        int a = 11;
        int b = 22;

        solution(a, b);
    }
    public static int solution(int a, int b) {
        // 1. 최대공약수로 약분
        int gcd = gcd(a, b);
        b /= gcd;

        // 2. 분모에서 2 제거
        while (b % 2 == 0) {
            b /= 2;
        }

        // 3. 분모에서 5 제거
        while (b % 5 == 0) {
            b /= 5;
        }

        // 4. 1만 남으면 유한소수
        return b == 1 ? 1 : 2;
    }

    // 유클리드 호제법
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
