package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.im */
/* loaded from: classes2.dex */
public class C5206im implements InterfaceC5528vj {

    /* renamed from: a */
    public final InterfaceC4392Ba f31948a;

    /* renamed from: b */
    public final Object f31949b = new Object();

    /* renamed from: c */
    public boolean f31950c = false;

    /* renamed from: d */
    public final InterfaceC4645Lk f31951d;

    public C5206im(InterfaceC4392Ba interfaceC4392Ba, InterfaceC4645Lk interfaceC4645Lk) {
        this.f31948a = interfaceC4392Ba;
        this.f31951d = interfaceC4645Lk;
    }

    /* renamed from: a */
    public void mo19639a() {
    }

    /* renamed from: b */
    public final void m20582b() {
        synchronized (this.f31949b) {
            try {
                if (!this.f31950c) {
                    m20585e();
                    mo19639a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final InterfaceC4392Ba m20583c() {
        return this.f31948a;
    }

    /* renamed from: d */
    public final InterfaceC4645Lk m20584d() {
        return this.f31951d;
    }

    /* renamed from: e */
    public final void m20585e() {
        synchronized (this.f31949b) {
            try {
                if (!this.f31950c) {
                    mo19640f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void mo19640f() {
        this.f31951d.mo19601a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final void onCreate() {
        synchronized (this.f31949b) {
            try {
                if (this.f31950c) {
                    this.f31950c = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final void onDestroy() {
        synchronized (this.f31949b) {
            try {
                if (!this.f31950c) {
                    mo19639a();
                    this.f31950c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
