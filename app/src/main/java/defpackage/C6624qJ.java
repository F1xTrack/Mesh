package defpackage;

/* renamed from: qJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6624qJ {
    public final int a;
    public final int b;

    static {
        C7950xG0 c7950xG0 = new C7950xG0(3);
        YN1.c(c7950xG0.b <= c7950xG0.c);
        new C6624qJ(c7950xG0);
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
    }

    public C6624qJ(C7950xG0 c7950xG0) {
        c7950xG0.getClass();
        this.a = c7950xG0.b;
        this.b = c7950xG0.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6624qJ)) {
            return false;
        }
        C6624qJ c6624qJ = (C6624qJ) obj;
        c6624qJ.getClass();
        return this.a == c6624qJ.a && this.b == c6624qJ.b && AbstractC0277Dh1.a(null, null);
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
