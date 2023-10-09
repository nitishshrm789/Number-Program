import java.util.* ;
class Ugly_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		uglyNumber(num) ;
	}
	public static void uglyNumber(int num){
		while(num != 1){
			if(num%2 == 0){
				num /= 2 ;
			}
			else if(num % 3 == 0){
				num /= 3 ;
			}
			else if(num % 5 == 0){
				num /= 5 ;
			}
			else{
				break ;
			}
		}
		if(num == 1){
			System.out.println("Ugly Number") ;
		}
		else{
			System.out.println("Not a Ugly Number") ;
		}
	}
}
