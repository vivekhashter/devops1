package ito;

public class Hrmin {

	public static void main(String[] args) {
		int X=12,Y=15;
		float ans= func(X,Y);
	    System.out.println(ans);

	}
	public static float func( float x,float  y)
	{
		float sub;
		if(y < 35) {
		x = (x%12+y/60)*30;
		 y= y*6;
		sub = (y - x);
	}
		else {
		x = (x%12+y/60)*30;
		 y= y*6;
		sub = 360- (y-x);
	
	}		
		return sub ;
		
	}

}
