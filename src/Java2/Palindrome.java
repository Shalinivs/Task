package Java2;

public class Palindrome {

	 static void polindrome() {
		// TODO Auto-generated method stub
		
		String s1="MOM";
		String rev=" ";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("it is a polindrome");
		}
			else
			{
				System.out.println("it is not a polindrome");
			}
	 }
			public static void main(String[] args)
			
			{
				polindrome();
			}
			
			

	}


