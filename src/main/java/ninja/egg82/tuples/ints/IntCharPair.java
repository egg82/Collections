package ninja.egg82.tuples.ints;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IntCharPair {
    private int first;
    private char second;
    private int hc;

    public IntCharPair(int first, char second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(24659, 17117).append(first).append(second).toHashCode();
    }

    public int getFirst() { return first; }

    public char getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        IntCharPair o = (IntCharPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
