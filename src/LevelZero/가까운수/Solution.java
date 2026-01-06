package LevelZero.가까운수;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Solution
{
    public static void main(String[] args)
    {
        int[] array = {13, 11};
        int n = 12;

        Integer[] tempArr = new Integer[array.length];
        for(int i=0; i<array.length; i++)
        {
            tempArr[i] = array[i] - n;
        }

        Arrays.sort(tempArr);
        Arrays.sort(tempArr, Comparator.comparingInt(Math::abs));

        System.out.println("tempArr = " + (tempArr[0] + n));


//
//        Arrays.sort(tempArr, Comparator.comparingInt(Math::abs));
//
//        return tempArr[0];
    }
}
