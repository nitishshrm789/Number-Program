import java.util.* ;
class Difference_Between_Consecutive_Digits_Of_A_Number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		diffBetweenConsecutiveDigits(num) ;
	}
	public static void diffBetweenConsecutiveDigits(int num){
		int last ;
		for(int i=num; i>9; ){
			last = i%10 ;
			i /=10 ;
			int secLast = i%10 ;
			int diff = last-secLast ;
			System.out.println(last+" - "+secLast+" = "+diff) ;
		}
	}
}
