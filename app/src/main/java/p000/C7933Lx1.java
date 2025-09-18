package p000;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: Lx1 */
/* loaded from: classes.dex */
public final class C7933Lx1 extends TJ1 {

    /* renamed from: c */
    public final C7119x8 f6942c;

    /* renamed from: d */
    public final C7119x8 f6943d;

    /* renamed from: e */
    public long f6944e;

    public C7933Lx1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f6943d = new C7119x8();
        this.f6942c = new C7119x8();
    }

    /* renamed from: A1 */
    public final void m5161A1(long j, String str) {
        if (str == null || str.length() == 0) {
            mo6070n().f8378g.m24555d("Ad unit id must be a non-empty string");
        } else {
            mo6071p0().m25412E1(new EA1(this, str, j, 1));
        }
    }

    /* renamed from: B1 */
    public final void m5162B1(long j, CU1 cu1) {
        if (cu1 == null) {
            mo6070n().f8386o.m24555d("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8386o.m24554c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C10282mZ1.m22846Y1(cu1, bundle, true);
            m7682w1().m2653X1("am", "_xa", bundle);
        }
    }

    /* renamed from: C1 */
    public final void m5163C1(String str, long j, CU1 cu1) {
        if (cu1 == null) {
            mo6070n().f8386o.m24555d("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8386o.m24554c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C10282mZ1.m22846Y1(cu1, bundle, true);
            m7682w1().m2653X1("am", "_xu", bundle);
        }
    }

    /* renamed from: D1 */
    public final void m5164D1(long j) {
        C7119x8 c7119x8 = this.f6942c;
        Iterator it = ((C6867t8) c7119x8.keySet()).iterator();
        while (it.hasNext()) {
            c7119x8.put((String) it.next(), Long.valueOf(j));
        }
        if (c7119x8.isEmpty()) {
            return;
        }
        this.f6944e = j;
    }

    /* renamed from: E1 */
    public final void m5165E1(long j, String str) {
        if (str == null || str.length() == 0) {
            mo6070n().f8378g.m24555d("Ad unit id must be a non-empty string");
        } else {
            mo6071p0().m25412E1(new EA1(this, str, j, 0));
        }
    }

    /* renamed from: z1 */
    public final void m5166z1(long j) {
        CU1 cu1M4329C1 = m7683x1().m4329C1(false);
        C7119x8 c7119x8 = this.f6942c;
        Iterator it = ((C6867t8) c7119x8.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m5163C1(str, j - ((Long) c7119x8.getOrDefault(str, null)).longValue(), cu1M4329C1);
        }
        if (!c7119x8.isEmpty()) {
            m5162B1(j - this.f6944e, cu1M4329C1);
        }
        m5164D1(j);
    }
}
