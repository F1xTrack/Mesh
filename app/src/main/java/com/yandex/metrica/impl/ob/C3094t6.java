package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3094t6 {
    private final EnumC3249z6 a;
    private final Integer b;

    /* renamed from: com.yandex.metrica.impl.ob.t6$b */
    public static final class b {
        private EnumC3249z6 a;
        private Integer b;

        private b(EnumC3249z6 enumC3249z6) {
            this.a = enumC3249z6;
        }

        public b a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public C3094t6 a() {
            return new C3094t6(this);
        }
    }

    public static final b a(EnumC3249z6 enumC3249z6) {
        return new b(enumC3249z6);
    }

    public EnumC3249z6 b() {
        return this.a;
    }

    private C3094t6(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public Integer a() {
        return this.b;
    }
}
