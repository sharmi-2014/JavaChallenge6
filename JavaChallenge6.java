package javachallenge;

import java.util.Arrays;

public class JavaChallenge6 {
	public static void main(String[] args) {
		int[] nums= {3,2,3};
		int[] nums1= {2,2,1,1,1,2,2};
		
		Arrays.sort(nums);
		for(int i=0;i<(nums.length/2)+1;i++)
		{
			if(nums[i]>=nums[i+1]) {
				System.out.println(nums[i]+ " is the majority element");
				break;
			}
		}
		for(int i=0;i<(nums1.length/2)+1;i++)
		{
			if(nums1[i]>=nums1[i+1])
			{
				System.out.println(nums1[i]+ " is the majority element");
				break;
			}
		}
		
	}

}
