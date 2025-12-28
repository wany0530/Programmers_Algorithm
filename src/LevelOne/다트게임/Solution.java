package LevelOne.다트게임;

public class Solution
{
    public static void main(String[] args)
    {
        String target = "1D2S#10S".replace("10", "!");

        int[] scores = new int[3];
        int idx = -1;

        for(int start = 0; start < target.length(); start++)
        {
            char c = target.charAt(start);
            if(Character.isDigit(c) || c == '!')
            {
                idx++;
                scores[idx] = c == '!' ? 10 : c - '0';
            }
            else if (c == 'D')
            {
                scores[idx] *= scores[idx];
            }
            else if (c == 'T')
            {
                scores[idx] *= scores[idx] * scores[idx];
            }
            else if (c == '*')
            {
                scores[idx] *= 2;

                if (idx > 0)
                    scores[idx - 1] *= 2;
            }
            else if (c == '#')
            {
                scores[idx] *= -1;
            }
        }

        int answer = 0;
        for (int score : scores)
        {
            answer += score;
        }

        System.out.println("answer = " + answer);
    }

    private static class Target
    {
        private final String num;
        private final String bonus;
        private final String option;

        public Target(String num, String bonus, String option)
        {
            this.num = num;
            this.bonus = bonus;
            this.option = option;
        }
    }
}





