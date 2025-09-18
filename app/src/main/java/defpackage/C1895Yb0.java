package defpackage;

/* renamed from: Yb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1895Yb0 extends C0767Jp {
    public final C2548cc0 i;

    public C1895Yb0(InterfaceC1729Vy interfaceC1729Vy, C2548cc0 c2548cc0) {
        super(1, interfaceC1729Vy);
        this.i = c2548cc0;
    }

    @Override // defpackage.C0767Jp
    public final Throwable q(C2548cc0 c2548cc0) {
        Throwable thB;
        C2548cc0 c2548cc02 = this.i;
        c2548cc02.getClass();
        Object obj = C2548cc0.a.get(c2548cc02);
        return (!(obj instanceof C2167ac0) || (thB = ((C2167ac0) obj).b()) == null) ? obj instanceof C6165nv ? ((C6165nv) obj).a : c2548cc0.u() : thB;
    }

    @Override // defpackage.C0767Jp
    public final String z() {
        return "AwaitContinuation";
    }
}
