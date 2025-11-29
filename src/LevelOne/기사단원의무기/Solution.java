package LevelOne.기사단원의무기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();

        System.out.print("limit를 입력하세요: ");
        int limit = sc.nextInt();

        System.out.print("power를 입력하세요: ");
        int power = sc.nextInt();

        int[] arr = new int[number];

        for(int start=0; start < number; start++)
        {
            Set<Integer> set = new HashSet<>();

            for(int i=1; i * i<= start+1; i++)
            {
                if((start+1) % i == 0)
                {
                    set.add(i);
                    set.add((start+1)/i);
                }
            }

            int cnt = set.size();
            arr[start] = cnt > limit ? power : cnt;
        }

        int result = Arrays.stream(arr).sum();
    }
}
