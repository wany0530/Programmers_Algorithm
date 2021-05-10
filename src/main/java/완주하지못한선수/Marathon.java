package main.java.완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;

public class Marathon {
	public static void main(String[] args) {
	}
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        //배열들 정렬하고
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        
        // 비교하고 다른영역을 추출
        for(i=1; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        
        return participant[i];
    }
}