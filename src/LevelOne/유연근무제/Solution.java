package LevelOne.유연근무제;

public class Solution
{
    public static void main(String[] args)
    {
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startDay = 5;
        int result = 0;


        for(int start = 0; start < schedules.length; start++)
        {
            int schedule = schedules[start];
            int minute = getMinute(schedule);
            int limitTime = minute + 10;
            boolean success = true;

            for(int i=0; i<7; i++)
            {
                int day = (startDay - 1 + i) % 7;

                if(day >= 5)
                    continue;

                int actual = getMinute(timelogs[start][i]);
                if(actual > limitTime)
                {
                    success = false;
                    break;
                }
            }

            if(success) result++;
        }

        System.out.println("result = " + result);
    }

    private static int getMinute(int schedule)
    {
        return (schedule / 100) * 60 + (schedule % 100);
    }
}
