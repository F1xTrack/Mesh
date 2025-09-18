package defpackage;

import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;

/* renamed from: Es0 */
/* loaded from: classes2.dex */
public final class C0387Es0 {
    public final AbstractC7874ws0 a;
    public final C0075As0 b;
    public final F71 c;

    public C0387Es0(AbstractC7874ws0 abstractC7874ws0) {
        O90.f(abstractC7874ws0, "module");
        this.a = abstractC7874ws0;
        this.b = abstractC7874ws0.a();
        this.c = LB.b(new C0309Ds0(this, 0));
    }

    public final void a(String str, ReadableArray readableArray, C1592Ue0 c1592Ue0) throws C5445k8 {
        C0075As0 c0075As0 = this.b;
        O90.f(str, "methodName");
        O90.f(readableArray, "args");
        try {
            AbstractC1282Qf abstractC1282Qf = (AbstractC1282Qf) c0075As0.e.get(str);
            if (abstractC1282Qf == null) {
                throw new C1319Qr0(0);
            }
            abstractC1282Qf.d(this, readableArray, c1592Ue0);
        } catch (Throwable th) {
            throw new C5445k8(str, c0075As0.a, !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [Vg0, mZ] */
    public final void b(NP np) {
        CP cp = (CP) this.b.c.get(np);
        if (cp == null) {
            return;
        }
        C1207Pg c1207Pg = cp instanceof C1207Pg ? (C1207Pg) cp : null;
        if (c1207Pg != null) {
            c1207Pg.a.invoke();
        }
    }

    public final void c(NP np, Object obj, Object obj2) {
        CP cp = (CP) this.b.c.get(np);
        if (cp == null) {
            return;
        }
        DP dp = cp instanceof DP ? (DP) cp : null;
        if (dp != null) {
            dp.a.invoke(obj, obj2);
        }
    }
}
