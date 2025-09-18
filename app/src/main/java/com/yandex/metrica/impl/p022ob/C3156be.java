package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.be */
/* loaded from: classes2.dex */
public class C3156be implements InterfaceC3208de {

    /* renamed from: a */
    private final InterfaceC3208de f23133a;

    /* renamed from: b */
    private final InterfaceC3208de f23134b;

    /* renamed from: com.yandex.metrica.impl.ob.be$a */
    public static class a {

        /* renamed from: a */
        private InterfaceC3208de f23135a;

        /* renamed from: b */
        private InterfaceC3208de f23136b;

        public a(InterfaceC3208de interfaceC3208de, InterfaceC3208de interfaceC3208de2) {
            this.f23135a = interfaceC3208de;
            this.f23136b = interfaceC3208de2;
        }

        /* renamed from: a */
        public a m15686a(C2885Qi c2885Qi) {
            this.f23136b = new C3442me(c2885Qi.m14856E());
            return this;
        }

        /* renamed from: a */
        public a m15687a(boolean z) {
            this.f23135a = new C3234ee(z);
            return this;
        }

        /* renamed from: a */
        public C3156be m15688a() {
            return new C3156be(this.f23135a, this.f23136b);
        }
    }

    public C3156be(InterfaceC3208de interfaceC3208de, InterfaceC3208de interfaceC3208de2) {
        this.f23133a = interfaceC3208de;
        this.f23134b = interfaceC3208de2;
    }

    /* renamed from: b */
    public static a m15683b() {
        return new a(new C3234ee(false), new C3442me(null));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3208de
    /* renamed from: a */
    public boolean mo15685a(String str) {
        return this.f23134b.mo15685a(str) && this.f23133a.mo15685a(str);
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.f23133a + ", mStartupStateStrategy=" + this.f23134b + '}';
    }

    /* renamed from: a */
    public a m15684a() {
        return new a(this.f23133a, this.f23134b);
    }
}
