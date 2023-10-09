import java.util.* ;
class Range_Of_Prime_Number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		rangeOfPrimeNumber() ;
	}
	public static void rangeOfPrimeNumber(){
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter end value : ") ;
		int end = scan.nextInt() ;

		for(int i = 2; i<= end; i++){
			int ans = getPrimeNumber(i);
			i = getPrimeNumber(i) ;
			if(i<=end){
				System.out.print(i+"  ") ;	
			}
			else{
				continue ;
			}
		}
	}
	public static int getPrimeNumber(int num){
		while(true){
			if(checkPrime(num)){
				return num ;
			}
			else {
				num++ ;
			}	
		}
	}
	public static boolean checkPrime(int num){
		for(int i=2; i<=num/2; i++){
			if(num%i == 0){
				return false ;
			}
		}
		return true ;
	}
}
