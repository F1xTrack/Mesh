package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: Ep, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0377Ep implements Runnable {
    public final ES1 a = new ES1(1);

    public static void a(C0844Ko1 c0844Ko1, String str) {
        RunnableC3654ep1 runnableC3654ep1;
        boolean z;
        WorkDatabase workDatabase = c0844Ko1.c;
        C1701Vo1 c1701Vo1U = workDatabase.u();
        VH vhP = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iJ = c1701Vo1U.j(str2);
            if (iJ != 3 && iJ != 4) {
                c1701Vo1U.q(6, str2);
            }
            linkedList.addAll(vhP.y(str2));
        }
        PD0 pd0 = c0844Ko1.f;
        synchronized (pd0.l) {
            try {
                TE.G().getClass();
                pd0.j.add(str);
                runnableC3654ep1 = (RunnableC3654ep1) pd0.f.remove(str);
                z = runnableC3654ep1 != null;
                if (runnableC3654ep1 == null) {
                    runnableC3654ep1 = (RunnableC3654ep1) pd0.g.remove(str);
                }
                if (runnableC3654ep1 != null) {
                    pd0.h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        PD0.d(runnableC3654ep1);
        if (z) {
            pd0.l();
        }
        Iterator it = c0844Ko1.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC8375zV0) it.next()).c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        ES1 es1 = this.a;
        try {
            b();
            es1.C(ES1.d);
        } catch (Throwable th) {
            es1.C(new C6938ry0(th));
        }
    }
}
