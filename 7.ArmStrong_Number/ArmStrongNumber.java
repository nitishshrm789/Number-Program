import java.util.* ;
class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.print("Enter a number : ") ;
		int num = scan.nextInt() ;

		ArmStrongNumber(num) ;
	}
	public static void ArmStrongNumber(int num){
		int ct = Count(num) ;
		int sum = 0 ;
		for(int i=num; i>0; i/=10){
			int rem = i%10 ;
			int pow = Power(rem,ct);
			sum+=pow ;
		}
		if(sum == num){
			System.out.println("Armstrong number") ;
		}
		else{
			System.out.println("Not an Armstrong Number") ;
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