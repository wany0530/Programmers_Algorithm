package LevelOne.과일장수;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution
{
    public static void main(String[] args)
    {
//        int[] apples = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int[] apples = {1, 2, 3, 1, 2, 3, 1};
        int k = 3;
        int m = 4;

        Arrays.sort(apples);


        int sum = 0;
        for(int start=apples.length-m; start >= 0; start -= m)
        {
            sum += apples[start] * m;
        }
    }
}
