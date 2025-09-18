package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: eH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3550eH {
    public final String a;
    public final G10 b;

    public C3550eH(Set set, G10 g10) {
        this.a = b(set);
        this.b = g10;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1510Td c1510Td = (C1510Td) it.next();
            sb.append(c1510Td.a);
            sb.append('/');
            sb.append(c1510Td.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        G10 g10 = this.b;
        synchronized (((HashSet) g10.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) g10.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(g10.G());
    }
}
