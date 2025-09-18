package p000;

/* loaded from: classes2.dex */
public final class GS0 {

    /* renamed from: a */
    public C10777qR0 f3741a;

    /* renamed from: b */
    public EnumC9219eG0 f3742b;

    /* renamed from: d */
    public String f3744d;

    /* renamed from: e */
    public E20 f3745e;

    /* renamed from: g */
    public IS0 f3747g;

    /* renamed from: h */
    public HS0 f3748h;

    /* renamed from: i */
    public HS0 f3749i;

    /* renamed from: j */
    public HS0 f3750j;

    /* renamed from: k */
    public long f3751k;

    /* renamed from: l */
    public long f3752l;

    /* renamed from: m */
    public C4198hk f3753m;

    /* renamed from: c */
    public int f3743c = -1;

    /* renamed from: f */
    public J20 f3746f = new J20();

    /* renamed from: b */
    public static void m3065b(String str, HS0 hs0) {
        if (hs0 != null) {
            if (hs0.f4301g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (hs0.f4302h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (hs0.f4303i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (hs0.f4304j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: a */
    public final HS0 m3066a() {
        int i = this.f3743c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f3743c).toString());
        }
        C10777qR0 c10777qR0 = this.f3741a;
        if (c10777qR0 == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC9219eG0 enumC9219eG0 = this.f3742b;
        if (enumC9219eG0 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f3744d;
        if (str != null) {
            return new HS0(c10777qR0, enumC9219eG0, str, i, this.f3745e, this.f3746f.m4140g(), this.f3747g, this.f3748h, this.f3749i, this.f3750j, this.f3751k, this.f3752l, this.f3753m);
        }
        throw new IllegalStateException("message == null");
    }

    /* renamed from: c */
    public final void m3067c(K20 k20) {
        O90.m5968f(k20, "headers");
        this.f3746f = k20.m4526i();
    }
}
