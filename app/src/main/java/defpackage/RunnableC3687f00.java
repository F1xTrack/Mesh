package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: f00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3687f00 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final C2209aq0 f = new C2209aq0(11);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static OO0 c(RecyclerView recyclerView, int i, long j) {
        int iT = recyclerView.f.T();
        for (int i2 = 0; i2 < iT; i2++) {
            OO0 oo0M = RecyclerView.M(recyclerView.f.S(i2));
            if (oo0M.c == i && !oo0M.g()) {
                return null;
            }
        }
        FO0 fo0 = recyclerView.c;
        try {
            recyclerView.T();
            OO0 oo0K = fo0.k(i, j);
            if (oo0K != null) {
                if (!oo0K.f() || oo0K.g()) {
                    fo0.a(oo0K, false);
                } else {
                    fo0.h(oo0K.a);
                }
            }
            recyclerView.U(false);
            return oo0K;
        } catch (Throwable th) {
            recyclerView.U(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s) {
            if (RecyclerView.L1 && !this.a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C5583ks c5583ks = recyclerView.r1;
        c5583ks.a = i;
        c5583ks.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3687f00.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC0181Cb1.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                this.b = 0L;
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
                this.b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                this.b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.b = 0L;
            int i3 = AbstractC0181Cb1.a;
            Trace.endSection();
            throw th;
        }
    }
}
