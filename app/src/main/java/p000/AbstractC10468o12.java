package p000;

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
public abstract class AbstractC10468o12 {

    /* renamed from: a */
    public static WeakReference f38689a;

    /* renamed from: a */
    public static final void m23309a(PD0 pd0, final WorkDatabase workDatabase, C6790rv c6790rv, final List list, final C8383Uo1 c8383Uo1, final Set set) {
        C8435Vo1 c8435Vo1Mo10328u = workDatabase.mo10328u();
        final String str = c8383Uo1.f12134a;
        final C8383Uo1 c8383Uo1M8569l = c8435Vo1Mo10328u.m8569l(str);
        if (c8383Uo1M8569l == null) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Worker with ", str, " doesn't exist"));
        }
        if (F91.m2535r(c8383Uo1M8569l.f12135b)) {
            return;
        }
        if (c8383Uo1M8569l.m8185d() ^ c8383Uo1.m8185d()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append(c8383Uo1M8569l.m8185d() ? "Periodic" : "OneTime");
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(AbstractC1374Vq.m8593l(sb, c8383Uo1.m8185d() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
        }
        final boolean zM6261f = pd0.m6261f(str);
        if (!zM6261f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC11933zV0) it.next()).mo8315c(str);
            }
        }
        Runnable runnable = new Runnable() { // from class: dp1
            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                WorkDatabase workDatabase2 = workDatabase;
                O90.m5968f(workDatabase2, "$workDatabase");
                C8383Uo1 c8383Uo12 = c8383Uo1;
                C8383Uo1 c8383Uo13 = c8383Uo1M8569l;
                O90.m5968f(list, "$schedulers");
                String str2 = str;
                O90.m5968f(str2, "$workSpecId");
                Set set2 = set;
                O90.m5968f(set2, "$tags");
                C8435Vo1 c8435Vo1Mo10328u2 = workDatabase2.mo10328u();
                C8539Xo1 c8539Xo1Mo10329v = workDatabase2.mo10329v();
                C8383Uo1 c8383Uo1M8182b = C8383Uo1.m8182b(c8383Uo12, null, c8383Uo13.f12135b, null, null, c8383Uo13.f12144k, c8383Uo13.f12147n, c8383Uo13.f12153t + 1, 515069);
                if (Build.VERSION.SDK_INT < 26) {
                    C4149gy c4149gy = c8383Uo1M8182b.f12143j;
                    String name = ConstraintTrackingWorker.class.getName();
                    String str3 = c8383Uo1M8182b.f12136c;
                    if (!O90.m5963a(str3, name) && (c4149gy.f28119d || c4149gy.f28120e)) {
                        C7621Fx1 c7621Fx1 = new C7621Fx1(13);
                        c7621Fx1.m2859w(c8383Uo1M8182b.f12138e.f46722a);
                        ((HashMap) c7621Fx1.f3494a).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                        C7249zC c7249zC = new C7249zC((HashMap) c7621Fx1.f3494a);
                        C7249zC.m26327c(c7249zC);
                        c8383Uo1M8182b = C8383Uo1.m8182b(c8383Uo1M8182b, null, 0, ConstraintTrackingWorker.class.getName(), c7249zC, 0, 0L, 0, 1048555);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c8435Vo1Mo10328u2.f12763a;
                workDatabase_Impl.m23792b();
                workDatabase_Impl.m23793c();
                try {
                    C10061kr0 c10061kr0 = (C10061kr0) c8435Vo1Mo10328u2.f12765c;
                    C3936dZ c3936dZM2771a = c10061kr0.m2771a();
                    try {
                        c10061kr0.m22274g(c3936dZM2771a, c8383Uo1M8182b);
                        c3936dZM2771a.m17710m();
                        c10061kr0.m2776f(c3936dZM2771a);
                        workDatabase_Impl.m23799n();
                        workDatabase_Impl.m23795j();
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c8539Xo1Mo10329v.f13981b;
                        workDatabase_Impl2.m23792b();
                        C10061kr0 c10061kr02 = (C10061kr0) c8539Xo1Mo10329v.f13983d;
                        C3936dZ c3936dZM2771a2 = c10061kr02.m2771a();
                        c3936dZM2771a2.mo2033d(1, str2);
                        workDatabase_Impl2.m23793c();
                        try {
                            c3936dZM2771a2.m17710m();
                            workDatabase_Impl2.m23799n();
                            workDatabase_Impl2.m23795j();
                            c10061kr02.m2776f(c3936dZM2771a2);
                            c8539Xo1Mo10329v.m9126H(str2, set2);
                            if (zM6261f) {
                                return;
                            }
                            c8435Vo1Mo10328u2.m8571n(-1L, str2);
                            workDatabase2.mo10327t().m6153t(str2);
                        } catch (Throwable th) {
                            workDatabase_Impl2.m23795j();
                            c10061kr02.m2776f(c3936dZM2771a2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c10061kr0.m2776f(c3936dZM2771a);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl.m23795j();
                    throw th3;
                }
            }
        };
        workDatabase.m23793c();
        try {
            runnable.run();
            workDatabase.m23799n();
            if (zM6261f) {
                return;
            }
            CV0.m1192a(c6790rv, workDatabase, list);
        } finally {
            workDatabase.m23795j();
        }
    }
}
