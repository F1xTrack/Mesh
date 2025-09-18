package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CT0 {

    /* renamed from: b */
    public static final CT0 f1389b = new CT0(-1);

    /* renamed from: a */
    public final int f1390a;

    public CT0(int i) {
        this.f1390a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CT0) {
            return this.f1390a == ((CT0) obj).f1390a;
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f1390a);
        Boolean bool = Boolean.FALSE;
        return ((numValueOf.hashCode() + 31) * 31) + bool.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f1390a), Boolean.FALSE}, 2));
    }
}
