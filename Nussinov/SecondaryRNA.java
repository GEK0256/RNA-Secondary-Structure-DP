public class SecondaryRNA {
	public static int maxBasePair(String rna) {
		int n = rna.length(); // length of RNA sequence
		int[][] values = new int[n][n]; // number of total bonds for each subsequence
		for (int i=0;i<4;i++) {
			for (int j=0;j<n;j++) {
				values[i][j] = 0; // 0 pairs for length 4 or less (no sharp turns)
			}
		}
		for (int i=4;i<n;i++) {
			for (int j=0;j<n-i;j++) { // builds up (DP)
				int max = values[i-1][j]; // if the last one doesn't pair up
				for (int k=0;k<i+j-4;k++) {
					if (complement(rna.charAt(k), rna.charAt(i+j))) { // Watson-Crick
						max = Math.max(max, values[k+1][0]+values[i+j-k][k+1]+1); // for each pairing of last element with another
					}
				}
				values[i][j] = max; 
			}
		}
		return values[n-1][0];
	}
	
	public static boolean complement(char a, char b) {
		return a=='A'&&b=='U' || a=='U'&&b=='A' || a=='G'&&b=='C' || a=='C'&&b=='G';
	}
	public static void main(String[] args) {
		System.out.println(maxBasePair("AUGCUACGU"));
	}
}
