public class BitSwap
{
	public static int swapInt(int toSwap)
	{
		if(toSwap <= 0)
			return 0;
		StringBuilder output = new StringBuilder();
		String input = Integer.toBinaryString(toSwap);
		System.out.println(input);
		int startIndex = 0 ;
		//Following if checks whether the oldest bit has to be swapped
		//with a leading zero
		if(input.length() % 2 == 1)
		{
			output.append(1);
			output.append(0);
			startIndex += 1;
		}


		for(int i = startIndex; i < input.length(); i+=2)
		{
			output.append(input.charAt(i+1));

			output.append(input.charAt(i));
			System.out.println(i + " " + input.charAt(i+1) +" "+  input.charAt(i));
		}
		System.out.println(output);
		return Integer.parseInt(new String(output), 2);

	}

	public static void main(String[] args) {
		System.out.println(swapInt(0));
	}
}