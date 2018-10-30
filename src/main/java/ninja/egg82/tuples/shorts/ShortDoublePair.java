package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortDoublePair {
    private short first;
    private double second;
    private int hc;

    public ShortDoublePair(short first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(16763, 5153).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortDoublePair o = (ShortDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
