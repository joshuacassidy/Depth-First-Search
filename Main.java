public class Main {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");

        v1.addAdjacency(v2);
        v1.addAdjacency(v3);
        v2.addAdjacency(v4);
        v3.addAdjacency(v4);
        v3.addAdjacency(v4);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.search(v1);
    }

}
