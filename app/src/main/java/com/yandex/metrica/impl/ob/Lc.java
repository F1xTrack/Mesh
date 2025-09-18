package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Lc {
    private final I9 a;
    private final C2877kd b;
    private final Oc c;
    private final Ic d;
    private final Gc e;
    private final Kc f;

    public class a implements Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public long a() {
            return Lc.this.a.b(0L);
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public void a(long j) {
            Lc.this.a.g(j);
        }
    }

    public Lc(C2877kd c2877kd, I9 i9, C3206xd c3206xd) {
        this.b = c2877kd;
        this.a = i9;
        Oc ocB = b();
        this.c = ocB;
        this.e = a(ocB);
        this.d = a();
        this.f = a(c3206xd);
    }

    private Oc b() {
        return new a();
    }

    private Ic a() {
        return new Ic(this.b.a.b);
    }

    private Gc a(Oc oc) {
        return new Gc(oc, new R2());
    }

    private Kc a(C3206xd c3206xd) {
        C3255zc c3255zc = this.b.a;
        return new Kc(c3255zc.a, c3206xd, c3255zc.b, c3255zc.c);
    }

    public C2927md<Jc> a(Jc jc) {
        return new C2927md<>(this.f, this.e, new C3150vc(this.c, new Nm()), this.d, jc);
    }
}
