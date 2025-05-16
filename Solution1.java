package Theme4;

import java.util.Scanner;

class Solution1 {
    static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.value);
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        var tree = new Solution1();
        var scanner = new Scanner(System.in);
        var root = (Node) null;
        while (true) {
            var number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            root = tree.insert(root, number);
        }
        tree.inorderTraversal(root);
    }
}
