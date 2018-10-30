package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleDoublePair {
    private double first;
    private double second;
    private int hc;

    public DoubleDoublePair(double first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(36319, 49081).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleDoublePair o = (DoubleDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
