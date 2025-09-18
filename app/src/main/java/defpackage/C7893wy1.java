package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: wy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7893wy1 implements InterfaceC3680ey0, InterfaceC1571Tx0, InterfaceC0947Lx0 {
    public final Object a = new Object();
    public final int b;
    public final C3892g32 c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public C7893wy1(int i, C3892g32 c3892g32) {
        this.b = i;
        this.c = c3892g32;
    }

    public final void a() {
        int i = this.d + this.e + this.f;
        int i2 = this.b;
        if (i == i2) {
            Exception exc = this.g;
            C3892g32 c3892g32 = this.c;
            if (exc == null) {
                if (this.h) {
                    c3892g32.q();
                    return;
                } else {
                    c3892g32.p(null);
                    return;
                }
            }
            c3892g32.o(new ExecutionException(this.e + " out of " + i2 + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.InterfaceC0947Lx0
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    @Override // defpackage.InterfaceC1571Tx0
    public final void onFailure(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    @Override // defpackage.InterfaceC3680ey0
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
