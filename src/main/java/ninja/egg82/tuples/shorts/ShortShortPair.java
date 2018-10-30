package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortShortPair {
    private short first;
    private short second;
    private int hc;

    public ShortShortPair(short first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(34651, 47093).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortShortPair o = (ShortShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
