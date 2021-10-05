package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval();
		myInterval.setLowerBound(0);
		myInterval.setUpperBound(2);
		
		int width = myInterval.getUpperBound() - myInterval.getLowerBound();
		assert width == 2;
	}

}
