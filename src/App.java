import java.util.Random;
import java.util.Set;
import collections.sets.Sets;
import models.Contacto;
import models.Person;
import structures.node.Node;
import structures.tree.BinaryTree;
import structures.tree.Ejercicio1;
import structures.tree.Ejercicio2;

public class App {

    public static void main(String[] args) {
        //runIntComparativaPesos();
        //runPersonTree();
        //runEjercicios();
        runSets();
    }

    private static void runSets() {
        Sets sets = new Sets();

        // Primera implementación: HashSet
        System.out.println("HashSet:");
        Set<String> hashSet = sets.HashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño: " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        // Segunda implementación: LinkedHashSet
        System.out.println("LinkedHashSet:");
        Set<String> lhSet = sets.construirLinkedHashSet();
        System.out.println(lhSet);
        System.out.println(lhSet.size());
        System.out.println(lhSet.contains("B"));

        // Tercera implementación: TreeSet
        System.out.println("TreeSet:");
        Set<String> tSet = sets.construirTreeSet();
        System.out.println(tSet);
        System.out.println(tSet.size());
        System.out.println(tSet.contains("B"));

        // Cuarta implementación: TreeSetConComparador
        System.out.println("TreeSetConComparador:");
        Set<Contacto> tCSet = sets.construirTreeSetConComparador();
        System.out.println(tCSet);
        System.out.println(tCSet.size());

        // Quinta implementación: ConstruirHashSet
        System.out.println("ConstruirHashSet:");
        Set<Contacto> hCSet = sets.construirHashSet();
        System.out.println(hCSet);
        System.out.println(hCSet.size());
    }

    private static void runIntComparativaPesos() {

        BinaryTree<Integer> tree = new BinaryTree<>();
        Random random = new Random();

        final int TOTAL = 50000;
        final int MIN = 1;
        final int MAX = 50000;

        for (int i = 0; i < TOTAL; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        long start1 = System.nanoTime();
        int w1 = tree.weight();
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        int w2 = tree.weight();
        long end2 = System.nanoTime();

        System.out.println("Nodos insertados: " + TOTAL);
        System.out.println("Peso: " + w1 + " / " + w2);
        System.out.println("Tiempo 1: " + (end1 - start1) / 1_000_000.0 + " ms");
        System.out.println("Tiempo 2: " + (end2 - start2) / 1_000_000.0 + " ms");
    }

    private static void runPersonTree() {

        BinaryTree<Person> tree = new BinaryTree<>();

        tree.insert(new Person("Alice", 30));
        tree.insert(new Person("Bob", 25));
        tree.insert(new Person("Diego", 35));
        tree.insert(new Person("Rafael", 35));

        System.out.println("Peso del árbol: " + tree.weight());

        System.out.print("InOrder: ");
        tree.inOrder();

        System.out.print("PreOrder: ");
        tree.preOrder();
    }

    private static void runEjercicios() {

        int[] numeros = {8, 7, 6, 5, 4, 3, 2};

        Ejercicio1 ejercicio1 = new Ejercicio1();
        BinaryTree<Integer> tree = ejercicio1.insert(numeros);

        ejercicio1.printTree(tree.getRoot());

        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.invert(tree.getRoot());

        System.out.println("Árbol invertido:");
        ejercicio1.printTree(tree.getRoot());
    }
}