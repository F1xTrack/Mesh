package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6188o12 {
    public static WeakReference a;

    public static final void a(PD0 pd0, final WorkDatabase workDatabase, C6928rv c6928rv, final List list, final C1623Uo1 c1623Uo1, final Set set) {
        C1701Vo1 c1701Vo1U = workDatabase.u();
        final String str = c1623Uo1.a;
        final C1623Uo1 c1623Uo1L = c1701Vo1U.l(str);
        if (c1623Uo1L == null) {
            throw new IllegalArgumentException(AbstractC8235ym.k("Worker with ", str, " doesn't exist"));
        }
        if (F91.r(c1623Uo1L.b)) {
            return;
        }
        if (c1623Uo1L.d() ^ c1623Uo1.d()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append(c1623Uo1L.d() ? "Periodic" : "OneTime");
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(AbstractC1705Vq.l(sb, c1623Uo1.d() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        final boolean zF = pd0.f(str);
        if (!zF) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC8375zV0) it.next()).c(str);
            }
        }
        Runnable runnable = new Runnable() { // from class: dp1
            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                WorkDatabase workDatabase2 = workDatabase;
                O90.f(workDatabase2, "$workDatabase");
                C1623Uo1 c1623Uo12 = c1623Uo1;
                C1623Uo1 c1623Uo13 = c1623Uo1L;
                O90.f(list, "$schedulers");
                String str2 = str;
                O90.f(str2, "$workSpecId");
                Set set2 = set;
                O90.f(set2, "$tags");
                C1701Vo1 c1701Vo1U2 = workDatabase2.u();
                C1857Xo1 c1857Xo1V = workDatabase2.v();
                C1623Uo1 c1623Uo1B = C1623Uo1.b(c1623Uo12, null, c1623Uo13.b, null, null, c1623Uo13.k, c1623Uo13.n, c1623Uo13.t + 1, 515069);
                if (Build.VERSION.SDK_INT < 26) {
                    C4061gy c4061gy = c1623Uo1B.j;
                    String name = ConstraintTrackingWorker.class.getName();
                    String str3 = c1623Uo1B.c;
                    if (!O90.a(str3, name) && (c4061gy.d || c4061gy.e)) {
                        C0481Fx1 c0481Fx1 = new C0481Fx1(13);
                        c0481Fx1.w(c1623Uo1B.e.a);
                        ((HashMap) c0481Fx1.a).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                        C8317zC c8317zC = new C8317zC((HashMap) c0481Fx1.a);
                        C8317zC.c(c8317zC);
                        c1623Uo1B = C1623Uo1.b(c1623Uo1B, null, 0, ConstraintTrackingWorker.class.getName(), c8317zC, 0, 0L, 0, 1048555);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1701Vo1U2.a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                try {
                    C5581kr0 c5581kr0 = (C5581kr0) c1701Vo1U2.c;
                    C3414dZ c3414dZA = c5581kr0.a();
                    try {
                        c5581kr0.g(c3414dZA, c1623Uo1B);
                        c3414dZA.m();
                        c5581kr0.f(c3414dZA);
                        workDatabase_Impl.n();
                        workDatabase_Impl.j();
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c1857Xo1V.b;
                        workDatabase_Impl2.b();
                        C5581kr0 c5581kr02 = (C5581kr0) c1857Xo1V.d;
                        C3414dZ c3414dZA2 = c5581kr02.a();
                        c3414dZA2.d(1, str2);
                        workDatabase_Impl2.c();
                        try {
                            c3414dZA2.m();
                            workDatabase_Impl2.n();
                            workDatabase_Impl2.j();
                            c5581kr02.f(c3414dZA2);
                            c1857Xo1V.H(str2, set2);
                            if (zF) {
                                return;
                            }
                            c1701Vo1U2.n(-1L, str2);
                            workDatabase2.t().t(str2);
                        } catch (Throwable th) {
                            workDatabase_Impl2.j();
                            c5581kr02.f(c3414dZA2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c5581kr0.f(c3414dZA);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl.j();
                    throw th3;
                }
            }
        };
        workDatabase.c();
        try {
            runnable.run();
            workDatabase.n();
            if (zF) {
                return;
            }
            CV0.a(c6928rv, workDatabase, list);
        } finally {
            workDatabase.j();
        }
    }
}
