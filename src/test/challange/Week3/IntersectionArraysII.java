package test.challange.Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArraysII {

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 2, 1 };
		int[] nums2 = new int[] { 2, 2 };
		int[] res = intersect(nums1, nums2);
		for (int i : res)
			System.out.println(i);
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		List<Integer> res = new ArrayList<>();
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				res.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j])
				i++;
			else if (nums1[i] > nums2[j])
				j++;
		}
		int result[] = new int[res.size()];
		for (int k = 0; k < res.size(); k++)
			result[k] = res.get(k);
		return result;
	}

}
