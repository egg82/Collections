package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanIntPair {
    private boolean first;
    private int second;
    private int hc;

    public BooleanIntPair(boolean first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(60607, 10009).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanIntPair o = (BooleanIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
