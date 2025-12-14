package LevelOne.실패율;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution
{
    public static void main(String[] args)
    {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        List<Integer> list = Arrays.stream(stages).sorted().boxed().collect(Collectors.toList());
        int base = 0;
        for(Integer i : stages)
        {
            if(base != i)
                base = i;


        }
    }
}
