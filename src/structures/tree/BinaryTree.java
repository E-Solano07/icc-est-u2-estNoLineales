package structures.tree;

import structures.Node;

public class BinaryTree<T extends Comparable<T>> {
    
    private Node<T> root;
    private int weight;

    public BinaryTree() {
        this.root = null;
        this.weight = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot(){
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        root = insertRecursivo(root, node);
        weight++;
    }

    private Node<T> insertRecursivo(Node<T> actual, Node<T> nuevo) {
        if (actual == null) {
            return nuevo;
        }
        if (nuevo.getValue().compareTo(actual.getValue()) < 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nuevo));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nuevo));
        }
        return actual;
    }

    public int getWeight() {
        return weight;
    }
    public void postOrder() {
        postOrderRecursivo(root);
        System.out.println();
    }

    private void postOrderRecursivo(Node<T> actual) {
        if (actual == null) return;
        
        postOrderRecursivo(actual.getLeft());
        postOrderRecursivo(actual.getRight());
        System.out.print(actual.getValue() + " ");
    }

    public void preOrder() {
        preOrderRecursivo(root);
        System.out.println();
    }

    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null) return;
        
        System.out.print(actual.getValue() + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void inOrder() {
        inOrderRecursivo(root);
        System.out.println();
    }

    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null) return;
        
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual.getValue() + " ");
        inOrderRecursivo(actual.getRight());       
    }

    public int height() {
        return heightRecursivo(root);
    }

    private int heightRecursivo(Node<T> actual) {
        if (actual == null) return 0;
        
        int leftHeight = heightRecursivo(actual.getLeft());
        int rightHeight = heightRecursivo(actual.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int weight() {
        return weightRecursivo(root);
    }

    private int weightRecursivo(Node<T> actual) {
        if (actual == null) return 0;
        
        int leftWeight = weightRecursivo(actual.getLeft());
        int rightWeight = weightRecursivo(actual.getRight());
        return 1 + leftWeight + rightWeight;
    }
}
