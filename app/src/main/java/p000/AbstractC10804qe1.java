package p000;

/* renamed from: qe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10804qe1 {
    /* renamed from: a */
    public abstract EnumC9532gi1 mo24037a();

    /* renamed from: b */
    public abstract AbstractC7742Ig0 mo24038b();

    /* renamed from: c */
    public abstract boolean mo24039c();

    /* renamed from: d */
    public abstract AbstractC10804qe1 mo24040d(C8054Og0 c8054Og0);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC10804qe1)) {
            return false;
        }
        AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) obj;
        return mo24039c() == abstractC10804qe1.mo24039c() && mo24037a() == abstractC10804qe1.mo24037a() && mo24038b().equals(abstractC10804qe1.mo24038b());
    }

    public final int hashCode() {
        int iHashCode = mo24037a().hashCode();
        if (AbstractC7375Be1.m794l(mo24038b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo24039c() ? 17 : mo24038b().hashCode());
    }

    public final String toString() {
        if (mo24039c()) {
            return "*";
        }
        if (mo24037a() == EnumC9532gi1.f27947c) {
            return mo24038b().toString();
        }
        return mo24037a() + " " + mo24038b();
    }
}
