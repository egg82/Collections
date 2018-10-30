package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleFloatPair {
    private double first;
    private float second;
    private int hc;

    public DoubleFloatPair(double first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(1031, 63977).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleFloatPair o = (DoubleFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
