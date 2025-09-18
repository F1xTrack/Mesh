package defpackage;

/* renamed from: Hz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0641Hz extends G {
    public static final C1538Tm0 c = new C1538Tm0(11);
    public final String b;

    public C0641Hz(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0641Hz) && O90.a(this.b, ((C0641Hz) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
