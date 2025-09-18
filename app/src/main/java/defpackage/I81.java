package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I81 implements InterfaceC1573Ty {
    public final /* synthetic */ C6845rT0 a;
    public final /* synthetic */ InterfaceC1573Ty b;
    public final /* synthetic */ Executor c;

    public I81(C6845rT0 c6845rT0, InterfaceC1573Ty interfaceC1573Ty, Executor executor) {
        this.a = c6845rT0;
        this.b = interfaceC1573Ty;
        this.c = executor;
    }

    @Override // defpackage.InterfaceC1573Ty
    public final Object a(N81 n81) {
        InterfaceC1573Ty interfaceC1573Ty = this.b;
        Executor executor = this.c;
        C6845rT0 c6845rT0 = this.a;
        try {
            executor.execute(new RunnableC1492Sx(interfaceC1573Ty, n81, c6845rT0, 17));
            return null;
        } catch (Exception e) {
            c6845rT0.g(new C7074sg(e));
            return null;
        }
    }
}
