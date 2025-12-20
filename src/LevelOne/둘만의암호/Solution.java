package LevelOne.둘만의암호;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "ukkssadfxczvsadfwerwerqweasdsdfsad";
        String skip = "wbqd";
        int idx = 5;

        boolean[] isSkip = new boolean[26];
        for(char c : skip.toCharArray())
        {
            isSkip[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray())
        {
            char tempC = c;
            int cnt = 0;

            while(cnt < idx)
            {
                tempC++;

                if(tempC > 'z')
                    tempC = 'a';

                if(!isSkip[tempC - 'a'])
                    cnt++;
            }

            sb.append(tempC);
        }

        String result = sb.toString();
    }
}
