package defpackage;

/* renamed from: Fp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456Fp0 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C0456Fp0(Object obj) {
        this(-1L, obj);
    }

    public final C0456Fp0 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new C0456Fp0(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0456Fp0)) {
            return false;
        }
        C0456Fp0 c0456Fp0 = (C0456Fp0) obj;
        return this.a.equals(c0456Fp0.a) && this.b == c0456Fp0.b && this.c == c0456Fp0.c && this.d == c0456Fp0.d && this.e == c0456Fp0.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public C0456Fp0(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C0456Fp0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C0456Fp0(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
