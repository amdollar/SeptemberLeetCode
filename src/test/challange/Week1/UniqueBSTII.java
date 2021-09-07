package test.challange.Week1;

import java.util.ArrayList;
import java.util.List;

public class UniqueBSTII {

	public static void main(String[] args) {
		int number = 4;
		List<TreeNode> res = generateTrees(1, number);
	}

	private static List<TreeNode> generateTrees(int start, int end) {

		List<TreeNode> allTrees = new ArrayList();

		if (start > end) {
			allTrees.add(null);
			return allTrees;
		}

		for (int i = start; i <= end; i++) {
			List<TreeNode> leftTrees = generateTrees(start, i - 1);
			List<TreeNode> rightTrees = generateTrees(i + 1, end);

			for (TreeNode l : leftTrees) {
				for (TreeNode r : rightTrees) {
					TreeNode node = new TreeNode(i);
					node.left = l;
					node.right = r;
					allTrees.add(node);
				}
			}
		}

		return allTrees;
	}

	public List<TreeNode> generateTrees(int n) {

		return generateTrees(1, n);
	}

}
