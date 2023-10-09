import java.util.* ;
class Spy_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		spyNumber(num) ;
	}
	public static void spyNumber(int num){
		int sum=0, prod=1 ;
		while(num>0){
			int rem=num%10 ;
			sum += rem ;
			prod *= rem ;
			num /= 10 ;
		}
		if(sum == prod){
			System.out.println("Spy Number") ;
		}
		else{
			System.out.println("Not a spy number") ;
		}
	}
}
