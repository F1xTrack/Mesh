package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CV0 {
    public static final /* synthetic */ int a = 0;

    static {
        TE.M("Schedulers");
    }

    public static void a(C6928rv c6928rv, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C1701Vo1 c1701Vo1U = workDatabase.u();
        workDatabase.c();
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = c6928rv.b;
            if (i == 23) {
                i2 /= 2;
            }
            ArrayList arrayListG = c1701Vo1U.g(i2);
            ArrayList arrayListF = c1701Vo1U.f();
            if (arrayListG.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    c1701Vo1U.n(jCurrentTimeMillis, ((C1623Uo1) it.next()).a);
                }
            }
            workDatabase.n();
            workDatabase.j();
            if (arrayListG.size() > 0) {
                C1623Uo1[] c1623Uo1Arr = (C1623Uo1[]) arrayListG.toArray(new C1623Uo1[arrayListG.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC8375zV0 interfaceC8375zV0 = (InterfaceC8375zV0) it2.next();
                    if (interfaceC8375zV0.b()) {
                        interfaceC8375zV0.e(c1623Uo1Arr);
                    }
                }
            }
            if (arrayListF.size() > 0) {
                C1623Uo1[] c1623Uo1Arr2 = (C1623Uo1[]) arrayListF.toArray(new C1623Uo1[arrayListF.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC8375zV0 interfaceC8375zV02 = (InterfaceC8375zV0) it3.next();
                    if (!interfaceC8375zV02.b()) {
                        interfaceC8375zV02.e(c1623Uo1Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
