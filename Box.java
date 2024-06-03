class Box
{
	double width, height, depth;
	int boxNo;

	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}

	Box()
	{
		width=height=depth=0;
	}

	Box(int num)
	{
		this();
		boxNo=num;
	}
}