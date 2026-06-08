public class Treenodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Preorder: Root Left Right
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder: Left Root Right
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder: Left Right Root
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(15);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(9);

        root.right.left = new Node(7);
        root.right.right = new Node(4);

        System.out.println("Binary Tree:");
        System.out.println("          " + root.data);
        System.out.println("         /  \\");
        System.out.println("       " + root.left.data + "    " + root.right.data);
        System.out.println("      / \\   / \\");
        System.out.println("     " + root.left.left.data + "   "
                + root.left.right.data + " "
                + root.right.left.data + "   "
                + root.right.right.data);

        System.out.println("\n\nPreorder Traversal:");
        preorder(root);

        System.out.println("\n\nInorder Traversal:");
        inorder(root);

        System.out.println("\n\nPostorder Traversal:");
        postorder(root);
    }
}