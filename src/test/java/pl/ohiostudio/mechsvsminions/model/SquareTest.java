package pl.ohiostudio.mechsvsminions.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SquareTest
{
	@Test
	public void shouldReturnCorrectArea()
	{
		//given
		int sideLength = 2;
		Square square = new Square(sideLength);

		//when
		int area = square.getSideLength();

		//then
		assertEquals(4, area);
	}
}