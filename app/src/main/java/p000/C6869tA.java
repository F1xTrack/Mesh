package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: tA */
/* loaded from: classes.dex */
public final class C6869tA {

    /* renamed from: a */
    public final C10030kb1 f42892a;

    public C6869tA(C10030kb1 c10030kb1) {
        this.f42892a = c10030kb1;
    }

    /* renamed from: a */
    public final void m24849a(C7025ve c7025ve) {
        C10030kb1 c10030kb1 = this.f42892a;
        HashSet hashSet = c7025ve.f44461a;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(hashSet));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C6899te c6899te = (C6899te) ((AbstractC9885jT0) it.next());
            String str = c6899te.f43179b;
            String str2 = c6899te.f43181d;
            String str3 = c6899te.f43182e;
            String str4 = c6899te.f43180c;
            long j = c6899te.f43183f;
            C8170Qm0 c8170Qm0 = AbstractC10013kT0.f36505a;
            arrayList.add(new C6962ue(str, str2, str3.length() > 256 ? str3.substring(0, 256) : str3, str4, j));
        }
        synchronized (((C10141lT0) c10030kb1.f36566f)) {
            try {
                if (((C10141lT0) c10030kb1.f36566f).m22431c(arrayList)) {
                    ((ExecutorC1584ZA) ((C10910rT1) c10030kb1.f36562b).f41679c).m9502a(new O91(c10030kb1, 3, ((C10141lT0) c10030kb1.f36566f).m22429a()));
                }
            } finally {
            }
        }
    }
}
