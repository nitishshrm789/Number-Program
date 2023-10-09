import java.util.* ;
class Rotating_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		rotatingNumber(num) ;
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
