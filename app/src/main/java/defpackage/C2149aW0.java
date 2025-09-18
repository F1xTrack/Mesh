package defpackage;

/* renamed from: aW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2149aW0 implements InterfaceC7158t60 {
    public final InterfaceC7158t60 a;
    public final Object b = new Object();
    public boolean c;
    public C1693Vm d;

    public C2149aW0(InterfaceC7158t60 interfaceC7158t60) {
        this.a = interfaceC7158t60;
    }

    @Override // defpackage.InterfaceC7158t60
    public final void a(long j, C1693Vm c1693Vm) {
        C1518Tf1 c1518Tf1;
        O90.f(c1693Vm, "screenFlashListener");
        synchronized (this.b) {
            this.c = true;
            this.d = c1693Vm;
        }
        InterfaceC7158t60 interfaceC7158t60 = this.a;
        if (interfaceC7158t60 != null) {
            interfaceC7158t60.a(j, new C1693Vm(1, this));
            c1518Tf1 = C1518Tf1.a;
        } else {
            c1518Tf1 = null;
        }
        if (c1518Tf1 == null) {
            AbstractC0759Jm0.f("ScreenFlashWrapper");
            c();
        }
    }

    public final void b() {
        C1518Tf1 c1518Tf1;
        synchronized (this.b) {
            try {
                if (this.c) {
                    InterfaceC7158t60 interfaceC7158t60 = this.a;
                    if (interfaceC7158t60 != null) {
                        interfaceC7158t60.clear();
                        c1518Tf1 = C1518Tf1.a;
                    } else {
                        c1518Tf1 = null;
                    }
                    if (c1518Tf1 == null) {
                        AbstractC0759Jm0.f("ScreenFlashWrapper");
                    }
                } else {
                    AbstractC0759Jm0.f("ScreenFlashWrapper");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                C1693Vm c1693Vm = this.d;
                if (c1693Vm != null) {
                    c1693Vm.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7158t60
    public final void clear() {
        b();
    }
}
