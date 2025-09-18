package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class QR1 {
    public static TJ a() {
        if (TJ.b != null) {
            return TJ.b;
        }
        synchronized (TJ.class) {
            try {
                if (TJ.b == null) {
                    TJ.b = new TJ(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return TJ.b;
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static C7054sZ0 c(Set set, InterfaceC8318zC0 interfaceC8318zC0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C7054sZ0)) {
                set.getClass();
                return new C7054sZ0(set, interfaceC8318zC0);
            }
            C7054sZ0 c7054sZ0 = (C7054sZ0) set;
            InterfaceC8318zC0 interfaceC8318zC02 = c7054sZ0.b;
            interfaceC8318zC02.getClass();
            return new C7054sZ0(c7054sZ0.a, new AC0(Arrays.asList(interfaceC8318zC02, interfaceC8318zC0)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C7054sZ0)) {
            set2.getClass();
            return new C7245tZ0(set2, interfaceC8318zC0);
        }
        C7054sZ0 c7054sZ02 = (C7054sZ0) set2;
        InterfaceC8318zC0 interfaceC8318zC03 = c7054sZ02.b;
        interfaceC8318zC03.getClass();
        return new C7245tZ0((SortedSet) c7054sZ02.a, new AC0(Arrays.asList(interfaceC8318zC03, interfaceC8318zC0)));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static ExecutorC2442c30 e() {
        if (ExecutorC2442c30.c != null) {
            return ExecutorC2442c30.c;
        }
        synchronized (ExecutorC2442c30.class) {
            try {
                if (ExecutorC2442c30.c == null) {
                    ExecutorC2442c30.c = new ExecutorC2442c30();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC2442c30.c;
    }

    public static C6863rZ0 f(V70 v70, V70 v702) {
        QL1.d(v70, "set1");
        QL1.d(v702, "set2");
        return new C6863rZ0(v70, v702);
    }

    public static ExecutorC3799fa0 g() {
        if (ExecutorC3799fa0.c != null) {
            return ExecutorC3799fa0.c;
        }
        synchronized (ExecutorC3799fa0.class) {
            try {
                if (ExecutorC3799fa0.c == null) {
                    ExecutorC3799fa0.c = new ExecutorC3799fa0(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC3799fa0.c;
    }

    public static C20 h() {
        if (AbstractC0837Km0.a != null) {
            return AbstractC0837Km0.a;
        }
        synchronized (AbstractC0837Km0.class) {
            try {
                if (AbstractC0837Km0.a == null) {
                    AbstractC0837Km0.a = new C20(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return AbstractC0837Km0.a;
    }
}
