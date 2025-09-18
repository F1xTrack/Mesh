package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Sc extends AbstractC3180wc {

    public class a implements Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public long a() {
            return Sc.this.a.e(0L);
        }

        @Override // com.yandex.metrica.impl.ob.Oc
        public void a(long j) {
            Sc.this.a.j(j);
        }
    }

    public Sc(C2877kd c2877kd, I9 i9) {
        this(c2877kd, i9, new C2617a2());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3180wc
    public Oc a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3180wc
    public String b() {
        return "network";
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3180wc
    public String c() {
        return "lbs";
    }

    public Sc(C2877kd c2877kd, I9 i9, C2617a2 c2617a2) {
        super(c2877kd, i9, c2617a2);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3180wc
    public InterfaceC2779ge a(C2754fe c2754fe) {
        return this.c.a(c2754fe);
    }
}
