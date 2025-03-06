/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean traverse(TreeNode root, int targetSum, int currSum){
        if(root == null) return false;

        int sumTillHere = currSum + root.val;

        if(root.left == null && root.right == null){
            return sumTillHere == targetSum;
        }

        return (this.traverse(root.left, targetSum, sumTillHere) || this.traverse(root.right, targetSum, sumTillHere));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return this.traverse(root, targetSum, 0);
    }
}