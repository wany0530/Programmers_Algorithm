package LevelTwo.캐시;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static int main(String[] args)
    {
        String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int cacheSize = 3;
        int answer = 0;

        if(cacheSize == 0)
            return 5 * cities.length;

        List<String> cacheList = new LinkedList<>();
        for (String s : cities)
        {
            String city = s.toLowerCase();
            if(!cacheList.contains(city))
            {
                answer += 5;
                if(cacheList.size() >= cacheSize)
                {
                    cacheList.remove(0);
                }
                cacheList.add(city);
            }
            else
            {
                answer += 1;
                cacheList.remove(city);
                cacheList.add(city);
            }
        }

        return answer;
    }
}
