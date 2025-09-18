package p000;

/* renamed from: Fp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7604Fp0 {

    /* renamed from: a */
    public final Object f3430a;

    /* renamed from: b */
    public final int f3431b;

    /* renamed from: c */
    public final int f3432c;

    /* renamed from: d */
    public final long f3433d;

    /* renamed from: e */
    public final int f3434e;

    public C7604Fp0(Object obj) {
        this(-1L, obj);
    }

    /* renamed from: a */
    public final C7604Fp0 m2790a(Object obj) {
        if (this.f3430a.equals(obj)) {
            return this;
        }
        return new C7604Fp0(obj, this.f3431b, this.f3432c, this.f3433d, this.f3434e);
    }

    /* renamed from: b */
    public final boolean m2791b() {
        return this.f3431b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7604Fp0)) {
            return false;
        }
        C7604Fp0 c7604Fp0 = (C7604Fp0) obj;
        return this.f3430a.equals(c7604Fp0.f3430a) && this.f3431b == c7604Fp0.f3431b && this.f3432c == c7604Fp0.f3432c && this.f3433d == c7604Fp0.f3433d && this.f3434e == c7604Fp0.f3434e;
    }

    public final int hashCode() {
        return ((((((((this.f3430a.hashCode() + 527) * 31) + this.f3431b) * 31) + this.f3432c) * 31) + ((int) this.f3433d)) * 31) + this.f3434e;
    }

    public C7604Fp0(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C7604Fp0(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C7604Fp0(Object obj, int i, int i2, long j, int i3) {
        this.f3430a = obj;
        this.f3431b = i;
        this.f3432c = i2;
        this.f3433d = j;
        this.f3434e = i3;
    }
}
