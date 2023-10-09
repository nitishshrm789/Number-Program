import java.util.* ;
class Xylem_And_Phloem_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;

		System.out.println("Enter a number : ") ;
		int num = scan.nextInt() ;

		checkXylemAndPhloem(num) ;
	}
	public static void checkXylemAndPhloem(int num){
		int sumOfFirstAndLast = getFirst(num) + getLast(num) ;
		int sumOfMiddle = sumOfDigits(getMiddle(num)) ;

		if(sumOfFirstAndLast == sumOfMiddle){
			System.out.println("Xylem") ;
		}
		else{
			System.out.println("Phloem") ;
		}
	}
	public static int getFirst(int num){
		int ct = Count(num) ;
		int pow = Power(10,ct-1) ;
		return num/pow ;
	}
	public static int getLast(int num){
		return num % 10 ;
	}
	public static int getMiddle(int num){
		num /= 10 ;
		int ct = Count(num) ;
		int pow=Power(10,ct-1) ;

		return num % pow ;
	}
	public static int sumOfDigits(int num){
		int sum = 0 ;
		for(int i=num; i>0 ; i /= 10){
			int rem = i % 10 ;
			sum += rem ;
		}
		return sum ;
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
