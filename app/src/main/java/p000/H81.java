package p000;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class H81 implements InterfaceC1256Ty {

    /* renamed from: a */
    public final /* synthetic */ C10909rT0 f4144a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1256Ty f4145b;

    public H81(C10909rT0 c10909rT0, InterfaceC1256Ty interfaceC1256Ty) {
        this.f4144a = c10909rT0;
        this.f4145b = interfaceC1256Ty;
    }

    @Override // p000.InterfaceC1256Ty
    /* renamed from: a */
    public final Object mo2126a(N81 n81) {
        InterfaceC1256Ty interfaceC1256Ty = this.f4145b;
        C10909rT0 c10909rT0 = this.f4144a;
        try {
            try {
                c10909rT0.m24357i(interfaceC1256Ty.mo2126a(n81));
                return null;
            } catch (CancellationException unused) {
                c10909rT0.m24355e();
                return null;
            } catch (Exception e) {
                c10909rT0.m24356g(e);
                return null;
            }
        } catch (Exception e2) {
            c10909rT0.m24356g(new C6838sg(e2));
            return null;
        }
    }
}
