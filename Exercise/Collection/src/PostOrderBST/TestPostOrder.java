package PostOrderBST;

public class TestPostOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        postorderTraversal(root);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        // Duyệt cây con bên trái
        postorderTraversal(root.left);

        // Duyệt cây con bên phải
        postorderTraversal(root.right);

        // Xử lý nút hiện tại
        System.out.println(root.val);
    }

}
