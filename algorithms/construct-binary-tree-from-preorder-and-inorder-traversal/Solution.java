// Source: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

/*
Given preorder and inorder traversal of a tree, construct the binary tree.
Note:
You may assume that duplicates do not exist in the tree.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null
                || preorder.length != inorder.length)
            return null;
        
        return buildTree(preorder, inorder, 0, 0, preorder.length);
    }
    
	public TreeNode buildTree(int[] preorder, int[] inorder, 
            int pOffset, int iOffset, int len) {
        if (len <= 0) return null;
        
        int val = preorder[pOffset];
        TreeNode root = new TreeNode(val);
        
        int idx = -1;
        for (int i = iOffset; i < iOffset + len; i++) {
            if (inorder[i] == val) {
                idx = i;
                break;
            }
        }
        root.left = buildTree(preorder, inorder, pOffset + 1, iOffset, idx - iOffset);
        root.right = buildTree(preorder, inorder, 
                pOffset + idx - iOffset + 1, idx + 1, len - idx + iOffset - 1);
        
        return root;
    }
}

