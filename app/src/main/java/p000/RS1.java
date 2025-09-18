package p000;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class RS1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10184a;

    /* renamed from: b */
    public final /* synthetic */ long f10185b;

    /* renamed from: c */
    public final /* synthetic */ FR1 f10186c;

    public /* synthetic */ RS1(FR1 fr1, long j, int i) {
        this.f10184a = i;
        this.f10185b = j;
        this.f10186c = fr1;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f10184a) {
            case 0:
                FR1 fr1 = this.f10186c;
                C9708i41 c9708i41 = fr1.m7851t1().f11752m;
                long j = this.f10185b;
                c9708i41.m18963h(j);
                fr1.mo6070n().f8385n.m24554c(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                FR1 fr12 = this.f10186c;
                fr12.mo7681v1();
                fr12.m18793A1();
                fr12.mo6070n().f8385n.m24555d("Resetting analytics data (FE)");
                WW1 ww1M7684y1 = fr12.m7684y1();
                ww1M7684y1.mo7681v1();
                C0451H9 c0451h9 = ww1M7684y1.f13245g;
                ((C10662pX1) c0451h9.f4148c).m8321a();
                WW1 ww1 = (WW1) c0451h9.f4149d;
                if (((C9110dP1) ww1.f11615b).f26037g.m6511E1(null, IB1.f4775X0)) {
                    c0451h9.f4146a = ((C9110dP1) ww1.f11615b).f26044n.elapsedRealtime();
                } else {
                    c0451h9.f4146a = 0L;
                }
                c0451h9.f4147b = c0451h9.f4146a;
                C9110dP1 c9110dP1 = (C9110dP1) fr12.f11615b;
                c9110dP1.m17597j().m22027E1();
                boolean zM17593f = c9110dP1.m17593f();
                UM1 um1M7851t1 = fr12.m7851t1();
                um1M7851t1.f11747h.m18963h(this.f10185b);
                if (!TextUtils.isEmpty(um1M7851t1.m7851t1().f11763x.m8350o())) {
                    um1M7851t1.f11763x.m8354t(null);
                }
                um1M7851t1.f11757r.m18963h(0L);
                um1M7851t1.f11758s.m18963h(0L);
                Boolean boolM6510D1 = ((C9110dP1) um1M7851t1.f11615b).f26037g.m6510D1("firebase_analytics_collection_deactivated");
                if (boolM6510D1 == null || !boolM6510D1.booleanValue()) {
                    um1M7851t1.m7991A1(!zM17593f);
                }
                um1M7851t1.f11764y.m8354t(null);
                um1M7851t1.f11765z.m18963h(0L);
                um1M7851t1.f11742A.m7570V(null);
                C8989cV1 c8989cV1M17601o = c9110dP1.m17601o();
                c8989cV1M17601o.mo7681v1();
                c8989cV1M17601o.m18793A1();
                EY1 ey1M10752N1 = c8989cV1M17601o.m10752N1(false);
                ((C9110dP1) c8989cV1M17601o.f11615b).m17598k().m25844E1();
                c8989cV1M17601o.m10744F1(new FV1(c8989cV1M17601o, ey1M10752N1, 0));
                fr12.m7684y1().f13244f.m24358l();
                fr12.f3221t = !zM17593f;
                c9110dP1.m17601o().m10741C1(new AtomicReference());
                break;
        }
    }
}
