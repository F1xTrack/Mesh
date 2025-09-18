package p000;

/* renamed from: fe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9395fe0 extends AbstractC9523ge0 {

    /* renamed from: a */
    public final C0181Cs f27308a;

    public C9395fe0(C0181Cs c0181Cs) {
        this.f27308a = c0181Cs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9395fe0) && O90.m5963a(this.f27308a, ((C9395fe0) obj).f27308a);
    }

    public final int hashCode() {
        return this.f27308a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f27308a + ')';
    }
}
