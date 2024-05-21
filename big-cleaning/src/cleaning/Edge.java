package cleaning;

/**
 * Represents a directed edge
 * @param <W> Weight type
 * @param <N> Node type
 */
public class Edge<W, N> {
    N goingTo;
    W weight;

    public Edge(N goingTo, W weight) {
        this.goingTo = goingTo;
        this.weight = weight;
    }
}
