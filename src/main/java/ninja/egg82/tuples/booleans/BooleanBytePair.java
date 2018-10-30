package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanBytePair {
    private boolean first;
    private byte second;
    private int hc;

    public BooleanBytePair(boolean first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(8573, 30529).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanBytePair o = (BooleanBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
