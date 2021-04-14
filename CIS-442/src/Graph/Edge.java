package Graph;

public class Edge {
    Vertex destination;
    double cost;

    public Edge(Vertex v, double cost) {
        this.destination = v;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public Vertex getDestination() {
        return destination;
    }
}
