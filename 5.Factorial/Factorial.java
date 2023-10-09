import java.util.* ;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		Factorial1(num) ;
		Factorial2(num) ;
	}
	public static int Factorial1(int num){
		int fact = 1 ;
		for(int i=1; i<=num; i++){
			fact *= i ;
		}
		System.out.println(num+"! = "+fact) ;
		return fact ;
	}
	public static int Factorial2(int num){
		int fact = 1 ;
		for(int i=num; i>=1; i--){
			fact *= i ;
		}
		System.out.println(num+"! = "+fact) ;
		return fact ;
	}
}
