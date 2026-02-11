package LevelTwo.하노이탑;

import java.util.ArrayList;
import java.util.List;

public class Solution
{

    public static void main(String[] args)
    {
        int n = 2;

        List<int[]> result = new ArrayList<>();

        hanoi(n, 1, 2, 3, result);
        int[][] answer = new int[result.size()][2];
        for(int i=0; i<result.size(); i++)
        {
            answer[i] = result.get(i);
        }

    }

    public static void hanoi(int cnt, int start, int middle, int end, List<int[]> result)
    {
        if(cnt == 0)
            return;

        hanoi(cnt-1, start, end, middle, result);

        result.add(new int[]{start, end});

        hanoi(cnt-1, middle, start, end, result);
    }

}
