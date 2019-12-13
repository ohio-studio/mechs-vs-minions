package pl.ohiostudio.mechsvsminions.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareTest
{
	@Test
	public void shouldReturnCorrectArea()
	{
		//given
		double sideLength = 2;
		Square square = new Square(sideLength);

		//when
		double area = square.getArea();

		//then
		assertEquals(4, area);
	}
}