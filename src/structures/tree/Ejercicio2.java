package structures.tree;

import structures.node.Node;

public class Ejercicio2 {

    public void invert(Node<Integer> root) {
        invertRec(root);
    }

    private void invertRec(Node<Integer> node) {
        if (node == null) return;

        Node<Integer> temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);

        invertRec(node.getLeft());
        invertRec(node.getRight());
    }
}