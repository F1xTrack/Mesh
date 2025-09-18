package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ND {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public C7903x10 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public DO h;
    public C0795Jy0 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public InterfaceC0660If0 n;
    public EnumC7561vD0 o;
    public AbstractC3750fK p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                C7111ss0 c7111ss0 = (C7111ss0) arrayListB.get(i);
                if (!arrayList.contains(c7111ss0.a)) {
                    arrayList.add(c7111ss0.a);
                }
                int i2 = 0;
                while (true) {
                    List list = c7111ss0.b;
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

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listG = this.c.a().g(this.d);
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                C7111ss0 c7111ss0B = ((InterfaceC7302ts0) listG.get(i)).b(this.d, this.e, this.f, this.i);
                if (c7111ss0B != null) {
                    arrayList.add(c7111ss0B);
                }
            }
        }
        return arrayList;
    }

    public final C4211hk0 c(Class cls) {
        C4211hk0 c4211hk0;
        C3578eQ0 c3578eQ0A = this.c.a();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C4401ik0 c4401ik0 = c3578eQ0A.i;
        C4047gt0 c4047gt0 = (C4047gt0) c4401ik0.b.getAndSet(null);
        if (c4047gt0 == null) {
            c4047gt0 = new C4047gt0();
        }
        c4047gt0.a = cls;
        c4047gt0.b = cls2;
        c4047gt0.c = cls3;
        synchronized (c4401ik0.a) {
            c4211hk0 = (C4211hk0) c4401ik0.a.getOrDefault(c4047gt0, null);
        }
        c4401ik0.b.set(c4047gt0);
        c3578eQ0A.i.getClass();
        if (C4401ik0.c.equals(c4211hk0)) {
            return null;
        }
        if (c4211hk0 != null) {
            return c4211hk0;
        }
        ArrayList arrayListE = c3578eQ0A.e(cls, cls2, cls3);
        C4211hk0 c4211hk02 = arrayListE.isEmpty() ? null : new C4211hk0(cls, cls2, cls3, arrayListE, c3578eQ0A.j);
        c3578eQ0A.i.a(cls, cls2, cls3, c4211hk02);
        return c4211hk02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC2315bO d(java.lang.Object r6) {
        /*
            r5 = this;
            x10 r0 = r5.c
            eQ0 r0 = r0.a()
            wO r0 = r0.b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            vO r3 = (defpackage.C7593vO) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            bO r1 = r3.b     // Catch: java.lang.Throwable -> L2b
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
            java.lang.String r6 = defpackage.AbstractC7209tN0.v(r6, r1)
            r0.<init>(r6)
            throw r0
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ND.d(java.lang.Object):bO");
    }

    public final InterfaceC7446uc1 e(Class cls) {
        InterfaceC7446uc1 interfaceC7446uc1 = (InterfaceC7446uc1) this.j.get(cls);
        if (interfaceC7446uc1 == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC7446uc1 = (InterfaceC7446uc1) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC7446uc1 != null) {
            return interfaceC7446uc1;
        }
        if (!this.j.isEmpty() || !this.q) {
            return C1752Wf1.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
