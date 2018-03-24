import java.util.Stack;

public class DepthFirstSearch {


    public void search(Vertex rootVertex) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(rootVertex);

        while (!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.print(" " +actualVertex.getName());
            for( Vertex v: actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }

    public void recursiveSearch(Vertex vertices) {
        System.out.print(vertices.getName() + " ");

        for (Vertex vertex : vertices.getNeighbourList()) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                recursiveSearch(vertex);
            }
        }


    }


}
