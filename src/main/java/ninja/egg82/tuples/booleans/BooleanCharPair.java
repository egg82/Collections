package ninja.egg82.tuples.booleans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BooleanCharPair {
    private boolean first;
    private char second;
    private int hc;

    public BooleanCharPair(boolean first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(32009, 28463).append(first).append(second).toHashCode();
    }

    public boolean getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        BooleanCharPair o = (BooleanCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
