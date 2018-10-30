package ninja.egg82.tuples.chars;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CharFloatPair {
    private char first;
    private float second;
    private int hc;

    public CharFloatPair(char first, float second) {
        this.first = first;
        this.second = second;
        this.hc = new HashCodeBuilder(36821, 36551).append(first).append(second).toHashCode();
    }

    public char getFirst() { return first; }

    public float getSecond() { return second; }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        CharFloatPair o = (CharFloatPair) obj;
        return new EqualsBuilder().append(first, o.first).append(second, o.second).isEquals();
    }

    public int hashCode() { return hc; }
}
