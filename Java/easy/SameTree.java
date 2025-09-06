package easy;

public class SameTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        return isEqual(p, q);

    }

    public boolean isEqual(TreeNode x, TreeNode y) {

        if (x == null && y == null)
            return true;

        if (x == null || y == null)
            return false;

        if (x.val != y.val)
            return false;

        return isEqual(x.left, y.left) && isEqual(x.right, y.right);
    }
}