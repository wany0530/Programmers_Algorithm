package LevelOne.소수구하기;

import java.util.stream.IntStream;

public class Solution
{
    public static void main(String[] args)
    {
        //소수 구하는 가장 최적화 방법
        int n = 10;
        boolean[] arr = new boolean[n+1];

        arr[0] = arr[1] = true;

        for(int i=2; i*i<=n; i++)
        {
            if(!arr[i])
            {
                for(int j=i*i; j<=n; j+=i) {
                    arr[j] = true;
                }
            }
        }

        IntStream.range(0, arr.length).filter(i -> arr[i] == false).count();

    }
}
