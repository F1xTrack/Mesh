package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class JU1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public volatile CU1 f5547d;

    /* renamed from: e */
    public volatile CU1 f5548e;

    /* renamed from: f */
    public CU1 f5549f;

    /* renamed from: g */
    public final ConcurrentHashMap f5550g;

    /* renamed from: h */
    public C11268uG1 f5551h;

    /* renamed from: i */
    public volatile boolean f5552i;

    /* renamed from: j */
    public volatile CU1 f5553j;

    /* renamed from: k */
    public CU1 f5554k;

    /* renamed from: l */
    public boolean f5555l;

    /* renamed from: m */
    public final Object f5556m;

    public JU1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f5556m = new Object();
        this.f5550g = new ConcurrentHashMap();
    }

    /* renamed from: C1 */
    public final CU1 m4329C1(boolean z) {
        m18793A1();
        mo7681v1();
        if (!z) {
            return this.f5549f;
        }
        CU1 cu1 = this.f5549f;
        return cu1 != null ? cu1 : this.f5554k;
    }

    /* renamed from: D1 */
    public final void m4330D1(String str, CU1 cu1, boolean z) {
        CU1 cu12;
        CU1 cu13 = this.f5547d == null ? this.f5548e : this.f5547d;
        if (cu1.f1400b == null) {
            cu12 = new CU1(cu1.f1399a, str != null ? m4334H1(str) : null, cu1.f1401c, cu1.f1403e, cu1.f1404f);
        } else {
            cu12 = cu1;
        }
        this.f5548e = this.f5547d;
        this.f5547d = cu12;
        mo6071p0().m25412E1(new UU1(this, cu12, cu13, ((C9110dP1) this.f11615b).f26044n.elapsedRealtime(), z));
    }

    /* renamed from: E1 */
    public final void m4331E1(C11268uG1 c11268uG1, Bundle bundle) {
        Bundle bundle2;
        if (!((C9110dP1) this.f11615b).f26037g.m6513G1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f5550g.put(Integer.valueOf(c11268uG1.f43627a), new CU1(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(NotificationConstants.f19487ID)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* renamed from: F1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4332F1(p000.CU1 r18, p000.CU1 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.JU1.m4332F1(CU1, CU1, long, boolean, android.os.Bundle):void");
    }

    /* renamed from: G1 */
    public final void m4333G1(CU1 cu1, boolean z, long j) {
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        C7933Lx1 c7933Lx1 = c9110dP1.f26047q;
        C9110dP1.m17591d(c7933Lx1);
        c7933Lx1.m5166z1(c9110dP1.f26044n.elapsedRealtime());
        if (!m7684y1().f13245g.m3318c(j, cu1 != null && cu1.f1402d, z) || cu1 == null) {
            return;
        }
        cu1.f1402d = false;
    }

    /* renamed from: H1 */
    public final String m4334H1(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str2.length();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        c9110dP1.f26037g.getClass();
        if (length <= 500) {
            return str2;
        }
        c9110dP1.f26037g.getClass();
        return str2.substring(0, 500);
    }

    /* renamed from: I1 */
    public final CU1 m4335I1(C11268uG1 c11268uG1) {
        Preconditions.checkNotNull(c11268uG1);
        CU1 cu1 = (CU1) this.f5550g.get(Integer.valueOf(c11268uG1.f43627a));
        if (cu1 == null) {
            CU1 cu12 = new CU1(null, m4334H1(c11268uG1.f43628b), m7852u1().m22865F2());
            this.f5550g.put(Integer.valueOf(c11268uG1.f43627a), cu12);
            cu1 = cu12;
        }
        return this.f5553j != null ? this.f5553j : cu1;
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return false;
    }
}
