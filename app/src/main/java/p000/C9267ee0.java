package p000;

/* renamed from: ee0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9267ee0 extends AbstractC9523ge0 {

    /* renamed from: a */
    public final AbstractC7742Ig0 f26794a;

    public C9267ee0(AbstractC7742Ig0 abstractC7742Ig0) {
        this.f26794a = abstractC7742Ig0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9267ee0) && O90.m5963a(this.f26794a, ((C9267ee0) obj).f26794a);
    }

    public final int hashCode() {
        return this.f26794a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f26794a + ')';
    }
}
