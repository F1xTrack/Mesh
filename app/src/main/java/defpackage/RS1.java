package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class RS1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ FR1 c;

    public /* synthetic */ RS1(FR1 fr1, long j, int i) {
        this.a = i;
        this.b = j;
        this.c = fr1;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.a) {
            case 0:
                FR1 fr1 = this.c;
                C4277i41 c4277i41 = fr1.t1().m;
                long j = this.b;
                c4277i41.h(j);
                fr1.n().n.c(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                FR1 fr12 = this.c;
                fr12.v1();
                fr12.A1();
                fr12.n().n.d("Resetting analytics data (FE)");
                WW1 ww1Y1 = fr12.y1();
                ww1Y1.v1();
                H9 h9 = ww1Y1.g;
                ((C6477pX1) h9.c).a();
                WW1 ww1 = (WW1) h9.d;
                if (((C3386dP1) ww1.b).g.E1(null, IB1.X0)) {
                    h9.a = ((C3386dP1) ww1.b).n.elapsedRealtime();
                } else {
                    h9.a = 0L;
                }
                h9.b = h9.a;
                C3386dP1 c3386dP1 = (C3386dP1) fr12.b;
                c3386dP1.j().E1();
                boolean zF = c3386dP1.f();
                UM1 um1T1 = fr12.t1();
                um1T1.h.h(this.b);
                if (!TextUtils.isEmpty(um1T1.t1().x.o())) {
                    um1T1.x.t(null);
                }
                um1T1.r.h(0L);
                um1T1.s.h(0L);
                Boolean boolD1 = ((C3386dP1) um1T1.b).g.D1("firebase_analytics_collection_deactivated");
                if (boolD1 == null || !boolD1.booleanValue()) {
                    um1T1.A1(!zF);
                }
                um1T1.y.t(null);
                um1T1.z.h(0L);
                um1T1.A.V(null);
                C2528cV1 c2528cV1O = c3386dP1.o();
                c2528cV1O.v1();
                c2528cV1O.A1();
                EY1 ey1N1 = c2528cV1O.N1(false);
                ((C3386dP1) c2528cV1O.b).k().E1();
                c2528cV1O.F1(new FV1(c2528cV1O, ey1N1, 0));
                fr12.y1().f.l();
                fr12.t = !zF;
                c3386dP1.o().C1(new AtomicReference());
                break;
        }
    }
}
