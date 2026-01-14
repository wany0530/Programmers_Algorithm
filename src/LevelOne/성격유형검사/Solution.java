package LevelOne.성격유형검사;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args)
    {
        String[] surveyArr = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<surveyArr.length; i++)
        {
            String survey = surveyArr[i];
            int choice = choices[i];

        }
    }

    private static class Survey
    {
        private String character;
        private int score;
        private String character2;
        private int score2;

        public Survey(String character, String character2)
        {
            this.character = character;
            this.character2 = character2;
        }
    }

    private enum Choice
    {
        VeryDisAgree( 1, 3)
        , DisAgree(2, 2)
        , LittleDisAgree(3, 1)
        , Commonly(4, 0)
        , LittleAgree(5, 1)
        , Agree(6, 2)
        , VeryAgree(7, 3);

        private int choise;
        private int score;

        Choice(int choise, int score)
        {
            this.choise = choise;
            this.score = score;
        }

        public int getScore(int choise)
        {
            for(Choice c : Choice.values())
            {
                if(c.getChoise() == choise)
                {
                    return c.getScore();
                }
            }

            return 0;
        }

        public int getChoise()
        {
            return choise;
        }

        public int getScore()
        {
            return score;
        }
    }
}
