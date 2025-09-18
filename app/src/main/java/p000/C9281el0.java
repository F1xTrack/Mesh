package p000;

/* renamed from: el0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9281el0 implements InterfaceC10011kS0, InterfaceC6301kS {

    /* renamed from: e */
    public static final C8539Xo1 f26822e = AbstractC8137Pv1.m6489b(20, new C10212m12(16));

    /* renamed from: a */
    public final F41 f26823a = new F41();

    /* renamed from: b */
    public InterfaceC10011kS0 f26824b;

    /* renamed from: c */
    public boolean f26825c;

    /* renamed from: d */
    public boolean f26826d;

    @Override // p000.InterfaceC10011kS0
    /* renamed from: a */
    public final Class mo4302a() {
        return this.f26824b.mo4302a();
    }

    @Override // p000.InterfaceC6301kS
    /* renamed from: b */
    public final F41 mo3389b() {
        return this.f26823a;
    }

    /* renamed from: c */
    public final synchronized void m18030c() {
        this.f26823a.m2490a();
        if (!this.f26825c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f26825c = false;
        if (this.f26826d) {
            recycle();
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final Object get() {
        return this.f26824b.get();
    }

    @Override // p000.InterfaceC10011kS0
    public final int getSize() {
        return this.f26824b.getSize();
    }

    @Override // p000.InterfaceC10011kS0
    public final synchronized void recycle() {
        this.f26823a.m2490a();
        this.f26826d = true;
        if (!this.f26825c) {
            this.f26824b.recycle();
            this.f26824b = null;
            f26822e.mo4580d(this);
        }
    }
}
