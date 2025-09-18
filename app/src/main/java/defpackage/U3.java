package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class U3 implements InterfaceC2378bj, W3, InterfaceC5281jH {
    public final /* synthetic */ V3 a;

    public /* synthetic */ U3(V3 v3) {
        this.a = v3;
    }

    @Override // defpackage.InterfaceC5281jH
    public void h(InterfaceC3739fG0 interfaceC3739fG0) {
        V3 v3 = this.a;
        v3.getClass();
        S3 s3 = (S3) interfaceC3739fG0.get();
        C1562Tu0 c1562Tu0 = new C1562Tu0(9, s3);
        N8 n8 = new N8(8, false);
        T3 t3 = (T3) s3;
        OJ1 oj1B = t3.b("clx", n8);
        if (oj1B == null) {
            oj1B = t3.b(CrashHianalyticsData.EVENT_ID_CRASH, n8);
        }
        if (oj1B != null) {
            G10 g10 = new G10(5, false);
            C6860rY0 c6860rY0 = new C6860rY0(c1562Tu0, TimeUnit.MILLISECONDS);
            synchronized (v3) {
                try {
                    Iterator it = v3.c.iterator();
                    while (it.hasNext()) {
                        g10.b = (C6406pA) it.next();
                    }
                    n8.c = g10;
                    n8.b = c6860rY0;
                    v3.b = g10;
                    v3.a = c6860rY0;
                } finally {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC2378bj
    public void v(C6406pA c6406pA) {
        V3 v3 = this.a;
        synchronized (v3) {
            try {
                if (v3.b instanceof VJ) {
                    v3.c.add(c6406pA);
                }
                v3.b.v(c6406pA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.W3
    public void w0(Bundle bundle) {
        this.a.a.w0(bundle);
    }
}
