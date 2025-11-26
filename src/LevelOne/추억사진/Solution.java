package LevelOne.추억사진;

import java.util.Arrays;
import java.util.List;

public class Solution
{
    public int[] solution(String[] name, int[] yearning, String[][] photo)
    {
        int[] result = new int[photo.length];

        for(int start=0; start<photo.length; start ++)
        {
            int sum = 0;

            for(String friend : photo[start])
            {
                List<String> list = Arrays.asList(name);
                if(list.contains(friend))
                {
                    sum += yearning[list.indexOf(friend)];
                }
            }
            result[start] = sum;
        }

        return result;
    }

    public static void main(String[] args)
    {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        Solution obj = new Solution();
        int[] solution1 = obj.solution(name, yearning, photo);
    }
}
