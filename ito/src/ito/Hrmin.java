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
		 x = (x%12+y/60)*30;
		 y= y*6;
		 sub= (y-x);
		return sub ;
		
	}

}
