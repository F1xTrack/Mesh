package p000;

/* renamed from: dP */
/* loaded from: classes.dex */
public final class C3926dP implements InterfaceC11798yR0, InterfaceC10905rR0 {

    /* renamed from: a */
    public final Object f26014a;

    /* renamed from: b */
    public final Object f26015b;

    /* renamed from: c */
    public volatile InterfaceC10905rR0 f26016c;

    /* renamed from: d */
    public volatile InterfaceC10905rR0 f26017d;

    /* renamed from: e */
    public int f26018e = 3;

    /* renamed from: f */
    public int f26019f = 3;

    public C3926dP(Object obj, InterfaceC11798yR0 interfaceC11798yR0) {
        this.f26014a = obj;
        this.f26015b = interfaceC11798yR0;
    }

    @Override // p000.InterfaceC11798yR0, p000.InterfaceC10905rR0
    /* renamed from: a */
    public final boolean mo4116a() {
        boolean z;
        synchronized (this.f26014a) {
            try {
                z = this.f26016c.mo4116a() || this.f26017d.mo4116a();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: b */
    public final boolean mo4117b(InterfaceC10905rR0 interfaceC10905rR0) {
        if (!(interfaceC10905rR0 instanceof C3926dP)) {
            return false;
        }
        C3926dP c3926dP = (C3926dP) interfaceC10905rR0;
        return this.f26016c.mo4117b(c3926dP.f26016c) && this.f26017d.mo4117b(c3926dP.f26017d);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, yR0] */
    @Override // p000.InterfaceC11798yR0
    /* renamed from: c */
    public final void mo17582c(InterfaceC10905rR0 interfaceC10905rR0) {
        synchronized (this.f26014a) {
            try {
                if (interfaceC10905rR0.equals(this.f26017d)) {
                    this.f26019f = 5;
                    ?? r3 = this.f26015b;
                    if (r3 != 0) {
                        r3.mo17582c(this);
                    }
                    return;
                }
                this.f26018e = 5;
                if (this.f26019f != 1) {
                    this.f26019f = 1;
                    this.f26017d.mo4125j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC10905rR0
    public final void clear() {
        synchronized (this.f26014a) {
            try {
                this.f26018e = 3;
                this.f26016c.clear();
                if (this.f26019f != 3) {
                    this.f26019f = 3;
                    this.f26017d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yR0] */
    @Override // p000.InterfaceC11798yR0
    /* renamed from: d */
    public final void mo17583d(InterfaceC10905rR0 interfaceC10905rR0) {
        synchronized (this.f26014a) {
            try {
                if (interfaceC10905rR0.equals(this.f26016c)) {
                    this.f26018e = 4;
                } else if (interfaceC10905rR0.equals(this.f26017d)) {
                    this.f26019f = 4;
                }
                ?? r4 = this.f26015b;
                if (r4 != 0) {
                    r4.mo17583d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yR0] */
    @Override // p000.InterfaceC11798yR0
    /* renamed from: e */
    public final InterfaceC11798yR0 mo17584e() {
        InterfaceC11798yR0 interfaceC11798yR0Mo17584e;
        synchronized (this.f26014a) {
            try {
                ?? r1 = this.f26015b;
                interfaceC11798yR0Mo17584e = r1 != 0 ? r1.mo17584e() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11798yR0Mo17584e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yR0] */
    @Override // p000.InterfaceC11798yR0
    /* renamed from: f */
    public final boolean mo17585f(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z;
        synchronized (this.f26014a) {
            ?? r1 = this.f26015b;
            z = (r1 == 0 || r1.mo17585f(this)) && interfaceC10905rR0.equals(this.f26016c);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yR0] */
    @Override // p000.InterfaceC11798yR0
    /* renamed from: g */
    public final boolean mo17586g(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z;
        int i;
        synchronized (this.f26014a) {
            ?? r1 = this.f26015b;
            z = false;
            if (r1 == 0 || r1.mo17586g(this)) {
                if (this.f26018e != 5 ? interfaceC10905rR0.equals(this.f26016c) : interfaceC10905rR0.equals(this.f26017d) && ((i = this.f26019f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yR0] */
    @Override // p000.InterfaceC11798yR0
    /* renamed from: h */
    public final boolean mo17587h(InterfaceC10905rR0 interfaceC10905rR0) {
        boolean z;
        synchronized (this.f26014a) {
            ?? r0 = this.f26015b;
            z = r0 == 0 || r0.mo17587h(this);
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: i */
    public final boolean mo4124i() {
        boolean z;
        synchronized (this.f26014a) {
            try {
                z = this.f26018e == 3 && this.f26019f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f26014a) {
            try {
                z = true;
                if (this.f26018e != 1 && this.f26019f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: j */
    public final void mo4125j() {
        synchronized (this.f26014a) {
            try {
                if (this.f26018e != 1) {
                    this.f26018e = 1;
                    this.f26016c.mo4125j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC10905rR0
    /* renamed from: k */
    public final boolean mo4126k() {
        boolean z;
        synchronized (this.f26014a) {
            try {
                z = this.f26018e == 4 || this.f26019f == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.InterfaceC10905rR0
    public final void pause() {
        synchronized (this.f26014a) {
            try {
                if (this.f26018e == 1) {
                    this.f26018e = 2;
                    this.f26016c.pause();
                }
                if (this.f26019f == 1) {
                    this.f26019f = 2;
                    this.f26017d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
