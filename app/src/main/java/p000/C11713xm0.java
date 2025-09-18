package p000;

/* renamed from: xm0 */
/* loaded from: classes.dex */
public final class C11713xm0 implements InterfaceC9467gC0 {

    /* renamed from: a */
    public final C11840ym0 f45770a;

    /* renamed from: b */
    public int f45771b;

    /* renamed from: c */
    public Class f45772c;

    public C11713xm0(C11840ym0 c11840ym0) {
        this.f45770a = c11840ym0;
    }

    @Override // p000.InterfaceC9467gC0
    /* renamed from: a */
    public final void mo10572a() {
        this.f45770a.m7845n1(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11713xm0)) {
            return false;
        }
        C11713xm0 c11713xm0 = (C11713xm0) obj;
        return this.f45771b == c11713xm0.f45771b && this.f45772c == c11713xm0.f45772c;
    }

    public final int hashCode() {
        int i = this.f45771b * 31;
        Class cls = this.f45772c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f45771b + "array=" + this.f45772c + '}';
    }
}
