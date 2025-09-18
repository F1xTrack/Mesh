package defpackage;

/* renamed from: Wt0 */
/* loaded from: classes2.dex */
public final class C1793Wt0 extends AbstractC0485Fz implements InterfaceC7381uH {
    public final /* synthetic */ InterfaceC7381uH c;
    public final AbstractC0485Fz d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1793Wt0(AbstractC0485Fz abstractC0485Fz, String str) {
        InterfaceC7381uH interfaceC7381uH = abstractC0485Fz instanceof InterfaceC7381uH ? (InterfaceC7381uH) abstractC0485Fz : null;
        this.c = interfaceC7381uH == null ? AbstractC7184tF.a : interfaceC7381uH;
        this.d = abstractC0485Fz;
        this.e = str;
    }

    @Override // defpackage.InterfaceC7381uH
    public final MK a(long j, RunnableC0490Ga1 runnableC0490Ga1, InterfaceC0173Bz interfaceC0173Bz) {
        return this.c.a(j, runnableC0490Ga1, interfaceC0173Bz);
    }

    @Override // defpackage.InterfaceC7381uH
    public final void e(long j, C0767Jp c0767Jp) {
        this.c.e(j, c0767Jp);
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        this.d.l(interfaceC0173Bz, runnable);
    }

    @Override // defpackage.AbstractC0485Fz
    public final boolean n(InterfaceC0173Bz interfaceC0173Bz) {
        return this.d.n(interfaceC0173Bz);
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        return this.e;
    }
}
