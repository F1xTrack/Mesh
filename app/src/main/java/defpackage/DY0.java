package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DY0 {
    public final CY0 a;

    public DY0(int i, ArrayList arrayList, ExecutorC5715lY0 executorC5715lY0, C0293Dn c0293Dn) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new BY0(i, arrayList, executorC5715lY0, c0293Dn);
        } else {
            this.a = new AY0(i, arrayList, executorC5715lY0, c0293Dn);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8125yB0.c(((C1808Wy0) it.next()).a.c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DY0)) {
            return false;
        }
        return this.a.equals(((DY0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
