package structures.tree;

import structures.Node;

public class intTree {

    private Node<Integer> root;
    private int weight;

    public intTree() {
        this.root = null;
        this.weight = 0;
    }

    public boolean isEmpty() { return root == null; }
    public Node<Integer> getRoot() { return root; }
    public void setRoot(Node<Integer> node) { root = node; }

    public void insert(Integer value) {
        Node<Integer> node = new Node<>(value);
        root = insertRecursivo(root, node);
        weight++;
    }

    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nuevo) {
        if (actual == null) {
            return nuevo;
        }
        if (nuevo.getValue() < actual.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nuevo));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nuevo));
        }
        return actual;
    }

    public int getWeight() { return weight; }

    public void postOrder() {
        postOrderRecursivo(root);
        System.out.println();
    }

    private void postOrderRecursivo(Node<Integer> actual) {
        if (actual == null) return;
        postOrderRecursivo(actual.getLeft());
        postOrderRecursivo(actual.getRight());
        System.out.print(actual.getValue() + " ");
    }

    public void preOrder() {
        preOrderRecursivo(root);
        System.out.println();
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null) return;
        
        System.out.print(actual.getValue() + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void inOrder() {
        inOrderRecursivo(root);
        System.out.println();
    }

    private void inOrderRecursivo(Node<Integer> actual) {
        if (actual == null) return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual.getValue() + " ");
        inOrderRecursivo(actual.getRight());
    }

    public int height() { return heightRecursivo(root); }

    private int heightRecursivo(Node<Integer> actual) {
        if (actual == null) return 0;
        int leftHeight = heightRecursivo(actual.getLeft());
        int rightHeight = heightRecursivo(actual.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int weight() { return weightRecursivo(root); }

    private int weightRecursivo(Node<Integer> actual) {
        if (actual == null) return 0;
        return 1 + weightRecursivo(actual.getLeft()) + weightRecursivo(actual.getRight());
    }
}
