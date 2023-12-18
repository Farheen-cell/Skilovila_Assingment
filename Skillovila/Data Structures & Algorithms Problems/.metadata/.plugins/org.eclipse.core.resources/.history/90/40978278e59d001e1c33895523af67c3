package problem1;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Check if the current node is balanced and its subtrees are balanced
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the height of the subtree
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // Return the height of the subtree rooted at the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Example usage:
        BalancedBinaryTree solution = new BalancedBinaryTree();

        // Constructing a balanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        boolean isTreeBalanced = solution.isBalanced(root);
        System.out.println("Is the tree balanced? " + isTreeBalanced);
    }
}
