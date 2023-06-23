public class Solution 
{
	public static long excelColumnNumber(String input) 
	{
		//Your code goes here
		long ans=0;
		for(int i = 0;i<input.length();i++){
			char  newchar = input.charAt(i);
			ans = ans * 26 + (newchar - 'A' + 1);
		}

		return ans;
	}
}