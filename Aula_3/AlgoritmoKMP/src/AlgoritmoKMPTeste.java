
public class AlgoritmoKMPTeste {
	static AlgoritmoKMP teste;
	
	public static void main(String[] args)
	{
		String text = "ABCABAABCABAC";
		String pattern = "ABA";

		teste.KMP(text, pattern);
	}
}
