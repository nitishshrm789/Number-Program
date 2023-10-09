import java.util.* ;
class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		checkPalindrome(num) ;
	}
	public static void checkPalindrome(int num){
		int rev = reverse(num) ;
		if(num == rev){
			System.out.println("Palindrome Number") ;
		}
		else{
			System.out.println("Not a Palindrome number") ;
		}
	}
	public static int reverse(int num){
		int rev=0 ;
		for(int i=num; i>0; i/=10){
			int rem=i%10 ;
			rev=rev*10+rem ;
		}
		System.out.println("rev("+num+") = "+rev) ;
		return rev ;
	}
}