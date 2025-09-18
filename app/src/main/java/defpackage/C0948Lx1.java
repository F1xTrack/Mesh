package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: Lx1 */
/* loaded from: classes.dex */
public final class C0948Lx1 extends TJ1 {
    public final C7925x8 c;
    public final C7925x8 d;
    public long e;

    public C0948Lx1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.d = new C7925x8();
        this.c = new C7925x8();
    }

    public final void A1(long j, String str) {
        if (str == null || str.length() == 0) {
            n().g.d("Ad unit id must be a non-empty string");
        } else {
            p0().E1(new EA1(this, str, j, 1));
        }
    }

    public final void B1(long j, CU1 cu1) {
        if (cu1 == null) {
            n().o.d("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            OL1 ol1N = n();
            ol1N.o.c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C5910mZ1.Y1(cu1, bundle, true);
            w1().X1("am", "_xa", bundle);
        }
    }

    public final void C1(String str, long j, CU1 cu1) {
        if (cu1 == null) {
            n().o.d("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            OL1 ol1N = n();
            ol1N.o.c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C5910mZ1.Y1(cu1, bundle, true);
            w1().X1("am", "_xu", bundle);
        }
    }

    public final void D1(long j) {
        C7925x8 c7925x8 = this.c;
        Iterator it = ((C7163t8) c7925x8.keySet()).iterator();
        while (it.hasNext()) {
            c7925x8.put((String) it.next(), Long.valueOf(j));
        }
        if (c7925x8.isEmpty()) {
            return;
        }
        this.e = j;
    }

    public final void E1(long j, String str) {
        if (str == null || str.length() == 0) {
            n().g.d("Ad unit id must be a non-empty string");
        } else {
            p0().E1(new EA1(this, str, j, 0));
        }
    }

    public final void z1(long j) {
        CU1 cu1C1 = x1().C1(false);
        C7925x8 c7925x8 = this.c;
        Iterator it = ((C7163t8) c7925x8.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C1(str, j - ((Long) c7925x8.getOrDefault(str, null)).longValue(), cu1C1);
        }
        if (!c7925x8.isEmpty()) {
            B1(j - this.e, cu1C1);
        }
        D1(j);
    }
}
