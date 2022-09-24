package ito;

public class divisor {

	public static void main(String[] args) {
		int a = 100;
        int b = 5;
 
        System.out.println(divided(a, b));
		
	
    
 }
	public static long divided(long dividend, long divisor)
    {
 
		
		long sign  = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

   
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);

    long quotient = 0;

    while (dividend >= divisor) {
        dividend -= divisor;
        ++quotient;
    }
    if (sign == -1)
        quotient = -quotient;

    return quotient;
}
 
}
