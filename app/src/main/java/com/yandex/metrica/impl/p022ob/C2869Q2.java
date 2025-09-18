package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.InterfaceC3354j4;

/* renamed from: com.yandex.metrica.impl.ob.Q2 */
/* loaded from: classes2.dex */
public class C2869Q2<C extends InterfaceC3354j4> implements InterfaceC2594F2 {

    /* renamed from: a */
    private C f21966a;

    /* renamed from: b */
    final Object f21967b = new Object();

    /* renamed from: c */
    boolean f21968c = false;

    /* renamed from: d */
    private final InterfaceC3109Zi f21969d;

    public C2869Q2(C c, InterfaceC3109Zi interfaceC3109Zi) {
        this.f21966a = c;
        this.f21969d = interfaceC3109Zi;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: a */
    public void mo14019a() {
        synchronized (this.f21967b) {
            try {
                if (this.f21968c) {
                    this.f21968c = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: b */
    public void mo14021b() {
        synchronized (this.f21967b) {
            try {
                if (!this.f21968c) {
                    mo14808c();
                    this.f21968c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public void mo14808c() {
    }

    /* renamed from: d */
    public void m14809d() {
        synchronized (this.f21967b) {
            if (!this.f21968c) {
                synchronized (this.f21967b) {
                    try {
                        if (!this.f21968c) {
                            mo14811f();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                mo14808c();
            }
        }
    }

    /* renamed from: e */
    public C m14810e() {
        return this.f21966a;
    }

    /* renamed from: f */
    public void mo14811f() {
        this.f21969d.mo15515a();
    }
}
