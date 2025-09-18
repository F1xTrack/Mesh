package defpackage;

import java.util.concurrent.Executor;

/* renamed from: Cx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245Cx implements InterfaceC3486dx0 {
    public static final C0245Cx b = new C0245Cx(null);
    public final F70 a;

    public C0245Cx(Object obj) {
        this.a = AbstractC1500Sz1.g(obj);
    }

    @Override // defpackage.InterfaceC3486dx0
    public final void a(Executor executor, InterfaceC3296cx0 interfaceC3296cx0) {
        this.a.d(new RunnableC6769r4(this, 27, interfaceC3296cx0), executor);
    }

    @Override // defpackage.InterfaceC3486dx0
    public final InterfaceFutureC0750Jj0 g() {
        return this.a;
    }

    @Override // defpackage.InterfaceC3486dx0
    public final void l(InterfaceC3296cx0 interfaceC3296cx0) {
    }
}
