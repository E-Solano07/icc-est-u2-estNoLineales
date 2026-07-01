package structures.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import structures.node.Node;

public class Graph<T> {

    // COLLECTION DE NODOS
    // LIST ARRAY LIST LINKED LIST
    // Set<Node> nodes;
    // MAP HASH MAP TREE MAP
    
    // private Node root;

    private Map<Node<T>, Set<Node<T>>> graph;

    public Graph() {
        this.graph = new HashMap<Node<T>, Set<Node<T>>>();
        Map<Node<T>, Set <Node<T>>> g2 = new HashMap<Node<T>, Set<Node<T>>>();

        for (Node<T> node : graph.keySet()) {
            g2.put(node, graph.get(node));
        }
    }

    public void add(Node<T> node) {
        graph.putIfAbsent(node, new HashSet<Node<T>>());
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        graph.putIfAbsent(node, new HashSet<Node<T>>());
    }

    public void addEdge(T v1, T v2) {
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        add(nv1);
        add(nv2);
        graph.get(nv1).add(nv2);
        graph.get(nv2).add(nv1);
    }

    public void addEdgeUni(T v1, T v2) {
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        graph.get(nv1).add(nv2);
    }

    public void printGraph() {
        for (Map.Entry<Node<T>, Set<Node<T>>> entry : graph.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Node<T> coneccion : entry.getValue()) {
                System.out.print(coneccion);
            }
            System.out.println();
        }
    }
}
