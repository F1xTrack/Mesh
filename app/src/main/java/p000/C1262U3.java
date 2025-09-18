package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: U3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1262U3 implements InterfaceC1803bj, InterfaceC1388W3, InterfaceC6227jH {

    /* renamed from: a */
    public final /* synthetic */ C1325V3 f11622a;

    public /* synthetic */ C1262U3(C1325V3 c1325v3) {
        this.f11622a = c1325v3;
    }

    @Override // p000.InterfaceC6227jH
    /* renamed from: h */
    public void mo410h(InterfaceC9347fG0 interfaceC9347fG0) {
        C1325V3 c1325v3 = this.f11622a;
        c1325v3.getClass();
        InterfaceC1136S3 interfaceC1136S3 = (InterfaceC1136S3) interfaceC9347fG0.get();
        C8342Tu0 c8342Tu0 = new C8342Tu0(9, interfaceC1136S3);
        C0827N8 c0827n8 = new C0827N8(8, false);
        C1199T3 c1199t3 = (C1199T3) interfaceC1136S3;
        OJ1 oj1M7539b = c1199t3.m7539b("clx", c0827n8);
        if (oj1M7539b == null) {
            oj1M7539b = c1199t3.m7539b(CrashHianalyticsData.EVENT_ID_CRASH, c0827n8);
        }
        if (oj1M7539b != null) {
            G10 g10 = new G10(5, false);
            C10919rY0 c10919rY0 = new C10919rY0(c8342Tu0, TimeUnit.MILLISECONDS);
            synchronized (c1325v3) {
                try {
                    Iterator it = c1325v3.f12333c.iterator();
                    while (it.hasNext()) {
                        g10.f3531b = (C6600pA) it.next();
                    }
                    c0827n8.f7524c = g10;
                    c0827n8.f7523b = c10919rY0;
                    c1325v3.f12332b = g10;
                    c1325v3.f12331a = c10919rY0;
                } finally {
                }
            }
        }
    }

    @Override // p000.InterfaceC1803bj
    /* renamed from: v */
    public void mo2907v(C6600pA c6600pA) {
        C1325V3 c1325v3 = this.f11622a;
        synchronized (c1325v3) {
            try {
                if (c1325v3.f12332b instanceof C1341VJ) {
                    c1325v3.f12333c.add(c6600pA);
                }
                c1325v3.f12332b.mo2907v(c6600pA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1388W3
    /* renamed from: w0 */
    public void mo1476w0(Bundle bundle) {
        this.f11622a.f12331a.mo1476w0(bundle);
    }
}
