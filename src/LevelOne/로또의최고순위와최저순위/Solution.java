package LevelOne.로또의최고순위와최저순위;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        int[] lottos = {45, 4, 35, 20, 3, 0};
        int[] win_nums = {1, 2, 4, 5, 6, 7};
        int[] ranking = {6, 5, 4, 3, 2, 0};
        int correctCnt = 0;
        int zeroCnt = 0;

        Set<Integer> set = new HashSet<>();
        for(int num : lottos)
        {
            set.add(num);

            if(num == 0)
                zeroCnt++;
        }


        for(int n : win_nums)
        {
            if(set.contains(n))
                correctCnt++;
        }

        int[] answerArr = new int[]{6, 6};

        int firstVal = correctCnt + zeroCnt;
        for(int i = 1; i<=ranking.length; i++)
        {
            if(ranking[i-1] == firstVal)
                answerArr[0] = i;

            if(ranking[i-1] == correctCnt)
                answerArr[1] = i;
        }

        String a = "z";
    }
}
