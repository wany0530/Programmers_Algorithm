package LevelOne.비밀지도;

import java.util.Arrays;

/**
 *
 * String[] answer = new String[n];
 *       String temp;
 *
 *       for(int i = 0 ; i < n ; i++){
 *           temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
 *           temp = temp.substring(temp.length() - n);
 *           temp = temp.replaceAll("1", "#");
 *           temp = temp.replaceAll("0", " ");
 *           answer[i] = temp;
 *       }
 *
 *       return answer;
 *
 *       와 미쳤다..
 */

public class Solution
{
    public static void main(String[] args)
    {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        int n = arr1.length;

        String[][] checkArr = new String[n][n];
        for(int i = 0; i < n; i++)
        {
            String binaryString = Integer.toBinaryString(arr1[i]);

            if(binaryString.length() < n)
            {
                binaryString = String.format("%" + n + "s", binaryString).replace(' ', '0');
            }

            String binaryString2 = Integer.toBinaryString(arr2[i]);

            if(binaryString2.length() < n)
            {
                binaryString2 = String.format("%" + n + "s", binaryString2).replace(' ', '0');
            }

            for(int j = 0; j < binaryString.length(); j ++)
            {
                if(((int)binaryString.charAt(j) - 48) + ((int)binaryString2.charAt(j) - 48) > 0)
                    checkArr[i][j] = "#";
                else
                    checkArr[i][j] = " ";
            }
        }

        String[] answer = new String[n];
        int cnt = 0;
        for(String[] arr : checkArr)
        {
            answer[cnt++] = String.join("", arr);
        }
    }
}
