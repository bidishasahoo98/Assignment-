package operator;

public class Amstrongnumber {

	public static void main(String[] args) {
	int n=153;
	int sum=0;
	int R,Q,M;
	System.out.println("number is :"+n);
	M=n;
	while(n>0){
		R=(n%10);
		sum=(int) (sum + Math.pow(R,3));
		n=(n/10);
	}
	System.out.println("sum is: "+sum);
if(sum==M) {
	System.out.println("This is Amstrong number");
}else {
	System.out.println("This is not Amstrong number");
}
	}

}
