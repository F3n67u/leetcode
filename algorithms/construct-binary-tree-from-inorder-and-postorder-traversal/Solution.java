// Source: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

/*
Given inorder and postorder traversal of a tree, construct the binary tree.

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null
                || inorder.length != postorder.length)
            return null;
        
        return buildTree(inorder, postorder, 0, 0, inorder.length);
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder, 
            int iOffset, int pOffset, int len) {
        if (len <= 0) return null;
        
        int val = postorder[pOffset + len - 1];
        TreeNode root = new TreeNode(val);
        
        int idx = -1;
        for (int i = iOffset; i < iOffset + len; i++) {
            if (inorder[i] == val) {
                idx = i;
                break;
            }
        }
        root.left = buildTree(inorder, postorder, iOffset, pOffset, idx - iOffset);
        root.right = buildTree(inorder, postorder, idx + 1, pOffset + idx - iOffset, len + iOffset - idx -1);
        
        return root;
    }
}
