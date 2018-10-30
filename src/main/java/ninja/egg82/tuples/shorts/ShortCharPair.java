package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortCharPair {
    private short first;
    private char second;
    private int hc;

    public ShortCharPair(short first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(34763, 51109).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortCharPair o = (ShortCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
