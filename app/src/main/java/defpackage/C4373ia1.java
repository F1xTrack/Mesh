package defpackage;

/* renamed from: ia1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4373ia1 implements InterfaceC8173yR0, InterfaceC6839rR0 {
    public final InterfaceC8173yR0 a;
    public final Object b;
    public volatile J11 c;
    public volatile InterfaceC6839rR0 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public C4373ia1(Object obj, InterfaceC8173yR0 interfaceC8173yR0) {
        this.b = obj;
        this.a = interfaceC8173yR0;
    }

    @Override // defpackage.InterfaceC8173yR0, defpackage.InterfaceC6839rR0
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean b(InterfaceC6839rR0 interfaceC6839rR0) {
        if (!(interfaceC6839rR0 instanceof C4373ia1)) {
            return false;
        }
        C4373ia1 c4373ia1 = (C4373ia1) interfaceC6839rR0;
        if (this.c == null) {
            if (c4373ia1.c != null) {
                return false;
            }
        } else if (!this.c.b(c4373ia1.c)) {
            return false;
        }
        if (this.d == null) {
            if (c4373ia1.d != null) {
                return false;
            }
        } else if (!this.d.b(c4373ia1.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC8173yR0
    public final void c(InterfaceC6839rR0 interfaceC6839rR0) {
        synchronized (this.b) {
            try {
                if (!interfaceC6839rR0.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                InterfaceC8173yR0 interfaceC8173yR0 = this.a;
                if (interfaceC8173yR0 != null) {
                    interfaceC8173yR0.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.InterfaceC8173yR0
    public final void d(InterfaceC6839rR0 interfaceC6839rR0) {
        synchronized (this.b) {
            try {
                if (interfaceC6839rR0.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                InterfaceC8173yR0 interfaceC8173yR0 = this.a;
                if (interfaceC8173yR0 != null) {
                    interfaceC8173yR0.d(this);
                }
                if (!AbstractC7209tN0.p(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8173yR0
    public final InterfaceC8173yR0 e() {
        InterfaceC8173yR0 interfaceC8173yR0E;
        synchronized (this.b) {
            try {
                InterfaceC8173yR0 interfaceC8173yR0 = this.a;
                interfaceC8173yR0E = interfaceC8173yR0 != null ? interfaceC8173yR0.e() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8173yR0E;
    }

    @Override // defpackage.InterfaceC8173yR0
    public final boolean f(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z;
        synchronized (this.b) {
            try {
                InterfaceC8173yR0 interfaceC8173yR0 = this.a;
                z = (interfaceC8173yR0 == null || interfaceC8173yR0.f(this)) && interfaceC6839rR0.equals(this.c) && this.e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC8173yR0
    public final boolean g(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z;
        synchronized (this.b) {
            try {
                InterfaceC8173yR0 interfaceC8173yR0 = this.a;
                z = (interfaceC8173yR0 == null || interfaceC8173yR0.g(this)) && interfaceC6839rR0.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC8173yR0
    public final boolean h(InterfaceC6839rR0 interfaceC6839rR0) {
        boolean z;
        synchronized (this.b) {
            try {
                InterfaceC8173yR0 interfaceC8173yR0 = this.a;
                z = (interfaceC8173yR0 == null || interfaceC8173yR0.h(this)) && (interfaceC6839rR0.equals(this.c) || this.e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void j() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.j();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.j();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC6839rR0
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.InterfaceC6839rR0
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!AbstractC7209tN0.p(this.f)) {
                    this.f = 2;
                    this.d.pause();
                }
                if (!AbstractC7209tN0.p(this.e)) {
                    this.e = 2;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
