package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.so */
/* loaded from: classes2.dex */
public final class C3608so {

    /* renamed from: a */
    private final boolean f24787a;

    /* renamed from: b */
    private final String f24788b;

    private C3608so(InterfaceC3660uo<?> interfaceC3660uo, boolean z, String str) {
        interfaceC3660uo.getClass();
        this.f24787a = z;
        this.f24788b = str;
    }

    /* renamed from: a */
    public final String m16804a() {
        return this.f24788b;
    }

    /* renamed from: b */
    public final boolean m16805b() {
        return this.f24787a;
    }

    /* renamed from: a */
    public static final C3608so m16802a(InterfaceC3660uo<?> interfaceC3660uo) {
        return new C3608so(interfaceC3660uo, true, "");
    }

    /* renamed from: a */
    public static final C3608so m16803a(InterfaceC3660uo<?> interfaceC3660uo, String str) {
        return new C3608so(interfaceC3660uo, false, str);
    }
}
