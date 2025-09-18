package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: wy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11611wy1 implements InterfaceC9307ey0, InterfaceC8348Tx0, InterfaceC7932Lx0 {

    /* renamed from: a */
    public final Object f45209a = new Object();

    /* renamed from: b */
    public final int f45210b;

    /* renamed from: c */
    public final C9450g32 f45211c;

    /* renamed from: d */
    public int f45212d;

    /* renamed from: e */
    public int f45213e;

    /* renamed from: f */
    public int f45214f;

    /* renamed from: g */
    public Exception f45215g;

    /* renamed from: h */
    public boolean f45216h;

    public C11611wy1(int i, C9450g32 c9450g32) {
        this.f45210b = i;
        this.f45211c = c9450g32;
    }

    /* renamed from: a */
    public final void m25728a() {
        int i = this.f45212d + this.f45213e + this.f45214f;
        int i2 = this.f45210b;
        if (i == i2) {
            Exception exc = this.f45215g;
            C9450g32 c9450g32 = this.f45211c;
            if (exc == null) {
                if (this.f45216h) {
                    c9450g32.m18390q();
                    return;
                } else {
                    c9450g32.m18389p(null);
                    return;
                }
            }
            c9450g32.m18388o(new ExecutionException(this.f45213e + " out of " + i2 + " underlying tasks failed", this.f45215g));
        }
    }

    @Override // p000.InterfaceC7932Lx0
    /* renamed from: b */
    public final void mo4300b() {
        synchronized (this.f45209a) {
            this.f45214f++;
            this.f45216h = true;
            m25728a();
        }
    }

    @Override // p000.InterfaceC8348Tx0
    public final void onFailure(Exception exc) {
        synchronized (this.f45209a) {
            this.f45213e++;
            this.f45215g = exc;
            m25728a();
        }
    }

    @Override // p000.InterfaceC9307ey0
    public final void onSuccess(Object obj) {
        synchronized (this.f45209a) {
            this.f45212d++;
            m25728a();
        }
    }
}
