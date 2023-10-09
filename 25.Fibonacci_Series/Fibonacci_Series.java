import java.util.Scanner ;
class Fibonacci_Series
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the number of Fibonacci series do you need : ") ;
		int end = scan.nextInt() ;

		fibonacciSeries(end) ;
	}
	public static void fibonacciSeries(int end){
		int n1=0, n2=1 , n3 ;
		for(int i=0; i<end; i++){
			n3 = n1+n2 ;
			System.out.print(n1+"  ") ;
			n1=n2 ;
			n2=n3 ;
		}
	}
}
