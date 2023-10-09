import java.util.* ;
class Happy_or_Sad_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		happyOrSad(num) ;
	}
	public static void happyOrSad(int num){
		int sum = 0 ;
		int ans = num ;
		while(true){
			sum = 0 ;
			for(int i=ans; i>0;i/=10){
				int rem = i%10 ;
				sum = sum + (rem*rem) ;
			}
			ans = sum ;
			if(sum==1 || sum==4){
				break ;
			}
		}
		if(sum == 1){
			System.out.println("Happy Number") ;
		}
		else{
			System.out.println("Sad Number") ;
		}
	}
}
