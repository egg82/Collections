package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatShortPair {
    private float first;
    private short second;
    private int hc;

    public FloatShortPair(float first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(29641, 30259).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatShortPair o = (FloatShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
