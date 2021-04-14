package Graph;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Graph {
    public Map<String, Vertex> vertexMap;
    public Graph() {
        vertexMap = new HashMap<>();
    }

    public Vertex getVertex(String vertexName) {
        Vertex vertex = vertexMap.get(vertexName);
        if (vertex == null){
            vertex = new Vertex(vertexName);
            vertexMap.put(vertexName, vertex);
        }

        return vertex;
    }

    public void printGraph() {
        Set<Map.Entry<String, Vertex>> entries = vertexMap.entrySet();
        for (Map.Entry<String, Vertex> thisPair: entries) {
            List<Edge> value = thisPair.getValue().getAdj();
            String a = thisPair.getKey();
            for (Edge edge : value) {
                String b = edge.getDestination().getVertexName();
                double c = edge.getCost();
                System.out.println("There is a direct edge between " + a + " and " + b + " with a cost of " + c);
            }
        }
    }

    public String readFile(){ //Copied from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
        String content = "";
        try {
            content = new String (Files.readAllBytes(Paths.get("C:/Users/ZachariousFTW/OneDrive - Virginia Military Institute/Documents/CIS-442/Graph.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        } return content;
    }

    public void addEdge(String sourceName, String destName, double cost) {
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        String a = g.readFile();
        a = a.replaceAll("\\s", "");
        for (int i = 0; i < a.length(); i++) {
            double v = Double.parseDouble(a.substring(i + 2, i + 4));
            g.addEdge(a.substring(i, i + 1), a.substring(i + 1, i + 2), v);
            i += 3;
        }
        g.printGraph();
    }
}
