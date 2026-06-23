package structures.tree;

import structures.node.Node;

public class Ejercicio1 {

    public BinaryTree<Integer> insert(int[] numeros) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        int medio = numeros.length / 2;
        tree.insert(numeros[medio]);

        for (int i = 1; i <= medio; i++) {

            int izq = medio - i;
            if (izq >= 0) {
                tree.insert(numeros[izq]);
            }

            int der = medio + i;
            if (der < numeros.length) {
                tree.insert(numeros[der]);
            }
        }

        return tree;
    }

    public void printTree(Node<Integer> root) {
        System.out.println("Árbol:");
        printTreeRec(root, 0);
        System.out.println();
    }

    private void printTreeRec(Node<Integer> node, int space) {
        if (node == null) return;
            space += 2;

        printTreeRec(node.getRight(), space);
    
        System.out.println();
        for (int i = 2; i < space; i++) {
            System.out.print(" ");
        }

        System.out.println(node.getValue());

        printTreeRec(node.getLeft(), space);
    }
}