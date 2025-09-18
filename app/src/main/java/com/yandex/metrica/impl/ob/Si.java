package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C2881kh;
import com.yandex.metrica.impl.ob.Fi;
import com.yandex.metrica.impl.ob.Qi;
import com.yandex.metrica.impl.ob.Ri;
import defpackage.InterfaceC5908mZ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Si {
    private final C2669c4 a;
    private final Pi b;
    private final Qi.b c;
    private volatile K2 d;
    private Gi e;
    private final Om f;
    private final Q g;
    private final C3056ri h;
    private final F3 i;

    public class a implements InterfaceC5908mZ {
        public a() {
        }

        @Override // defpackage.InterfaceC5908mZ
        public Object invoke() {
            return Si.this.g;
        }
    }

    public Si(Context context, String str, C2881kh.b bVar, Pi pi) {
        this(context, new Y3(str), bVar, pi, new Qi.b(context), new C3135um(context), new Nm(), P0.i().e(), new C3056ri(), F3.a());
    }

    public synchronized K2 b() {
        try {
            if (!d()) {
                return null;
            }
            if (this.d == null) {
                this.d = new K2(this, this.e.b());
            }
            return this.d;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Qi c() {
        return this.e.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean d() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.Gi r0 = r5.e     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Qi r0 = r0.d()     // Catch: java.lang.Throwable -> L2d
            boolean r1 = com.yandex.metrica.impl.ob.Oi.b(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L30
            boolean r1 = com.yandex.metrica.impl.ob.Oi.a(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = r1 ^ 1
            if (r1 == 0) goto L2f
            com.yandex.metrica.impl.ob.ri r1 = r5.h     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Gi r3 = r5.e     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.dh r3 = r3.b()     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.kh r3 = (com.yandex.metrica.impl.ob.C2881kh) r3     // Catch: java.lang.Throwable -> L2d
            java.util.Map r3 = r3.D()     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Q r4 = r5.g     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r1.a(r3, r0, r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2f
            r1 = 1
            goto L30
        L2d:
            r0 = move-exception
            goto L32
        L2f:
            r1 = r2
        L30:
            monitor-exit(r5)
            return r1
        L32:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Si.d():boolean");
    }

    private void a(C3135um c3135um, Ej ej, Qi qi) {
        Qi.a aVarA = qi.a();
        if (!Oi.a(qi.V())) {
            aVarA = aVarA.l(ej.a().a);
        }
        String strA = c3135um.a();
        if (!Oi.a(qi.i())) {
            aVarA = aVarA.c(strA).e("");
        }
        if (!Oi.a(qi.j())) {
            aVarA = aVarA.d(strA);
        }
        Qi qiA = aVarA.a();
        b(qiA);
        a(qiA);
    }

    private Si(Context context, C2669c4 c2669c4, C2881kh.b bVar, Pi pi, Qi.b bVar2, C3135um c3135um, Om om, Q q, C3056ri c3056ri, F3 f3) {
        this(context, c2669c4, bVar, pi, bVar2, bVar2.a(), c3135um, om, q, c3056ri, f3);
    }

    private Si(Context context, C2669c4 c2669c4, C2881kh.b bVar, Pi pi, Qi.b bVar2, Qi qi, C3135um c3135um, Om om, Q q, C3056ri c3056ri, F3 f3) {
        this(context, c2669c4, pi, bVar2, qi, c3135um, new Gi(new C2881kh.c(context, c2669c4.b()), qi, bVar), om, q, c3056ri, Fj.a(context).a(context, new Jj(bVar2)), f3);
    }

    private synchronized void b(Qi qi) {
        this.e.a(qi);
        this.c.a(qi);
        P0.i().a(qi);
        this.i.a((H3) new K3(this.a.b(), qi));
    }

    public Si(Context context, C2669c4 c2669c4, Pi pi, Qi.b bVar, Qi qi, C3135um c3135um, Gi gi, Om om, Q q, C3056ri c3056ri, Ej ej, F3 f3) {
        this.a = c2669c4;
        this.b = pi;
        this.c = bVar;
        this.e = gi;
        this.f = om;
        this.g = q;
        this.h = c3056ri;
        this.i = f3;
        a(c3135um, ej, qi);
    }

    public C2669c4 a() {
        return this.a;
    }

    public void a(Hi hi) {
        ArrayList arrayList;
        synchronized (this) {
            this.d = null;
        }
        Pi pi = this.b;
        String strB = this.a.b();
        Qi qiD = this.e.d();
        Fi.a aVar = (Fi.a) pi;
        synchronized (Fi.this.b) {
            try {
                Collection collectionA = Fi.this.a.a(strB);
                if (collectionA == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collectionA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Li) it.next()).a(hi, qiD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.yandex.metrica.impl.ob.C3162vj r6, com.yandex.metrica.impl.ob.C2881kh r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.ob.U2.b(r8)     // Catch: java.lang.Throwable -> L33
            r1 = 0
            if (r0 != 0) goto L35
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L33
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L33
            boolean r0 = com.yandex.metrica.impl.ob.U2.b(r8)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L35
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L35
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            java.util.Date r8 = r0.parse(r8)     // Catch: java.lang.Throwable -> L35
            long r2 = r8.getTime()     // Catch: java.lang.Throwable -> L35
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L35
            goto L36
        L33:
            r6 = move-exception
            goto L61
        L35:
            r8 = r1
        L36:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            if (r8 != 0) goto L3f
            r8 = r0
        L3f:
            java.lang.Long r0 = r6.M()     // Catch: java.lang.Throwable -> L33
            com.yandex.metrica.impl.ob.Lm r2 = com.yandex.metrica.impl.ob.Lm.c()     // Catch: java.lang.Throwable -> L33
            long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L33
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.metrica.impl.ob.Qi r6 = r5.a(r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L33
            r5.d = r1     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            r5.b(r6)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            r5.a(r6)
            return
        L5e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L61:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Si.a(com.yandex.metrica.impl.ob.vj, com.yandex.metrica.impl.ob.kh, java.util.Map):void");
    }

    public Qi a(C3162vj c3162vj, C2881kh c2881kh, Long l) {
        boolean zEquals;
        String strC = C3240ym.c(c2881kh.D());
        Map<String, String> mapB = c2881kh.C().b();
        String strN = c3162vj.n();
        String strO = this.e.d().o();
        if (!C3240ym.d(C3240ym.a(strN))) {
            strN = C3240ym.d(C3240ym.a(strO)) ? strO : null;
        }
        String strI = this.e.d().i();
        if (TextUtils.isEmpty(strI)) {
            strI = c3162vj.i();
        }
        Qi qiD = this.e.d();
        Qi.a aVarI = new Qi.a(new Ri.b(c3162vj.e())).c(strI).e(c3162vj.h()).c(this.f.b()).d(qiD.j()).l(qiD.V()).g(c3162vj.o()).c(c3162vj.F()).b(c2881kh.K()).i(c3162vj.x()).e(c3162vj.r()).j(c3162vj.w()).k(c3162vj.C()).a(c3162vj.d()).a(c3162vj.j()).g(c3162vj.t()).a(c3162vj.g()).f(strN).i(strC);
        this.h.getClass();
        Map<String, String> mapA = C3240ym.a(strN);
        if (U2.b(mapB)) {
            zEquals = U2.b(mapA);
        } else {
            zEquals = mapA.equals(mapB);
        }
        Qi.a aVarA = aVarI.c(zEquals).h(C3240ym.c(mapB)).a(c3162vj.D()).d(c3162vj.q()).a(c3162vj.N()).j(c3162vj.y()).b(c3162vj.f()).a(c3162vj.v()).h(c3162vj.u()).a(c3162vj.B()).a(c3162vj.G()).a(true);
        Long lValueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l != null) {
            lValueOf = l;
        }
        return aVarA.b(lValueOf.longValue()).a(this.e.b().a(l.longValue())).b(false).a(c3162vj.p()).a(c3162vj.A()).a(c3162vj.K()).b(c3162vj.J()).c(c3162vj.L()).a(c3162vj.I()).a(c3162vj.H()).a(c3162vj.c()).a(c3162vj.k()).f(c3162vj.s()).a(c3162vj.b()).a(c3162vj.a()).a(c3162vj.l()).a(c3162vj.m()).a(c3162vj.E()).a();
    }

    private void a(Qi qi) {
        ArrayList arrayList;
        Pi pi = this.b;
        String strB = this.a.b();
        Fi.a aVar = (Fi.a) pi;
        synchronized (Fi.this.b) {
            try {
                Fi.this.c = qi;
                Collection collectionA = Fi.this.a.a(strB);
                if (collectionA == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collectionA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Li) it.next()).a(qi);
        }
    }

    public synchronized boolean a(List<String> list, Map<String, String> map) {
        return !Oi.a(this.e.d(), list, map, new a());
    }

    public synchronized void a(C2881kh.b bVar) {
        boolean z;
        try {
            this.e.a(bVar);
            C2881kh c2881khB = this.e.b();
            if (c2881khB.L()) {
                List<String> listH = c2881khB.H();
                boolean z2 = true;
                Qi.a aVarB = null;
                if (!U2.b(listH) || U2.b(c2881khB.K())) {
                    z = false;
                } else {
                    aVarB = this.e.d().a().b((List<String>) null);
                    z = true;
                }
                if (U2.b(listH) || U2.a(listH, c2881khB.K())) {
                    z2 = z;
                } else {
                    aVarB = this.e.d().a().b(listH);
                }
                if (z2) {
                    Qi qiA = aVarB.a();
                    b(qiA);
                    a(qiA);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
