package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class MU0 implements InterfaceC5252j70 {
    public final InterfaceC5252j70 d;
    public final Surface e;
    public InterfaceC8000xX f;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final C6204o60 g = new C6204o60(1, this);

    public MU0(InterfaceC5252j70 interfaceC5252j70) {
        this.d = interfaceC5252j70;
        this.e = interfaceC5252j70.h();
    }

    @Override // defpackage.InterfaceC5252j70
    public final InterfaceC3903g70 a() {
        C6395p60 c6395p60;
        synchronized (this.a) {
            InterfaceC3903g70 interfaceC3903g70A = this.d.a();
            if (interfaceC3903g70A != null) {
                this.b++;
                c6395p60 = new C6395p60(interfaceC3903g70A);
                c6395p60.a(this.g);
            } else {
                c6395p60 = null;
            }
        }
        return c6395p60;
    }

    public final void b() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.d.f();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.d.c();
        }
        return iC;
    }

    @Override // defpackage.InterfaceC5252j70
    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final void f() {
        synchronized (this.a) {
            this.d.f();
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.d.getHeight();
        }
        return height;
    }

    @Override // defpackage.InterfaceC5252j70
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.d.getWidth();
        }
        return width;
    }

    @Override // defpackage.InterfaceC5252j70
    public final Surface h() {
        Surface surfaceH;
        synchronized (this.a) {
            surfaceH = this.d.h();
        }
        return surfaceH;
    }

    @Override // defpackage.InterfaceC5252j70
    public final void k(InterfaceC4285i70 interfaceC4285i70, Executor executor) {
        synchronized (this.a) {
            this.d.k(new H30(this, 11, interfaceC4285i70), executor);
        }
    }

    @Override // defpackage.InterfaceC5252j70
    public final int l() {
        int iL;
        synchronized (this.a) {
            iL = this.d.l();
        }
        return iL;
    }

    @Override // defpackage.InterfaceC5252j70
    public final InterfaceC3903g70 n() {
        C6395p60 c6395p60;
        synchronized (this.a) {
            InterfaceC3903g70 interfaceC3903g70N = this.d.n();
            if (interfaceC3903g70N != null) {
                this.b++;
                c6395p60 = new C6395p60(interfaceC3903g70N);
                c6395p60.a(this.g);
            } else {
                c6395p60 = null;
            }
        }
        return c6395p60;
    }
}
