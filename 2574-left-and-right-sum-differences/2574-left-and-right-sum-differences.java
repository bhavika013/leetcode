class Solution {
    public int[] leftRightDifference(int[] nums){
        int[] answer=new int[nums.length];
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum=totalsum+nums[i];
        }
        int leftsum=0;
        int rightsum;
        for(int i=0;i<nums.length;i++){
            rightsum=totalsum-leftsum-nums[i];
            answer[i]=Math.abs(leftsum-rightsum);
            leftsum=leftsum+nums[i];
        }
           return answer;
    }
}  
