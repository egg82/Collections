package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleBytePair {
    private double first;
    private byte second;
    private int hc;

    public DoubleBytePair(double first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(13313, 36713).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleBytePair o = (DoubleBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
