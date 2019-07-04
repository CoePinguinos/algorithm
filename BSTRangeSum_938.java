class BSTRangeSum_938 {
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        helper(root, L, R);
        return ans;
    }
    
    private void helper(TreeNode root, int L, int R) {
        if (root == null) return;
        if (root.val >= L && root.val <= R) 
            ans += root.val; 
      
        if (root.val > L) 
            helper(root.left, L, R);
        
        if (root.val < R) 
            helper(root.right, L, R);
        
    }
}