package LevelOne.키패드누르기;

public class Solution
{
    private static final int[][] POS = {
            {3, 1}, // 0
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, // 3
            {1, 0}, // 4
            {1, 1}, // 5
            {1, 2}, // 6
            {2, 0}, // 7
            {2, 1}, // 8
            {2, 2}, // 9
            {3, 0}, // *
            {3, 2}  // #
    };

    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";

        boolean rightHanded = "right".equals(hand);

        int left = 10;
        int right = 11;

        StringBuilder answer = new StringBuilder();
        for(int num : numbers)
        {
            if(num%3 == 1)
            {
                answer.append("L");
                left = num;
            }
            else if(num != 0 && num%3 == 0)
            {
                answer.append("R");
                right = num;
            }
            else
            {
                int leftDist = getDistance(num, left);
                int rightDist = getDistance(num, right);

                if(leftDist < rightDist || (leftDist == rightDist && !rightHanded))
                {
                    answer.append("L");
                    left = num;
                }
                else
                {
                    answer.append("R");
                    right = num;
                }
            }
        }

        String a = "";
    }

    private static int getDistance(int num, int left)
    {
        return Math.abs(POS[left][0] - POS[num][0]) + Math.abs(POS[left][1] - POS[num][1]);
    }

}
