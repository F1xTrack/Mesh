package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CT0 {
    public static final CT0 b = new CT0(-1);
    public final int a;

    public CT0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CT0) {
            return this.a == ((CT0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Boolean bool = Boolean.FALSE;
        return ((numValueOf.hashCode() + 31) * 31) + bool.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Boolean.FALSE}, 2));
    }
}
