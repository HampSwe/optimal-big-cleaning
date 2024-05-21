package cleaning;

import java.util.*;

public class Graph<T> {

    private final Collection<Node<T>> nodes = new LinkedList<>();

    public Node<T> addNode(T data) {
        Node<T> node = new Node<>(data, new LinkedList<>());
        nodes.add(node);
        return node;
    }

    public void connectNodes (Node<T> u, Node<T> v) {
        u.addNeighbour(v);
    }

    public Collection<Node<T>> getAllNodes() {
        return nodes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Graph(\n");

        for (Node<?> node : nodes) {
            stringBuilder.append(node.toString());
            stringBuilder.append("\n");
        }

        stringBuilder.append(")\n");

        return stringBuilder.toString();
    }

    private void resetGraph() {
        for (Node<T> node : nodes) {
            node.setVisited(false);
        }
    }
}

