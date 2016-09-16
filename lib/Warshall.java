	public static int[][] warshall(int n, int[][]matrix) {
		int[][] ans = matrix;
		for(int i=0; i<n; i++) {
			ans[i][i] = 0;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					ans[j][k] = Math.min(ans[j][k], ans[j][i]+ans[i][k]);
				}
			}
		}
		return ans;
	}
