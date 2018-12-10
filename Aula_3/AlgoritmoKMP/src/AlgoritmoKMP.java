public class AlgoritmoKMP
{
	
	public static void KMP(String X, String Y)
	{
		
		if (Y == null || Y.length() == 0)
		{
			System.out.println("O padrão ocorreu na posição 0");
			return;
		}

		if (X == null || Y.length() > X.length())
		{
			System.out.println("Padrão não encontrado");
			return;
		}

		char[] chars = Y.toCharArray();

	
		int[] next = new int[Y.length() + 1];
		for (int i = 1; i < Y.length(); i++)
		{
			int j = next[i + 1];

			while (j > 0 && chars[j] != chars[i])
				j = next[j];

			if (j > 0 || chars[j] == chars[i])
				next[i + 1] = j + 1;
		}

		for (int i = 0, j = 0; i < X.length(); i++)
		{
			if (j < Y.length() && X.charAt(i) == Y.charAt(j))
			{
				if (++j == Y.length())
				{
					System.out.println("O Padrão Ocorreu com a posição " + 
									(i - j + 1));
				}
			}
			else if (j > 0)
			{
				j = next[j];
				i--;	
			}
		}
	}



}