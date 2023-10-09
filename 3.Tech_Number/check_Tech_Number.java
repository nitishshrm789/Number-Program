import java.util.* ;
class check_Tech_Number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		checkTechNumber(num) ;
	}
	public static void checkTechNumber(int num){
		int ct = Count(num) ;
		if(ct % 2 == 0){
			int pow = Power(10,ct/2) ;
			int num1 = num / pow ;
			int num2 = num % pow ;
			int sum = num1 + num2 ;
			int sq = sum * sum ;
			if(sq == num){
				System.out.println("Tech number") ;
			}
			else{
				System.out.println("Not a Tech Number") ;
			}
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
