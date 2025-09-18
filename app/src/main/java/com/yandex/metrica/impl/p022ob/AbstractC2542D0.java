package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.D0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2542D0<T> {

    /* renamed from: a */
    private final C2614Fm<EnumC2567E0, Integer> f20991a;

    public AbstractC2542D0() {
        C2614Fm<EnumC2567E0, Integer> c2614Fm = new C2614Fm<>(0);
        c2614Fm.m14146a(EnumC2567E0.UNDEFINED, 0);
        c2614Fm.m14146a(EnumC2567E0.APP, 1);
        c2614Fm.m14146a(EnumC2567E0.SATELLITE, 2);
        c2614Fm.m14146a(EnumC2567E0.RETAIL, 3);
        this.f20991a = c2614Fm;
    }

    /* renamed from: a */
    public final C2614Fm<EnumC2567E0, Integer> m13975a() {
        return this.f20991a;
    }

    /* renamed from: a */
    public abstract boolean mo13976a(T t, T t2);
}
