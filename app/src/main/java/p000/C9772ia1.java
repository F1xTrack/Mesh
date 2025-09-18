package p000;

/* renamed from: ia1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9772ia1 implements InterfaceC11798yR0, InterfaceC10905rR0 {

    /* renamed from: a */
    public final InterfaceC11798yR0 f29329a;

    /* renamed from: b */
    public final Object f29330b;

    /* renamed from: c */
    public volatile J11 f29331c;

    /* renamed from: d */
    public volatile InterfaceC10905rR0 f29332d;

    /* renamed from: e */
    public int f29333e = 3;

    /* renamed from: f */
    public int f29334f = 3;

    /* renamed from: g */
    public boolean f29335g;

    public C9772ia1(Object obj, InterfaceC11798yR0 interfaceC11798yR0) {
        this.f29330b = obj;
        this.f29329a = interfaceC11798yR0;
    }

    @Override // p000.InterfaceC11798yR0, p000.InterfaceC10905rR0
    /* renamed from: a */
    public final boolean mo4116a() {
        boolean z;
        synchronized (this.f29330b) {
            try {
                z = this.f29332d.mo4116a() || this.f29331c.mo4116a();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: b */
    public final boolean mo4117b(InterfaceC10905rR0 interfaceC10905rR0) {
        if (!(interfaceC10905rR0 instanceof C9772ia1)) {
            return false;
        }
        C9772ia1 c9772ia1 = (C9772ia1) interfaceC10905rR0;
        if (this.f29331c == null) {
            if (c9772ia1.f29331c != null) {
                return false;
            }
        } else if (!this.f29331c.mo4117b(c9772ia1.f29331c)) {
            return false;
        }
        if (this.f29332d == null) {
            if (c9772ia1.f29332d != null) {
                return false;
            }
        } else if (!this.f29332d.mo4117b(c9772ia1.f29332d)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC11798yR0
    /* renamed from: c */
    public final void mo17582c(InterfaceC10905rR0 interfaceC10905rR0) {
        synchronized (this.f29330b) {
            try {
                if (!interfaceC10905rR0.equals(this.f29331c)) {
                    this.f29334f = 5;
                    return;
                }
                this.f29333e = 5;
                InterfaceC11798yR0 interfaceC11798yR0 = this.f29329a;
                if (interfaceC11798yR0 != null) {
                    interfaceC11798yR0.mo17582c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC10905rR0
    public final void clear() {
        synchronized (this.f29330b) {
            this.f29335g = false;
            this.f29333e = 3;
            this.f29334f = 3;
            this.f29332d.clear();
            this.f29331c.clear();
        }
    }

    @Override // p000.InterfaceC11798yR0
    /* renamed from: d */
    public final void mo17583d(InterfaceC10905rR0 interfaceC10905rR0) {
        synchronized (this.f29330b) {
            try {
                if (interfaceC10905rR0.equals(this.f29332d)) {
                    this.f29334f = 4;
                    return;
                }
                this.f29333e = 4;
                InterfaceC11798yR0 interfaceC11798yR0 = this.f29329a;
                if (interfaceC11798yR0 != null) {
                    interfaceC11798yR0.mo17583d(this);
                }
                if (!AbstractC11153tN0.m24904p(this.f29334f)) {
                    this.f29332d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC11798yR0
    /* renamed from: e */
    public final InterfaceC11798yR0 mo17584e() {
        InterfaceC11798yR0 interfaceC11798yR0Mo17584e;
        synchronized (this.f29330b) {
            try {
                InterfaceC11798yR0 interfaceC11798yR0 = this.f29329a;
                interfaceC11798yR0Mo17584e = interfaceC11798yR0 != null ? interfaceC11798yR0.mo17584e() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11798yR0Mo17584e;
    }

    @Override // p000.InterfaceC11798yR0
    /* renamed from: f */
    public final boolean mo17585f(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z;
        synchronized (this.f29330b) {
            try {
                InterfaceC11798yR0 interfaceC11798yR0 = this.f29329a;
                z = (interfaceC11798yR0 == null || interfaceC11798yR0.mo17585f(this)) && interfaceC10905rR0.equals(this.f29331c) && this.f29333e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC11798yR0
    /* renamed from: g */
    public final boolean mo17586g(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z;
        synchronized (this.f29330b) {
            try {
                InterfaceC11798yR0 interfaceC11798yR0 = this.f29329a;
                z = (interfaceC11798yR0 == null || interfaceC11798yR0.mo17586g(this)) && interfaceC10905rR0.equals(this.f29331c) && !mo4116a();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC11798yR0
    /* renamed from: h */
    public final boolean mo17587h(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z;
        synchronized (this.f29330b) {
            try {
                InterfaceC11798yR0 interfaceC11798yR0 = this.f29329a;
                z = (interfaceC11798yR0 == null || interfaceC11798yR0.mo17587h(this)) && (interfaceC10905rR0.equals(this.f29331c) || this.f29333e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: i */
    public final boolean mo4124i() {
        boolean z;
        synchronized (this.f29330b) {
            z = this.f29333e == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f29330b) {
            z = true;
            if (this.f29333e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: j */
    public final void mo4125j() {
        synchronized (this.f29330b) {
            try {
                this.f29335g = true;
                try {
                    if (this.f29333e != 4 && this.f29334f != 1) {
                        this.f29334f = 1;
                        this.f29332d.mo4125j();
                    }
                    if (this.f29335g && this.f29333e != 1) {
                        this.f29333e = 1;
                        this.f29331c.mo4125j();
                    }
                    this.f29335g = false;
                } catch (Throwable th) {
                    this.f29335g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: k */
    public final boolean mo4126k() {
        boolean z;
        synchronized (this.f29330b) {
            z = this.f29333e == 4;
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    public final void pause() {
        synchronized (this.f29330b) {
            try {
                if (!AbstractC11153tN0.m24904p(this.f29334f)) {
                    this.f29334f = 2;
                    this.f29332d.pause();
                }
                if (!AbstractC11153tN0.m24904p(this.f29333e)) {
                    this.f29333e = 2;
                    this.f29331c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
