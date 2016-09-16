	public static int[] dijkstra(int n, int start, int[][] matrix) {
		boolean[] defnode = new boolean[n];
		int[] cost = new int[n];
		for(int i=0; i<n; i++) {
			defnode[i] = false;
			cost[i] = Integer.MAX_VALUE;
		}
		cost[start] = 0;
		int node = start;
		int counter = 0;
		while(true) {
			counter++;
			if(counter == n || node == Integer.MAX_VALUE) return cost;
			defnode[node] = true;
			for(int i=0; i<n; i++) {
				if(defnode[i]) continue;
				if(matrix[node][i] == Integer.MAX_VALUE) continue;
				cost[i] = Math.min(cost[i], cost[node]+matrix[node][i]);
			}
			int minnode = Integer.MAX_VALUE;
			int mincost = Integer.MAX_VALUE;
			for(int i=0; i<n; i++) {
				if(defnode[i]) continue;
					if(cost[i] < mincost) {
						minnode = i;
						mincost = cost[i];
					}
				}
			node = minnode;
		}
	}
