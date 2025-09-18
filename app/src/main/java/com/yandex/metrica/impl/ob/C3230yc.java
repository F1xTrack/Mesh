package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.yc */
/* loaded from: classes2.dex */
class C3230yc {
    private Uc a;
    private final B8 b;
    private final A8 c;

    public C3230yc(Uc uc, B8 b8, A8 a8) {
        this.a = uc;
        this.b = b8;
        this.c = a8;
    }

    public void a() {
        Uc uc = this.a;
        if (uc != null) {
            long jC = this.b.c();
            int i = uc.f;
            if (jC > i) {
                this.b.b((int) (i * 0.1f));
            }
            Uc uc2 = this.a;
            long jC2 = this.c.c();
            int i2 = uc2.f;
            if (jC2 > i2) {
                this.c.b((int) (i2 * 0.1f));
            }
        }
    }

    public void a(Uc uc) {
        this.a = uc;
    }
}
