import java.util.* ;
class circular_Prime
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		circularPrime(num) ;
	}
	public static void circularPrime(int num){
		int rotate = num , ct = Count(num) , count = 0;
		while(true){
			if(checkPrime(rotate)){
				count++ ;
				if(count == ct){
					break ;
				}
				rotate = rotatingNumber(rotate);	
			}else{
				break ;
			}
		}
		if(count==ct){
			System.out.println("Circular Prime") ;
		}
		else{
			System.out.println("Not a Circular Prime") ;
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
	public static boolean checkPrime(int num){
		for(int i=2; i<=num/2; i++){
			if(num%i == 0){
				return false ;
			}
		}
		return true ;
	}
	public static int rotatingNumber(int num){
		int dup_num = num ;
		int last = num % 10 ;
		num /= 10 ;
		int ct = Count(num) ;
		int pow = Power(10,ct) ;
		
		int ans = (last * pow) + num ;
		System.out.println("rot("+dup_num+") = "+ans) ;
		return ans ;
	}
	public static int Power(int base, int exp){
		int pow = 1 ;
		for(int i=0; i<exp; i++){
			pow = pow * base ;
		}
		return pow ;
	}
}
