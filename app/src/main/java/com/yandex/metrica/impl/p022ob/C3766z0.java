package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2945T4;

/* renamed from: com.yandex.metrica.impl.ob.z0 */
/* loaded from: classes2.dex */
public class C3766z0<C extends C2945T4> extends C2869Q2<C> {

    /* renamed from: e */
    private final C3095Z4 f25353e;

    /* renamed from: f */
    private final C2675I8 f25354f;

    public C3766z0(C c, InterfaceC3109Zi interfaceC3109Zi, C3095Z4 c3095z4, C2675I8 c2675i8) {
        super(c, interfaceC3109Zi);
        this.f25353e = c3095z4;
        this.f25354f = c2675i8;
    }

    /* renamed from: a */
    public void m17313a(C3376k0 c3376k0) {
        if (this.f21968c) {
            return;
        }
        synchronized (this.f21967b) {
            try {
                if (!this.f21968c) {
                    mo14811f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2995V4 c2995v4 = new C2995V4(m14810e(), c3376k0, this.f25353e, this.f25354f);
        C2892R1 c2892r1M14741l = C2842P0.m14728i().m14741l();
        if (c2892r1M14741l != null) {
            c2892r1M14741l.m14967b(c2995v4);
        }
    }
}
