/**
 * Class overrides hashCode and equals methods
 */
public class Time {

	int hour, min, sec;
	
	public int hashCode() {
		//Prime numbers are very useful when it comes to this
		// reduces number of hash collisions
		return hour * 733 + min * 13 + sec * 967;
	}

	public boolean equals(Object other) {
		if (other instanceof Time) {
			Time t = (Time)other;
			// Below returns true if the hours mins and seconds are equal
			// == checks for equality, && is boolean AND
			return (t.hour == hour && t.min == min && t.sec == sec);
		}
		return false;
	}
	
	/**
	 * Constructor for instantiating a Time object
	 * @param h = hour
	 * @param m = minute
	 * @param s = second
	 */
	public Time(int h, int m, int s) {
		this.hour = h;
		this.min = m;
		this.sec = s;
	}
	
}
