import java.util.Scanner;  
class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length*2;i++){
             arr[i] = nums[i%nums.length];   
        }
      
        return arr;
    }
}
