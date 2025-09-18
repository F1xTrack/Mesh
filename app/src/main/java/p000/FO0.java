package p000;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class FO0 {

    /* renamed from: a */
    public final ArrayList f3192a;

    /* renamed from: b */
    public ArrayList f3193b;

    /* renamed from: c */
    public final ArrayList f3194c;

    /* renamed from: d */
    public final List f3195d;

    /* renamed from: e */
    public int f3196e;

    /* renamed from: f */
    public int f3197f;

    /* renamed from: g */
    public EO0 f3198g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f3199h;

    public FO0(RecyclerView recyclerView) {
        this.f3199h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3192a = arrayList;
        this.f3193b = null;
        this.f3194c = new ArrayList();
        this.f3195d = Collections.unmodifiableList(arrayList);
        this.f3196e = 2;
        this.f3197f = 2;
    }

    /* renamed from: a */
    public final void m2618a(OO0 oo0, boolean z) {
        RecyclerView.m10233l(oo0);
        RecyclerView recyclerView = this.f3199h;
        QO0 qo0 = recyclerView.f16534z1;
        View view = oo0.f8408a;
        if (qo0 != null) {
            PO0 po0 = qo0.f9611e;
            AbstractC10944rk1.m24482n(view, po0 instanceof PO0 ? (C0002A1) po0.f9062e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f16513o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f16520s1 != null) {
                recyclerView.f16505g.m5457z(oo0);
            }
            if (RecyclerView.f16451M1) {
                Objects.toString(oo0);
            }
        }
        oo0.f8426s = null;
        oo0.f8425r = null;
        EO0 eo0M2620c = m2620c();
        eo0M2620c.getClass();
        int i = oo0.f8413f;
        ArrayList arrayList2 = eo0M2620c.m2209a(i).f1999a;
        if (((DO0) eo0M2620c.f2687a.get(i)).f2000b <= arrayList2.size()) {
            FL1.m2582a(view);
        } else {
            if (RecyclerView.f16450L1 && arrayList2.contains(oo0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            oo0.m6057n();
            arrayList2.add(oo0);
        }
    }

    /* renamed from: b */
    public final int m2619b(int i) {
        RecyclerView recyclerView = this.f3199h;
        if (i >= 0 && i < recyclerView.f16520s1.m4625b()) {
            return !recyclerView.f16520s1.f6051g ? i : recyclerView.f16502e.m18943h(i, 0);
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "invalid position ", ". State item count is ");
        sbM26237n.append(recyclerView.f16520s1.m4625b());
        sbM26237n.append(recyclerView.m10237C());
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }

    /* renamed from: c */
    public final EO0 m2620c() {
        if (this.f3198g == null) {
            EO0 eo0 = new EO0();
            eo0.f2687a = new SparseArray();
            eo0.f2688b = 0;
            eo0.f2689c = Collections.newSetFromMap(new IdentityHashMap());
            this.f3198g = eo0;
            m2621d();
        }
        return this.f3198g;
    }

    /* renamed from: d */
    public final void m2621d() {
        RecyclerView recyclerView;
        AbstractC10899rO0 abstractC10899rO0;
        EO0 eo0 = this.f3198g;
        if (eo0 == null || (abstractC10899rO0 = (recyclerView = this.f3199h).f16511m) == null || !recyclerView.f16519s) {
            return;
        }
        eo0.f2689c.add(abstractC10899rO0);
    }

    /* renamed from: e */
    public final void m2622e(AbstractC10899rO0 abstractC10899rO0, boolean z) {
        EO0 eo0 = this.f3198g;
        if (eo0 == null) {
            return;
        }
        Set set = eo0.f2689c;
        set.remove(abstractC10899rO0);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = eo0.f2687a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((DO0) sparseArray.get(sparseArray.keyAt(i))).f1999a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                FL1.m2582a(((OO0) arrayList.get(i2)).f8408a);
            }
            i++;
        }
    }

    /* renamed from: f */
    public final void m2623f() {
        ArrayList arrayList = this.f3194c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2624g(size);
        }
        arrayList.clear();
        if (RecyclerView.f16456R1) {
            C6327ks c6327ks = this.f3199h.f16518r1;
            int[] iArr = c6327ks.f36732c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c6327ks.f36733d = 0;
        }
    }

    /* renamed from: g */
    public final void m2624g(int i) {
        boolean z = RecyclerView.f16450L1;
        ArrayList arrayList = this.f3194c;
        OO0 oo0 = (OO0) arrayList.get(i);
        if (RecyclerView.f16451M1) {
            Objects.toString(oo0);
        }
        m2618a(oo0, true);
        arrayList.remove(i);
    }

    /* renamed from: h */
    public final void m2625h(View view) {
        OO0 oo0M10226M = RecyclerView.m10226M(view);
        boolean zM6054k = oo0M10226M.m6054k();
        RecyclerView recyclerView = this.f3199h;
        if (zM6054k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (oo0M10226M.m6053j()) {
            oo0M10226M.f8421n.m2629l(oo0M10226M);
        } else if (oo0M10226M.m6060q()) {
            oo0M10226M.f8417j &= -33;
        }
        m2626i(oo0M10226M);
        if (recyclerView.f16483M == null || oo0M10226M.m6051h()) {
            return;
        }
        recyclerView.f16483M.mo8954d(oo0M10226M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2626i(p000.OO0 r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FO0.m2626i(OO0):void");
    }

    /* renamed from: j */
    public final void m2627j(View view) {
        AbstractC11538wO0 abstractC11538wO0;
        OO0 oo0M10226M = RecyclerView.m10226M(view);
        boolean zM6047d = oo0M10226M.m6047d(12);
        RecyclerView recyclerView = this.f3199h;
        if (!zM6047d && oo0M10226M.m6055l() && (abstractC11538wO0 = recyclerView.f16483M) != null) {
            C1463XF c1463xf = (C1463XF) abstractC11538wO0;
            if (oo0M10226M.m6046c().isEmpty() && c1463xf.f13634g && !oo0M10226M.m6050g()) {
                if (this.f3193b == null) {
                    this.f3193b = new ArrayList();
                }
                oo0M10226M.f8421n = this;
                oo0M10226M.f8422o = true;
                this.f3193b.add(oo0M10226M);
                return;
            }
        }
        if (oo0M10226M.m6050g() && !oo0M10226M.m6052i() && !recyclerView.f16511m.f41642b) {
            throw new IllegalArgumentException(AbstractC1374Vq.m8587f(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        oo0M10226M.f8421n = this;
        oo0M10226M.f8422o = false;
        this.f3192a.add(oo0M10226M);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.OO0 m2628k(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.FO0.m2628k(int, long):OO0");
    }

    /* renamed from: l */
    public final void m2629l(OO0 oo0) {
        if (oo0.f8422o) {
            this.f3193b.remove(oo0);
        } else {
            this.f3192a.remove(oo0);
        }
        oo0.f8421n = null;
        oo0.f8422o = false;
        oo0.f8417j &= -33;
    }

    /* renamed from: m */
    public final void m2630m() {
        AbstractC11919zO0 abstractC11919zO0 = this.f3199h.f16512n;
        this.f3197f = this.f3196e + (abstractC11919zO0 != null ? abstractC11919zO0.f46822j : 0);
        ArrayList arrayList = this.f3194c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3197f; size--) {
            m2624g(size);
        }
    }
}
