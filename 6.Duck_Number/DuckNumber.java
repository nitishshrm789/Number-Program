import java.util.* ;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.print("Enter a number : ") ;
		int num = scan.nextInt() ;

		DuckNumber(num) ;
	}
	public static void DuckNumber(int num){
		int i ;
		for(i=num; i>0; i/=10){
			int rem = i % 10 ;
			if(rem == 0){
				break ;
			}
		}
		if(i != 0){
			System.out.println("It is a Duck Number") ;
		}
		else{
			System.out.println("It is not a Duck Number") ;
		}
	}
}
