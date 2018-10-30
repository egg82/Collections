package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleBooleanPair {
    private double first;
    private boolean second;
    private int hc;

    public DoubleBooleanPair(double first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(22621, 46643).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleBooleanPair o = (DoubleBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
