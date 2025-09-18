package defpackage;

/* renamed from: ee0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3620ee0 extends AbstractC4002ge0 {
    public final AbstractC0663Ig0 a;

    public C3620ee0(AbstractC0663Ig0 abstractC0663Ig0) {
        this.a = abstractC0663Ig0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3620ee0) && O90.a(this.a, ((C3620ee0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}
