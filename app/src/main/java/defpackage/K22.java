package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class K22 {
    public static C8203yb0 a(EnumC8403ze1 enumC8403ze1, boolean z, boolean z2, C1601Uh0 c1601Uh0, int i) {
        boolean z3 = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            c1601Uh0 = null;
        }
        return new C8203yb0(enumC8403ze1, z4, z3, c1601Uh0 != null ? AbstractC7627vZ0.e(c1601Uh0) : null, 34);
    }

    public static NT1 b(Object obj, Object obj2) {
        NT1 nt1 = (NT1) obj;
        NT1 nt12 = (NT1) obj2;
        if (!nt12.isEmpty()) {
            if (!nt1.a) {
                if (nt1.isEmpty()) {
                    nt1 = new NT1();
                } else {
                    NT1 nt13 = new NT1(nt1);
                    nt13.a = true;
                    nt1 = nt13;
                }
            }
            nt1.e();
            if (!nt12.isEmpty()) {
                nt1.putAll(nt12);
            }
        }
        return nt1;
    }

    public static void c(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    public static void d(Object obj, Object obj2) {
        NT1 nt1 = (NT1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (nt1.isEmpty()) {
            return;
        }
        Iterator it = nt1.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    public static NT1 e() {
        NT1 nt1 = NT1.b;
        if (nt1.isEmpty()) {
            return new NT1();
        }
        NT1 nt12 = new NT1(nt1);
        nt12.a = true;
        return nt12;
    }

    public static void f(Object obj) {
        ((NT1) obj).a = false;
    }

    public static NT1 g(Object obj) {
        return (NT1) obj;
    }

    public static boolean h(Object obj) {
        return !((NT1) obj).a;
    }
}
