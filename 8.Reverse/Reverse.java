import java.util.* ;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		reverse(num) ;
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
