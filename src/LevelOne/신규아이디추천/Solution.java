package LevelOne.신규아이디추천;

public class Solution
{
    public static void main(String[] args)
    {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        // 1단계 : 소문자로 지환.
        String tempId = new_id.toLowerCase();

        // 2단계 : 불필요 문자 제거
        tempId = tempId.replaceAll("[^a-z0-9._-]", "");

        // 3단계 : 연속된 . 치환
        tempId = tempId.replaceAll("\\.+", ".");
//        String continueDot = "..";
//        while(tempId.contains(continueDot))
//        {
//            tempId = tempId.replace(continueDot, ".");
//        }

        // 4단계 : 시작과 끝 . 제거
        tempId = removeEndPointDot(tempId);
        if(tempId.isEmpty())
        {
            tempId = "a";
        }

        // 5단계 : 15글자 이상이면 자르기.
        if(tempId.length() > 15)
        {
            tempId = tempId.substring(0, 15);
        }

        // 6단계 : 다시 양 끝 . 제거.
        tempId = removeEndPointDot(tempId);

        // 7단계 : 문자열 길이가 2 이하면  new_id의 마지막 문자를 new_id의 길이가  3이 될때까지  반복
        while (tempId.length() < 3)
        {
            tempId += tempId.charAt(tempId.length() - 1);
        }

        System.out.println("tempId = " + tempId);
    }

    private static String removeEndPointDot(String tempId)
    {
        if(tempId.startsWith("."))
        {
            tempId = tempId.substring(1);
        }
        if(tempId.endsWith("."))
        {
            tempId = tempId.substring(0, tempId.length()-1);
        }
        return tempId;
    }
}
