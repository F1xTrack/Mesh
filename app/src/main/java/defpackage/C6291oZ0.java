package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: oZ0 */
/* loaded from: classes.dex */
public final class C6291oZ0 {
    public static final C5909mZ0 c = new C5909mZ0();
    public static final KC0 d = AbstractC3758fM1.b(EY0.b, new C3513e41(XS0.p));
    public final C0481Fx1 a;
    public final UQ0 b;

    public C6291oZ0(MU mu, InterfaceC0173Bz interfaceC0173Bz, InterfaceC0173Bz interfaceC0173Bz2, XU xu) {
        mu.a();
        Context context = mu.a;
        O90.e(context, "firebaseApp.applicationContext");
        PY0 py0 = PY0.a;
        C2267b8 c2267b8A = PY0.a(mu);
        C0481Fx1 c0481Fx1 = new C0481Fx1(context, 24);
        C5772lr0 c5772lr0 = new C5772lr0(c2267b8A, interfaceC0173Bz);
        c.getClass();
        UQ0 uq0 = new UQ0(interfaceC0173Bz2, xu, c2267b8A, c5772lr0, (InterfaceC3729fD) d.getValue(context, C5909mZ0.a[0]));
        this.a = c0481Fx1;
        this.b = uq0;
    }

    public final double a() {
        Bundle bundle = (Bundle) this.a.a;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (ConfigValue.DOUBLE_DEFAULT_VALUE <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        C8384zY0 c8384zY0 = this.b.b().b;
        if (c8384zY0 == null) {
            O90.o("sessionConfigs");
            throw null;
        }
        Double d2 = c8384zY0.b;
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (ConfigValue.DOUBLE_DEFAULT_VALUE <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.AbstractC1963Yy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C6100nZ0
            if (r0 == 0) goto L13
            r0 = r7
            nZ0 r0 = (defpackage.C6100nZ0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nZ0 r0 = new nZ0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            Tf1 r3 = defpackage.C1518Tf1.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            defpackage.RQ1.d(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            oZ0 r2 = r0.a
            defpackage.RQ1.d(r7)
            goto L4a
        L3a:
            defpackage.RQ1.d(r7)
            r0.a = r6
            r0.d = r5
            Fx1 r7 = r6.a
            r7.getClass()
            if (r3 != r1) goto L49
            return r1
        L49:
            r2 = r6
        L4a:
            UQ0 r7 = r2.b
            r2 = 0
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6291oZ0.b(Yy):java.lang.Object");
    }
}
