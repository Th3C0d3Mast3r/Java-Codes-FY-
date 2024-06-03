import java.util.*;
class Lines
{
	double m; //this is the slope
	double yI;
	double x1, y1, x2, y2;

	Lines()
	{
		m=1;
		yI=1;
		x1=y1=x2=y2=1;
	}

	Lines(double m, double yI)
	{
		this.m=m;
		this.yI=yI;
		System.out.println("y="+m+"x+"+yI);
	}

	Lines(double y1, double m, double x1)
	{
		this.y1=y1;
		this.m=m;
		this.x1=x1;
		System.out.println("y-"+y1+"="+m+"x-"+x1);
	}

	Lines(double m, double x1, double x2, double y1, double y2)
	{
		this.m=m;
		this.y1=y1;
		this.y2=y2;
		this.x1=x1;
		this.x2=x2;
		System.out.println(m+"=("+y2+"-"+y1+") / ("+x2+"-"+x1+")");
	}
}