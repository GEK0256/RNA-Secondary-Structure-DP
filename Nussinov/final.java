// Haron Adbaru, Guang Cui, Annie Zhao

public class SecondaryRNA {
	// actual method that takes an RNA string and computes the maximum number of base pairs
	public static int maxBasePair(String rna) {
		int n = rna.length(); // length of RNA sequence
		int[][] values = new int[n+1][n]; // number of total bonds for each subsequence (DP array)
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j<n; j++) {
				values[i][j] = 0; // 0 pairs for length 5 or less (no sharp turns)
			}
		}
		for (int i = 6; i < n+1; i++) { // i is the length
			for (int j = 0; j < n-i+1; j++) { // j is the starting position
				int max = values[i-1][j]; // if the last one doesn't pair up
				for (int k = j; k < i+j-5; k++) { // if the last one pairs up with something
					if (complement(rna.charAt(k), rna.charAt(i+j-1))) { // Watson-Crick
						max = Math.max(max, values[k-j][j]+values[i-k+j-2][k+1]+1); 
						// for each pairing of last element with another
					}
				}
				values[i][j] = max; // stores maximum into array
			}
		}
		return values[n][0]; // final answer
	}
	
	// helper method that determines whether two characters are complements (Watson-Crick)
	public static boolean complement(char a, char b) {
		return a=='A'&&b=='U' || a=='U'&&b=='A' || a=='G'&&b=='C' || a=='C'&&b=='G';
	}
	
	// main method: this specific case returns 11, which is the right answer
	public static void main(String[] args) {
		System.out.println(maxBasePair("GUCGAUUGAGCGAAUGUAACAACGUGGCUACGGCGAGA")); // example RNA string
	}
}
