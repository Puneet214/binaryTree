import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class bt {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        doInorder(root, ans);

        return ans;
    }

    public void doInorder(TreeNode node, List<Integer> ans) {

        if (node == null) {
            return;
        }

        doInorder(node.left, ans);

        ans.add(node.val);

        doInorder(node.right, ans);
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);

        a.right = b;
        b.left = c;

        bt obj = new bt();

        List<Integer> result = obj.inorderTraversal(a);

        System.out.println(result);
    }
}
