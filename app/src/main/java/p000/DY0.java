package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DY0 {

    /* renamed from: a */
    public final CY0 f2043a;

    public DY0(int i, ArrayList arrayList, ExecutorC10151lY0 executorC10151lY0, C0239Dn c0239Dn) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f2043a = new BY0(i, arrayList, executorC10151lY0, c0239Dn);
        } else {
            this.f2043a = new AY0(i, arrayList, executorC10151lY0, c0239Dn);
        }
    }

    /* renamed from: a */
    public static ArrayList m1725a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC11766yB0.m26067c(((C8506Wy0) it.next()).f13467a.mo9437c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DY0)) {
            return false;
        }
        return this.f2043a.equals(((DY0) obj).f2043a);
    }

    public final int hashCode() {
        return this.f2043a.hashCode();
    }
}
