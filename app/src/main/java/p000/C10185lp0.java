package p000;

/* renamed from: lp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10185lp0 {

    /* renamed from: a */
    public final long f37303a;

    /* renamed from: b */
    public final long f37304b;

    /* renamed from: c */
    public final long f37305c;

    /* renamed from: d */
    public final float f37306d;

    /* renamed from: e */
    public final float f37307e;

    static {
        new C10057kp0().m22273a();
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
        AbstractC7485Dh1.m1797L(3);
        AbstractC7485Dh1.m1797L(4);
    }

    public C10185lp0(C10057kp0 c10057kp0) {
        long j = c10057kp0.f36710a;
        long j2 = c10057kp0.f36711b;
        long j3 = c10057kp0.f36712c;
        float f = c10057kp0.f36713d;
        float f2 = c10057kp0.f36714e;
        this.f37303a = j;
        this.f37304b = j2;
        this.f37305c = j3;
        this.f37306d = f;
        this.f37307e = f2;
    }

    /* renamed from: a */
    public final C10057kp0 m22540a() {
        C10057kp0 c10057kp0 = new C10057kp0();
        c10057kp0.f36710a = this.f37303a;
        c10057kp0.f36711b = this.f37304b;
        c10057kp0.f36712c = this.f37305c;
        c10057kp0.f36713d = this.f37306d;
        c10057kp0.f36714e = this.f37307e;
        return c10057kp0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10185lp0)) {
            return false;
        }
        C10185lp0 c10185lp0 = (C10185lp0) obj;
        return this.f37303a == c10185lp0.f37303a && this.f37304b == c10185lp0.f37304b && this.f37305c == c10185lp0.f37305c && this.f37306d == c10185lp0.f37306d && this.f37307e == c10185lp0.f37307e;
    }

    public final int hashCode() {
        long j = this.f37303a;
        long j2 = this.f37304b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f37305c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.f37306d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f37307e;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
