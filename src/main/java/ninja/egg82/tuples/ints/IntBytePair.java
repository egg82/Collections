package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntBytePair {
    private int first;
    private byte second;
    private int hc;

    public IntBytePair(int first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(41513, 5483).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntBytePair o = (IntBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
