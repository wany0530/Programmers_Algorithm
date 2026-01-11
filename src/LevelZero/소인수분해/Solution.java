package LevelZero.소인수분해;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        int n = 12;

        Set<Integer> set = new HashSet<>();

        while(n % 2 == 0)
        {
            set.add(2);
            n /= 2;
        }

        for(int start = 3; start * start <= n; start += 2)
        {
            set.add(start);
            n /= start;
        }

        if(n > 1)
        {
            set.add(n);
        }

        int[] result = new int[set.size()];
        int idx = 0;
        for(Integer num : set)
        {
            result[idx++] = num;
        }

        Arrays.sort(result);

    }
}
