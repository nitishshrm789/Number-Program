import java.util.* ;
class Special_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		specialNumber(num) ;
	}
	public static void specialNumber(int num){
		int sum = 0;
		for(int i = num; i>0; i/=10){
			int rem = i % 10 ;
			int fact = Factorial(rem) ;
			sum += fact ;
		}
		if(sum == num){
			System.out.println("Strong Number or Special Number or Peterson Number") ;
		}
		else{
			System.out.println("Not a strong Number or Special Number or Peterson Number") ;
		}
	}
	public static int Factorial(int num){
		int fact = 1 ;
		for(int i=1; i<=num; i++){
			fact *= i ;
		}
		System.out.println(num+"! = "+fact) ;
		return fact ;
	}
}