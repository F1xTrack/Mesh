package defpackage;

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
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public EO0 g;
    public final /* synthetic */ RecyclerView h;

    public FO0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(OO0 oo0, boolean z) {
        RecyclerView.l(oo0);
        RecyclerView recyclerView = this.h;
        QO0 qo0 = recyclerView.z1;
        View view = oo0.a;
        if (qo0 != null) {
            PO0 po0 = qo0.e;
            AbstractC6897rk1.n(view, po0 instanceof PO0 ? (A1) po0.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.s1 != null) {
                recyclerView.g.z(oo0);
            }
            if (RecyclerView.M1) {
                Objects.toString(oo0);
            }
        }
        oo0.s = null;
        oo0.r = null;
        EO0 eo0C = c();
        eo0C.getClass();
        int i = oo0.f;
        ArrayList arrayList2 = eo0C.a(i).a;
        if (((DO0) eo0C.a.get(i)).b <= arrayList2.size()) {
            FL1.a(view);
        } else {
            if (RecyclerView.L1 && arrayList2.contains(oo0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            oo0.n();
            arrayList2.add(oo0);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.s1.b()) {
            return !recyclerView.s1.g ? i : recyclerView.e.h(i, 0);
        }
        StringBuilder sbN = AbstractC8235ym.n(i, "invalid position ", ". State item count is ");
        sbN.append(recyclerView.s1.b());
        sbN.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public final EO0 c() {
        if (this.g == null) {
            EO0 eo0 = new EO0();
            eo0.a = new SparseArray();
            eo0.b = 0;
            eo0.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = eo0;
            d();
        }
        return this.g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC6830rO0 abstractC6830rO0;
        EO0 eo0 = this.g;
        if (eo0 == null || (abstractC6830rO0 = (recyclerView = this.h).m) == null || !recyclerView.s) {
            return;
        }
        eo0.c.add(abstractC6830rO0);
    }

    public final void e(AbstractC6830rO0 abstractC6830rO0, boolean z) {
        EO0 eo0 = this.g;
        if (eo0 == null) {
            return;
        }
        Set set = eo0.c;
        set.remove(abstractC6830rO0);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = eo0.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((DO0) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                FL1.a(((OO0) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.R1) {
            C5583ks c5583ks = this.h.r1;
            int[] iArr = c5583ks.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c5583ks.d = 0;
        }
    }

    public final void g(int i) {
        boolean z = RecyclerView.L1;
        ArrayList arrayList = this.c;
        OO0 oo0 = (OO0) arrayList.get(i);
        if (RecyclerView.M1) {
            Objects.toString(oo0);
        }
        a(oo0, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        OO0 oo0M = RecyclerView.M(view);
        boolean zK = oo0M.k();
        RecyclerView recyclerView = this.h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (oo0M.j()) {
            oo0M.n.l(oo0M);
        } else if (oo0M.q()) {
            oo0M.j &= -33;
        }
        i(oo0M);
        if (recyclerView.M == null || oo0M.h()) {
            return;
        }
        recyclerView.M.d(oo0M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.OO0 r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FO0.i(OO0):void");
    }

    public final void j(View view) {
        AbstractC7784wO0 abstractC7784wO0;
        OO0 oo0M = RecyclerView.M(view);
        boolean zD = oo0M.d(12);
        RecyclerView recyclerView = this.h;
        if (!zD && oo0M.l() && (abstractC7784wO0 = recyclerView.M) != null) {
            XF xf = (XF) abstractC7784wO0;
            if (oo0M.c().isEmpty() && xf.g && !oo0M.g()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                oo0M.n = this;
                oo0M.o = true;
                this.b.add(oo0M);
                return;
            }
        }
        if (oo0M.g() && !oo0M.i() && !recyclerView.m.b) {
            throw new IllegalArgumentException(AbstractC1705Vq.f(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        oo0M.n = this;
        oo0M.o = false;
        this.a.add(oo0M);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.OO0 k(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FO0.k(int, long):OO0");
    }

    public final void l(OO0 oo0) {
        if (oo0.o) {
            this.b.remove(oo0);
        } else {
            this.a.remove(oo0);
        }
        oo0.n = null;
        oo0.o = false;
        oo0.j &= -33;
    }

    public final void m() {
        AbstractC8354zO0 abstractC8354zO0 = this.h.n;
        this.f = this.e + (abstractC8354zO0 != null ? abstractC8354zO0.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            g(size);
        }
    }
}
