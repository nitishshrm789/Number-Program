import java.util.* ;
class Neon_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.print("Enter a number : ") ;
		int num = scan.nextInt() ;

		checkNeonNumber(num) ;
	}
	public static void checkNeonNumber(int num){
		int sq = num * num ;
		int sum = sumOfDigits(sq) ;
		if(sum == num){
			System.out.println("Neon Number") ;
		}
		else{
			System.out.println("Not a Neon Number") ;
		}
	}
	public static int sumOfDigits(int num){
		int sum = 0 ;
		for(int i=num; i>0 ; i /= 10){
			int rem = i % 10 ;
			sum += rem ;
		}
		return sum ;
	}
}
