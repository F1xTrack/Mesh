package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class H81 implements InterfaceC1573Ty {
    public final /* synthetic */ C6845rT0 a;
    public final /* synthetic */ InterfaceC1573Ty b;

    public H81(C6845rT0 c6845rT0, InterfaceC1573Ty interfaceC1573Ty) {
        this.a = c6845rT0;
        this.b = interfaceC1573Ty;
    }

    @Override // defpackage.InterfaceC1573Ty
    public final Object a(N81 n81) {
        InterfaceC1573Ty interfaceC1573Ty = this.b;
        C6845rT0 c6845rT0 = this.a;
        try {
            try {
                c6845rT0.i(interfaceC1573Ty.a(n81));
                return null;
            } catch (CancellationException unused) {
                c6845rT0.e();
                return null;
            } catch (Exception e) {
                c6845rT0.g(e);
                return null;
            }
        } catch (Exception e2) {
            c6845rT0.g(new C7074sg(e2));
            return null;
        }
    }
}
