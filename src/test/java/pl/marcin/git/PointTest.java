package pl.marcin.git;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	@Test
	public void addPointsTest()
	{
		Point p1 = new Point(2.5, 6.3);
		Point p2 = new Point(2.5, 0.7);
		
		Assert.assertEquals(new Point(5.0, 7.0), p1.addPoints(p2));
	}

}
