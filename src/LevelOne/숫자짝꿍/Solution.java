package LevelOne.숫자짝꿍;

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        String a = "12321";
        String b = "42531";
        int[] aArr = numCntArr(a);
        int[] bArr = numCntArr(b);


        StringBuilder sb = new StringBuilder();

        for (int d = 9; d >= 0; d--) {
            int common = Math.min(aArr[d], bArr[d]);
            for (int i = 0; i < common; i++) {
                sb.append(d);
            }
        }

        if(sb.length() == 0)
            System.out.println("-1 = " + -1);

        if(sb.charAt(0) == '0')
            System.out.println("0 = " + 0);

        System.out.println("sb.toString() = " + sb.toString());
    }

    private static int[] numCntArr(String a)
    {
        int[] arr = new int[10];

        for(int i=9; i>=0; i--)
        {
            String tempA = a;
            tempA = tempA.replace(i + "", "");
            arr[i] = a.length() - tempA.length();
        }

        return arr;
    }
}
