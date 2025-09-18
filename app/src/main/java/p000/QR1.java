package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class QR1 {
    /* renamed from: a */
    public static ExecutorC1215TJ m6703a() {
        if (ExecutorC1215TJ.f11316b != null) {
            return ExecutorC1215TJ.f11316b;
        }
        synchronized (ExecutorC1215TJ.class) {
            try {
                if (ExecutorC1215TJ.f11316b == null) {
                    ExecutorC1215TJ.f11316b = new ExecutorC1215TJ(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC1215TJ.f11316b;
    }

    /* renamed from: b */
    public static boolean m6704b(Set set, Object obj) {
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

    /* renamed from: c */
    public static C11049sZ0 m6705c(Set set, InterfaceC11895zC0 interfaceC11895zC0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C11049sZ0)) {
                set.getClass();
                return new C11049sZ0(set, interfaceC11895zC0);
            }
            C11049sZ0 c11049sZ0 = (C11049sZ0) set;
            InterfaceC11895zC0 interfaceC11895zC02 = c11049sZ0.f42483b;
            interfaceC11895zC02.getClass();
            return new C11049sZ0(c11049sZ0.f42482a, new AC0(Arrays.asList(interfaceC11895zC02, interfaceC11895zC0)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C11049sZ0)) {
            set2.getClass();
            return new C11177tZ0(set2, interfaceC11895zC0);
        }
        C11049sZ0 c11049sZ02 = (C11049sZ0) set2;
        InterfaceC11895zC0 interfaceC11895zC03 = c11049sZ02.f42483b;
        interfaceC11895zC03.getClass();
        return new C11177tZ0((SortedSet) c11049sZ02.f42482a, new AC0(Arrays.asList(interfaceC11895zC03, interfaceC11895zC0)));
    }

    /* renamed from: d */
    public static int m6706d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: e */
    public static ExecutorC8931c30 m6707e() {
        if (ExecutorC8931c30.f17270c != null) {
            return ExecutorC8931c30.f17270c;
        }
        synchronized (ExecutorC8931c30.class) {
            try {
                if (ExecutorC8931c30.f17270c == null) {
                    ExecutorC8931c30.f17270c = new ExecutorC8931c30();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC8931c30.f17270c;
    }

    /* renamed from: f */
    public static C10921rZ0 m6708f(V70 v70, V70 v702) {
        QL1.m6668d(v70, "set1");
        QL1.m6668d(v702, "set2");
        return new C10921rZ0(v70, v702);
    }

    /* renamed from: g */
    public static ExecutorC9387fa0 m6709g() {
        if (ExecutorC9387fa0.f27240c != null) {
            return ExecutorC9387fa0.f27240c;
        }
        synchronized (ExecutorC9387fa0.class) {
            try {
                if (ExecutorC9387fa0.f27240c == null) {
                    ExecutorC9387fa0.f27240c = new ExecutorC9387fa0(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ExecutorC9387fa0.f27240c;
    }

    /* renamed from: h */
    public static C20 m6710h() {
        if (AbstractC7858Km0.f6279a != null) {
            return AbstractC7858Km0.f6279a;
        }
        synchronized (AbstractC7858Km0.class) {
            try {
                if (AbstractC7858Km0.f6279a == null) {
                    AbstractC7858Km0.f6279a = new C20(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return AbstractC7858Km0.f6279a;
    }
}
