import java.util.* ;
class Alternative_Addition_Of_A_Number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		alternativeAddition(num) ;
	}
	public static void alternativeAddition(int num){
		int sum=0 ;
		for(int i=num; i>0; i/=100){
			int rem = i % 10 ;
			System.out.print(rem+" + ") ;
			sum += rem ;
		}
		System.out.print(" = "+sum) ;
	}
}
