package p000;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class K22 {
    /* renamed from: a */
    public static C11818yb0 m4530a(EnumC11952ze1 enumC11952ze1, boolean z, boolean z2, C8368Uh0 c8368Uh0, int i) {
        boolean z3 = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) != 0 ? false : z2;
        if ((i & 4) != 0) {
            c8368Uh0 = null;
        }
        return new C11818yb0(enumC11952ze1, z4, z3, c8368Uh0 != null ? AbstractC11433vZ0.m25454e(c8368Uh0) : null, 34);
    }

    /* renamed from: b */
    public static NT1 m4531b(Object obj, Object obj2) {
        NT1 nt1 = (NT1) obj;
        NT1 nt12 = (NT1) obj2;
        if (!nt12.isEmpty()) {
            if (!nt1.f7806a) {
                if (nt1.isEmpty()) {
                    nt1 = new NT1();
                } else {
                    NT1 nt13 = new NT1(nt1);
                    nt13.f7806a = true;
                    nt1 = nt13;
                }
            }
            nt1.m5694e();
            if (!nt12.isEmpty()) {
                nt1.putAll(nt12);
            }
        }
        return nt1;
    }

    /* renamed from: c */
    public static void m4532c(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public static void m4533d(Object obj, Object obj2) {
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

    /* renamed from: e */
    public static NT1 m4534e() {
        NT1 nt1 = NT1.f7805b;
        if (nt1.isEmpty()) {
            return new NT1();
        }
        NT1 nt12 = new NT1(nt1);
        nt12.f7806a = true;
        return nt12;
    }

    /* renamed from: f */
    public static void m4535f(Object obj) {
        ((NT1) obj).f7806a = false;
    }

    /* renamed from: g */
    public static NT1 m4536g(Object obj) {
        return (NT1) obj;
    }

    /* renamed from: h */
    public static boolean m4537h(Object obj) {
        return !((NT1) obj).f7806a;
    }
}
