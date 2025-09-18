package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: wK */
/* loaded from: classes.dex */
public final class C7771wK implements InterfaceC5890mT {
    public static final long n = TimeUnit.HOURS.toMillis(2);
    public static final long o = TimeUnit.MINUTES.toMillis(30);
    public final long a;
    public final long b;
    public long c;
    public final C0162Bv0 d;
    public final HashSet e;
    public long f;
    public final C7915x41 g;
    public final BM h;
    public final C3759fN i;
    public final C0084Av0 j;
    public final C7390uK k;
    public final OL0 l;
    public final Object m = new Object();

    public C7771wK(BM bm, C3759fN c3759fN, C7581vK c7581vK, C0162Bv0 c0162Bv0, C0084Av0 c0084Av0, ExecutorService executorService) {
        C7915x41 c7915x41;
        this.a = c7581vK.b;
        long j = c7581vK.c;
        this.b = j;
        this.c = j;
        C7915x41 c7915x412 = C7915x41.h;
        synchronized (C7915x41.class) {
            try {
                if (C7915x41.h == null) {
                    C7915x41.h = new C7915x41();
                }
                c7915x41 = C7915x41.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = c7915x41;
        this.h = bm;
        this.i = c3759fN;
        this.f = -1L;
        this.d = c0162Bv0;
        this.j = c0084Av0;
        C7390uK c7390uK = new C7390uK();
        c7390uK.a = false;
        c7390uK.b = -1L;
        c7390uK.c = -1L;
        this.k = c7390uK;
        this.l = OL0.f;
        this.e = new HashSet();
        new CountDownLatch(0);
    }

    public final C5699lT a(C1857Xo1 c1857Xo1, String str) {
        C5699lT c5699lTQ;
        synchronized (this.m) {
            c5699lTQ = c1857Xo1.q();
            this.e.add(str);
            this.k.b(c5699lTQ.a.length(), 1L);
        }
        return c5699lTQ;
    }

    public final void b(long j) throws IOException {
        long length;
        BM bm = this.h;
        try {
            ArrayList arrayListD = d(bm.d());
            C7390uK c7390uK = this.k;
            long jA = c7390uK.a() - j;
            Iterator it = arrayListD.iterator();
            int i = 0;
            long j2 = 0;
            while (it.hasNext()) {
                C3926gF c3926gF = (C3926gF) it.next();
                if (j2 > jA) {
                    break;
                }
                ((C4117hF) bm.c()).getClass();
                File file = c3926gF.b.a;
                if (file.exists()) {
                    length = file.delete() ? file.length() : -1L;
                } else {
                    length = 0;
                }
                this.e.remove(c3926gF.a);
                if (length > 0) {
                    i++;
                    j2 += length;
                    C3513e41 c3513e41O0 = C3513e41.O0();
                    this.d.getClass();
                    c3513e41O0.Q0();
                }
            }
            c7390uK.b(-j2, -i);
            bm.getClass();
            try {
                C4117hF c4117hF = (C4117hF) bm.c();
                c4117hF.getClass();
                W02.b(c4117hF.a, new C1135Oi(2, c4117hF));
            } catch (IOException unused) {
                AbstractC3393dS.g(BM.class);
            }
        } catch (IOException e) {
            e.getMessage();
            this.j.getClass();
            throw e;
        }
    }

    public final C5699lT c(O01 o01) {
        C5699lT c5699lT;
        C3513e41 c3513e41O0 = C3513e41.O0();
        try {
            synchronized (this.m) {
                try {
                    ArrayList arrayListA = AbstractC4343iQ1.a(o01);
                    String str = null;
                    c5699lT = null;
                    for (int i = 0; i < arrayListA.size(); i++) {
                        str = (String) arrayListA.get(i);
                        C4117hF c4117hF = (C4117hF) this.h.c();
                        File fileB = c4117hF.b(str);
                        if (fileB.exists()) {
                            c4117hF.e.getClass();
                            fileB.setLastModified(System.currentTimeMillis());
                            c5699lT = new C5699lT(fileB);
                        } else {
                            c5699lT = null;
                        }
                        if (c5699lT != null) {
                            break;
                        }
                    }
                    if (c5699lT == null) {
                        this.d.getClass();
                        this.e.remove(str);
                    } else {
                        str.getClass();
                        this.d.getClass();
                        this.e.add(str);
                    }
                } finally {
                }
            }
            return c5699lT;
        } catch (IOException unused) {
            this.j.getClass();
            this.d.getClass();
            return null;
        } finally {
            c3513e41O0.Q0();
        }
    }

    public final ArrayList d(Collection collection) {
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3926gF c3926gF = (C3926gF) it.next();
            if (c3926gF.a() > jCurrentTimeMillis) {
                arrayList.add(c3926gF);
            } else {
                arrayList2.add(c3926gF);
            }
        }
        this.i.getClass();
        Collections.sort(arrayList2, new C2209aq0(8));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean e(O01 o01) {
        synchronized (this.m) {
            if (f(o01)) {
                return true;
            }
            try {
                ArrayList arrayListA = AbstractC4343iQ1.a(o01);
                for (int i = 0; i < arrayListA.size(); i++) {
                    String str = (String) arrayListA.get(i);
                    if (((C4117hF) this.h.c()).b(str).exists()) {
                        this.e.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public final boolean f(O01 o01) {
        synchronized (this.m) {
            try {
                ArrayList arrayListA = AbstractC4343iQ1.a(o01);
                for (int i = 0; i < arrayListA.size(); i++) {
                    if (this.e.contains((String) arrayListA.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x003d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C5699lT g(defpackage.O01 r5, defpackage.C0515Gj r6) {
        /*
            r4 = this;
            e41 r0 = defpackage.C3513e41.O0()
            Bv0 r1 = r4.d
            r1.getClass()
            java.lang.Object r1 = r4.m
            monitor-enter(r1)
            r2 = 0
            java.lang.String r3 = defpackage.AbstractC4343iQ1.e(r5)     // Catch: java.lang.Throwable -> L77 java.io.UnsupportedEncodingException -> L79
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            Xo1 r5 = r4.j(r3, r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r1 = 1
            r5.W(r6)     // Catch: java.lang.Throwable -> L4e
            lT r6 = r4.a(r5, r3)     // Catch: java.lang.Throwable -> L4e
            java.io.File r3 = r6.a     // Catch: java.lang.Throwable -> L4e
            r3.length()     // Catch: java.lang.Throwable -> L4e
            uK r3 = r4.k     // Catch: java.lang.Throwable -> L4e
            r3.a()     // Catch: java.lang.Throwable -> L4e
            Bv0 r3 = r4.d     // Catch: java.lang.Throwable -> L4e
            r3.getClass()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r3 == 0) goto L3d
            boolean r5 = r5.delete()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r5 == 0) goto L3e
        L3d:
            r2 = r1
        L3e:
            if (r2 != 0) goto L4a
            java.lang.Class<wK> r5 = defpackage.C7771wK.class
            defpackage.AbstractC3393dS.d(r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            goto L4a
        L46:
            r5 = move-exception
            goto L73
        L48:
            r5 = move-exception
            goto L68
        L4a:
            r0.Q0()
            return r6
        L4e:
            r6 = move-exception
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r3 == 0) goto L5f
            boolean r5 = r5.delete()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r5 == 0) goto L60
        L5f:
            r2 = r1
        L60:
            if (r2 != 0) goto L67
            java.lang.Class<wK> r5 = defpackage.C7771wK.class
            defpackage.AbstractC3393dS.d(r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L67:
            throw r6     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L68:
            Bv0 r6 = r4.d     // Catch: java.lang.Throwable -> L46
            r6.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.Class<wK> r6 = defpackage.C7771wK.class
            defpackage.AbstractC3393dS.g(r6)     // Catch: java.lang.Throwable -> L46
            throw r5     // Catch: java.lang.Throwable -> L46
        L73:
            r0.Q0()
            throw r5
        L77:
            r5 = move-exception
            goto L80
        L79:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L77
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L77
            throw r6     // Catch: java.lang.Throwable -> L77
        L80:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7771wK.g(O01, Gj):lT");
    }

    public final boolean h() {
        boolean z;
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C7390uK c7390uK = this.k;
        synchronized (c7390uK) {
            z = c7390uK.a;
        }
        if (z) {
            long j = this.f;
            if (j != -1 && jCurrentTimeMillis - j <= o) {
                return false;
            }
        }
        return i();
    }

    public final boolean i() {
        long j;
        C7771wK c7771wK = this;
        c7771wK.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = n + jCurrentTimeMillis;
        try {
            Iterator it = c7771wK.h.d().iterator();
            long jMax = -1;
            boolean z = false;
            int i = 0;
            long j3 = 0;
            while (it.hasNext()) {
                try {
                    C3926gF c3926gF = (C3926gF) it.next();
                    i++;
                    Iterator it2 = it;
                    if (c3926gF.c < 0) {
                        c3926gF.c = c3926gF.b.a.length();
                    }
                    j3 += c3926gF.c;
                    if (c3926gF.a() > j2) {
                        if (c3926gF.c < 0) {
                            c3926gF.c = c3926gF.b.a.length();
                        }
                        jMax = Math.max(c3926gF.a() - jCurrentTimeMillis, jMax);
                        z = true;
                    }
                    it = it2;
                } catch (IOException e) {
                    e = e;
                    c7771wK = this;
                    C0084Av0 c0084Av0 = c7771wK.j;
                    e.getMessage();
                    c0084Av0.getClass();
                    return false;
                }
            }
            if (z) {
                c7771wK = this;
                c7771wK.j.getClass();
            } else {
                c7771wK = this;
            }
            C7390uK c7390uK = c7771wK.k;
            synchronized (c7390uK) {
                j = c7390uK.c;
            }
            long j4 = i;
            if (j != j4 || c7771wK.k.a() != j3) {
                c7771wK.k.d(j3, j4);
            }
            c7771wK.f = jCurrentTimeMillis;
            return true;
        } catch (IOException e2) {
            e = e2;
        }
    }

    public final C1857Xo1 j(String str, O01 o01) throws IOException {
        synchronized (this.m) {
            try {
                boolean zH = h();
                k();
                long jA = this.k.a();
                if (jA > this.c && !zH) {
                    this.k.c();
                    h();
                }
                long j = this.c;
                if (jA > j) {
                    b((j * 9) / 10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4117hF c4117hF = (C4117hF) this.h.c();
        c4117hF.getClass();
        File file = new File(c4117hF.c(str));
        boolean zExists = file.exists();
        C0084Av0 c0084Av0 = c4117hF.d;
        if (!zExists) {
            try {
                AbstractC2055a12.b(file);
            } catch (C3971gU e) {
                c0084Av0.getClass();
                throw e;
            }
        }
        try {
            return new C1857Xo1(c4117hF, str, File.createTempFile(str.concat("."), ".tmp", file), 10);
        } catch (IOException e2) {
            c0084Av0.getClass();
            throw e2;
        }
    }

    public final void k() {
        boolean z;
        BM bm = this.h;
        bm.getClass();
        try {
            z = ((C4117hF) bm.c()).b;
        } catch (IOException unused) {
            z = false;
        }
        char c = z ? (char) 2 : (char) 1;
        C7915x41 c7915x41 = this.g;
        long jA = this.b - this.k.a();
        c7915x41.a();
        c7915x41.a();
        ReentrantLock reentrantLock = c7915x41.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - c7915x41.e > C7915x41.i) {
                    c7915x41.a = C7915x41.b(c7915x41.a, c7915x41.b);
                    c7915x41.c = C7915x41.b(c7915x41.c, c7915x41.d);
                    c7915x41.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c == 1 ? c7915x41.a : c7915x41.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
