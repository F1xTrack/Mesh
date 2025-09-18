package defpackage;

/* renamed from: xm0 */
/* loaded from: classes.dex */
public final class C8046xm0 implements InterfaceC3918gC0 {
    public final C8236ym0 a;
    public int b;
    public Class c;

    public C8046xm0(C8236ym0 c8236ym0) {
        this.a = c8236ym0;
    }

    @Override // defpackage.InterfaceC3918gC0
    public final void a() {
        this.a.n1(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8046xm0)) {
            return false;
        }
        C8046xm0 c8046xm0 = (C8046xm0) obj;
        return this.b == c8046xm0.b && this.c == c8046xm0.c;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
