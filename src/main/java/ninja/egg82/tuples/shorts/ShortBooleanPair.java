package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortBooleanPair {
    private short first;
    private boolean second;
    private int hc;

    public ShortBooleanPair(short first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(45959, 22453).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortBooleanPair o = (ShortBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
