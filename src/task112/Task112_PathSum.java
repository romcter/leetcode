package task112;

public class Task112_PathSum {

    public static void main(String[] args) {

        TreeNode leftNode = new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null);
        TreeNode rightNode = new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)));
        TreeNode rootNode = new TreeNode(5,leftNode, rightNode);

        System.out.println(hasPathSum(rootNode, 22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null)
            return false;

        if(root.val == targetSum && root.left == null && root.right == null)
            return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }




     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
}
