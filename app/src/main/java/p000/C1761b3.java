package p000;

/* renamed from: b3 */
/* loaded from: classes2.dex */
public final class C1761b3 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6216j6 f16720a;

    /* renamed from: b */
    public final /* synthetic */ C0619Jp f16721b;

    /* renamed from: c */
    public final /* synthetic */ C1339VH f16722c;

    public C1761b3(InterfaceC6216j6 interfaceC6216j6, C0619Jp c0619Jp, C1339VH c1339vh) {
        this.f16720a = interfaceC6216j6;
        this.f16721b = c0619Jp;
        this.f16722c = c1339vh;
    }

    /* renamed from: a */
    public final void m10417a(AbstractActivityC4221i6 abstractActivityC4221i6) {
        Object objM7015b;
        this.f16720a.mo8368j(this);
        try {
            ((C0197D7) this.f16722c.f12486b).m1561d(abstractActivityC4221i6);
            objM7015b = C8313Tf1.f11463a;
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        this.f16721b.resumeWith(objM7015b);
    }
}
