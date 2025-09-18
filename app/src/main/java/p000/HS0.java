package p000;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class HS0 implements Closeable {

    /* renamed from: a */
    public final C10777qR0 f4295a;

    /* renamed from: b */
    public final EnumC9219eG0 f4296b;

    /* renamed from: c */
    public final String f4297c;

    /* renamed from: d */
    public final int f4298d;

    /* renamed from: e */
    public final E20 f4299e;

    /* renamed from: f */
    public final K20 f4300f;

    /* renamed from: g */
    public final IS0 f4301g;

    /* renamed from: h */
    public final HS0 f4302h;

    /* renamed from: i */
    public final HS0 f4303i;

    /* renamed from: j */
    public final HS0 f4304j;

    /* renamed from: k */
    public final long f4305k;

    /* renamed from: l */
    public final long f4306l;

    /* renamed from: m */
    public final C4198hk f4307m;

    /* renamed from: n */
    public C1684al f4308n;

    public HS0(C10777qR0 c10777qR0, EnumC9219eG0 enumC9219eG0, String str, int i, E20 e20, K20 k20, IS0 is0, HS0 hs0, HS0 hs02, HS0 hs03, long j, long j2, C4198hk c4198hk) {
        O90.m5968f(c10777qR0, "request");
        O90.m5968f(enumC9219eG0, "protocol");
        O90.m5968f(str, "message");
        this.f4295a = c10777qR0;
        this.f4296b = enumC9219eG0;
        this.f4297c = str;
        this.f4298d = i;
        this.f4299e = e20;
        this.f4300f = k20;
        this.f4301g = is0;
        this.f4302h = hs0;
        this.f4303i = hs02;
        this.f4304j = hs03;
        this.f4305k = j;
        this.f4306l = j2;
        this.f4307m = c4198hk;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IS0 is0 = this.f4301g;
        if (is0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        is0.close();
    }

    /* renamed from: m */
    public final C1684al m3427m() {
        C1684al c1684al = this.f4308n;
        if (c1684al != null) {
            return c1684al;
        }
        int i = C1684al.f15668n;
        C1684al c1684alM9295b = YP1.m9295b(this.f4300f);
        this.f4308n = c1684alM9295b;
        return c1684alM9295b;
    }

    /* renamed from: n */
    public final boolean m3428n() {
        int i = this.f4298d;
        return 200 <= i && i < 300;
    }

    /* renamed from: o */
    public final GS0 m3429o() {
        GS0 gs0 = new GS0();
        gs0.f3741a = this.f4295a;
        gs0.f3742b = this.f4296b;
        gs0.f3743c = this.f4298d;
        gs0.f3744d = this.f4297c;
        gs0.f3745e = this.f4299e;
        gs0.f3746f = this.f4300f.m4526i();
        gs0.f3747g = this.f4301g;
        gs0.f3748h = this.f4302h;
        gs0.f3749i = this.f4303i;
        gs0.f3750j = this.f4304j;
        gs0.f3751k = this.f4305k;
        gs0.f3752l = this.f4306l;
        gs0.f3753m = this.f4307m;
        return gs0;
    }

    public final String toString() {
        return "Response{protocol=" + this.f4296b + ", code=" + this.f4298d + ", message=" + this.f4297c + ", url=" + this.f4295a.f40870a + '}';
    }
}
