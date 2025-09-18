package p000;

/* renamed from: tb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11181tb0 {

    /* renamed from: a */
    public final C0055As f43155a;

    /* renamed from: b */
    public final C0055As f43156b;

    /* renamed from: c */
    public final C0055As f43157c;

    public C11181tb0(C0055As c0055As, C0055As c0055As2, C0055As c0055As3) {
        this.f43155a = c0055As;
        this.f43156b = c0055As2;
        this.f43157c = c0055As3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11181tb0)) {
            return false;
        }
        C11181tb0 c11181tb0 = (C11181tb0) obj;
        return O90.m5963a(this.f43155a, c11181tb0.f43155a) && O90.m5963a(this.f43156b, c11181tb0.f43156b) && O90.m5963a(this.f43157c, c11181tb0.f43157c);
    }

    public final int hashCode() {
        return this.f43157c.hashCode() + ((this.f43156b.hashCode() + (this.f43155a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f43155a + ", kotlinReadOnly=" + this.f43156b + ", kotlinMutable=" + this.f43157c + ')';
    }
}
