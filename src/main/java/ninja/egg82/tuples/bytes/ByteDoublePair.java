package ninja.egg82.tuples.bytes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ByteDoublePair {
    private byte first;
    private double second;
    private int hc;

    public ByteDoublePair(byte first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(51521, 36067).append(first).append(second).toHashCode();
    }

    public byte getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ByteDoublePair o = (ByteDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
