package structures.tree;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        root = insertRecursivo(root, node);
    }

    private Node<T> insertRecursivo(Node<T> actual, Node<T> nuevo) {
        if (actual == null) return nuevo;

        if (nuevo.getValue().compareTo(actual.getValue()) < 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nuevo));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nuevo));
        }

        return actual;
    }

    // 🔥 tamaño real del árbol
    public int weight() {
        return weightRecursivo(root);
    }

    private int weightRecursivo(Node<T> actual) {
        if (actual == null) return 0;
        return 1 + weightRecursivo(actual.getLeft()) + weightRecursivo(actual.getRight());
    }

    public int height() {
        return heightRecursivo(root);
    }

    private int heightRecursivo(Node<T> actual) {
        if (actual == null) return 0;

        return Math.max(
                heightRecursivo(actual.getLeft()),
                heightRecursivo(actual.getRight())
        ) + 1;
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node<T> n) {
        if (n == null) return;
        inOrderRec(n.getLeft());
        System.out.print(n.getValue() + " ");
        inOrderRec(n.getRight());
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node<T> n) {
        if (n == null) return;
        System.out.print(n.getValue() + " ");
        preOrderRec(n.getLeft());
        preOrderRec(n.getRight());
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node<T> n) {
        if (n == null) return;
        postOrderRec(n.getLeft());
        postOrderRec(n.getRight());
        System.out.print(n.getValue() + " ");
    }
}