package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.yc */
/* loaded from: classes2.dex */
class C3752yc {

    /* renamed from: a */
    private C2978Uc f25303a;

    /* renamed from: b */
    private final C2500B8 f25304b;

    /* renamed from: c */
    private final C2475A8 f25305c;

    public C3752yc(C2978Uc c2978Uc, C2500B8 c2500b8, C2475A8 c2475a8) {
        this.f25303a = c2978Uc;
        this.f25304b = c2500b8;
        this.f25305c = c2475a8;
    }

    /* renamed from: a */
    public void m17232a() {
        C2978Uc c2978Uc = this.f25303a;
        if (c2978Uc != null) {
            long jM16681c = this.f25304b.m16681c();
            int i = c2978Uc.f22444f;
            if (jM16681c > i) {
                this.f25304b.m16678b((int) (i * 0.1f));
            }
            C2978Uc c2978Uc2 = this.f25303a;
            long jM16681c2 = this.f25305c.m16681c();
            int i2 = c2978Uc2.f22444f;
            if (jM16681c2 > i2) {
                this.f25305c.m16678b((int) (i2 * 0.1f));
            }
        }
    }

    /* renamed from: a */
    public void m17233a(C2978Uc c2978Uc) {
        this.f25303a = c2978Uc;
    }
}
