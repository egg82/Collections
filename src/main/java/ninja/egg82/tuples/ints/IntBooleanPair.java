package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntBooleanPair {
    private int first;
    private boolean second;
    private int hc;

    public IntBooleanPair(int first, boolean second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(4651, 16231).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public boolean getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntBooleanPair o = (IntBooleanPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
