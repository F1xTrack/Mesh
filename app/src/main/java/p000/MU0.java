package p000;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class MU0 implements InterfaceC9841j70 {

    /* renamed from: d */
    public final InterfaceC9841j70 f7187d;

    /* renamed from: e */
    public final Surface f7188e;

    /* renamed from: f */
    public InterfaceC7144xX f7189f;

    /* renamed from: a */
    public final Object f7184a = new Object();

    /* renamed from: b */
    public int f7185b = 0;

    /* renamed from: c */
    public boolean f7186c = false;

    /* renamed from: g */
    public final C10479o60 f7190g = new C10479o60(1, this);

    public MU0(InterfaceC9841j70 interfaceC9841j70) {
        this.f7187d = interfaceC9841j70;
        this.f7188e = interfaceC9841j70.mo4044h();
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: a */
    public final InterfaceC9457g70 mo4037a() {
        C10607p60 c10607p60;
        synchronized (this.f7184a) {
            InterfaceC9457g70 interfaceC9457g70Mo4037a = this.f7187d.mo4037a();
            if (interfaceC9457g70Mo4037a != null) {
                this.f7185b++;
                c10607p60 = new C10607p60(interfaceC9457g70Mo4037a);
                c10607p60.m26161a(this.f7190g);
            } else {
                c10607p60 = null;
            }
        }
        return c10607p60;
    }

    /* renamed from: b */
    public final void m5386b() {
        synchronized (this.f7184a) {
            try {
                this.f7186c = true;
                this.f7187d.mo4042f();
                if (this.f7185b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: c */
    public final int mo4039c() {
        int iMo4039c;
        synchronized (this.f7184a) {
            iMo4039c = this.f7187d.mo4039c();
        }
        return iMo4039c;
    }

    @Override // p000.InterfaceC9841j70
    public final void close() {
        synchronized (this.f7184a) {
            try {
                Surface surface = this.f7188e;
                if (surface != null) {
                    surface.release();
                }
                this.f7187d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: f */
    public final void mo4042f() {
        synchronized (this.f7184a) {
            this.f7187d.mo4042f();
        }
    }

    @Override // p000.InterfaceC9841j70
    public final int getHeight() {
        int height;
        synchronized (this.f7184a) {
            height = this.f7187d.getHeight();
        }
        return height;
    }

    @Override // p000.InterfaceC9841j70
    public final int getWidth() {
        int width;
        synchronized (this.f7184a) {
            width = this.f7187d.getWidth();
        }
        return width;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: h */
    public final Surface mo4044h() {
        Surface surfaceMo4044h;
        synchronized (this.f7184a) {
            surfaceMo4044h = this.f7187d.mo4044h();
        }
        return surfaceMo4044h;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: k */
    public final void mo4047k(InterfaceC9713i70 interfaceC9713i70, Executor executor) {
        synchronized (this.f7184a) {
            this.f7187d.mo4047k(new H30(this, 11, interfaceC9713i70), executor);
        }
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: l */
    public final int mo4048l() {
        int iMo4048l;
        synchronized (this.f7184a) {
            iMo4048l = this.f7187d.mo4048l();
        }
        return iMo4048l;
    }

    @Override // p000.InterfaceC9841j70
    /* renamed from: n */
    public final InterfaceC9457g70 mo4049n() {
        C10607p60 c10607p60;
        synchronized (this.f7184a) {
            InterfaceC9457g70 interfaceC9457g70Mo4049n = this.f7187d.mo4049n();
            if (interfaceC9457g70Mo4049n != null) {
                this.f7185b++;
                c10607p60 = new C10607p60(interfaceC9457g70Mo4049n);
                c10607p60.m26161a(this.f7190g);
            } else {
                c10607p60 = null;
            }
        }
        return c10607p60;
    }
}
