package LevelOne.소수만들기;

public class Solution
{
    private static int count = 0;
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};

        int size = nums.length;
        for(int i=0; i<size-2; i++)
        {
            for(int j=i + 1; j<size-1; j++)
            {
                for(int k=j+1; k<size; k++)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isDecimal(sum))
                        count++;
                }
            }
        }

        System.out.println("count = " + count);
    }
    private static boolean isDecimal(int num)
    {
        if(num < 2)
            return false;

        for(int i = 2; i*i<=num; i++)
        {
            if(num % i == 0)
                return false;
        }

        return true;
    }
}
