package Arrays;
public class SearchInRotatedSortedArray {
	public static int search(int[] nums, int target) {
		for(int i=0; i<nums.length; i++){
			if(target==nums[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args){
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.print(search(nums, target));
	}
}
