import java.util.ArrayList;


public class Permutations {
	String input;
	ArrayList<String> permutations;
	Permutations(String _input)
	{
	    permutations = new ArrayList<String>();
		this.input = _input;
	}
	public void generatePerumatations()
	{
		_generatePermutations("", input);
		for(String permutation : permutations)
		{
			System.out.println(permutation);
		}
	}
	private void _generatePermutations(String prefix, String str)
	{
		int n = str.length();
		if(n == 0)
		{
			System.out.println(prefix);
			permutations.add(prefix);
		}
		else
		{
			for(int i = 0 ; i < n ;i++)
			{
				_generatePermutations(prefix + str.charAt(i), str.substring(0, i)+str.substring(i+1));
			}
		}
	}
	
	public static void main(String[] args)
	{
		
		Permutations p = new Permutations("ABCD");
		p.generatePerumatations();
	}

}
