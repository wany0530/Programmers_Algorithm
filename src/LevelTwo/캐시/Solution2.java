package LevelTwo.캐시;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution2
{
    public static void main(String[] args) {
        String[] cities = {"Jeju","Pangyo","Seoul","NewYork","LA",
                "Jeju","Pangyo","Seoul","NewYork","LA"};
        int cacheSize = 3;

        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;

        Map<String, String> cache =
                new LinkedHashMap<>(cacheSize, 0.75f, true) {

                    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                        return size() > cacheSize;
                    }
                };

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.containsKey(city)) {
                answer += 1; // hit
            } else {
                answer += 5; // miss
            }

            cache.put(city, city); // 자동 LRU 갱신
        }

        return answer;
    }
}
