package LevelOne.옹알이2;

import java.util.Optional;

public class Solution
{
    public static void main(String[] args)
    {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] pronunciation = {"aya", "ye", "woo", "ma"};

        int result = 0;
        for(int i = 0; i<babbling.length; i++)
        {
            String s = babbling[i];
            for(int start = 1; start<=pronunciation.length; start++)
            {
                s = s.replace(pronunciation[start - 1], start+"");
            }

            try
            {
                int target = Integer.parseInt(s);
            }
            catch (NumberFormatException e)
            {
                continue;
            }

            int base = 0;
            boolean isRepeat = false;
            for(char c : s.toCharArray())
            {
                if(base != Character.getNumericValue(c))
                    base = Character.getNumericValue(c);
                else
                    isRepeat = true;
            }

            if(!isRepeat)
                result++;
        }

        String a= "";
    }
}
