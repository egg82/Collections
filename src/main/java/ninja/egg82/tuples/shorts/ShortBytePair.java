package ninja.egg82.tuples.shorts;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShortBytePair {
    private short first;
    private byte second;
    private int hc;

    public ShortBytePair(short first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(15823, 49139).append(first).append(second).toHashCode();
    }

    public short getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ShortBytePair o = (ShortBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
