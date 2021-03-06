// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.matcher;

/**
 * An element matcher that checks an object's equality to another object.
 *
 * @param <T> The type of the matched entity.
 */
public class EqualityMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    /**
     * The object that is checked to be equal to the matched value.
     */
    private final Object value;

    /**
     * Creates an element matcher that tests for equality.
     *
     * @param value The object that is checked to be equal to the matched value.
     */
    public EqualityMatcher(Object value) {
        this.value = value;
    }

    @Override
    public boolean matches(T target) {
        return value.equals(target);
    }

    @Override
    public String toString() {
        return "is(" + value + ")";
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof EqualityMatcher)) return false;
        final EqualityMatcher<?> other = (EqualityMatcher<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$value = this.value;
        final java.lang.Object other$value = other.value;
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof EqualityMatcher;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $value = this.value;
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }
}
