package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatBytePair {
    private float first;
    private byte second;
    private int hc;

    public FloatBytePair(float first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(35291, 12479).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatBytePair o = (FloatBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
