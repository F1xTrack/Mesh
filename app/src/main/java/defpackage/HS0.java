package defpackage;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class HS0 implements Closeable {
    public final C6649qR0 a;
    public final EnumC3548eG0 b;
    public final String c;
    public final int d;
    public final E20 e;
    public final K20 f;
    public final IS0 g;
    public final HS0 h;
    public final HS0 i;
    public final HS0 j;
    public final long k;
    public final long l;
    public final C4210hk m;
    public C2193al n;

    public HS0(C6649qR0 c6649qR0, EnumC3548eG0 enumC3548eG0, String str, int i, E20 e20, K20 k20, IS0 is0, HS0 hs0, HS0 hs02, HS0 hs03, long j, long j2, C4210hk c4210hk) {
        O90.f(c6649qR0, "request");
        O90.f(enumC3548eG0, "protocol");
        O90.f(str, "message");
        this.a = c6649qR0;
        this.b = enumC3548eG0;
        this.c = str;
        this.d = i;
        this.e = e20;
        this.f = k20;
        this.g = is0;
        this.h = hs0;
        this.i = hs02;
        this.j = hs03;
        this.k = j;
        this.l = j2;
        this.m = c4210hk;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IS0 is0 = this.g;
        if (is0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        is0.close();
    }

    public final C2193al m() {
        C2193al c2193al = this.n;
        if (c2193al != null) {
            return c2193al;
        }
        int i = C2193al.n;
        C2193al c2193alB = YP1.b(this.f);
        this.n = c2193alB;
        return c2193alB;
    }

    public final boolean n() {
        int i = this.d;
        return 200 <= i && i < 300;
    }

    public final GS0 o() {
        GS0 gs0 = new GS0();
        gs0.a = this.a;
        gs0.b = this.b;
        gs0.c = this.d;
        gs0.d = this.c;
        gs0.e = this.e;
        gs0.f = this.f.i();
        gs0.g = this.g;
        gs0.h = this.h;
        gs0.i = this.i;
        gs0.j = this.j;
        gs0.k = this.k;
        gs0.l = this.l;
        gs0.m = this.m;
        return gs0;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
