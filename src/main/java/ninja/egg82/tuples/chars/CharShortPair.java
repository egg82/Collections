package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharShortPair {
    private char first;
    private short second;
    private int hc;

    public CharShortPair(char first, short second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(49103, 6421).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public short getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharShortPair o = (CharShortPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
