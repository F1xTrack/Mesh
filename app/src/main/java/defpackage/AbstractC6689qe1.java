package defpackage;

/* renamed from: qe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6689qe1 {
    public abstract EnumC4015gi1 a();

    public abstract AbstractC0663Ig0 b();

    public abstract boolean c();

    public abstract AbstractC6689qe1 d(C1130Og0 c1130Og0);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6689qe1)) {
            return false;
        }
        AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) obj;
        return c() == abstractC6689qe1.c() && a() == abstractC6689qe1.a() && b().equals(abstractC6689qe1.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (AbstractC0112Be1.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == EnumC4015gi1.c) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
