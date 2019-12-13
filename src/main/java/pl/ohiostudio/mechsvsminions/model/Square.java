package pl.ohiostudio.mechsvsminions.model;

public class Square
{
	int sideLength = 0;

	public Square()
	{
	}

	public Square(final int sideLength)
	{
		this.sideLength = sideLength;
	}

	public int getSideLength()
	{
		return sideLength;
	}

	public void setSideLength(final int sideLength)
	{
		this.sideLength = sideLength;
	}

	public int getArea()
	{
		return sideLength ^ 2;
	}
}
