package cleaning;

import java.util.Collection;

public class Node <T> {

    private final T data;
    private final Collection<Node<T>> neighbours;
    private boolean visited = false;

    public Node(T data, Collection<Node<T>> collection) {
        this.data = data;
        this.neighbours = collection;
    }

    public void addNeighbour(Node<T> node) {
        neighbours.add(node);
    }

    public void addMultipleNeighbours(Collection<Node<T>> nodes) {
        neighbours.addAll(nodes);
    }

    public T getData() {
        return data;
    }

    public Collection<Node<T>> getNeighbours() {
        return neighbours;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return ((Node<?>) obj).data.equals(data);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Node (");
        stringBuilder.append(data.toString());
        stringBuilder.append(") -> [");

        if (!neighbours.isEmpty()) {

            for (var node : neighbours) {
                stringBuilder.append(node.data.toString() + ", ");
            }

            stringBuilder.setLength(stringBuilder.length() - 2);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();

    }
}
