package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MO implements Runnable {
    public final C8243yo1 a;
    public final ES1 b;

    static {
        TE.M("EnqueueRunnable");
    }

    public MO(C8243yo1 c8243yo1, ES1 es1) {
        this.a = c8243yo1;
        this.b = es1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.C8243yo1 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MO.a(yo1):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ES1 es1 = this.b;
        C8243yo1 c8243yo1 = this.a;
        try {
            c8243yo1.getClass();
            C0844Ko1 c0844Ko1 = c8243yo1.a;
            HashSet hashSet = new HashSet();
            hashSet.addAll(c8243yo1.e);
            HashSet hashSetC = C8243yo1.c(c8243yo1);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(c8243yo1.e);
                    z = false;
                    break;
                } else if (hashSetC.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c8243yo1 + ")");
            }
            WorkDatabase workDatabase = c0844Ko1.c;
            workDatabase.c();
            try {
                boolean zA = a(c8243yo1);
                workDatabase.n();
                if (zA) {
                    AbstractC0486Fz0.a(c0844Ko1.a, RescheduleReceiver.class, true);
                    CV0.a(c0844Ko1.b, c0844Ko1.c, c0844Ko1.e);
                }
                es1.C(ES1.d);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            es1.C(new C6938ry0(th));
        }
    }
}
