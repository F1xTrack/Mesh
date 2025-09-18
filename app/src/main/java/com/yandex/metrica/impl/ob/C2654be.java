package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2654be implements InterfaceC2704de {
    private final InterfaceC2704de a;
    private final InterfaceC2704de b;

    /* renamed from: com.yandex.metrica.impl.ob.be$a */
    public static class a {
        private InterfaceC2704de a;
        private InterfaceC2704de b;

        public a(InterfaceC2704de interfaceC2704de, InterfaceC2704de interfaceC2704de2) {
            this.a = interfaceC2704de;
            this.b = interfaceC2704de2;
        }

        public a a(Qi qi) {
            this.b = new C2928me(qi.E());
            return this;
        }

        public a a(boolean z) {
            this.a = new C2729ee(z);
            return this;
        }

        public C2654be a() {
            return new C2654be(this.a, this.b);
        }
    }

    public C2654be(InterfaceC2704de interfaceC2704de, InterfaceC2704de interfaceC2704de2) {
        this.a = interfaceC2704de;
        this.b = interfaceC2704de2;
    }

    public static a b() {
        return new a(new C2729ee(false), new C2928me(null));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2704de
    public boolean a(String str) {
        return this.b.a(str) && this.a.a(str);
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.a + ", mStartupStateStrategy=" + this.b + '}';
    }

    public a a() {
        return new a(this.a, this.b);
    }
}
