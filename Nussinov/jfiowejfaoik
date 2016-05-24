public class SecondaryRNA {
	public static int maxBasePair(String rna) {
		int n = rna.length(); // length of RNA sequence
		int[][] values = new int[n+1][n]; // number of total bonds for each subsequence
		for (int i=0;i<=5;i++) {
			for (int j=0;j<n;j++) {
				values[i][j] = 0; // 0 pairs for length 5 or less (no sharp turns)
			}
		}
		for (int i=6;i<n;i++) {
			for (int j=0;j<n-i+1;j++) { // builds up (DP)
				int max = values[i-1][j]; // if the last one doesn't pair up
				System.out.println(max);
				for (int k=j;k<i+j-5;k++) {
					System.out.println(k+" asdf "+rna.charAt(k)+" "+rna.charAt(i+j-1));
					if (complement(rna.charAt(k), rna.charAt(i+j-1))) { // Watson-Crick
						max = Math.max(max, values[k-j][j]+values[i-k+j-2][k+1]+1); // for each pairing of last element with another
						System.out.println(max+" "+ k);
					}
				}
				values[i][j] = max; 
				System.out.println(i+" "+j+" "+max);
			}
		}
		return values[n-1][0];
	}
	
	public static boolean complement(char a, char b) {
		return a=='A'&&b=='U' || a=='U'&&b=='A' || a=='G'&&b=='C' || a=='C'&&b=='G';
	}
	public static void main(String[] args) {
		System.out.println(maxBasePair("AUGCUUACGU"));
	}
}
