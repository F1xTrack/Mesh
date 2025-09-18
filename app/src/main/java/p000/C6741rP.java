package p000;

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

/* renamed from: rP */
/* loaded from: classes2.dex */
public final class C6741rP {

    /* renamed from: q */
    public static volatile C6741rP f41644q;

    /* renamed from: r */
    public static final C6884tP f41645r;

    /* renamed from: s */
    public static final HashMap f41646s;

    /* renamed from: a */
    public final HashMap f41647a;

    /* renamed from: b */
    public final HashMap f41648b;

    /* renamed from: c */
    public final ConcurrentHashMap f41649c;

    /* renamed from: d */
    public final C6809sD f41650d = new C6809sD(2);

    /* renamed from: e */
    public final C8170Qm0 f41651e;

    /* renamed from: f */
    public final A20 f41652f;

    /* renamed from: g */
    public final RunnableC7089wf f41653g;

    /* renamed from: h */
    public final RunnableC1483XZ f41654h;

    /* renamed from: i */
    public final P51 f41655i;

    /* renamed from: j */
    public final ExecutorService f41656j;

    /* renamed from: k */
    public final boolean f41657k;

    /* renamed from: l */
    public final boolean f41658l;

    /* renamed from: m */
    public final boolean f41659m;

    /* renamed from: n */
    public final boolean f41660n;

    /* renamed from: o */
    public final boolean f41661o;

    /* renamed from: p */
    public final InterfaceC11329ul0 f41662p;

    static {
        C6884tP c6884tP = new C6884tP();
        c6884tP.f43050a = C6884tP.f43049b;
        f41645r = c6884tP;
        f41646s = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6741rP() {
        /*
            r5 = this;
            r5.<init>()
            sD r0 = new sD
            r1 = 2
            r0.<init>(r1)
            r5.f41650d = r0
            tP r0 = p000.C6741rP.f41645r
            r0.getClass()
            boolean r1 = p000.C11073sl0.f42584a
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
            r5.f41662p = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.f41647a = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.f41648b = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r5.f41649c = r3
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
            r5.f41651e = r3
            if (r3 == 0) goto L62
            A20 r2 = new A20
            java.lang.Object r1 = r3.f9780b
            android.os.Looper r1 = (android.os.Looper) r1
            r2.<init>(r5, r1)
        L62:
            r5.f41652f = r2
            wf r1 = new wf
            r1.<init>(r5)
            r5.f41653g = r1
            XZ r1 = new XZ
            r1.<init>(r5)
            r5.f41654h = r1
            P51 r1 = new P51
            r1.<init>()
            r5.f41655i = r1
            r1 = 1
            r5.f41657k = r1
            r5.f41658l = r1
            r5.f41659m = r1
            r5.f41660n = r1
            r5.f41661o = r1
            java.util.concurrent.ExecutorService r0 = r0.f43050a
            r5.f41656j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6741rP.<init>():void");
    }

    /* renamed from: a */
    public static void m24326a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                m24326a(arrayList, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    public static C6741rP m24327b() {
        if (f41644q == null) {
            synchronized (C6741rP.class) {
                try {
                    if (f41644q == null) {
                        f41644q = new C6741rP();
                    }
                } finally {
                }
            }
        }
        return f41644q;
    }

    /* renamed from: c */
    public final void m24328c(CA0 ca0) {
        Object obj = ca0.f1233a;
        Q51 q51 = ca0.f1234b;
        ca0.f1233a = null;
        ca0.f1234b = null;
        ca0.f1235c = null;
        ArrayList arrayList = CA0.f1232d;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(ca0);
            }
        }
        if (q51.f9479c) {
            m24329d(q51, obj);
        }
    }

    /* renamed from: d */
    public final void m24329d(Q51 q51, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            q51.f9478b.f8222a.invoke(q51.f9477a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            boolean z = obj instanceof N51;
            boolean z2 = this.f41657k;
            InterfaceC11329ul0 interfaceC11329ul0 = this.f41662p;
            if (!z) {
                if (z2) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder("Could not dispatch event: ");
                    sb.append(obj.getClass());
                    sb.append(" to subscribing class ");
                    VH0 vh0 = q51.f9477a;
                    sb.append(VH0.class);
                    interfaceC11329ul0.mo7639A(level, sb.toString(), cause);
                }
                if (this.f41659m) {
                    m24331f(new N51(cause, obj, q51.f9477a));
                    return;
                }
                return;
            }
            if (z2) {
                Level level2 = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("SubscriberExceptionEvent subscriber ");
                VH0 vh02 = q51.f9477a;
                sb2.append(VH0.class);
                sb2.append(" threw an exception");
                interfaceC11329ul0.mo7639A(level2, sb2.toString(), cause);
                N51 n51 = (N51) obj;
                interfaceC11329ul0.mo7639A(level2, "Initial event " + n51.f7493b + " caused exception in " + n51.f7494c, n51.f7492a);
            }
        }
    }

    /* renamed from: e */
    public final synchronized boolean m24330e(VH0 vh0) {
        return this.f41648b.containsKey(vh0);
    }

    /* renamed from: f */
    public final void m24331f(Object obj) {
        C6678qP c6678qP = (C6678qP) this.f41650d.get();
        ArrayList arrayList = c6678qP.f40857a;
        arrayList.add(obj);
        if (c6678qP.f40858b) {
            return;
        }
        C8170Qm0 c8170Qm0 = this.f41651e;
        c6678qP.f40859c = c8170Qm0 == null || ((Looper) c8170Qm0.f9780b) == Looper.myLooper();
        c6678qP.f40858b = true;
        while (!arrayList.isEmpty()) {
            try {
                m24332g(arrayList.remove(0), c6678qP);
            } finally {
                c6678qP.f40858b = false;
                c6678qP.f40859c = false;
            }
        }
    }

    /* renamed from: g */
    public final void m24332g(Object obj, C6678qP c6678qP) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zM24333h;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f41661o) {
            HashMap map = f41646s;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            m24326a(arrayList, superclass.getInterfaces());
                        }
                        f41646s.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = list.size();
            zM24333h = false;
            for (int i = 0; i < size; i++) {
                zM24333h |= m24333h(obj, c6678qP, (Class) list.get(i));
            }
        } else {
            zM24333h = m24333h(obj, c6678qP, cls);
        }
        if (zM24333h) {
            return;
        }
        if (this.f41658l) {
            this.f41662p.mo7643a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f41660n || cls == C7668Gv0.class || cls == N51.class) {
            return;
        }
        m24331f(new C7668Gv0(obj));
    }

    /* renamed from: h */
    public final boolean m24333h(Object obj, C6678qP c6678qP, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f41647a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Q51 q51 = (Q51) it.next();
            c6678qP.f40860d = obj;
            m24334i(q51, obj, c6678qP.f40859c);
        }
        return true;
    }

    /* renamed from: i */
    public final void m24334i(Q51 q51, Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = AbstractC6615pP.f40050a[q51.f9478b.f8223b.ordinal()];
        if (i == 1) {
            m24329d(q51, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                m24329d(q51, obj);
                return;
            }
            A20 a20 = this.f41652f;
            a20.getClass();
            CA0 ca0M1000a = CA0.m1000a(q51, obj);
            synchronized (a20) {
                try {
                    a20.f22a.m17578v(ca0M1000a);
                    if (!a20.f25d) {
                        a20.f25d = true;
                        if (!a20.sendMessage(a20.obtainMessage())) {
                            throw new C6838sg("Could not send handler message");
                        }
                    }
                } finally {
                }
            }
            return;
        }
        if (i == 3) {
            if (z) {
                this.f41653g.m25669a(q51, obj);
                return;
            } else {
                m24329d(q51, obj);
                return;
            }
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown thread mode: " + q51.f9478b.f8223b);
        }
        RunnableC1483XZ runnableC1483XZ = this.f41654h;
        runnableC1483XZ.getClass();
        ((C9108dO1) runnableC1483XZ.f13850b).m17578v(CA0.m1000a(q51, obj));
        ((C6741rP) runnableC1483XZ.f13851c).f41656j.execute(runnableC1483XZ);
    }

    /* renamed from: j */
    public final void m24335j(VH0 vh0, O51 o51) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object value;
        Class cls = o51.f8224c;
        Q51 q51 = new Q51(vh0, o51);
        HashMap map = this.f41647a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(q51)) {
            throw new C6838sg("Subscriber " + VH0.class + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i != size) {
                if (o51.f8225d <= ((Q51) copyOnWriteArrayList.get(i)).f9478b.f8225d) {
                }
            }
            copyOnWriteArrayList.add(i, q51);
            break;
        }
        HashMap map2 = this.f41648b;
        List arrayList = (List) map2.get(vh0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(vh0, arrayList);
        }
        arrayList.add(cls);
        if (o51.f8226e) {
            ConcurrentHashMap concurrentHashMap = this.f41649c;
            C8170Qm0 c8170Qm0 = this.f41651e;
            if (this.f41661o) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                        m24334i(q51, value, c8170Qm0 == null || ((Looper) c8170Qm0.f9780b) == Looper.myLooper());
                    }
                }
                return;
            }
            Object obj = concurrentHashMap.get(cls);
            if (obj != null) {
                m24334i(q51, obj, c8170Qm0 != null ? ((Looper) c8170Qm0.f9780b) == Looper.myLooper() : true);
            }
        }
    }

    public final String toString() {
        return AbstractC7222ym.m26236m(new StringBuilder("EventBus[indexCount=0, eventInheritance="), this.f41661o, "]");
    }
}
