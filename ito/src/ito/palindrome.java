package ito;

public class palindrome {

	public static void main(String[] args) {
		String s="basa";
		boolean git = checkpalindrome(s);
		System.out.println(git);

	}
	public static boolean checkpalindrome(String str)
	{
		String rev="";
		boolean ans = false;
		for(int i= str.length()-1;i>=0;i--)
		{
			rev+= str.charAt(i);
		}
		if(str.equals(rev))
		{
			ans = true;
		}
		return ans;
	}

}
