package LevelOne.햄버거;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class Solution
{
    public static void main(String[] args)
    {
//        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] ingredient = {1, 2,3,1,3,3,1,2,3,1};
        int answer = 0;

        StringBuffer sb = new StringBuffer();
        for (int i : ingredient)
        {
            sb.append(i);
            int nowLength = sb.length();
            if (nowLength >= 4)
            {
                int bread = nowLength - 4;
                if (sb.charAt(bread) == '1' && sb.charAt(nowLength - 3) == '2'
                                            && sb.charAt(nowLength - 2) == '3'
                                            && sb.charAt(nowLength - 1) == '1')
                {
                    sb.delete(bread, nowLength);
                    answer++;
                }
            }
        }
        System.out.println("answer = " + answer);
    }
}
