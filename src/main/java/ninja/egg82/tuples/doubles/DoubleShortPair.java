package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleShortPair {
    private double first;
    private short second;
    private int hc;

    public DoubleShortPair(double first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(44071, 36857).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleShortPair o = (DoubleShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
