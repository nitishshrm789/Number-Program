import java.util.* ;
class Automorphic_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		AutomorphicNumber(num) ;
	}
	public static void AutomorphicNumber(int num){
		int ct = Count(num) ;
		int pow = Power(10, ct) ;
		int sq = num * num ;
		int lastPlace = sq % pow ;

		if(num == lastPlace){
			System.out.println("Automorphic Number") ;
		}
		else{
			System.out.println("Not an Automorphic number") ;
		}
	}
	public static int Count(int num){
		int ct = 0 ;
		while(num > 0){
			ct++ ;
			num /= 10 ;
		}
		return ct ;
	}
	public static int Power(int base, int exp){
		int pow = 1 ;
		for(int i=0; i<exp; i++){
			pow = pow * base ;
		}
		return pow ;
	}
}