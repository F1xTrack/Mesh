package defpackage;

/* loaded from: classes.dex */
public final class JO implements InterfaceC5506kS0 {
    public final boolean a;
    public final boolean b;
    public final InterfaceC5506kS0 c;
    public final EO d;
    public final IO e;
    public int f;
    public boolean g;

    public JO(InterfaceC5506kS0 interfaceC5506kS0, boolean z, boolean z2, IO io2, EO eo) {
        IL1.d(interfaceC5506kS0, "Argument must not be null");
        this.c = interfaceC5506kS0;
        this.a = z;
        this.b = z2;
        this.e = io2;
        IL1.d(eo, "Argument must not be null");
        this.d = eo;
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Class a() {
        return this.c.a();
    }

    public final synchronized void b() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.e(this.e, this);
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Object get() {
        return this.c.get();
    }

    @Override // defpackage.InterfaceC5506kS0
    public final int getSize() {
        return this.c.getSize();
    }

    @Override // defpackage.InterfaceC5506kS0
    public final synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
