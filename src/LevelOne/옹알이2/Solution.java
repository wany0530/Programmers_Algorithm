package LevelOne.옹알이2;

import java.util.Optional;

public class Solution
{
    public static void main(String[] args)
    {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] pronunciation = {"aya", "ye", "woo", "ma"};
        String[] repeatPronunciation = {"ayaaya", "yeye", "woowoo", "mama"};
        int result = 0;
        for(int start = 0; start < babbling.length; start++)
        {
            if(babbling[start].indexOf(repeatPronunciation[0]) != -1 ||
               babbling[start].indexOf(repeatPronunciation[1]) != -1 ||
               babbling[start].indexOf(repeatPronunciation[2]) != -1 ||
               babbling[start].indexOf(repeatPronunciation[3]) != -1)
            {
                continue;
            }

            babbling[start] = babbling[start].replace(pronunciation[0], " ");
            babbling[start] = babbling[start].replace(pronunciation[1], " ");
            babbling[start] = babbling[start].replace(pronunciation[2], " ");
            babbling[start] = babbling[start].replace(pronunciation[3], " ");
            babbling[start] = babbling[start].replace(" ", "");

            if(babbling[start].length() == 0)
                result++;
        }


    }
}
