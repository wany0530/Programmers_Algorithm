package LevelOne.성격유형검사;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args)
    {
        String[] surveyArr = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String[] standard = {"RT", "CF", "JM", "AN"};
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        StringBuilder answer = new StringBuilder();
        for(int i=0; i<surveyArr.length; i++)
        {
            String survey = surveyArr[i];
            int score = choices[i] - 4;

            String animal = score >= 0 ? survey.substring(1, 2) : survey.substring(0, 1);
            map.computeIfPresent(animal, (k, v) -> v + Math.abs(score));
        }

        for(int start=0; start<standard.length; start++)
        {
            String charaterOne = standard[start].substring(0, 1);
            String charaterTwo = standard[start].substring(1, 2);


            if(map.get(charaterOne) >= map.get(charaterTwo))
                answer.append(charaterOne);
            else
                answer.append(charaterTwo);
        }

        System.out.println("answer.toString() = " + answer.toString());
    }

    private static class Animal
    {
        private String name;
        private int score;

        public Animal(String name, int score)
        {
            this.name = name;
            this.score = score;
        }

        public String getName()
        {
            return name;
        }

        public int getScore()
        {
            return score;
        }
    }
}
