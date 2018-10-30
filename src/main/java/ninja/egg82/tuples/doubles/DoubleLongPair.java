package ninja.egg82.tuples.doubles;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DoubleLongPair {
    private double first;
    private long second;
    private int hc;

    public DoubleLongPair(double first, long second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(6101, 34549).append(first).append(second).toHashCode();
    }

    public double getFirst() { return first; }

    public long getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        DoubleLongPair o = (DoubleLongPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
