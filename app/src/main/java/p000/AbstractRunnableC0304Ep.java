package p000;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: Ep */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0304Ep implements Runnable {

    /* renamed from: a */
    public final ES1 f2913a = new ES1(1);

    /* renamed from: a */
    public static void m2425a(C7863Ko1 c7863Ko1, String str) {
        RunnableC9290ep1 runnableC9290ep1;
        boolean z;
        WorkDatabase workDatabase = c7863Ko1.f6316c;
        C8435Vo1 c8435Vo1Mo10328u = workDatabase.mo10328u();
        C1339VH c1339vhMo10323p = workDatabase.mo10323p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iM8567j = c8435Vo1Mo10328u.m8567j(str2);
            if (iM8567j != 3 && iM8567j != 4) {
                c8435Vo1Mo10328u.m8574q(6, str2);
            }
            linkedList.addAll(c1339vhMo10323p.m8383y(str2));
        }
        PD0 pd0 = c7863Ko1.f6319f;
        synchronized (pd0.f8908l) {
            try {
                C1210TE.m7634G().getClass();
                pd0.f8906j.add(str);
                runnableC9290ep1 = (RunnableC9290ep1) pd0.f8902f.remove(str);
                z = runnableC9290ep1 != null;
                if (runnableC9290ep1 == null) {
                    runnableC9290ep1 = (RunnableC9290ep1) pd0.f8903g.remove(str);
                }
                if (runnableC9290ep1 != null) {
                    pd0.f8904h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        PD0.m6257d(runnableC9290ep1);
        if (z) {
            pd0.m6267l();
        }
        Iterator it = c7863Ko1.f6318e.iterator();
        while (it.hasNext()) {
            ((InterfaceC11933zV0) it.next()).mo8315c(str);
        }
    }

    /* renamed from: b */
    public abstract void mo1373b();

    @Override // java.lang.Runnable
    public final void run() {
        ES1 es1 = this.f2913a;
        try {
            mo1373b();
            es1.m2282C(ES1.f2705d);
        } catch (Throwable th) {
            es1.m2282C(new C10971ry0(th));
        }
    }
}
