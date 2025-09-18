package p000;

/* renamed from: Wt0 */
/* loaded from: classes2.dex */
public final class C8496Wt0 extends AbstractC0377Fz implements InterfaceC6939uH {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6939uH f13439c;

    /* renamed from: d */
    public final AbstractC0377Fz f13440d;

    /* renamed from: e */
    public final String f13441e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8496Wt0(AbstractC0377Fz abstractC0377Fz, String str) {
        InterfaceC6939uH interfaceC6939uH = abstractC0377Fz instanceof InterfaceC6939uH ? (InterfaceC6939uH) abstractC0377Fz : null;
        this.f13439c = interfaceC6939uH == null ? AbstractC6874tF.f42962a : interfaceC6939uH;
        this.f13440d = abstractC0377Fz;
        this.f13441e = str;
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: a */
    public final InterfaceC0776MK mo4311a(long j, RunnableC7627Ga1 runnableC7627Ga1, InterfaceC0125Bz interfaceC0125Bz) {
        return this.f13439c.mo4311a(j, runnableC7627Ga1, interfaceC0125Bz);
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: e */
    public final void mo4313e(long j, C0619Jp c0619Jp) {
        this.f13439c.mo4313e(j, c0619Jp);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        this.f13440d.mo732l(interfaceC0125Bz, runnable);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: n */
    public final boolean mo2868n(InterfaceC0125Bz interfaceC0125Bz) {
        return this.f13440d.mo2868n(interfaceC0125Bz);
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        return this.f13441e;
    }
}
