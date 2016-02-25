import java.util.*;

/**
 * Created by MHDante on 2016-02-09.
 */
public class DFS {


    public static class Graph{

        //TreeMap is used to map vertices to Adjacency Lists. The lists are stored as TreeSets for ordering, uniqueness and log(n) retrieval.
        private TreeMap<String, TreeSet<String>> graph = new TreeMap<>();

        //Adds a vertex with a given name to the graph.
        public void addVertex(String name){
            if(!graph.containsKey(name)) graph.put(name, new TreeSet<String>());
        }

        //Adds an edge to the graph. Throws an exception if the Vertices don't exist. Two nodes can only share one edge.
        public void addEdge(String vertex1, String vertex2){
            if(!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) throw new NoSuchElementException();
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }
        //Returns an alphabetically ordered Array of Strings representing the vertices connected to the given vertex.
        public String[] getNeighbours(String vertex){
            if(!graph.containsKey(vertex)) throw new NoSuchElementException();
            TreeSet<String> neighbours = graph.get(vertex);
            return neighbours.toArray(new String[neighbours.size()]);
        }
        //Returns true if there is an edge between vertex1 and vertex2;
        public boolean areConnected(String vertex1, String vertex2){
            if(!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) throw new NoSuchElementException();
            return graph.get(vertex1).contains(vertex2) && graph.get(vertex2).contains(vertex1);
        }
        //Returns an alphabetically ordered Array of Strings representing all the vertices in the graph.
        public String[] getVertices(){
            Set<String> vertices = graph.keySet();
            return vertices.toArray(new String[vertices.size()]);
        }

    }

    public static HashSet<String> visited = new HashSet<>();
    public static Graph g = new Graph();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            g.addVertex(sc.next());
        }
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            String v1 = tokens[0];
            for (int j = 2; j < tokens.length; j++) {
                String v2 = tokens[j];
                g.addEdge(v1, v2);
            }
        }


        //Do your thing!
        for (String v : g.getVertices()) {
          nodeTraverse(v);
        }

    }

    public static void nodeTraverse(String vertex) {
      if (!visited.contains(vertex)) {
        System.out.println(vertex);
        visited.add(vertex);
        String[] neighbours = g.getNeighbours(vertex);

        if (neighbours.length > 0) {
          for (String v : neighbours) {
            nodeTraverse(v);
          }
        }
        
      }
    }

}
