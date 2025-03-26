Binary_insert :

class Binaryinsert {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    public Binaryinsert() {
        root = null;
    }

    public Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public Boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Binaryinsert tree = new Binaryinsert();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("Inorder traversal of the BST: ");
        tree.inorder(tree.root);
        System.out.println();

        int keyToSearch = 40;
        System.out.println("Searching for node with key: " + keyToSearch);
        if (tree.search(tree.root, keyToSearch)) {
            System.out.println("Node with key " + keyToSearch + " found.");
        } else {
            System.out.println("Node with key " + keyToSearch + " not found.");
        }

        keyToSearch = 90;
        System.out.println("Searching for node with key: " + keyToSearch);
        if (tree.search(tree.root, keyToSearch)) {
            System.out.println("Node with key " + keyToSearch + " found.");
        } else {
            System.out.println("Node with key " + keyToSearch + " not found.");
        }
    }
}

