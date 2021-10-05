package interval;

/**
 * Abstractetoestandsinvariant:
 * @invar The width equals the difference of the upper bound and the lower bound.
 *    | getWidth() == getUpperBound() - getLowerBound()
 * @invar The upper bound is not less than the lower bound.
 *    | getLowerBound() <= getUpperBound()
 */
public class Interval {
	/**
	 * Representatie-invariant:
	 * @invar This interval's width is nonnegative.
	 *     | 0 <= width
	 */
	private int lowerBound;
	private int width;
	
	public int getLowerBound() { return lowerBound; }
	public int getUpperBound() { return lowerBound + width; }
	public int getWidth() { return width; }
	
	/**
	 * @post This interval's lower bound equals zero.
	 *    | getLowerBound() == 0
	 * @post This interval's upper bound equals zero.
	 *    | getUpperBound() == 0
	 */
	public Interval() {}
	
	/**
	 * @pre | lowerBound <= upperBound
	 * @post | getLowerBound() == lowerBound
	 * @post | getUpperBound() == upperBound
	 */
	public Interval(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.width = upperBound - lowerBound;
	}
	
	/**
	 * @pre The given lower bound is not greater than this interval's upper bound.
	 *    | lowerBound <= getUpperBound()
	 * @mutates | this
	 * @post This interval's lower bound equals the given lower bound.
	 *    | getLowerBound() == lowerBound
	 * @post This interval's upper bound equals its old upper bound.
	 *    | getUpperBound() == old(getUpperBound())
	 */
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
	/**
	 * @pre The given upper bound is not less than this interval's lower bound.
	 *    | getLowerBound() <= upperBound
	 * @mutates | this
	 * @post This interval's upper bound equals the given upper bound.
	 *    | getUpperBound() == upperBound
	 * @post This interval's lower bound equals its old lower bound.
	 *    | getLowerBound() == old(getLowerBound())
	 */
	public void setUpperBound(int upperBound) {
		width = upperBound - lowerBound;
	}
	/**
	 * @pre The given width is nonnegative.
	 *    0 <= width
	 * @mutates | this
	 * @post This interval's lower bound equals its old lower bound.
	 *    | getLowerBound() == old(getLowerBound())
	 * @post This interval's upper bound equals its lower bound plus the given width.
	 *    | getUpperBound() == getLowerBound() + width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
}
