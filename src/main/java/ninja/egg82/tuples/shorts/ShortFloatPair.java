package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortFloatPair {
    private short first;
    private float second;
    private int hc;

    public ShortFloatPair(short first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(45779, 28979).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortFloatPair o = (ShortFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
