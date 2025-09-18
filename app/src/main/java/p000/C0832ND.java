package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ND */
/* loaded from: classes.dex */
public final class C0832ND {

    /* renamed from: a */
    public final ArrayList f7551a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f7552b = new ArrayList();

    /* renamed from: c */
    public C11617x10 f7553c;

    /* renamed from: d */
    public Object f7554d;

    /* renamed from: e */
    public int f7555e;

    /* renamed from: f */
    public int f7556f;

    /* renamed from: g */
    public Class f7557g;

    /* renamed from: h */
    public C0214DO f7558h;

    /* renamed from: i */
    public C7830Jy0 f7559i;

    /* renamed from: j */
    public Map f7560j;

    /* renamed from: k */
    public Class f7561k;

    /* renamed from: l */
    public boolean f7562l;

    /* renamed from: m */
    public boolean f7563m;

    /* renamed from: n */
    public InterfaceC7740If0 f7564n;

    /* renamed from: o */
    public EnumC11389vD0 f7565o;

    /* renamed from: p */
    public AbstractC4046fK f7566p;

    /* renamed from: q */
    public boolean f7567q;

    /* renamed from: r */
    public boolean f7568r;

    /* renamed from: a */
    public final ArrayList m5583a() {
        boolean z = this.f7563m;
        ArrayList arrayList = this.f7552b;
        if (!z) {
            this.f7563m = true;
            arrayList.clear();
            ArrayList arrayListM5584b = m5584b();
            int size = arrayListM5584b.size();
            for (int i = 0; i < size; i++) {
                C11087ss0 c11087ss0 = (C11087ss0) arrayListM5584b.get(i);
                if (!arrayList.contains(c11087ss0.f42647a)) {
                    arrayList.add(c11087ss0.f42647a);
                }
                int i2 = 0;
                while (true) {
                    List list = c11087ss0.f42648b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final ArrayList m5584b() {
        boolean z = this.f7562l;
        ArrayList arrayList = this.f7551a;
        if (!z) {
            this.f7562l = true;
            arrayList.clear();
            List listM17933g = this.f7553c.m25734a().m17933g(this.f7554d);
            int size = listM17933g.size();
            for (int i = 0; i < size; i++) {
                C11087ss0 c11087ss0Mo8530b = ((InterfaceC11215ts0) listM17933g.get(i)).mo8530b(this.f7554d, this.f7555e, this.f7556f, this.f7559i);
                if (c11087ss0Mo8530b != null) {
                    arrayList.add(c11087ss0Mo8530b);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C9663hk0 m5585c(Class cls) {
        C9663hk0 c9663hk0;
        C9239eQ0 c9239eQ0M25734a = this.f7553c.m25734a();
        Class cls2 = this.f7557g;
        Class cls3 = this.f7561k;
        C9791ik0 c9791ik0 = c9239eQ0M25734a.f26705i;
        C9553gt0 c9553gt0 = (C9553gt0) c9791ik0.f29437b.getAndSet(null);
        if (c9553gt0 == null) {
            c9553gt0 = new C9553gt0();
        }
        c9553gt0.f28073a = cls;
        c9553gt0.f28074b = cls2;
        c9553gt0.f28075c = cls3;
        synchronized (c9791ik0.f29436a) {
            c9663hk0 = (C9663hk0) c9791ik0.f29436a.getOrDefault(c9553gt0, null);
        }
        c9791ik0.f29437b.set(c9553gt0);
        c9239eQ0M25734a.f26705i.getClass();
        if (C9791ik0.f29435c.equals(c9663hk0)) {
            return null;
        }
        if (c9663hk0 != null) {
            return c9663hk0;
        }
        ArrayList arrayListM17931e = c9239eQ0M25734a.m17931e(cls, cls2, cls3);
        C9663hk0 c9663hk02 = arrayListM17931e.isEmpty() ? null : new C9663hk0(cls, cls2, cls3, arrayListM17931e, c9239eQ0M25734a.f26706j);
        c9239eQ0M25734a.f26705i.m19073a(cls, cls2, cls3, c9663hk02);
        return c9663hk02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.f44352b;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceC1782bO m5586d(java.lang.Object r6) {
        /*
            r5 = this;
            x10 r0 = r5.f7553c
            eQ0 r0 = r0.m25734a()
            wO r0 = r0.f26698b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f44846a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            vO r3 = (p000.C7009vO) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.f44351a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            bO r1 = r3.f44352b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L42
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            dQ0 r0 = new dQ0
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = "Failed to find source encoder for data class: "
            java.lang.String r6 = p000.AbstractC11153tN0.m24910v(r6, r1)
            r0.<init>(r6)
            throw r0
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0832ND.m5586d(java.lang.Object):bO");
    }

    /* renamed from: e */
    public final InterfaceC11312uc1 m5587e(Class cls) {
        InterfaceC11312uc1 interfaceC11312uc1 = (InterfaceC11312uc1) this.f7560j.get(cls);
        if (interfaceC11312uc1 == null) {
            Iterator it = this.f7560j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC11312uc1 = (InterfaceC11312uc1) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC11312uc1 != null) {
            return interfaceC11312uc1;
        }
        if (!this.f7560j.isEmpty() || !this.f7567q) {
            return C8469Wf1.f13315b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
