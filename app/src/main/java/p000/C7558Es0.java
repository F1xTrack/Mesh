package p000;

import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;

/* renamed from: Es0 */
/* loaded from: classes2.dex */
public final class C7558Es0 {

    /* renamed from: a */
    public final AbstractC11598ws0 f2933a;

    /* renamed from: b */
    public final C7350As0 f2934b;

    /* renamed from: c */
    public final F71 f2935c;

    public C7558Es0(AbstractC11598ws0 abstractC11598ws0) {
        O90.m5968f(abstractC11598ws0, "module");
        this.f2933a = abstractC11598ws0;
        this.f2934b = abstractC11598ws0.mo2834a();
        this.f2935c = AbstractC0705LB.m4915b(new C7506Ds0(this, 0));
    }

    /* renamed from: a */
    public final void m2436a(String str, ReadableArray readableArray, C8362Ue0 c8362Ue0) throws C6281k8 {
        C7350As0 c7350As0 = this.f2934b;
        O90.m5968f(str, "methodName");
        O90.m5968f(readableArray, "args");
        try {
            AbstractC1049Qf abstractC1049Qf = (AbstractC1049Qf) c7350As0.f458e.get(str);
            if (abstractC1049Qf == null) {
                throw new C8180Qr0(0);
            }
            abstractC1049Qf.mo6740d(this, readableArray, c8362Ue0);
        } catch (Throwable th) {
            throw new C6281k8(str, c7350As0.f454a, !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [Vg0, mZ] */
    /* renamed from: b */
    public final void m2437b(EnumC0844NP enumC0844NP) {
        AbstractC0152CP abstractC0152CP = (AbstractC0152CP) this.f2934b.f456c.get(enumC0844NP);
        if (abstractC0152CP == null) {
            return;
        }
        C0987Pg c0987Pg = abstractC0152CP instanceof C0987Pg ? (C0987Pg) abstractC0152CP : null;
        if (c0987Pg != null) {
            c0987Pg.f9219a.invoke();
        }
    }

    /* renamed from: c */
    public final void m2438c(EnumC0844NP enumC0844NP, Object obj, Object obj2) {
        AbstractC0152CP abstractC0152CP = (AbstractC0152CP) this.f2934b.f456c.get(enumC0844NP);
        if (abstractC0152CP == null) {
            return;
        }
        C0215DP c0215dp = abstractC0152CP instanceof C0215DP ? (C0215DP) abstractC0152CP : null;
        if (c0215dp != null) {
            c0215dp.f2005a.invoke(obj, obj2);
        }
    }
}
