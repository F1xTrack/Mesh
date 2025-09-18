package p000;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I81 implements InterfaceC1256Ty {

    /* renamed from: a */
    public final /* synthetic */ C10909rT0 f4712a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1256Ty f4713b;

    /* renamed from: c */
    public final /* synthetic */ Executor f4714c;

    public I81(C10909rT0 c10909rT0, InterfaceC1256Ty interfaceC1256Ty, Executor executor) {
        this.f4712a = c10909rT0;
        this.f4713b = interfaceC1256Ty;
        this.f4714c = executor;
    }

    @Override // p000.InterfaceC1256Ty
    /* renamed from: a */
    public final Object mo2126a(N81 n81) {
        InterfaceC1256Ty interfaceC1256Ty = this.f4713b;
        Executor executor = this.f4714c;
        C10909rT0 c10909rT0 = this.f4712a;
        try {
            executor.execute(new RunnableC1192Sx(interfaceC1256Ty, n81, c10909rT0, 17));
            return null;
        } catch (Exception e) {
            c10909rT0.m24356g(new C6838sg(e));
            return null;
        }
    }
}
