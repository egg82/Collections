package ninja.egg82.tuples.floats;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FloatIntPair {
    private float first;
    private int second;
    private int hc;

    public FloatIntPair(float first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(7741, 10193).append(first).append(second).toHashCode();
    }

    public float getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        FloatIntPair o = (FloatIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
