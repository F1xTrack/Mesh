package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: tA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7169tA {
    public final C5534kb1 a;

    public C7169tA(C5534kb1 c5534kb1) {
        this.a = c5534kb1;
    }

    public final void a(C7641ve c7641ve) {
        C5534kb1 c5534kb1 = this.a;
        HashSet hashSet = c7641ve.a;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(hashSet));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C7259te c7259te = (C7259te) ((AbstractC5318jT0) it.next());
            String str = c7259te.b;
            String str2 = c7259te.d;
            String str3 = c7259te.e;
            String str4 = c7259te.c;
            long j = c7259te.f;
            C1304Qm0 c1304Qm0 = AbstractC5509kT0.a;
            arrayList.add(new C7450ue(str, str2, str3.length() > 256 ? str3.substring(0, 256) : str3, str4, j));
        }
        synchronized (((C5700lT0) c5534kb1.f)) {
            try {
                if (((C5700lT0) c5534kb1.f).c(arrayList)) {
                    ((ZA) ((C6846rT1) c5534kb1.b).c).a(new O91(c5534kb1, 3, ((C5700lT0) c5534kb1.f).a()));
                }
            } finally {
            }
        }
    }
}
