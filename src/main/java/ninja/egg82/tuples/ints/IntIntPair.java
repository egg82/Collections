package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntIntPair {
    private int first;
    private int second;
    private int hc;

    public IntIntPair(int first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(14783, 34591).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntIntPair o = (IntIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
