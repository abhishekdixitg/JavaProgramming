package M4;

public class MaxProdutSubArray {
	public static void main(String[] args) {

		int[] nums = { 2, 3, -2, 4 };
		System.out.println("Maximum Product Subarray: " + maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		int currMax = nums[0];
		int currMin = nums[0];
		int maxSoFar = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			if (num < 0) {
				int temp = currMax;
				currMax = currMin;
				currMin = temp;

			}

			currMax = Math.max(num, currMax * num);
			currMin = Math.min(num, currMin * num);
			maxSoFar = Math.max(maxSoFar, currMax);
		}

		return maxSoFar;

	}
}
