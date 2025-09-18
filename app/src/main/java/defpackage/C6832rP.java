package defpackage;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* renamed from: rP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6832rP {
    public static volatile C6832rP q;
    public static final C7214tP r;
    public static final HashMap s;
    public final HashMap a;
    public final HashMap b;
    public final ConcurrentHashMap c;
    public final C6987sD d = new C6987sD(2);
    public final C1304Qm0 e;
    public final A20 f;
    public final RunnableC7834wf g;
    public final XZ h;
    public final P51 i;
    public final ExecutorService j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final InterfaceC7472ul0 p;

    static {
        C7214tP c7214tP = new C7214tP();
        c7214tP.a = C7214tP.b;
        r = c7214tP;
        s = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6832rP() {
        /*
            r5 = this;
            r5.<init>()
            sD r0 = new sD
            r1 = 2
            r0.<init>(r1)
            r5.d = r0
            tP r0 = defpackage.C6832rP.r
            r0.getClass()
            boolean r1 = defpackage.C7090sl0.a
            r2 = 0
            if (r1 == 0) goto L23
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L1a
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L23
            sl0 r3 = new sl0
            r3.<init>()
            goto L2a
        L23:
            TE r3 = new TE
            r4 = 17
            r3.<init>(r4)
        L2a:
            r5.p = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.a = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.b = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r5.c = r3
            if (r1 == 0) goto L54
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L48
            goto L49
        L48:
            r1 = r2
        L49:
            if (r1 != 0) goto L4c
            goto L54
        L4c:
            Qm0 r3 = new Qm0
            r4 = 23
            r3.<init>(r4, r1)
            goto L55
        L54:
            r3 = r2
        L55:
            r5.e = r3
            if (r3 == 0) goto L62
            A20 r2 = new A20
            java.lang.Object r1 = r3.b
            android.os.Looper r1 = (android.os.Looper) r1
            r2.<init>(r5, r1)
        L62:
            r5.f = r2
            wf r1 = new wf
            r1.<init>(r5)
            r5.g = r1
            XZ r1 = new XZ
            r1.<init>(r5)
            r5.h = r1
            P51 r1 = new P51
            r1.<init>()
            r5.i = r1
            r1 = 1
            r5.k = r1
            r5.l = r1
            r5.m = r1
            r5.n = r1
            r5.o = r1
            java.util.concurrent.ExecutorService r0 = r0.a
            r5.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6832rP.<init>():void");
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static C6832rP b() {
        if (q == null) {
            synchronized (C6832rP.class) {
                try {
                    if (q == null) {
                        q = new C6832rP();
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final void c(CA0 ca0) {
        Object obj = ca0.a;
        Q51 q51 = ca0.b;
        ca0.a = null;
        ca0.b = null;
        ca0.c = null;
        ArrayList arrayList = CA0.d;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(ca0);
            }
        }
        if (q51.c) {
            d(q51, obj);
        }
    }

    public final void d(Q51 q51, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            q51.b.a.invoke(q51.a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            boolean z = obj instanceof N51;
            boolean z2 = this.k;
            InterfaceC7472ul0 interfaceC7472ul0 = this.p;
            if (!z) {
                if (z2) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder("Could not dispatch event: ");
                    sb.append(obj.getClass());
                    sb.append(" to subscribing class ");
                    VH0 vh0 = q51.a;
                    sb.append(VH0.class);
                    interfaceC7472ul0.A(level, sb.toString(), cause);
                }
                if (this.m) {
                    f(new N51(cause, obj, q51.a));
                    return;
                }
                return;
            }
            if (z2) {
                Level level2 = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("SubscriberExceptionEvent subscriber ");
                VH0 vh02 = q51.a;
                sb2.append(VH0.class);
                sb2.append(" threw an exception");
                interfaceC7472ul0.A(level2, sb2.toString(), cause);
                N51 n51 = (N51) obj;
                interfaceC7472ul0.A(level2, "Initial event " + n51.b + " caused exception in " + n51.c, n51.a);
            }
        }
    }

    public final synchronized boolean e(VH0 vh0) {
        return this.b.containsKey(vh0);
    }

    public final void f(Object obj) {
        C6642qP c6642qP = (C6642qP) this.d.get();
        ArrayList arrayList = c6642qP.a;
        arrayList.add(obj);
        if (c6642qP.b) {
            return;
        }
        C1304Qm0 c1304Qm0 = this.e;
        c6642qP.c = c1304Qm0 == null || ((Looper) c1304Qm0.b) == Looper.myLooper();
        c6642qP.b = true;
        while (!arrayList.isEmpty()) {
            try {
                g(arrayList.remove(0), c6642qP);
            } finally {
                c6642qP.b = false;
                c6642qP.c = false;
            }
        }
    }

    public final void g(Object obj, C6642qP c6642qP) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zH;
        List list;
        Class<?> cls = obj.getClass();
        if (this.o) {
            HashMap map = s;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            a(arrayList, superclass.getInterfaces());
                        }
                        s.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = list.size();
            zH = false;
            for (int i = 0; i < size; i++) {
                zH |= h(obj, c6642qP, (Class) list.get(i));
            }
        } else {
            zH = h(obj, c6642qP, cls);
        }
        if (zH) {
            return;
        }
        if (this.l) {
            this.p.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.n || cls == C0552Gv0.class || cls == N51.class) {
            return;
        }
        f(new C0552Gv0(obj));
    }

    public final boolean h(Object obj, C6642qP c6642qP, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Q51 q51 = (Q51) it.next();
            c6642qP.d = obj;
            i(q51, obj, c6642qP.c);
        }
        return true;
    }

    public final void i(Q51 q51, Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = AbstractC6451pP.a[q51.b.b.ordinal()];
        if (i == 1) {
            d(q51, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                d(q51, obj);
                return;
            }
            A20 a20 = this.f;
            a20.getClass();
            CA0 ca0A = CA0.a(q51, obj);
            synchronized (a20) {
                try {
                    a20.a.v(ca0A);
                    if (!a20.d) {
                        a20.d = true;
                        if (!a20.sendMessage(a20.obtainMessage())) {
                            throw new C7074sg("Could not send handler message");
                        }
                    }
                } finally {
                }
            }
            return;
        }
        if (i == 3) {
            if (z) {
                this.g.a(q51, obj);
                return;
            } else {
                d(q51, obj);
                return;
            }
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown thread mode: " + q51.b.b);
        }
        XZ xz = this.h;
        xz.getClass();
        ((C3383dO1) xz.b).v(CA0.a(q51, obj));
        ((C6832rP) xz.c).j.execute(xz);
    }

    public final void j(VH0 vh0, O51 o51) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object value;
        Class cls = o51.c;
        Q51 q51 = new Q51(vh0, o51);
        HashMap map = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(q51)) {
            throw new C7074sg("Subscriber " + VH0.class + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i != size) {
                if (o51.d <= ((Q51) copyOnWriteArrayList.get(i)).b.d) {
                }
            }
            copyOnWriteArrayList.add(i, q51);
            break;
        }
        HashMap map2 = this.b;
        List arrayList = (List) map2.get(vh0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(vh0, arrayList);
        }
        arrayList.add(cls);
        if (o51.e) {
            ConcurrentHashMap concurrentHashMap = this.c;
            C1304Qm0 c1304Qm0 = this.e;
            if (this.o) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                        i(q51, value, c1304Qm0 == null || ((Looper) c1304Qm0.b) == Looper.myLooper());
                    }
                }
                return;
            }
            Object obj = concurrentHashMap.get(cls);
            if (obj != null) {
                i(q51, obj, c1304Qm0 != null ? ((Looper) c1304Qm0.b) == Looper.myLooper() : true);
            }
        }
    }

    public final String toString() {
        return AbstractC8235ym.m(new StringBuilder("EventBus[indexCount=0, eventInheritance="), this.o, "]");
    }
}
