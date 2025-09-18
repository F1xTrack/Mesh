package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.t6 */
/* loaded from: classes2.dex */
public final class C3616t6 {

    /* renamed from: a */
    private final EnumC3772z6 f24795a;

    /* renamed from: b */
    private final Integer f24796b;

    /* renamed from: com.yandex.metrica.impl.ob.t6$b */
    public static final class b {

        /* renamed from: a */
        private EnumC3772z6 f24797a;

        /* renamed from: b */
        private Integer f24798b;

        private b(EnumC3772z6 enumC3772z6) {
            this.f24797a = enumC3772z6;
        }

        /* renamed from: a */
        public b m16813a(int i) {
            this.f24798b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C3616t6 m16814a() {
            return new C3616t6(this);
        }
    }

    /* renamed from: a */
    public static final b m16808a(EnumC3772z6 enumC3772z6) {
        return new b(enumC3772z6);
    }

    /* renamed from: b */
    public EnumC3772z6 m16810b() {
        return this.f24795a;
    }

    private C3616t6(b bVar) {
        this.f24795a = bVar.f24797a;
        this.f24796b = bVar.f24798b;
    }

    /* renamed from: a */
    public Integer m16809a() {
        return this.f24796b;
    }
}
