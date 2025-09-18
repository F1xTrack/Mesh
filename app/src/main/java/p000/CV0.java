package p000;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CV0 {

    /* renamed from: a */
    public static final /* synthetic */ int f1414a = 0;

    static {
        C1210TE.m7637M("Schedulers");
    }

    /* renamed from: a */
    public static void m1192a(C6790rv c6790rv, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C8435Vo1 c8435Vo1Mo10328u = workDatabase.mo10328u();
        workDatabase.m23793c();
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = c6790rv.f42152b;
            if (i == 23) {
                i2 /= 2;
            }
            ArrayList arrayListM8564g = c8435Vo1Mo10328u.m8564g(i2);
            ArrayList arrayListM8563f = c8435Vo1Mo10328u.m8563f();
            if (arrayListM8564g.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListM8564g.iterator();
                while (it.hasNext()) {
                    c8435Vo1Mo10328u.m8571n(jCurrentTimeMillis, ((C8383Uo1) it.next()).f12134a);
                }
            }
            workDatabase.m23799n();
            workDatabase.m23795j();
            if (arrayListM8564g.size() > 0) {
                C8383Uo1[] c8383Uo1Arr = (C8383Uo1[]) arrayListM8564g.toArray(new C8383Uo1[arrayListM8564g.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC11933zV0 interfaceC11933zV0 = (InterfaceC11933zV0) it2.next();
                    if (interfaceC11933zV0.mo8314b()) {
                        interfaceC11933zV0.mo8316e(c8383Uo1Arr);
                    }
                }
            }
            if (arrayListM8563f.size() > 0) {
                C8383Uo1[] c8383Uo1Arr2 = (C8383Uo1[]) arrayListM8563f.toArray(new C8383Uo1[arrayListM8563f.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC11933zV0 interfaceC11933zV02 = (InterfaceC11933zV0) it3.next();
                    if (!interfaceC11933zV02.mo8314b()) {
                        interfaceC11933zV02.mo8316e(c8383Uo1Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m23795j();
            throw th;
        }
    }
}
