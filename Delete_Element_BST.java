
class TreeNode1{
    int value;
    TreeNode1 left, right;

    TreeNode1(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode1 root;

    // Method to delete a node from the BST
    TreeNode1 deleteNode(TreeNode1 root, int key) {
        if (root == null) {
            return root; // Tree is empty
        }

        // Recur down the tree
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else { // Node to be deleted found
            // Case 1: Node has only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node has two children
            root.value = minValue(root.right); // Get in-order successor
            root.right = deleteNode(root.right, root.value); // Delete successor
        }
        return root;
    }

    // Helper method to find the minimum value in a subtree
    int minValue(TreeNode1 root) {
        int minValue = root.value;
        while (root.left != null) {
            root = root.left; // Find leftmost leaf
        }
        return root.value;
    }

    // Method to insert a new value into the BST
    TreeNode1 insert(TreeNode1 root, int value) {
        if (root == null) {
            root = new TreeNode1(value);
            return root; // If the tree is empty, create a new node
        }

        if (value < root.value) {
            root.left = insert(root.left, value); // Recur on left subtree
        } else if (value > root.value) {
            root.right = insert(root.right, value); // Recur on right subtree
        }

        return root; // Return the unchanged node pointer
    }

    // In-order traversal of the tree
    void inorderTraversal(TreeNode1 root) {
        if (root != null) {
            inorderTraversal(root.left); // Recur on left subtree
            System.out.print(root.value + " "); // Print root value
            inorderTraversal(root.right); // Recur on right subtree
        }
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree(); // Create the BST

        // Insert values into the BST
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        // Display the BST before deletion
        System.out.println("In-order traversal of the BST:");
        bst.inorderTraversal(bst.root);
        System.out.println();

        // Delete node with value 50
        int key = 50;
        System.out.println("Deleting node with value " + key);
        bst.root = bst.deleteNode(bst.root, key);

        // Display the BST after deletion
        System.out.println("In-order traversal after deletion:");
        bst.inorderTraversal(bst.root);
        System.out.println();
    }
}