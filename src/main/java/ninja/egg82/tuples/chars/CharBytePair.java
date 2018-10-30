package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharBytePair {
    private char first;
    private byte second;
    private int hc;

    public CharBytePair(char first, byte second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(4733, 47743).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public byte getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharBytePair o = (CharBytePair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
