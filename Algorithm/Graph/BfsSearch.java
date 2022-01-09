package Graph;

import java.util.ArrayList;

public class BfsSearch {
	int count;
	boolean[] visited;
	ArrayList<Integer> queue;
	int[][] matrix;
	
	public BfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];
		queue = new ArrayList<>();
	}
	
	public void bfsTraversal() {
		queue.add(0);
		visited[0] = true;
		
		while (queue.isEmpty() == false) {
			int node = queue.remove(0);
			System.out.print(node + " ");
			
			for(int j = 0; j < count; j++) {
				if(matrix[node][j] != 0 && visited[j] == false) {
					queue.add(j);
					visited[j] = true;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		BfsSearch bfs = new BfsSearch(count);
		bfs.matrix = graph.getMatrix();
		bfs.bfsTraversal();
	}

}
