package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntFloatPair {
    private int first;
    private float second;
    private int hc;

    public IntFloatPair(int first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(23773, 8017).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntFloatPair o = (IntFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
