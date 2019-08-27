package ivan.samoylov;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int x, TreeNode l, TreeNode r){
        this.value = x;
        this.left = l;
        this.right = r;
    }

    static TreeNode newNode(int x)
    {
        return new TreeNode(x, null, null);
    }

    public static void inOutputOrder(TreeNode node)
    {
        if (node == null)
            return;
        inOutputOrder(node.left);
        System.out.printf("%d ", node.value);
        inOutputOrder(node.right);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.value += t2.value;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
