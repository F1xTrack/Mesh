package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Gk {
    public final /* synthetic */ Ik a;

    public Gk(Ik ik) {
        this.a = ik;
    }

    public final void a(String str, Kk kk, C4583gl c4583gl) {
        ArrayList arrayList;
        synchronized (this.a.b) {
            try {
                Collection collection = (Collection) this.a.a.a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rk) it.next()).a(kk, c4583gl);
        }
    }
}
