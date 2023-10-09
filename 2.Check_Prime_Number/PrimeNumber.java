import java.util.* ;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.print("Enter a Number : ") ;
		int num = scan.nextInt() ;

		checkPrime1(num) ;
		checkPrime2(num) ;

		if(checkPrime3(num)){
			System.out.println("It is a prime number") ;
		}
		else{
			System.out.println("It is not a prime number") ;
		}
	}
	public static void checkPrime1(int num){
		int den ;
		for(den=2; den <num; den++){										//for loop will only run till the end of the number 
			if(num%den == 0){
				break ;
			}
		}
		if(den == num){
			System.out.println("It is a prime number") ;
		}
		else{
			System.out.println("It is not a prime number") ;
		}
	}
	public static void checkPrime2(int num){
		int den ;
		for(den=2; den <=num/2; den++){										//for loop will only run till half of the number 
			if(num%den == 0){
				break ;
			}
		}
		if(den > num/2){
			System.out.println("It is a prime number") ;
		}
		else{
			System.out.println("It is not a prime number") ;
		}
	}
	public static boolean checkPrime3(int num){
		for(int i=2; i<=num/2;i++){
			if(num%i == 0){
				return false ;
			}
		}
		return true ;
	}
}
