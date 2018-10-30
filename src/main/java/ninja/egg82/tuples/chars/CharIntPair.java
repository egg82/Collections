package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharIntPair {
    private char first;
    private int second;
    private int hc;

    public CharIntPair(char first, int second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(64453, 20071).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public int getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharIntPair o = (CharIntPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
