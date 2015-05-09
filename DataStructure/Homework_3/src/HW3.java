
public class HW3 {

	public static int one(int n){
		
		if(n > 0){

			return 2 * one(n-1) + n;
		}
		if(n < 0){
			System.out.println(" ERROR : one()");
			return -1;
		}

			return 0;
		

	}
	public static int two(int n){
		if(n==1){
			return 1;
		}
		if(n < 0){
			System.out.println(" ERROR : two()");
			return -1;
		}
		return 2 * two(n/2) + 1;
		
	}
	public static int three(int n){
		if(n==1){
			return 1;
		}
		if(n < 0){
			System.out.println(" ERROR : three()");
			return -1;
		}

		return 2 * three(n/2) + n;
			
	}
	public static int gcd(int a, int b){
		if(b < 0){
			System.out.println(" ERROR : gcd()");
			return -1;
		}
		if(b > 0){
			
			int t = a;
			a =b;
			b= t%b;
			
		}
		if(b==0){
			return a;
		}
		
		
		return gcd(a,b);
	}
	
	
	
	public static int nc(int a, int b,int num){
		
		if(b>0){
			num++;
			int t = a;
			a = b;
			b= t%b;
			return nc(a,b,num);
			
		}
		return num;
	}

	public static int amx(int max){
		int nMax = 0;
		int n = max;
		for(int i=max; i>=1; i--){
			int x = nc(max,i,0);
			if(nMax < x){
				nMax = x;
				n = i;
			}
			
		}
		return n;
		
	}
	
	public static int C(int n, int k){
		if(k>1 && k<n){
			return C(n-1,k) + C(n-1,k-1);
		}else{
			if(k==n || k==0){
				return 1;
			}else{
				return 0;
			}
		}
		
	}
	
	public static int ncC(int n, int k){
		
		if(k>1 && k<n){
			return ncC(n-1,k) + ncC(n-1,k-1) + 2;
		}else{
			return 0;
		}
		
		
	}
	public static int ratio(int n){
		return (n/gcd(n,amx(n)));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. f(7) = " + one(7));
		System.out.println("1. f(51) = " + one(51));
		System.out.println("2. g(32) = " + two(32));
		System.out.println("2. g(1048576) = " + two(1048576));
		System.out.println("3. h(32) = " + three(32));
		System.out.println("3. h(1048576) = " + three(1048576));
		System.out.println("4. gcd(32,18) = " + gcd(32,18));
		System.out.println("4. nc(gcd(32,18)) = " + nc(32,18,0));
		System.out.println("5. gcd(1234567,23456)) = " + gcd(1234567,23456));
		System.out.println("5. nc(gcd(1234567,23456)) = " + nc(1234567,23456,0));
		System.out.println("6. amx(7) = " +amx(7));
		System.out.println("7. amx(987) = " +amx(987));
		System.out.println("7. amx(1597) = " +amx(1597));
		System.out.println("8. ratio(10) = " +ratio(10));
		System.out.println("8. ratio(n) = (n/gcd(n,amx(n)))");
		System.out.println("9. nc(C(5,2)) = " + ncC(5,2));
		System.out.println("9. C(5,2) = " +C(5,2));
		System.out.println("10. nc(C(21,12)) = " +ncC(21,12));
		System.out.println("10. C(21,12) = " +C(21,12));
		
	}

}
