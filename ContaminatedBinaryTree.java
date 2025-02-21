import java.util.HashSet;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class FindElements {
    private Set<Integer> values;

    public FindElements(TreeNode root) {
        values = new HashSet<>();
        recoverTree(root, 0);
    }

    private void recoverTree(TreeNode node, int value) {
        if (node == null) return;

        node.val = value;
        values.add(value);

        recoverTree(node.left, 2 * value + 1);
        recoverTree(node.right, 2 * value + 2);
    }

    public boolean find(int target) {
        return values.contains(target);
    }
}
