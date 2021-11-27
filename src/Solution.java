public class Solution {
    public int twoSum(int []nums, int target) {
       final  int n=nums.length();
        for(int i=0;i<n;i++){
            if (nums[i]+nums[i+1]==target){
                System.out.println(i);
                System.out.println(i+1);
            }
        }

        return n;
    }

    class test{
        public static void main(String args[]){
            Solution obj=new Solution();
            System.out.println(obj.twoSum(1,1));
        }
    }
}
