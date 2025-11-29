package LevelOne.year2016;

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public String solution(int a, int b)
    {
        int totalDay = 0;

        int[] monthArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayArr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        for(int i =0; i < a-1; i++)
        {
            totalDay += monthArr[i];
        }

        totalDay += b - 1;

        return dayArr[totalDay % 7];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("2016년의 월을 입력하세요.");
        int month = sc.nextInt();

        System.out.print("2016년의 일을 입력하세요.");
        int day = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.solution(month, day) + "요일");;
    }
}
