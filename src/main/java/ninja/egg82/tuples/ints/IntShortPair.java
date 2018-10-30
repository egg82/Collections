package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntShortPair {
    private int first;
    private short second;
    private int hc;

    public IntShortPair(int first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(50077, 5107).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntShortPair o = (IntShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
