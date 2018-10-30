package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntDoublePair {
    private int first;
    private double second;
    private int hc;

    public IntDoublePair(int first, double second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(53239, 7253).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public double getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntDoublePair o = (IntDoublePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
