package p000;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: MO */
/* loaded from: classes.dex */
public final class RunnableC0780MO implements Runnable {

    /* renamed from: a */
    public final C11845yo1 f7141a;

    /* renamed from: b */
    public final ES1 f7142b;

    static {
        C1210TE.m7637M("EnqueueRunnable");
    }

    public RunnableC0780MO(C11845yo1 c11845yo1, ES1 es1) {
        this.f7141a = c11845yo1;
        this.f7142b = es1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5361a(p000.C11845yo1 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0780MO.m5361a(yo1):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ES1 es1 = this.f7142b;
        C11845yo1 c11845yo1 = this.f7141a;
        try {
            c11845yo1.getClass();
            C7863Ko1 c7863Ko1 = c11845yo1.f46486a;
            HashSet hashSet = new HashSet();
            hashSet.addAll(c11845yo1.f46490e);
            HashSet hashSetM26262c = C11845yo1.m26262c(c11845yo1);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(c11845yo1.f46490e);
                    z = false;
                    break;
                } else if (hashSetM26262c.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c11845yo1 + ")");
            }
            WorkDatabase workDatabase = c7863Ko1.f6316c;
            workDatabase.m23793c();
            try {
                boolean zM5361a = m5361a(c11845yo1);
                workDatabase.m23799n();
                if (zM5361a) {
                    AbstractC7624Fz0.m2870a(c7863Ko1.f6314a, RescheduleReceiver.class, true);
                    CV0.m1192a(c7863Ko1.f6315b, c7863Ko1.f6316c, c7863Ko1.f6318e);
                }
                es1.m2282C(ES1.f2705d);
            } finally {
                workDatabase.m23795j();
            }
        } catch (Throwable th) {
            es1.m2282C(new C10971ry0(th));
        }
    }
}
