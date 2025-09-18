package p000;

/* renamed from: BR */
/* loaded from: classes2.dex */
public final class C0091BR {

    /* renamed from: a */
    public final AbstractC0631K0 f808a;

    /* renamed from: b */
    public final int f809b;

    public C0091BR(int i, AbstractC0631K0 abstractC0631K0) {
        this.f808a = abstractC0631K0;
        this.f809b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0091BR)) {
            return false;
        }
        C0091BR c0091br = (C0091BR) obj;
        return this.f808a == c0091br.f808a && this.f809b == c0091br.f809b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f808a) * 65535) + this.f809b;
    }
}
