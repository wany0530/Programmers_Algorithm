package LevelOne.지폐접기;

public class Solution
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};

        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        int billMin = Math.min(bill[0], bill[1]);
        int walletMin = Math.min(wallet[0], wallet[1]);
        int billMax = Math.max(bill[0], bill[1]);
        int walletMax = Math.max(wallet[0], wallet[1]);

        int cnt = 0;
        while(billMin > walletMin || billMax > walletMax)
        {
            if(bill[0] > bill[1])
                bill[0] /= 2;
            else
                bill[1] /= 2;

            billMin = Math.min(bill[0], bill[1]);
            billMax = Math.max(bill[0], bill[1]);

            cnt++;
        }
        String a = "";

    }
}
