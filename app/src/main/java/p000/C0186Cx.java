package p000;

import java.util.concurrent.Executor;

/* renamed from: Cx */
/* loaded from: classes.dex */
public final class C0186Cx implements InterfaceC9177dx0 {

    /* renamed from: b */
    public static final C0186Cx f1780b = new C0186Cx(null);

    /* renamed from: a */
    public final F70 f1781a;

    public C0186Cx(Object obj) {
        this.f1781a = AbstractC8301Sz1.m7484g(obj);
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: a */
    public final void mo1479a(Executor executor, InterfaceC9049cx0 interfaceC9049cx0) {
        this.f1781a.mo2494d(new RunnableC6720r4(this, 27, interfaceC9049cx0), executor);
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: g */
    public final InterfaceFutureC7800Jj0 mo1480g() {
        return this.f1781a;
    }

    @Override // p000.InterfaceC9177dx0
    /* renamed from: l */
    public final void mo1481l(InterfaceC9049cx0 interfaceC9049cx0) {
    }
}
