package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class JU1 extends AbstractC4128hI1 {
    public volatile CU1 d;
    public volatile CU1 e;
    public CU1 f;
    public final ConcurrentHashMap g;
    public C7380uG1 h;
    public volatile boolean i;
    public volatile CU1 j;
    public CU1 k;
    public boolean l;
    public final Object m;

    public JU1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.m = new Object();
        this.g = new ConcurrentHashMap();
    }

    public final CU1 C1(boolean z) {
        A1();
        v1();
        if (!z) {
            return this.f;
        }
        CU1 cu1 = this.f;
        return cu1 != null ? cu1 : this.k;
    }

    public final void D1(String str, CU1 cu1, boolean z) {
        CU1 cu12;
        CU1 cu13 = this.d == null ? this.e : this.d;
        if (cu1.b == null) {
            cu12 = new CU1(cu1.a, str != null ? H1(str) : null, cu1.c, cu1.e, cu1.f);
        } else {
            cu12 = cu1;
        }
        this.e = this.d;
        this.d = cu12;
        p0().E1(new UU1(this, cu12, cu13, ((C3386dP1) this.b).n.elapsedRealtime(), z));
    }

    public final void E1(C7380uG1 c7380uG1, Bundle bundle) {
        Bundle bundle2;
        if (!((C3386dP1) this.b).g.G1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.g.put(Integer.valueOf(c7380uG1.a), new CU1(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(NotificationConstants.ID)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F1(defpackage.CU1 r18, defpackage.CU1 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JU1.F1(CU1, CU1, long, boolean, android.os.Bundle):void");
    }

    public final void G1(CU1 cu1, boolean z, long j) {
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        C0948Lx1 c0948Lx1 = c3386dP1.q;
        C3386dP1.d(c0948Lx1);
        c0948Lx1.z1(c3386dP1.n.elapsedRealtime());
        if (!y1().g.c(j, cu1 != null && cu1.d, z) || cu1 == null) {
            return;
        }
        cu1.d = false;
    }

    public final String H1(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str2.length();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        c3386dP1.g.getClass();
        if (length <= 500) {
            return str2;
        }
        c3386dP1.g.getClass();
        return str2.substring(0, 500);
    }

    public final CU1 I1(C7380uG1 c7380uG1) {
        Preconditions.checkNotNull(c7380uG1);
        CU1 cu1 = (CU1) this.g.get(Integer.valueOf(c7380uG1.a));
        if (cu1 == null) {
            CU1 cu12 = new CU1(null, H1(c7380uG1.b), u1().F2());
            this.g.put(Integer.valueOf(c7380uG1.a), cu12);
            cu1 = cu12;
        }
        return this.j != null ? this.j : cu1;
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return false;
    }
}
