package p000;

/* renamed from: Lm */
/* loaded from: classes.dex */
public final class C0741Lm implements InterfaceC6971un {

    /* renamed from: a */
    public final ExecutorC10151lY0 f6847a;

    /* renamed from: b */
    public final C1056Qm f6848b;

    /* renamed from: c */
    public final int f6849c;

    public C0741Lm(C1056Qm c1056Qm, ExecutorC10151lY0 executorC10151lY0, int i) {
        this.f6848b = c1056Qm;
        this.f6847a = executorC10151lY0;
        this.f6849c = i;
    }

    @Override // p000.InterfaceC6971un
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 mo5104a() {
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(this.f6848b.m6753a(this.f6849c));
        C0553Im c0553Im = new C0553Im(1);
        c1043qzM6727a.getClass();
        return AbstractC8301Sz1.m7495r(c1043qzM6727a, new C7391Bm1(20, c0553Im), this.f6847a);
    }

    @Override // p000.InterfaceC6971un
    /* renamed from: b */
    public final InterfaceFutureC7800Jj0 mo5105b() {
        return AbstractC11797yQ1.m26149b(new C0071B7(8, this));
    }
}
