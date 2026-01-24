package LevelOne.완주하지못한선수;

import java.util.*;
import java.util.stream.Collectors;

public class Solution
{
    public static void main(String[] args)
    {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = null;

        Map<String, Integer> map = new HashMap<>();

        for(String s : participant)
        {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String c : completion)
        {
            map.computeIfPresent(c, (k, v) -> v - 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            if(entry.getValue() != 0)
                result = entry.getKey();
        }

        System.out.println("result = " + result);
        

        String a = "";

    }
}
