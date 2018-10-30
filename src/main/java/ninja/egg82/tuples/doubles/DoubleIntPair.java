package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleIntPair {
    private double first;
    private int second;
    private int hc;

    public DoubleIntPair(double first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(30829, 57719).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleIntPair o = (DoubleIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
