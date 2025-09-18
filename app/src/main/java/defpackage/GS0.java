package defpackage;

/* loaded from: classes2.dex */
public final class GS0 {
    public C6649qR0 a;
    public EnumC3548eG0 b;
    public String d;
    public E20 e;
    public IS0 g;
    public HS0 h;
    public HS0 i;
    public HS0 j;
    public long k;
    public long l;
    public C4210hk m;
    public int c = -1;
    public J20 f = new J20();

    public static void b(String str, HS0 hs0) {
        if (hs0 != null) {
            if (hs0.g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (hs0.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (hs0.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (hs0.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final HS0 a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        C6649qR0 c6649qR0 = this.a;
        if (c6649qR0 == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC3548eG0 enumC3548eG0 = this.b;
        if (enumC3548eG0 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new HS0(c6649qR0, enumC3548eG0, str, i, this.e, this.f.g(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(K20 k20) {
        O90.f(k20, "headers");
        this.f = k20.i();
    }
}
