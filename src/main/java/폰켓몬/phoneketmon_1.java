package main.java.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class phoneketmon_1 {
	public static void main(String[] args) {
		
	}
}

class Solution {
    public int solution(int[] nums) {
        int result = 0;
       HashSet<Integer> pk = new HashSet<Integer>();
		for(int i=1; i<nums.length; i++) {
			pk.add(nums[i]);
		}
        
		if(pk.size() > nums.length/2) {
			result = nums.length/2;
		}
        if(pk.size() <= nums.length/2){
            result = pk.size();
        }
        return result;
    }
}