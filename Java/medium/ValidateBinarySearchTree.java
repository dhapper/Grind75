class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }


    private boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;

        // Current node must be strictly greater than min and strictly less than max
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Left subtree: max is current node
        // Right subtree: min is current node
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

}