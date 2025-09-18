package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2645H3;

/* renamed from: com.yandex.metrica.impl.ob.J3 */
/* loaded from: classes2.dex */
public class C2695J3<T extends C2645H3> {

    /* renamed from: a */
    private final InterfaceC2670I3<T> f21487a;

    /* renamed from: b */
    private final InterfaceC2620G3<T> f21488b;

    /* renamed from: com.yandex.metrica.impl.ob.J3$b */
    public static final class b<T extends C2645H3> {

        /* renamed from: a */
        final InterfaceC2670I3<T> f21489a;

        /* renamed from: b */
        InterfaceC2620G3<T> f21490b;

        public b(InterfaceC2670I3<T> interfaceC2670I3) {
            this.f21489a = interfaceC2670I3;
        }

        /* renamed from: a */
        public b<T> m14412a(InterfaceC2620G3<T> interfaceC2620G3) {
            this.f21490b = interfaceC2620G3;
            return this;
        }

        /* renamed from: a */
        public C2695J3<T> m14413a() {
            return new C2695J3<>(this);
        }
    }

    /* renamed from: a */
    public final boolean m14410a(C2645H3 c2645h3) {
        InterfaceC2620G3<T> interfaceC2620G3 = this.f21488b;
        if (interfaceC2620G3 == null) {
            return false;
        }
        return interfaceC2620G3.mo13946a(c2645h3);
    }

    /* renamed from: b */
    public void m14411b(C2645H3 c2645h3) {
        this.f21487a.mo13977a(c2645h3);
    }

    private C2695J3(b bVar) {
        this.f21487a = bVar.f21489a;
        this.f21488b = bVar.f21490b;
    }

    /* renamed from: a */
    public static <T extends C2645H3> b<T> m14409a(InterfaceC2670I3<T> interfaceC2670I3) {
        return new b<>(interfaceC2670I3);
    }
}
