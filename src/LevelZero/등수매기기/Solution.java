package LevelZero.등수매기기;

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        int[][] score = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {1, 1}};
        int size = score.length;
        double[] result = new double[size];
        int[] answer = new int[size];

        int idx = 0;
        for(int[] s : score)
        {
            result[idx++] = (s[0] + s[1]) / 2.0;
        }

        for(int i = 0; i < size; i++)
        {
            int rank = 1;
            for(int j = 0; j < size; j++)
            {
                if(result[i] < result[j])
                    rank++;
            }

            answer[i] = rank;
        }

        String a = "";

    }
}
