package LevelOne.대충만든자판;

public class Solutioin
{
    public static void main(String[] args)
    {
//        String[] keymap = {"BC"};
//        String[] keymap = {"AA"};
        String[] keymap = {"ABACD", "BCEFD"};
//        String[] targets = {"AC", "BC"};
//        String[] targets = {"B"};
        String[] targets = {"ABCD","AABB"};

        int[] answerArr = new int[targets.length];
        int arrIdx = 0;
        int answerNum = 0;
        int compareNum = -1;

        for (String target : targets)
        {
            boolean possible = true;
            for (char c : target.toCharArray())
            {
                for (String key : keymap)
                {
                    int idx = key.indexOf(c);

                    if (idx >= 0)
                    {
                        if (compareNum == -1 || idx < compareNum)
                        {
                            compareNum = idx;
                        }
                    }
                }

                if (compareNum == -1)
                {
                    possible = false;
                    break;
                }

                answerNum += compareNum + 1;

                compareNum = -1;


            }
            answerArr[arrIdx++] = possible ? answerNum : -1;
            answerNum = 0;
        }

        String a = "";
//        return answer;
    }
}
