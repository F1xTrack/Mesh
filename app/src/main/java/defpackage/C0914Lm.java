package defpackage;

/* renamed from: Lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914Lm implements InterfaceC7477un {
    public final ExecutorC5715lY0 a;
    public final C1303Qm b;
    public final int c;

    public C0914Lm(C1303Qm c1303Qm, ExecutorC5715lY0 executorC5715lY0, int i) {
        this.b = c1303Qm;
        this.a = executorC5715lY0;
        this.c = i;
    }

    @Override // defpackage.InterfaceC7477un
    public final InterfaceFutureC0750Jj0 a() {
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        QZ qzA = QZ.a(this.b.a(this.c));
        C0680Im c0680Im = new C0680Im(1);
        qzA.getClass();
        return AbstractC1500Sz1.r(qzA, new C0136Bm1(20, c0680Im), this.a);
    }

    @Override // defpackage.InterfaceC7477un
    public final InterfaceFutureC0750Jj0 b() {
        return AbstractC8171yQ1.b(new B7(8, this));
    }
}
