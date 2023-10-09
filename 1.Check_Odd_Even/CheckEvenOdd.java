import java.util.* ;
class CheckEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Enter a number : ") ;
		int num = scan.nextInt() ;

		Method1(num) ;
		Method2(num) ;
		Method3(num) ;
	}
	public static void Method1(int num){
		//If a number is a multiple of 2 then it is even otherwise it is odd. 
		if(num%2 == 0){
			System.out.println("Even number") ;
		}
		else{
			System.out.println("Odd Number") ;
		}
	}
	public static void Method2(int num){
		//Without using % operator
		if((num/2)*2 == num){
			System.out.println("Even number") ;
		}
		else{
			System.out.println("Odd Number") ;
		}
	}
	public static void Method3(int num){
		//Without using % operator
		int dnum = num/10 ;
		dnum *= 10 ;
		int lastValue = num - dnum ;
		if(lastValue==0 || lastValue==2 || lastValue==4 || lastValue==6 || lastValue==8){
			System.out.println("Even Number") ;
		}
		else{
			System.out.println("Odd Number") ;
		}
	}
}
