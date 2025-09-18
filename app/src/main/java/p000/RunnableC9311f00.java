package p000;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: f00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9311f00 implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f26994e = new ThreadLocal();

    /* renamed from: f */
    public static final C8774aq0 f26995f = new C8774aq0(11);

    /* renamed from: a */
    public ArrayList f26996a;

    /* renamed from: b */
    public long f26997b;

    /* renamed from: c */
    public long f26998c;

    /* renamed from: d */
    public ArrayList f26999d;

    /* renamed from: c */
    public static OO0 m18145c(RecyclerView recyclerView, int i, long j) {
        int iM22561T = recyclerView.f16504f.m22561T();
        for (int i2 = 0; i2 < iM22561T; i2++) {
            OO0 oo0M10226M = RecyclerView.m10226M(recyclerView.f16504f.m22560S(i2));
            if (oo0M10226M.f8410c == i && !oo0M10226M.m6050g()) {
                return null;
            }
        }
        FO0 fo0 = recyclerView.f16498c;
        try {
            recyclerView.m10252T();
            OO0 oo0M2628k = fo0.m2628k(i, j);
            if (oo0M2628k != null) {
                if (!oo0M2628k.m6049f() || oo0M2628k.m6050g()) {
                    fo0.m2618a(oo0M2628k, false);
                } else {
                    fo0.m2625h(oo0M2628k.f8408a);
                }
            }
            recyclerView.m10253U(false);
            return oo0M2628k;
        } catch (Throwable th) {
            recyclerView.m10253U(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m18146a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f16519s) {
            if (RecyclerView.f16450L1 && !this.f26996a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f26997b == 0) {
                this.f26997b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C6327ks c6327ks = recyclerView.f16518r1;
        c6327ks.f36730a = i;
        c6327ks.f36731b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18147b(long r17) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC9311f00.m18147b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC7421Cb1.f1471a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f26996a;
            if (arrayList.isEmpty()) {
                this.f26997b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f26997b = 0L;
                Trace.endSection();
            } else {
                m18147b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f26998c);
                this.f26997b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f26997b = 0L;
            int i3 = AbstractC7421Cb1.f1471a;
            Trace.endSection();
            throw th;
        }
    }
}
