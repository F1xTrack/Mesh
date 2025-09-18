package defpackage;

/* renamed from: el0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3641el0 implements InterfaceC5506kS0, InterfaceC5505kS {
    public static final C1857Xo1 e = AbstractC1254Pv1.b(20, new C5806m12(16));
    public final F41 a = new F41();
    public InterfaceC5506kS0 b;
    public boolean c;
    public boolean d;

    @Override // defpackage.InterfaceC5506kS0
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.InterfaceC5505kS
    public final F41 b() {
        return this.a;
    }

    public final synchronized void c() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Object get() {
        return this.b.get();
    }

    @Override // defpackage.InterfaceC5506kS0
    public final int getSize() {
        return this.b.getSize();
    }

    @Override // defpackage.InterfaceC5506kS0
    public final synchronized void recycle() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.recycle();
            this.b = null;
            e.d(this);
        }
    }
}
