import java.util.* ;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.print("Enter a : ") ;
		int a = scan.nextInt() ;
		System.out.print("Enter b : ") ;
		int b = scan.nextInt() ;

		LCM(a,b) ;
	}
	public static void LCM(int a, int b){
		int large = (a>b) ? (a) : (b) ;
		int lcm = large ;
		while(true){
			if(large%a==0 && large%b==0){
				lcm = large ;
				break ;
			}
			large++ ;
		}
		System.out.println("LCM("+a+","+b+") = "+lcm) ;
	}
}
