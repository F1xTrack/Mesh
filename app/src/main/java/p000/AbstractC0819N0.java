package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: N0 */
/* loaded from: classes.dex */
public abstract class AbstractC0819N0 {

    /* renamed from: a */
    public transient Set f7447a;

    /* renamed from: b */
    public transient Collection f7448b;

    /* renamed from: c */
    public transient Map f7449c;

    /* renamed from: a */
    public abstract Map mo4619a();

    /* renamed from: b */
    public boolean mo5489b(Object obj) {
        Iterator it = mo4619a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract Collection mo5490c(String str);

    /* renamed from: d */
    public final void m5491d(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        mo5490c(str).addAll(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0819N0) {
            return mo4619a().equals(((AbstractC0819N0) obj).mo4619a());
        }
        return false;
    }

    public final int hashCode() {
        return mo4619a().hashCode();
    }

    public final String toString() {
        return mo4619a().toString();
    }
}
