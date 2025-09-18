package defpackage;

/* renamed from: b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2251b3 {
    public final /* synthetic */ InterfaceC5248j6 a;
    public final /* synthetic */ C0767Jp b;
    public final /* synthetic */ VH c;

    public C2251b3(InterfaceC5248j6 interfaceC5248j6, C0767Jp c0767Jp, VH vh) {
        this.a = interfaceC5248j6;
        this.b = c0767Jp;
        this.c = vh;
    }

    public final void a(AbstractActivityC4281i6 abstractActivityC4281i6) {
        Object objB;
        this.a.j(this);
        try {
            ((D7) this.c.b).d(abstractActivityC4281i6);
            objB = C1518Tf1.a;
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        this.b.resumeWith(objB);
    }
}
