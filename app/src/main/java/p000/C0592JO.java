package p000;

/* renamed from: JO */
/* loaded from: classes.dex */
public final class C0592JO implements InterfaceC10011kS0 {

    /* renamed from: a */
    public final boolean f5502a;

    /* renamed from: b */
    public final boolean f5503b;

    /* renamed from: c */
    public final InterfaceC10011kS0 f5504c;

    /* renamed from: d */
    public final C0277EO f5505d;

    /* renamed from: e */
    public final C0529IO f5506e;

    /* renamed from: f */
    public int f5507f;

    /* renamed from: g */
    public boolean f5508g;

    public C0592JO(InterfaceC10011kS0 interfaceC10011kS0, boolean z, boolean z2, C0529IO c0529io, C0277EO c0277eo) {
        IL1.m3830d(interfaceC10011kS0, "Argument must not be null");
        this.f5504c = interfaceC10011kS0;
        this.f5502a = z;
        this.f5503b = z2;
        this.f5506e = c0529io;
        IL1.m3830d(c0277eo, "Argument must not be null");
        this.f5505d = c0277eo;
    }

    @Override // p000.InterfaceC10011kS0
    /* renamed from: a */
    public final Class mo4302a() {
        return this.f5504c.mo4302a();
    }

    /* renamed from: b */
    public final synchronized void m4303b() {
        if (this.f5508g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f5507f++;
    }

    /* renamed from: c */
    public final void m4304c() {
        boolean z;
        synchronized (this) {
            int i = this.f5507f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f5507f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f5505d.m2206e(this.f5506e, this);
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final Object get() {
        return this.f5504c.get();
    }

    @Override // p000.InterfaceC10011kS0
    public final int getSize() {
        return this.f5504c.getSize();
    }

    @Override // p000.InterfaceC10011kS0
    public final synchronized void recycle() {
        if (this.f5507f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f5508g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f5508g = true;
        if (this.f5503b) {
            this.f5504c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f5502a + ", listener=" + this.f5505d + ", key=" + this.f5506e + ", acquired=" + this.f5507f + ", isRecycled=" + this.f5508g + ", resource=" + this.f5504c + '}';
    }
}
