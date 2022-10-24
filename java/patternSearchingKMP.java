
public class patternSearchingKMP {
	// JAVA program for implementation of KMP pattern
	// searching algorithm

	 
		void KMPSearch(String pat, String txt)
		{
			int M = pat.length();
			int N = txt.length();

			// create l p s[] that will hold the longest
			// prefix suffix values for pattern
			int lps[] = new int[M];
			int j = 0; // index for pat[]

			// Pre process the pattern (calculate lps[]
			// array)
			computeLPSArray(pat, M, lps);

			int i = 0; // index for t x t[]
			while (i < N) {
				if (pat.charAt(j) == txt.charAt(i)) {
					j++;
					i++;
				}
				if (j == M) {
					System.out.println("Found pattern "
									+ "at index " + (i - j));
					j = lps[j - 1];
				}

				// mismatch after j matches
				else if (i < N && pat.charAt(j) != txt.charAt(i)) {
					// Do not match l p s[0..l p s[j-1]] characters,
					// they will match anyway
					if (j != 0)
						j = lps[j - 1];
					else
						i = i + 1;
				}
			}
		}

		void computeLPSArray(String pat, int M, int lps[])
		{
			// length of the previous longest prefix suffix
			int len = 0;
			int i = 1;
			lps[0] = 0; // l p s[0] is always 0

			// the loop calculates l p s[i] for i = 1 to M-1
			while (i < M) {
				if (pat.charAt(i) == pat.charAt(len)) {
					len++;
					lps[i] = len;
					i++;
				}
				else // (pat[i] != pat[l e n])
				{
					// This is tricky. Consider the example.
					// AAACAAAA and i = 7. The idea is similar
					// to search step.
					if (len != 0) {
						len = lps[len - 1];

						// Also, note that we do not increment
						// i here
					}
					else // if (l e n == 0)
					{
						lps[i] = len;
						i++;
					}
				}
			}
		}

		// Driver program to test above function
		public static void main(String args[])
		{
			String txt = "ABABDABACDABABCABAB";
			String pat = "ABABCABAB";
			new patternSearchingKMP().KMPSearch(pat, txt);
		}
	}
	



