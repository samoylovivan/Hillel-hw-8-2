package ivan.samoylov;

import static ivan.samoylov.TreeNode.*;

public class Main {

    public static void main(String[] args) {

      TreeNode root1 = newNode(1);
      root1.left = newNode(3);
      root1.right = newNode(2);
      root1.left.left = newNode(5);

      TreeNode root2 = newNode(2);
      root2.left = newNode(1);
      root2.right = newNode(3);
      root2.left.right = newNode(4);
      root2.right.right = newNode(7);

      TreeNode root3 = mergeTrees(root1, root2);
      System.out.println("Merged binary trees: ");
      inOutputOrder(root3);
    }
}

