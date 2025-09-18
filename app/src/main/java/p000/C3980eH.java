package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: eH */
/* loaded from: classes.dex */
public final class C3980eH {

    /* renamed from: a */
    public final String f26633a;

    /* renamed from: b */
    public final G10 f26634b;

    public C3980eH(Set set, G10 g10) {
        this.f26633a = m17893b(set);
        this.f26634b = g10;
    }

    /* renamed from: b */
    public static String m17893b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1235Td c1235Td = (C1235Td) it.next();
            sb.append(c1235Td.f11446a);
            sb.append('/');
            sb.append(c1235Td.f11447b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String m17894a() {
        Set setUnmodifiableSet;
        G10 g10 = this.f26634b;
        synchronized (((HashSet) g10.f3531b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) g10.f3531b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f26633a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + m17893b(g10.m2890G());
    }
}
