package p000;

import android.content.Context;
import android.os.Bundle;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: oZ0 */
/* loaded from: classes.dex */
public final class C10537oZ0 {

    /* renamed from: c */
    public static final C10281mZ0 f39089c = new C10281mZ0();

    /* renamed from: d */
    public static final KC0 f39090d = AbstractC9360fM1.m18222b(EY0.f2746b, new C9196e41(XS0.f13780p));

    /* renamed from: a */
    public final C7621Fx1 f39091a;

    /* renamed from: b */
    public final UQ0 f39092b;

    public C10537oZ0(C0786MU c0786mu, InterfaceC0125Bz interfaceC0125Bz, InterfaceC0125Bz interfaceC0125Bz2, InterfaceC1478XU interfaceC1478XU) {
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        O90.m5967e(context, "firebaseApp.applicationContext");
        PY0 py0 = PY0.f9130a;
        C1766b8 c1766b8M6383a = PY0.m6383a(c0786mu);
        C7621Fx1 c7621Fx1 = new C7621Fx1(context, 24);
        C10189lr0 c10189lr0 = new C10189lr0(c1766b8M6383a, interfaceC0125Bz);
        f39089c.getClass();
        UQ0 uq0 = new UQ0(interfaceC0125Bz2, interfaceC1478XU, c1766b8M6383a, c10189lr0, (InterfaceC4039fD) f39090d.getValue(context, C10281mZ0.f37767a[0]));
        this.f39091a = c7621Fx1;
        this.f39092b = uq0;
    }

    /* renamed from: a */
    public final double m23501a() {
        Bundle bundle = (Bundle) this.f39091a.f3494a;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (ConfigValue.DOUBLE_DEFAULT_VALUE <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        C11939zY0 c11939zY0 = this.f39092b.m8014b().f3314b;
        if (c11939zY0 == null) {
            O90.m5977o("sessionConfigs");
            throw null;
        }
        Double d = c11939zY0.f46866b;
        if (d != null) {
            double dDoubleValue2 = d.doubleValue();
            if (ConfigValue.DOUBLE_DEFAULT_VALUE <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m23502b(p000.AbstractC1571Yy r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.C10409nZ0
            if (r0 == 0) goto L13
            r0 = r7
            nZ0 r0 = (p000.C10409nZ0) r0
            int r1 = r0.f38368d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38368d = r1
            goto L18
        L13:
            nZ0 r0 = new nZ0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f38366b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f38368d
            Tf1 r3 = p000.C8313Tf1.f11463a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            p000.RQ1.m7017d(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            oZ0 r2 = r0.f38365a
            p000.RQ1.m7017d(r7)
            goto L4a
        L3a:
            p000.RQ1.m7017d(r7)
            r0.f38365a = r6
            r0.f38368d = r5
            Fx1 r7 = r6.f39091a
            r7.getClass()
            if (r3 != r1) goto L49
            return r1
        L49:
            r2 = r6
        L4a:
            UQ0 r7 = r2.f39092b
            r2 = 0
            r0.f38365a = r2
            r0.f38368d = r4
            java.lang.Object r7 = r7.m8015d(r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10537oZ0.m23502b(Yy):java.lang.Object");
    }
}
