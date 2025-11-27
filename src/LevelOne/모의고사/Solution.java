package LevelOne.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Solution
{
    public int[] solution(int[] answers)
    {
        int[] firstPerson = {1,2,3,4,5};
        int[] secondPerson = {2,1,2,3,2,4,2,5};
        int[] thirdPerson = {3,3,1,1,2,2,4,4,5,5};
        int[] answer = {0,0,0};
        for(int start=0, end=answers.length; start<end; start++)
        {
            if(answers[start] == firstPerson[start%firstPerson.length])
                answer[0]++;
            if(answers[start] == secondPerson[start%secondPerson.length])
                answer[1]++;
            if(answers[start] == thirdPerson[start%thirdPerson.length])
                answer[2]++;
        }

        int max = Arrays.stream(answer).max().getAsInt();

        List<Integer> list = new ArrayList<>();
        for(int start=0, end=answer.length; start<end; start++)
        {
            if(answer[start] == max)
                list.add(start+1);
        }

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }

    public static void main(String[] args)
    {
        Solution s = new Solution();
        s.solution(new int[]{1,2,3,4,5});
    }
}
