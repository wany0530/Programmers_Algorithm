package LevelOne.덧칠하기;

public class Solution
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        int[] arr = {2,3,6};
        System.out.println("cnt = " + obj.solution(8, 4, arr));
    }

    public int solution(int n, int m, int[] section)
    {
        int cnt = 0;
        int standard = 0;

        for(int num : section)
        {
            if(num > standard)
            {
                cnt++;
                standard = num + m - 1;
            }
        }

        return cnt;
    }
}
