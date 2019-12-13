package pl.ohiostudio.mechsvsminions.model;

public class Square
{
	double sideLength = 0;

	public Square()
	{
	}

	public Square(final double sideLength)
	{
		this.sideLength = sideLength;
	}

	public double getSideLength()
	{
		return sideLength;
	}

	public void setSideLength(final double sideLength)
	{
		this.sideLength = sideLength;
	}

	public double getArea()
	{
		return Math.pow(sideLength, 2);
	}
}
