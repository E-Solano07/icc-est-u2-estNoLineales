import java.util.Random;
import models.Person;
import structures.tree.BinaryTree;
import structures.tree.intTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntComparativaPesos();
        runPersonTree();
    }

    private static void runIntComparativaPesos() {
        intTree tree = new intTree();
        Random random = new Random();

        final int TOTAL_NODOS = 50_000;
        final int MIN = 1;
        final int MAX = 50_000;

        for (int i = 0; i < TOTAL_NODOS; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        long inicioPesoVariable = System.nanoTime();
        int pesoVariable = tree.getWeight();
        long finPesoVariable = System.nanoTime();
        double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

        long inicioPesoRecursivo = System.nanoTime();
        int pesoRecursivo = tree.weight();
        long finPesoRecursivo = System.nanoTime();
        double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

        System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
        System.out.println("Peso usando variable: " + pesoVariable);
        System.out.println("Peso usando recursión: " + pesoRecursivo);
        System.out.println("Tiempo getPeso(): " + tiempoPesoVariableMs + "ms");
        System.out.println("Tiempo pesoRecursivo: " + tiempoPesoRecursivoMs + "ms");
    }

    private static void runPersonTree() {
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));

        System.out.println("Peso total del árbol de personas: " + personTree.getWeight());
        
        System.out.print("Recorrido In-Order): ");
        personTree.inOrder();
        
        System.out.print("Recorrido Pre-Order: ");
        personTree.preOrder();
    }
}
