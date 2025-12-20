package LevelOne.실패율;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution
{
    public static void main(String[] args)
    {
        int n2 = 5;
        double[] successAvgArr2 = new double[n2];
        int[] stages2 = {2, 1, 2, 6, 2, 4, 3, 3};

        int length2 = stages2.length;

        Map<Integer, Long> map = Arrays.stream(stages2).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(int i=1; i<=n2; i++)
        {
            Long count = map.getOrDefault(i, 0L);
            successAvgArr2[i-1] = length2 == 0 ? 0L : (double) count / length2;

            length2 -= count;
        }

        Integer[] indexArr = new Integer[n2];
        for(int i=0; i<n2; i++)
        {
            indexArr[i] = i;
        }

        Arrays.sort(indexArr, (i, j) -> {
            int cmp = Double.compare(successAvgArr2[j], successAvgArr2[i]);
            if(cmp != 0)
                return cmp;

            return Integer.compare(i, j);
        });

        Arrays.stream(indexArr).mapToInt(i -> i + 1).forEach(System.out::println);
    }
}
