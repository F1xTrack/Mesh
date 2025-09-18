package defpackage;

/* renamed from: dP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3384dP implements InterfaceC8173yR0, InterfaceC6839rR0 {
    public final Object a;
    public final Object b;
    public volatile InterfaceC6839rR0 c;
    public volatile InterfaceC6839rR0 d;
    public int e = 3;
    public int f = 3;

    public C3384dP(Object obj, InterfaceC8173yR0 interfaceC8173yR0) {
        this.a = obj;
        this.b = interfaceC8173yR0;
    }

    @Override // defpackage.InterfaceC8173yR0, defpackage.InterfaceC6839rR0
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean b(InterfaceC6839rR0 interfaceC6839rR0) {
        if (!(interfaceC6839rR0 instanceof C3384dP)) {
            return false;
        }
        C3384dP c3384dP = (C3384dP) interfaceC6839rR0;
        return this.c.b(c3384dP.c) && this.d.b(c3384dP.d);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, yR0] */
    @Override // defpackage.InterfaceC8173yR0
    public final void c(InterfaceC6839rR0 interfaceC6839rR0) {
        synchronized (this.a) {
            try {
                if (interfaceC6839rR0.equals(this.d)) {
                    this.f = 5;
                    ?? r3 = this.b;
                    if (r3 != 0) {
                        r3.c(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yR0] */
    @Override // defpackage.InterfaceC8173yR0
    public final void d(InterfaceC6839rR0 interfaceC6839rR0) {
        synchronized (this.a) {
            try {
                if (interfaceC6839rR0.equals(this.c)) {
                    this.e = 4;
                } else if (interfaceC6839rR0.equals(this.d)) {
                    this.f = 4;
                }
                ?? r4 = this.b;
                if (r4 != 0) {
                    r4.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yR0] */
    @Override // defpackage.InterfaceC8173yR0
    public final InterfaceC8173yR0 e() {
        InterfaceC8173yR0 interfaceC8173yR0E;
        synchronized (this.a) {
            try {
                ?? r1 = this.b;
                interfaceC8173yR0E = r1 != 0 ? r1.e() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8173yR0E;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yR0] */
    @Override // defpackage.InterfaceC8173yR0
    public final boolean f(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z;
        synchronized (this.a) {
            ?? r1 = this.b;
            z = (r1 == 0 || r1.f(this)) && interfaceC6839rR0.equals(this.c);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yR0] */
    @Override // defpackage.InterfaceC8173yR0
    public final boolean g(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z;
        int i;
        synchronized (this.a) {
            ?? r1 = this.b;
            z = false;
            if (r1 == 0 || r1.g(this)) {
                if (this.e != 5 ? interfaceC6839rR0.equals(this.c) : interfaceC6839rR0.equals(this.d) && ((i = this.f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yR0] */
    @Override // defpackage.InterfaceC8173yR0
    public final boolean h(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z;
        synchronized (this.a) {
            ?? r0 = this.b;
            z = r0 == 0 || r0.h(this);
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void j() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void pause() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.pause();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
