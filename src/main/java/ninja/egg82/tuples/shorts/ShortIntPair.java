package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortIntPair {
    private short first;
    private int second;
    private int hc;

    public ShortIntPair(short first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(12163, 9887).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortIntPair o = (ShortIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
