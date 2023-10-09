import java.util.* ;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.print("Enter a : ") ;
		int a = scan.nextInt() ;
		System.out.print("Enter b : ") ;
		int b = scan.nextInt() ;

		HCF(a,b) ;
	}
	public static void HCF(int a, int b){
		int small = (a < b) ? (a) : (b) ;
		int hcf = small ;
		while(true){
			if(a % small == 0 && b % small == 0){
				hcf = small ;
				break ;
			}
			small-- ;
		}
		System.out.println("HCF("+a+","+b+") = "+hcf) ;
	}
}
