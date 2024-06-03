class Box11
{
	int volume;
	int l, b, h;

	Box11(int l, int b, int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
		this.volume=l*b*h;
	}
}