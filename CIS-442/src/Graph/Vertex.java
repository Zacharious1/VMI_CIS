package Graph;
import java.util.LinkedList;
import java.util.List;

public class Vertex {
    public String vertexName;
    public List<Edge> adj;
    int inDegree = 0;
    int topNum = 0;

    public Vertex(String vertexName) {
        this.vertexName = vertexName;
        adj = new LinkedList<>();

    }

    public String getVertexName() {
        return vertexName;
    }

    public int getInDegree() {
        return inDegree;
    }

    public int getTopNum() {
        return topNum;
    }

    public List<Edge> getAdj() {
        return adj;
    }
}
