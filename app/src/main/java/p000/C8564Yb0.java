package p000;

/* renamed from: Yb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8564Yb0 extends C0619Jp {

    /* renamed from: i */
    public final C9002cc0 f14367i;

    public C8564Yb0(InterfaceC1382Vy interfaceC1382Vy, C9002cc0 c9002cc0) {
        super(1, interfaceC1382Vy);
        this.f14367i = c9002cc0;
    }

    @Override // p000.C0619Jp
    /* renamed from: q */
    public final Throwable mo4437q(C9002cc0 c9002cc0) {
        Throwable thM9771b;
        C9002cc0 c9002cc02 = this.f14367i;
        c9002cc02.getClass();
        Object obj = C9002cc0.f17647a.get(c9002cc02);
        return (!(obj instanceof C8746ac0) || (thM9771b = ((C8746ac0) obj).m9771b()) == null) ? obj instanceof C6519nv ? ((C6519nv) obj).f38606a : c9002cc0.m10818u() : thM9771b;
    }

    @Override // p000.C0619Jp
    /* renamed from: z */
    public final String mo4445z() {
        return "AwaitContinuation";
    }
}
