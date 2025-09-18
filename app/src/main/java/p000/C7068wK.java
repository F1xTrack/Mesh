package p000;

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
public final class C7068wK implements InterfaceC6428mT {

    /* renamed from: n */
    public static final long f44806n = TimeUnit.HOURS.toMillis(2);

    /* renamed from: o */
    public static final long f44807o = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final long f44808a;

    /* renamed from: b */
    public final long f44809b;

    /* renamed from: c */
    public long f44810c;

    /* renamed from: d */
    public final C7408Bv0 f44811d;

    /* renamed from: e */
    public final HashSet f44812e;

    /* renamed from: f */
    public long f44813f;

    /* renamed from: g */
    public final C11626x41 f44814g;

    /* renamed from: h */
    public final C0086BM f44815h;

    /* renamed from: i */
    public final C4049fN f44816i;

    /* renamed from: j */
    public final C7356Av0 f44817j;

    /* renamed from: k */
    public final C6942uK f44818k;

    /* renamed from: l */
    public final OL0 f44819l;

    /* renamed from: m */
    public final Object f44820m = new Object();

    public C7068wK(C0086BM c0086bm, C4049fN c4049fN, C7005vK c7005vK, C7408Bv0 c7408Bv0, C7356Av0 c7356Av0, ExecutorService executorService) {
        C11626x41 c11626x41;
        this.f44808a = c7005vK.f44329b;
        long j = c7005vK.f44330c;
        this.f44809b = j;
        this.f44810c = j;
        C11626x41 c11626x412 = C11626x41.f45355h;
        synchronized (C11626x41.class) {
            try {
                if (C11626x41.f45355h == null) {
                    C11626x41.f45355h = new C11626x41();
                }
                c11626x41 = C11626x41.f45355h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f44814g = c11626x41;
        this.f44815h = c0086bm;
        this.f44816i = c4049fN;
        this.f44813f = -1L;
        this.f44811d = c7408Bv0;
        this.f44817j = c7356Av0;
        C6942uK c6942uK = new C6942uK();
        c6942uK.f43649a = false;
        c6942uK.f43650b = -1L;
        c6942uK.f43651c = -1L;
        this.f44818k = c6942uK;
        this.f44819l = OL0.f8371f;
        this.f44812e = new HashSet();
        new CountDownLatch(0);
    }

    /* renamed from: a */
    public final C6365lT m25596a(C8539Xo1 c8539Xo1, String str) {
        C6365lT c6365lTM9148q;
        synchronized (this.f44820m) {
            c6365lTM9148q = c8539Xo1.m9148q();
            this.f44812e.add(str);
            this.f44818k.m25167b(c6365lTM9148q.f37075a.length(), 1L);
        }
        return c6365lTM9148q;
    }

    /* renamed from: b */
    public final void m25597b(long j) throws IOException {
        long length;
        C0086BM c0086bm = this.f44815h;
        try {
            ArrayList arrayListM25599d = m25599d(c0086bm.m697d());
            C6942uK c6942uK = this.f44818k;
            long jM25166a = c6942uK.m25166a() - j;
            Iterator it = arrayListM25599d.iterator();
            int i = 0;
            long j2 = 0;
            while (it.hasNext()) {
                C4104gF c4104gF = (C4104gF) it.next();
                if (j2 > jM25166a) {
                    break;
                }
                ((C4167hF) c0086bm.m696c()).getClass();
                File file = c4104gF.f27631b.f37075a;
                if (file.exists()) {
                    length = file.delete() ? file.length() : -1L;
                } else {
                    length = 0;
                }
                this.f44812e.remove(c4104gF.f27630a);
                if (length > 0) {
                    i++;
                    j2 += length;
                    C9196e41 c9196e41M17830O0 = C9196e41.m17830O0();
                    this.f44811d.getClass();
                    c9196e41M17830O0.m17854Q0();
                }
            }
            c6942uK.m25167b(-j2, -i);
            c0086bm.getClass();
            try {
                C4167hF c4167hF = (C4167hF) c0086bm.m696c();
                c4167hF.getClass();
                W02.m8648b(c4167hF.f28332a, new C0926Oi(2, c4167hF));
            } catch (IOException unused) {
                AbstractC3929dS.m17674g(C0086BM.class);
            }
        } catch (IOException e) {
            e.getMessage();
            this.f44817j.getClass();
            throw e;
        }
    }

    /* renamed from: c */
    public final C6365lT m25598c(O01 o01) {
        C6365lT c6365lT;
        C9196e41 c9196e41M17830O0 = C9196e41.m17830O0();
        try {
            synchronized (this.f44820m) {
                try {
                    ArrayList arrayListM19031a = AbstractC9752iQ1.m19031a(o01);
                    String str = null;
                    c6365lT = null;
                    for (int i = 0; i < arrayListM19031a.size(); i++) {
                        str = (String) arrayListM19031a.get(i);
                        C4167hF c4167hF = (C4167hF) this.f44815h.m696c();
                        File fileM18787b = c4167hF.m18787b(str);
                        if (fileM18787b.exists()) {
                            c4167hF.f28336e.getClass();
                            fileM18787b.setLastModified(System.currentTimeMillis());
                            c6365lT = new C6365lT(fileM18787b);
                        } else {
                            c6365lT = null;
                        }
                        if (c6365lT != null) {
                            break;
                        }
                    }
                    if (c6365lT == null) {
                        this.f44811d.getClass();
                        this.f44812e.remove(str);
                    } else {
                        str.getClass();
                        this.f44811d.getClass();
                        this.f44812e.add(str);
                    }
                } finally {
                }
            }
            return c6365lT;
        } catch (IOException unused) {
            this.f44817j.getClass();
            this.f44811d.getClass();
            return null;
        } finally {
            c9196e41M17830O0.m17854Q0();
        }
    }

    /* renamed from: d */
    public final ArrayList m25599d(Collection collection) {
        this.f44819l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + f44806n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C4104gF c4104gF = (C4104gF) it.next();
            if (c4104gF.m18413a() > jCurrentTimeMillis) {
                arrayList.add(c4104gF);
            } else {
                arrayList2.add(c4104gF);
            }
        }
        this.f44816i.getClass();
        Collections.sort(arrayList2, new C8774aq0(8));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m25600e(O01 o01) {
        synchronized (this.f44820m) {
            if (m25601f(o01)) {
                return true;
            }
            try {
                ArrayList arrayListM19031a = AbstractC9752iQ1.m19031a(o01);
                for (int i = 0; i < arrayListM19031a.size(); i++) {
                    String str = (String) arrayListM19031a.get(i);
                    if (((C4167hF) this.f44815h.m696c()).m18787b(str).exists()) {
                        this.f44812e.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: f */
    public final boolean m25601f(O01 o01) {
        synchronized (this.f44820m) {
            try {
                ArrayList arrayListM19031a = AbstractC9752iQ1.m19031a(o01);
                for (int i = 0; i < arrayListM19031a.size(); i++) {
                    if (this.f44812e.contains((String) arrayListM19031a.get(i))) {
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
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C6365lT m25602g(p000.O01 r5, p000.C0424Gj r6) {
        /*
            r4 = this;
            e41 r0 = p000.C9196e41.m17830O0()
            Bv0 r1 = r4.f44811d
            r1.getClass()
            java.lang.Object r1 = r4.f44820m
            monitor-enter(r1)
            r2 = 0
            java.lang.String r3 = p000.AbstractC9752iQ1.m19035e(r5)     // Catch: java.lang.Throwable -> L77 java.io.UnsupportedEncodingException -> L79
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L77
            Xo1 r5 = r4.m25605j(r3, r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r1 = 1
            r5.m9140W(r6)     // Catch: java.lang.Throwable -> L4e
            lT r6 = r4.m25596a(r5, r3)     // Catch: java.lang.Throwable -> L4e
            java.io.File r3 = r6.f37075a     // Catch: java.lang.Throwable -> L4e
            r3.length()     // Catch: java.lang.Throwable -> L4e
            uK r3 = r4.f44818k     // Catch: java.lang.Throwable -> L4e
            r3.m25166a()     // Catch: java.lang.Throwable -> L4e
            Bv0 r3 = r4.f44811d     // Catch: java.lang.Throwable -> L4e
            r3.getClass()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.f13982c     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r3 == 0) goto L3d
            boolean r5 = r5.delete()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r5 == 0) goto L3e
        L3d:
            r2 = r1
        L3e:
            if (r2 != 0) goto L4a
            java.lang.Class<wK> r5 = p000.C7068wK.class
            p000.AbstractC3929dS.m17671d(r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            goto L4a
        L46:
            r5 = move-exception
            goto L73
        L48:
            r5 = move-exception
            goto L68
        L4a:
            r0.m17854Q0()
            return r6
        L4e:
            r6 = move-exception
            java.lang.Object r5 = r5.f13982c     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r3 == 0) goto L5f
            boolean r5 = r5.delete()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            if (r5 == 0) goto L60
        L5f:
            r2 = r1
        L60:
            if (r2 != 0) goto L67
            java.lang.Class<wK> r5 = p000.C7068wK.class
            p000.AbstractC3929dS.m17671d(r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L67:
            throw r6     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L68:
            Bv0 r6 = r4.f44811d     // Catch: java.lang.Throwable -> L46
            r6.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.Class<wK> r6 = p000.C7068wK.class
            p000.AbstractC3929dS.m17674g(r6)     // Catch: java.lang.Throwable -> L46
            throw r5     // Catch: java.lang.Throwable -> L46
        L73:
            r0.m17854Q0()
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7068wK.m25602g(O01, Gj):lT");
    }

    /* renamed from: h */
    public final boolean m25603h() {
        boolean z;
        this.f44819l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6942uK c6942uK = this.f44818k;
        synchronized (c6942uK) {
            z = c6942uK.f43649a;
        }
        if (z) {
            long j = this.f44813f;
            if (j != -1 && jCurrentTimeMillis - j <= f44807o) {
                return false;
            }
        }
        return m25604i();
    }

    /* renamed from: i */
    public final boolean m25604i() {
        long j;
        C7068wK c7068wK = this;
        c7068wK.f44819l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = f44806n + jCurrentTimeMillis;
        try {
            Iterator it = c7068wK.f44815h.m697d().iterator();
            long jMax = -1;
            boolean z = false;
            int i = 0;
            long j3 = 0;
            while (it.hasNext()) {
                try {
                    C4104gF c4104gF = (C4104gF) it.next();
                    i++;
                    Iterator it2 = it;
                    if (c4104gF.f27632c < 0) {
                        c4104gF.f27632c = c4104gF.f27631b.f37075a.length();
                    }
                    j3 += c4104gF.f27632c;
                    if (c4104gF.m18413a() > j2) {
                        if (c4104gF.f27632c < 0) {
                            c4104gF.f27632c = c4104gF.f27631b.f37075a.length();
                        }
                        jMax = Math.max(c4104gF.m18413a() - jCurrentTimeMillis, jMax);
                        z = true;
                    }
                    it = it2;
                } catch (IOException e) {
                    e = e;
                    c7068wK = this;
                    C7356Av0 c7356Av0 = c7068wK.f44817j;
                    e.getMessage();
                    c7356Av0.getClass();
                    return false;
                }
            }
            if (z) {
                c7068wK = this;
                c7068wK.f44817j.getClass();
            } else {
                c7068wK = this;
            }
            C6942uK c6942uK = c7068wK.f44818k;
            synchronized (c6942uK) {
                j = c6942uK.f43651c;
            }
            long j4 = i;
            if (j != j4 || c7068wK.f44818k.m25166a() != j3) {
                c7068wK.f44818k.m25169d(j3, j4);
            }
            c7068wK.f44813f = jCurrentTimeMillis;
            return true;
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: j */
    public final C8539Xo1 m25605j(String str, O01 o01) throws IOException {
        synchronized (this.f44820m) {
            try {
                boolean zM25603h = m25603h();
                m25606k();
                long jM25166a = this.f44818k.m25166a();
                if (jM25166a > this.f44810c && !zM25603h) {
                    this.f44818k.m25168c();
                    m25603h();
                }
                long j = this.f44810c;
                if (jM25166a > j) {
                    m25597b((j * 9) / 10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4167hF c4167hF = (C4167hF) this.f44815h.m696c();
        c4167hF.getClass();
        File file = new File(c4167hF.m18788c(str));
        boolean zExists = file.exists();
        C7356Av0 c7356Av0 = c4167hF.f28335d;
        if (!zExists) {
            try {
                AbstractC8671a12.m9663b(file);
            } catch (C4119gU e) {
                c7356Av0.getClass();
                throw e;
            }
        }
        try {
            return new C8539Xo1(c4167hF, str, File.createTempFile(str.concat("."), ".tmp", file), 10);
        } catch (IOException e2) {
            c7356Av0.getClass();
            throw e2;
        }
    }

    /* renamed from: k */
    public final void m25606k() {
        boolean z;
        C0086BM c0086bm = this.f44815h;
        c0086bm.getClass();
        try {
            z = ((C4167hF) c0086bm.m696c()).f28333b;
        } catch (IOException unused) {
            z = false;
        }
        char c = z ? (char) 2 : (char) 1;
        C11626x41 c11626x41 = this.f44814g;
        long jM25166a = this.f44809b - this.f44818k.m25166a();
        c11626x41.m25757a();
        c11626x41.m25757a();
        ReentrantLock reentrantLock = c11626x41.f45362f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - c11626x41.f45361e > C11626x41.f45356i) {
                    c11626x41.f45357a = C11626x41.m25756b(c11626x41.f45357a, c11626x41.f45358b);
                    c11626x41.f45359c = C11626x41.m25756b(c11626x41.f45359c, c11626x41.f45360d);
                    c11626x41.f45361e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = c == 1 ? c11626x41.f45357a : c11626x41.f45359c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        if (availableBlocksLong <= 0 || availableBlocksLong < jM25166a) {
            this.f44810c = this.f44808a;
        } else {
            this.f44810c = this.f44809b;
        }
    }
}
