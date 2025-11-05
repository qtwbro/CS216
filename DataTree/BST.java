package DataTree;

class BST {
    Node root;
    // Insert a new node
    Node insert(Node root, int value) {
        if (root == null) {
        root = new Node(value);
        return root;
    }
    if (value < root.data)
        root.left = insert(root.left, value);
        else if (value > root.data)
        root.right = insert(root.right, value);
        return root;
    }
// Search a value
    boolean search(Node root, int value) {
        if (root == null) return false;
        if (root.data == value) return true;
        if (value < root.data)
        return search(root.left, value);
        else
        return search(root.right, value);
    }
// Inorder traversal (sorted)
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int v : values) tree.root = tree.insert(tree.root, v);
        System.out.print("Inorder (sorted): ");
        tree.inorder(tree.root);
        System.out.println("\nSearch 7: " + tree.search(tree.root, 7));
        System.out.println("Search 9: " + tree.search(tree.root, 9));
    }
}

