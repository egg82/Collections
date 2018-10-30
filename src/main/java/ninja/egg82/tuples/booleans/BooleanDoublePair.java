package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanDoublePair {
    private boolean first;
    private double second;
    private int hc;

    public BooleanDoublePair(boolean first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(46649, 13613).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanDoublePair o = (BooleanDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
